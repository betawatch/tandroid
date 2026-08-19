package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.TextStyleSpan;

/* loaded from: classes3.dex */
public class CodeHighlighting {
    public static final int MATCH_COMMENT = 6;
    public static final int MATCH_CONSTANT = 3;
    public static final int MATCH_FUNCTION = 7;
    public static final int MATCH_KEYWORD = 1;
    public static final int MATCH_NONE = 0;
    public static final int MATCH_NUMBER = 5;
    public static final int MATCH_OPERATOR = 2;
    public static final int MATCH_STRING = 4;
    private static HashMap<String, TokenPattern[]> compiledPatterns;
    private static HashSet<String> languages;
    private static final ConcurrentHashMap<String, Highlighting> processedHighlighting = new ConcurrentHashMap<>();

    public static int getTextSizeDecrement(int i) {
        if (i > 120) {
            return 5;
        }
        return i > 50 ? 3 : 2;
    }

    public static class Span extends CharacterStyle {
        public final String code;
        public final int currentType;
        public final float decrementSize;
        public final String lng;
        public final boolean smallerSize;
        public final TextStyleSpan.TextStyleRun style;

        public Span(boolean z, int i, TextStyleSpan.TextStyleRun textStyleRun, String str, String str2) {
            this.smallerSize = z;
            this.lng = str;
            this.code = str2;
            this.decrementSize = CodeHighlighting.getTextSizeDecrement(str2 == null ? 0 : str2.length());
            this.currentType = i;
            this.style = textStyleRun;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            if (this.smallerSize) {
                textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - this.decrementSize));
            }
            int i = this.currentType;
            if (i == 2) {
                textPaint.setColor(-1);
            } else if (i == 1) {
                textPaint.setColor(Theme.getColor(Theme.key_chat_messageTextOut));
            } else {
                textPaint.setColor(Theme.getColor(Theme.key_chat_messageTextIn));
            }
            TextStyleSpan.TextStyleRun textStyleRun = this.style;
            if (textStyleRun != null) {
                textStyleRun.applyStyle(textPaint);
            } else {
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setUnderlineText(false);
            }
        }
    }

    public static class ColorSpan extends CharacterStyle {
        public int group;

        public ColorSpan(int i) {
            this.group = i;
        }

        public int getColorKey() {
            switch (this.group) {
                case 1:
                    return Theme.key_code_keyword;
                case 2:
                    return Theme.key_code_operator;
                case 3:
                    return Theme.key_code_constant;
                case 4:
                    return Theme.key_code_string;
                case 5:
                    return Theme.key_code_number;
                case 6:
                    return Theme.key_code_comment;
                case 7:
                    return Theme.key_code_function;
                default:
                    return -1;
            }
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(Theme.getColor(getColorKey()));
        }
    }

    public static class LockedSpannableString extends SpannableString {
        public boolean ready;

        public LockedSpannableString(CharSequence charSequence) {
            super(charSequence);
            this.ready = false;
        }

        public void unlock() {
            this.ready = true;
        }

        @Override // android.text.SpannableString, android.text.Spanned
        public <T> T[] getSpans(int i, int i2, Class<T> cls) {
            return !this.ready ? (T[]) ((Object[]) Array.newInstance((Class<?>) cls, 0)) : (T[]) super.getSpans(i, i2, cls);
        }

        @Override // android.text.SpannableString, android.text.Spanned
        public int nextSpanTransition(int i, int i2, Class cls) {
            return !this.ready ? i2 : super.nextSpanTransition(i, i2, cls);
        }

        @Override // android.text.SpannableString, android.text.Spanned
        public int getSpanStart(Object obj) {
            if (this.ready) {
                return super.getSpanStart(obj);
            }
            return -1;
        }

        @Override // android.text.SpannableString, android.text.Spanned
        public int getSpanEnd(Object obj) {
            if (this.ready) {
                return super.getSpanEnd(obj);
            }
            return -1;
        }

        @Override // android.text.SpannableString, android.text.Spanned
        public int getSpanFlags(Object obj) {
            if (this.ready) {
                return super.getSpanFlags(obj);
            }
            return 0;
        }
    }

    public static class LockedWithFallbackSpannableString extends LockedSpannableString {
        public SpannableStringBuilder fallback;

        public LockedWithFallbackSpannableString(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
            super(charSequence);
            this.fallback = spannableStringBuilder;
        }

        @Override // org.telegram.messenger.CodeHighlighting.LockedSpannableString, android.text.SpannableString, android.text.Spanned
        public <T> T[] getSpans(int i, int i2, Class<T> cls) {
            SpannableStringBuilder spannableStringBuilder;
            return (this.ready || (spannableStringBuilder = this.fallback) == null) ? (T[]) super.getSpans(i, i2, cls) : (T[]) spannableStringBuilder.getSpans(i, i2, cls);
        }

        @Override // org.telegram.messenger.CodeHighlighting.LockedSpannableString, android.text.SpannableString, android.text.Spanned
        public int nextSpanTransition(int i, int i2, Class cls) {
            SpannableStringBuilder spannableStringBuilder;
            return (this.ready || (spannableStringBuilder = this.fallback) == null) ? super.nextSpanTransition(i, i2, cls) : spannableStringBuilder.nextSpanTransition(i, i2, cls);
        }

        @Override // org.telegram.messenger.CodeHighlighting.LockedSpannableString, android.text.SpannableString, android.text.Spanned
        public int getSpanStart(Object obj) {
            SpannableStringBuilder spannableStringBuilder;
            return (this.ready || (spannableStringBuilder = this.fallback) == null) ? super.getSpanStart(obj) : spannableStringBuilder.getSpanStart(obj);
        }

        @Override // org.telegram.messenger.CodeHighlighting.LockedSpannableString, android.text.SpannableString, android.text.Spanned
        public int getSpanEnd(Object obj) {
            SpannableStringBuilder spannableStringBuilder;
            return (this.ready || (spannableStringBuilder = this.fallback) == null) ? super.getSpanEnd(obj) : spannableStringBuilder.getSpanEnd(obj);
        }

        @Override // org.telegram.messenger.CodeHighlighting.LockedSpannableString, android.text.SpannableString, android.text.Spanned
        public int getSpanFlags(Object obj) {
            SpannableStringBuilder spannableStringBuilder;
            return (this.ready || (spannableStringBuilder = this.fallback) == null) ? super.getSpanFlags(obj) : spannableStringBuilder.getSpanFlags(obj);
        }
    }

    private static class Highlighting {
        String language;
        SpannableString result;
        CharSequence text;

        private Highlighting() {
        }
    }

    public static SpannableString getHighlighted(CharSequence charSequence, String str) {
        if (TextUtils.isEmpty(str)) {
            return new SpannableString(charSequence);
        }
        String str2 = str + "`" + ((Object) charSequence);
        ConcurrentHashMap<String, Highlighting> concurrentHashMap = processedHighlighting;
        Highlighting highlighting = concurrentHashMap.get(str2);
        if (highlighting == null) {
            highlighting = new Highlighting();
            highlighting.text = charSequence;
            highlighting.language = str;
            LockedSpannableString lockedSpannableString = new LockedSpannableString(charSequence);
            highlighting.result = lockedSpannableString;
            highlight(lockedSpannableString, 0, lockedSpannableString.length(), str, 0, null, true);
            Iterator<String> it = concurrentHashMap.keySet().iterator();
            while (it.hasNext() && processedHighlighting.size() > 8) {
                it.next();
                it.remove();
            }
            processedHighlighting.put(str2, highlighting);
        }
        return highlighting.result;
    }

    public static void highlightEditable(CharSequence charSequence, final String str, final Utilities.Callback<SpannableString> callback) {
        if (callback == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        final SpannableString spannableString = new SpannableString(charSequence);
        if (TextUtils.isEmpty(str) || spannableString.length() == 0) {
            callback.run(spannableString);
        } else {
            final String spannableString2 = spannableString.toString();
            Utilities.searchQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.CodeHighlighting$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    CodeHighlighting.$r8$lambda$GnQc0UFV-OreAy2pkYwEC22lbb4(spannableString2, str, spannableString, callback);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$GnQc0UFV-OreAy2pkYwEC22lbb4(String str, String str2, SpannableString spannableString, final Utilities.Callback callback) {
        final SpannableString spannableString2;
        HashMap<String, TokenPattern[]> hashMap;
        if (compiledPatterns == null) {
            parse();
        }
        final ArrayList arrayList = new ArrayList();
        try {
            hashMap = compiledPatterns;
            spannableString2 = spannableString;
        } catch (Exception e) {
            e = e;
            spannableString2 = spannableString;
        }
        try {
            colorize(spannableString2, 0, spannableString.length(), tokenize(str, hashMap == null ? null : hashMap.get(str2), 0).toArray(), -1, arrayList);
        } catch (Exception e2) {
            e = e2;
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.CodeHighlighting$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CodeHighlighting.$r8$lambda$uJk7sehDZe0ZSZDsLPpJs_l6bMw(arrayList, spannableString2, callback);
                }
            });
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.CodeHighlighting$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CodeHighlighting.$r8$lambda$uJk7sehDZe0ZSZDsLPpJs_l6bMw(arrayList, spannableString2, callback);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$uJk7sehDZe0ZSZDsLPpJs_l6bMw(ArrayList arrayList, SpannableString spannableString, Utilities.Callback callback) {
        for (int i = 0; i < arrayList.size(); i++) {
            CachedToSpan cachedToSpan = (CachedToSpan) arrayList.get(i);
            spannableString.setSpan(new ColorSpan(cachedToSpan.group), cachedToSpan.start, cachedToSpan.end, 33);
        }
        callback.run(spannableString);
    }

    public static void prepare() {
        if (compiledPatterns != null) {
            return;
        }
        Utilities.searchQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.CodeHighlighting$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                CodeHighlighting.$r8$lambda$yc7DAs30Il1LjoB2owuVZpqSbS0();
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$yc7DAs30Il1LjoB2owuVZpqSbS0() {
        if (compiledPatterns == null) {
            parse();
        }
    }

    public static Set<String> getLanguages() {
        HashSet<String> hashSet = languages;
        if (hashSet == null) {
            return null;
        }
        return hashSet;
    }

    public static void highlight(final Spannable spannable, final int i, final int i2, final String str, int i3, TextStyleSpan.TextStyleRun textStyleRun, boolean z) {
        if (spannable == null) {
            return;
        }
        Utilities.searchQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.CodeHighlighting$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                CodeHighlighting.$r8$lambda$jQO9jOIHZCkw36qQVzRg3-QK6o8(spannable, i, i2, str);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$jQO9jOIHZCkw36qQVzRg3-QK6o8(final Spannable spannable, int i, int i2, String str) {
        if (compiledPatterns == null) {
            parse();
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringToken[][] stringTokenArr = new StringToken[1][];
        try {
            String charSequence = spannable.subSequence(i, i2).toString();
            HashMap<String, TokenPattern[]> hashMap = compiledPatterns;
            stringTokenArr[0] = tokenize(charSequence, hashMap == null ? null : hashMap.get(str), 0).toArray();
        } catch (Exception e) {
            FileLog.e(e);
        }
        FileLog.d("[CodeHighlighter] tokenize took " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        long currentTimeMillis2 = System.currentTimeMillis();
        final ArrayList arrayList = new ArrayList();
        colorize(spannable, i, i2, stringTokenArr[0], -1, arrayList);
        FileLog.d("[CodeHighlighter] colorize took " + (System.currentTimeMillis() - currentTimeMillis2) + "ms");
        if (arrayList.isEmpty()) {
            return;
        }
        if (spannable instanceof LockedSpannableString) {
            long currentTimeMillis3 = System.currentTimeMillis();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                CachedToSpan cachedToSpan = (CachedToSpan) arrayList.get(i3);
                spannable.setSpan(new ColorSpan(cachedToSpan.group), cachedToSpan.start, cachedToSpan.end, 33);
            }
            FileLog.d("[CodeHighlighter] applying " + arrayList.size() + " colorize spans took " + (System.currentTimeMillis() - currentTimeMillis3) + "ms in another thread");
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.CodeHighlighting$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    CodeHighlighting.$r8$lambda$FUf8UFflQpy8dsJzr9b6qK27Hmk(spannable);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.CodeHighlighting$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                CodeHighlighting.$r8$lambda$plxG-IoXIX1WFe9rdhmpCX8CFw4(arrayList, spannable);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$FUf8UFflQpy8dsJzr9b6qK27Hmk(Spannable spannable) {
        ((LockedSpannableString) spannable).unlock();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.emojiLoaded, new Object[0]);
    }

    public static /* synthetic */ void $r8$lambda$plxG-IoXIX1WFe9rdhmpCX8CFw4(ArrayList arrayList, Spannable spannable) {
        long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            CachedToSpan cachedToSpan = (CachedToSpan) arrayList.get(i);
            spannable.setSpan(new ColorSpan(cachedToSpan.group), cachedToSpan.start, cachedToSpan.end, 33);
        }
        FileLog.d("[CodeHighlighter] applying " + arrayList.size() + " colorize spans took " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.emojiLoaded, new Object[0]);
    }

    private static void colorize(Spannable spannable, int i, int i2, StringToken[] stringTokenArr, int i3, ArrayList<CachedToSpan> arrayList) {
        Spannable spannable2;
        ArrayList<CachedToSpan> arrayList2;
        if (stringTokenArr == null) {
            return;
        }
        int i4 = 0;
        int i5 = i;
        while (i4 < stringTokenArr.length && i5 < i2) {
            StringToken stringToken = stringTokenArr[i4];
            if (stringToken != null) {
                if (stringToken.string != null) {
                    int i6 = stringToken.group;
                    if (i3 != -1) {
                        i6 = i3;
                    }
                    if (i6 == -1) {
                        i5 += stringToken.length();
                    } else {
                        arrayList.add(new CachedToSpan(i6, i5, stringToken.length() + i5));
                    }
                } else if (stringToken.inside != null) {
                    spannable2 = spannable;
                    arrayList2 = arrayList;
                    colorize(spannable2, i5, i5 + stringToken.length(), stringToken.inside.toArray(), stringToken.group, arrayList2);
                    i5 += stringToken.length();
                    i4++;
                    spannable = spannable2;
                    arrayList = arrayList2;
                }
                spannable2 = spannable;
                arrayList2 = arrayList;
                i5 += stringToken.length();
                i4++;
                spannable = spannable2;
                arrayList = arrayList2;
            }
            spannable2 = spannable;
            arrayList2 = arrayList;
            i4++;
            spannable = spannable2;
            arrayList = arrayList2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class CachedToSpan {
        public int end;
        public int group;
        public int start;

        public CachedToSpan(int i, int i2, int i3) {
            this.group = i;
            this.start = i2;
            this.end = i3;
        }
    }

    private static LinkedList tokenize(String str, TokenPattern[] tokenPatternArr, int i) {
        return tokenize(str, tokenPatternArr, null, i);
    }

    private static LinkedList tokenize(String str, TokenPattern[] tokenPatternArr, TokenPattern tokenPattern, int i) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAfter(linkedList.head, new StringToken(str));
        matchGrammar(str, linkedList, flatRest(tokenPatternArr), linkedList.head, 0, null, tokenPattern, i);
        return linkedList;
    }

    private static TokenPattern[] flatRest(TokenPattern[] tokenPatternArr) {
        HashMap<String, TokenPattern[]> hashMap;
        TokenPattern[] tokenPatternArr2;
        ArrayList arrayList = null;
        if (tokenPatternArr == null) {
            return null;
        }
        for (int i = 0; i < tokenPatternArr.length; i++) {
            CachedPattern cachedPattern = tokenPatternArr[i].pattern;
            if (cachedPattern != null && "REST".equals(cachedPattern.patternSource)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Collections.addAll(arrayList, tokenPatternArr);
                }
                arrayList.remove(tokenPatternArr[i]);
                if (!TextUtils.isEmpty(tokenPatternArr[i].insideLanguage) && (hashMap = compiledPatterns) != null && (tokenPatternArr2 = hashMap.get(tokenPatternArr[i].insideLanguage)) != null) {
                    Collections.addAll(arrayList, tokenPatternArr2);
                }
            }
        }
        return arrayList != null ? (TokenPattern[]) arrayList.toArray(new TokenPattern[0]) : tokenPatternArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void matchGrammar(String str, LinkedList linkedList, TokenPattern[] tokenPatternArr, Node node, int i, RematchOptions rematchOptions, TokenPattern tokenPattern, int i2) {
        int i3;
        Match matchPattern;
        int i4;
        String substring;
        String substring2;
        int length;
        TokenPattern[] tokenPatternArr2;
        int i5;
        StringToken stringToken;
        int i6;
        String str2 = str;
        LinkedList linkedList2 = linkedList;
        TokenPattern[] tokenPatternArr3 = tokenPatternArr;
        if (tokenPatternArr3 == null || i2 > 20) {
            return;
        }
        int length2 = tokenPatternArr3.length;
        int i7 = 0;
        while (i7 < length2) {
            TokenPattern tokenPattern2 = tokenPatternArr3[i7];
            if (tokenPattern2 == tokenPattern) {
                return;
            }
            if (rematchOptions != null && rematchOptions.cause == tokenPattern2) {
                return;
            }
            Node node2 = node.next;
            int i8 = i;
            while (node2 != linkedList2.tail) {
                if (rematchOptions != null && i8 >= rematchOptions.reach) {
                    return;
                }
                if (linkedList2.length > str2.length()) {
                    FileLog.e("[CodeHighlighter] Something went terribly wrong, ABORT, ABORT!");
                    return;
                }
                StringToken stringToken2 = node2.value;
                String str3 = stringToken2.string;
                if (str3 != null && !stringToken2.token) {
                    if (tokenPattern2.greedy) {
                        matchPattern = matchPattern(tokenPattern2, i8, str2);
                        if (matchPattern != null && matchPattern.index < str2.length()) {
                            int i9 = matchPattern.index;
                            int i10 = matchPattern.length + i9;
                            int length3 = node2.value.length();
                            while (true) {
                                i8 += length3;
                                if (i9 < i8) {
                                    break;
                                }
                                node2 = node2.next;
                                length3 = node2.value.length();
                            }
                            i8 -= node2.value.length();
                            StringToken stringToken3 = node2.value;
                            if (stringToken3.string != null && !stringToken3.token) {
                                int i11 = i8;
                                int i12 = 1;
                                for (Node node3 = node2; node3 != linkedList2.tail && (i11 < i10 || !node3.value.token); node3 = node3.next) {
                                    i12++;
                                    i11 += node3.value.length();
                                }
                                str3 = str2.substring(i8, i11);
                                matchPattern.index -= i8;
                                i4 = i12 - 1;
                                i3 = 0;
                                int i13 = matchPattern.index;
                                substring = str3.substring(i3, i13);
                                substring2 = str3.substring(i13 + matchPattern.length);
                                length = str3.length() + i8;
                                if (rematchOptions != null && length > rematchOptions.reach) {
                                    rematchOptions.reach = length;
                                }
                                Node node4 = node2.prev;
                                if (substring.length() > 0) {
                                    node4 = linkedList2.addAfter(node4, new StringToken(substring));
                                    i8 += substring.length();
                                }
                                linkedList2.removeRange(node4, i4);
                                tokenPatternArr2 = tokenPattern2.insideTokenPatterns;
                                if (tokenPatternArr2 == null) {
                                    i5 = i8;
                                    stringToken = new StringToken(tokenPattern2.group, tokenize(matchPattern.string, tokenPatternArr2, tokenPattern2, i2 + 1), matchPattern.length);
                                } else {
                                    i5 = i8;
                                    String str4 = tokenPattern2.insideLanguage;
                                    if (str4 != null) {
                                        stringToken = new StringToken(tokenPattern2.group, tokenize(matchPattern.string, compiledPatterns.get(str4), tokenPattern2, i2 + 1), matchPattern.length);
                                    } else {
                                        stringToken = new StringToken(tokenPattern2.group, matchPattern.string);
                                    }
                                }
                                Node addAfter = linkedList2.addAfter(node4, stringToken);
                                if (substring2.length() > 0) {
                                    linkedList2.addAfter(addAfter, new StringToken(substring2));
                                }
                                if (i4 > 1) {
                                    RematchOptions rematchOptions2 = new RematchOptions();
                                    rematchOptions2.cause = tokenPattern2;
                                    rematchOptions2.reach = length;
                                    matchGrammar(str, linkedList2, tokenPatternArr, addAfter.prev, i5, rematchOptions2, tokenPattern, i2 + 1);
                                    if (rematchOptions != null && (i6 = rematchOptions2.reach) > rematchOptions.reach) {
                                        rematchOptions.reach = i6;
                                    }
                                }
                                node2 = addAfter;
                                i8 = i5;
                            }
                        }
                        i7++;
                        str2 = str;
                        linkedList2 = linkedList;
                        tokenPatternArr3 = tokenPatternArr;
                    } else {
                        i3 = 0;
                        matchPattern = matchPattern(tokenPattern2, 0, str3);
                        if (matchPattern != null) {
                            i4 = 1;
                            int i132 = matchPattern.index;
                            substring = str3.substring(i3, i132);
                            substring2 = str3.substring(i132 + matchPattern.length);
                            length = str3.length() + i8;
                            if (rematchOptions != null) {
                                rematchOptions.reach = length;
                            }
                            Node node42 = node2.prev;
                            if (substring.length() > 0) {
                            }
                            linkedList2.removeRange(node42, i4);
                            tokenPatternArr2 = tokenPattern2.insideTokenPatterns;
                            if (tokenPatternArr2 == null) {
                            }
                            Node addAfter2 = linkedList2.addAfter(node42, stringToken);
                            if (substring2.length() > 0) {
                            }
                            if (i4 > 1) {
                            }
                            node2 = addAfter2;
                            i8 = i5;
                        }
                    }
                }
                i8 += node2.value.length();
                node2 = node2.next;
                str2 = str;
                linkedList2 = linkedList;
            }
            i7++;
            str2 = str;
            linkedList2 = linkedList;
            tokenPatternArr3 = tokenPatternArr;
        }
    }

    private static Match matchPattern(TokenPattern tokenPattern, int i, String str) {
        try {
            Matcher matcher = tokenPattern.pattern.getPattern().matcher(str);
            matcher.region(i, str.length());
            if (!matcher.find()) {
                return null;
            }
            Match match = new Match();
            match.index = matcher.start();
            if (tokenPattern.lookbehind && matcher.groupCount() >= 1) {
                match.index += matcher.end(1) - matcher.start(1);
            }
            int end = matcher.end();
            int i2 = match.index;
            int i3 = end - i2;
            match.length = i3;
            match.string = str.substring(i2, i3 + i2);
            return match;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    private static class RematchOptions {
        TokenPattern cause;
        int reach;

        private RematchOptions() {
        }
    }

    private static class Match {
        int index;
        int length;
        String string;

        private Match() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class LinkedList {
        public Node head;
        public int length = 0;
        public Node tail;

        public LinkedList() {
            this.head = new Node();
            Node node = new Node();
            this.tail = node;
            Node node2 = this.head;
            node2.next = node;
            node.prev = node2;
        }

        public Node addAfter(Node node, StringToken stringToken) {
            Node node2 = node.next;
            Node node3 = new Node();
            node3.value = stringToken;
            node3.prev = node;
            node3.next = node2;
            node.next = node3;
            node2.prev = node3;
            this.length++;
            return node3;
        }

        public void removeRange(Node node, int i) {
            Node node2 = node.next;
            int i2 = 0;
            while (i2 < i && node2 != this.tail) {
                node2 = node2.next;
                i2++;
            }
            node.next = node2;
            node2.prev = node;
            this.length -= i2;
        }

        public StringToken[] toArray() {
            StringToken[] stringTokenArr = new StringToken[this.length];
            Node node = this.head.next;
            for (int i = 0; i < this.length && node != this.tail; i++) {
                stringTokenArr[i] = node.value;
                node = node.next;
            }
            return stringTokenArr;
        }
    }

    private static class Node {
        public Node next;
        public Node prev;
        public StringToken value;

        private Node() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class StringToken {
        final int group;
        final LinkedList inside;
        final int insideLength;
        final String string;
        final boolean token;

        public StringToken(int i, String str) {
            this.token = true;
            this.group = i;
            this.string = str;
            this.inside = null;
            this.insideLength = 0;
        }

        public StringToken(int i, LinkedList linkedList, int i2) {
            this.token = true;
            this.group = i;
            this.string = null;
            this.inside = linkedList;
            this.insideLength = i2;
        }

        public StringToken(String str) {
            this.token = false;
            this.group = -1;
            this.string = str;
            this.inside = null;
            this.insideLength = 0;
        }

        public int length() {
            String str = this.string;
            if (str != null) {
                return str.length();
            }
            return this.insideLength;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0172 A[Catch: Exception -> 0x016e, TryCatch #1 {Exception -> 0x016e, blocks: (B:99:0x016a, B:88:0x0172, B:90:0x0177), top: B:98:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0177 A[Catch: Exception -> 0x016e, TRY_LEAVE, TryCatch #1 {Exception -> 0x016e, blocks: (B:99:0x016a, B:88:0x0172, B:90:0x0177), top: B:98:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void parse() {
        GZIPInputStream gZIPInputStream;
        InputStream inputStream;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        GZIPInputStream gZIPInputStream2;
        BufferedInputStream bufferedInputStream3;
        1 r1 = null;
        r1 = null;
        r1 = null;
        GZIPInputStream gZIPInputStream3 = null;
        try {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                inputStream = ApplicationLoader.applicationContext.getAssets().open("codelng.gzip");
                try {
                    gZIPInputStream2 = new GZIPInputStream(inputStream, 65536);
                    try {
                        BufferedInputStream bufferedInputStream4 = new BufferedInputStream(gZIPInputStream2, 65536);
                        try {
                            StreamReader streamReader = new StreamReader(bufferedInputStream4);
                            HashMap hashMap = new HashMap();
                            int readUint8 = streamReader.readUint8();
                            for (int i = 0; i < readUint8; i++) {
                                int readUint82 = streamReader.readUint8();
                                int readUint83 = streamReader.readUint8();
                                String[] strArr = new String[readUint83];
                                for (int i2 = 0; i2 < readUint83; i2++) {
                                    strArr[i2] = streamReader.readString();
                                }
                                hashMap.put(Integer.valueOf(readUint82), strArr);
                            }
                            int readUint16 = streamReader.readUint16();
                            ParsedPattern[] parsedPatternArr = new ParsedPattern[readUint16];
                            for (int i3 = 0; i3 < readUint16; i3++) {
                                parsedPatternArr[i3] = new ParsedPattern();
                                int readUint84 = streamReader.readUint8();
                                ParsedPattern parsedPattern = parsedPatternArr[i3];
                                parsedPattern.multiline = (readUint84 & 1) != 0;
                                parsedPattern.caseInsensitive = (readUint84 & 2) != 0;
                                parsedPattern.pattern = streamReader.readString();
                            }
                            if (compiledPatterns == null) {
                                compiledPatterns = new HashMap<>();
                            }
                            if (languages == null) {
                                languages = new HashSet<>();
                            }
                            int i4 = 0;
                            while (i4 < readUint8) {
                                int readUint85 = streamReader.readUint8();
                                TokenPattern[] readTokens = readTokens(streamReader, parsedPatternArr, hashMap);
                                String[] strArr2 = (String[]) hashMap.get(Integer.valueOf(readUint85));
                                int length = strArr2.length;
                                int i5 = 0;
                                while (i5 < length) {
                                    compiledPatterns.put(strArr2[i5], readTokens);
                                    i5++;
                                    streamReader = streamReader;
                                }
                                StreamReader streamReader2 = streamReader;
                                if (strArr2.length > 0 && !"plain".equals(strArr2[0]) && !strArr2[0].endsWith("like") && !strArr2[0].startsWith("markup")) {
                                    languages.add(strArr2[0]);
                                }
                                i4++;
                                streamReader = streamReader2;
                            }
                            FileLog.d("[CodeHighlighter] Successfully read " + readUint8 + " languages, " + readUint16 + " patterns in " + (System.currentTimeMillis() - currentTimeMillis) + "ms from codelng.gzip");
                            gZIPInputStream2.close();
                            bufferedInputStream4.close();
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } catch (Exception e) {
                            e = e;
                            bufferedInputStream3 = bufferedInputStream4;
                            gZIPInputStream3 = gZIPInputStream2;
                            bufferedInputStream = bufferedInputStream3;
                            try {
                                FileLog.e(e);
                                if (gZIPInputStream3 != null) {
                                    gZIPInputStream3.close();
                                }
                                if (bufferedInputStream != null) {
                                    bufferedInputStream.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                gZIPInputStream = gZIPInputStream3;
                                r1 = bufferedInputStream;
                                bufferedInputStream2 = r1;
                                gZIPInputStream2 = gZIPInputStream;
                                Throwable th2 = th;
                                if (gZIPInputStream2 != null) {
                                    try {
                                        gZIPInputStream2.close();
                                    } catch (Exception e2) {
                                        FileLog.e(e2);
                                        throw th2;
                                    }
                                }
                                if (bufferedInputStream2 != null) {
                                    bufferedInputStream2.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                    throw th2;
                                }
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedInputStream2 = bufferedInputStream4;
                            Throwable th22 = th;
                            if (gZIPInputStream2 != null) {
                            }
                            if (bufferedInputStream2 != null) {
                            }
                            if (inputStream != null) {
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        bufferedInputStream3 = null;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedInputStream2 = null;
                    }
                } catch (Exception e4) {
                    e = e4;
                    bufferedInputStream = null;
                } catch (Throwable th5) {
                    th = th5;
                    gZIPInputStream = null;
                    bufferedInputStream2 = r1;
                    gZIPInputStream2 = gZIPInputStream;
                    Throwable th222 = th;
                    if (gZIPInputStream2 != null) {
                    }
                    if (bufferedInputStream2 != null) {
                    }
                    if (inputStream != null) {
                    }
                }
            } catch (Exception e5) {
                FileLog.e(e5);
            }
        } catch (Exception e6) {
            e = e6;
            inputStream = null;
            bufferedInputStream = null;
        } catch (Throwable th6) {
            th = th6;
            gZIPInputStream = null;
            inputStream = null;
        }
    }

    private static class ParsedPattern {
        private CachedPattern cachedPattern;
        boolean caseInsensitive;
        boolean multiline;
        String pattern;

        private ParsedPattern() {
        }

        public int flags() {
            return (this.multiline ? 8 : 0) | (this.caseInsensitive ? 2 : 0);
        }

        public CachedPattern getCachedPattern() {
            if (this.cachedPattern == null) {
                this.cachedPattern = new CachedPattern(this.pattern, flags());
            }
            return this.cachedPattern;
        }
    }

    private static TokenPattern[] readTokens(StreamReader streamReader, ParsedPattern[] parsedPatternArr, HashMap<Integer, String[]> hashMap) {
        int readUint8 = streamReader.readUint8();
        TokenPattern[] tokenPatternArr = new TokenPattern[readUint8];
        for (int i = 0; i < readUint8; i++) {
            int readUint82 = streamReader.readUint8();
            int i2 = readUint82 & 3;
            int i3 = (readUint82 >> 2) & 7;
            boolean z = (readUint82 & 32) != 0;
            boolean z2 = (readUint82 & 64) != 0;
            int readUint16 = streamReader.readUint16();
            if (i2 == 0) {
                tokenPatternArr[i] = new TokenPattern(i3, parsedPatternArr[readUint16].getCachedPattern());
            } else if (i2 == 1) {
                if (i3 == 0) {
                    tokenPatternArr[i] = new TokenPattern(parsedPatternArr[readUint16].getCachedPattern(), readTokens(streamReader, parsedPatternArr, hashMap));
                } else {
                    tokenPatternArr[i] = new TokenPattern(i3, parsedPatternArr[readUint16].getCachedPattern(), readTokens(streamReader, parsedPatternArr, hashMap));
                }
            } else if (i2 == 2) {
                tokenPatternArr[i] = new TokenPattern(parsedPatternArr[readUint16].getCachedPattern(), hashMap.get(Integer.valueOf(streamReader.readUint8()))[0]);
            }
            if (z) {
                tokenPatternArr[i].greedy = true;
            }
            if (z2) {
                tokenPatternArr[i].lookbehind = true;
            }
        }
        return tokenPatternArr;
    }

    private static class StreamReader {
        private final InputStream is;

        public StreamReader(InputStream inputStream) {
            this.is = inputStream;
        }

        public int readUint8() {
            return this.is.read() & NotificationCenter.didReceiveSmsCode;
        }

        public int readUint16() {
            return (this.is.read() & NotificationCenter.didReceiveSmsCode) | ((this.is.read() & NotificationCenter.didReceiveSmsCode) << 8);
        }

        public String readString() {
            int read = this.is.read();
            if (read >= 254) {
                read = this.is.read() | (this.is.read() << 8) | (this.is.read() << 16);
            }
            byte[] bArr = new byte[read];
            for (int i = 0; i < read; i++) {
                bArr[i] = (byte) this.is.read();
            }
            return new String(bArr, StandardCharsets.US_ASCII);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class TokenPattern {
        public boolean greedy;
        public int group;
        public String insideLanguage;
        public TokenPattern[] insideTokenPatterns;
        public boolean lookbehind;
        public final CachedPattern pattern;

        public TokenPattern(int i, CachedPattern cachedPattern) {
            this.pattern = cachedPattern;
            this.group = i;
        }

        public TokenPattern(CachedPattern cachedPattern, TokenPattern... tokenPatternArr) {
            this.group = -1;
            this.pattern = cachedPattern;
            this.insideTokenPatterns = tokenPatternArr;
        }

        public TokenPattern(CachedPattern cachedPattern, String str) {
            this.group = -1;
            this.pattern = cachedPattern;
            this.insideLanguage = str;
        }

        public TokenPattern(int i, CachedPattern cachedPattern, TokenPattern... tokenPatternArr) {
            this.group = i;
            this.pattern = cachedPattern;
            this.insideTokenPatterns = tokenPatternArr;
        }
    }

    private static class CachedPattern {
        private Pattern pattern;
        private String patternSource;
        private int patternSourceFlags;

        public CachedPattern(String str, int i) {
            this.patternSource = str;
            this.patternSourceFlags = i;
        }

        public Pattern getPattern() {
            if (this.pattern == null) {
                this.pattern = Pattern.compile(this.patternSource, this.patternSourceFlags);
            }
            return this.pattern;
        }
    }
}
