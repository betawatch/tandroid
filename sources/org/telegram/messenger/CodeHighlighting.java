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
import org.telegram.ui.Components.vz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
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

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class CachedPattern {
        private Pattern pattern;
        private String patternSource;
        private int patternSourceFlags;

        public CachedPattern(String str, int i9) {
            this.patternSource = str;
            this.patternSourceFlags = i9;
        }

        public Pattern getPattern() {
            if (this.pattern == null) {
                this.pattern = Pattern.compile(this.patternSource, this.patternSourceFlags);
            }
            return this.pattern;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class CachedToSpan {
        public int end;
        public int group;
        public int start;

        public CachedToSpan(int i9, int i10, int i11) {
            this.group = i9;
            this.start = i10;
            this.end = i11;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class ColorSpan extends CharacterStyle {
        public int group;

        public ColorSpan(int i9) {
            this.group = i9;
        }

        public int getColorKey() {
            switch (this.group) {
                case 1:
                    return org.telegram.ui.ActionBar.f6.Ik;
                case 2:
                    return org.telegram.ui.ActionBar.f6.Jk;
                case 3:
                    return org.telegram.ui.ActionBar.f6.Kk;
                case 4:
                    return org.telegram.ui.ActionBar.f6.Lk;
                case 5:
                    return org.telegram.ui.ActionBar.f6.Mk;
                case 6:
                    return org.telegram.ui.ActionBar.f6.Nk;
                case 7:
                    return org.telegram.ui.ActionBar.f6.Ok;
                default:
                    return -1;
            }
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, getColorKey(), false));
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class Highlighting {
        String language;
        SpannableString result;
        CharSequence text;

        private Highlighting() {
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class LinkedList {
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

        public void removeRange(Node node, int i9) {
            Node node2 = node.next;
            int i10 = 0;
            while (i10 < i9 && node2 != this.tail) {
                node2 = node2.next;
                i10++;
            }
            node.next = node2;
            node2.prev = node;
            this.length -= i10;
        }

        public StringToken[] toArray() {
            StringToken[] stringTokenArr = new StringToken[this.length];
            Node node = this.head.next;
            for (int i9 = 0; i9 < this.length && node != this.tail; i9++) {
                stringTokenArr[i9] = node.value;
                node = node.next;
            }
            return stringTokenArr;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class LockedSpannableString extends SpannableString {
        public boolean ready;

        public LockedSpannableString(CharSequence charSequence) {
            super(charSequence);
            this.ready = false;
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

        @Override // android.text.SpannableString, android.text.Spanned
        public int getSpanStart(Object obj) {
            if (this.ready) {
                return super.getSpanStart(obj);
            }
            return -1;
        }

        @Override // android.text.SpannableString, android.text.Spanned
        public <T> T[] getSpans(int i9, int i10, Class<T> cls) {
            return !this.ready ? (T[]) ((Object[]) Array.newInstance((Class<?>) cls, 0)) : (T[]) super.getSpans(i9, i10, cls);
        }

        @Override // android.text.SpannableString, android.text.Spanned
        public int nextSpanTransition(int i9, int i10, Class cls) {
            return !this.ready ? i10 : super.nextSpanTransition(i9, i10, cls);
        }

        public void unlock() {
            this.ready = true;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class LockedWithFallbackSpannableString extends LockedSpannableString {
        public SpannableStringBuilder fallback;

        public LockedWithFallbackSpannableString(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
            super(charSequence);
            this.fallback = spannableStringBuilder;
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

        @Override // org.telegram.messenger.CodeHighlighting.LockedSpannableString, android.text.SpannableString, android.text.Spanned
        public int getSpanStart(Object obj) {
            SpannableStringBuilder spannableStringBuilder;
            return (this.ready || (spannableStringBuilder = this.fallback) == null) ? super.getSpanStart(obj) : spannableStringBuilder.getSpanStart(obj);
        }

        @Override // org.telegram.messenger.CodeHighlighting.LockedSpannableString, android.text.SpannableString, android.text.Spanned
        public <T> T[] getSpans(int i9, int i10, Class<T> cls) {
            SpannableStringBuilder spannableStringBuilder;
            return (this.ready || (spannableStringBuilder = this.fallback) == null) ? (T[]) super.getSpans(i9, i10, cls) : (T[]) spannableStringBuilder.getSpans(i9, i10, cls);
        }

        @Override // org.telegram.messenger.CodeHighlighting.LockedSpannableString, android.text.SpannableString, android.text.Spanned
        public int nextSpanTransition(int i9, int i10, Class cls) {
            SpannableStringBuilder spannableStringBuilder;
            return (this.ready || (spannableStringBuilder = this.fallback) == null) ? super.nextSpanTransition(i9, i10, cls) : spannableStringBuilder.nextSpanTransition(i9, i10, cls);
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class Match {
        int index;
        int length;
        String string;

        private Match() {
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class Node {
        public Node next;
        public Node prev;
        public StringToken value;

        private Node() {
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class ParsedPattern {
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

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class RematchOptions {
        TokenPattern cause;
        int reach;

        private RematchOptions() {
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class Span extends CharacterStyle {
        public final String code;
        public final int currentType;
        public final float decrementSize;
        public final String lng;
        public final boolean smallerSize;
        public final vz0 style;

        public Span(boolean z10, int i9, vz0 vz0Var, String str, String str2) {
            this.smallerSize = z10;
            this.lng = str;
            this.code = str2;
            this.decrementSize = CodeHighlighting.getTextSizeDecrement(str2 == null ? 0 : str2.length());
            this.currentType = i9;
            this.style = vz0Var;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            if (this.smallerSize) {
                textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - this.decrementSize));
            }
            int i9 = this.currentType;
            if (i9 == 2) {
                textPaint.setColor(-1);
            } else if (i9 == 1) {
                textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.fc, false));
            } else {
                textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ec, false));
            }
            vz0 vz0Var = this.style;
            if (vz0Var != null) {
                vz0Var.a(textPaint);
            } else {
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setUnderlineText(false);
            }
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class StreamReader {
        private final InputStream is;

        public StreamReader(InputStream inputStream) {
            this.is = inputStream;
        }

        public String readString() {
            int read = this.is.read();
            if (read >= 254) {
                read = this.is.read() | (this.is.read() << 8) | (this.is.read() << 16);
            }
            byte[] bArr = new byte[read];
            for (int i9 = 0; i9 < read; i9++) {
                bArr[i9] = (byte) this.is.read();
            }
            return new String(bArr, StandardCharsets.US_ASCII);
        }

        public int readUint16() {
            return (this.is.read() & 255) | ((this.is.read() & 255) << 8);
        }

        public int readUint8() {
            return this.is.read() & 255;
        }
    }

    private static void colorize(Spannable spannable, int i9, int i10, StringToken[] stringTokenArr, int i11, ArrayList<CachedToSpan> arrayList) {
        Spannable spannable2;
        ArrayList<CachedToSpan> arrayList2;
        if (stringTokenArr == null) {
            return;
        }
        int i12 = 0;
        int i13 = i9;
        while (i12 < stringTokenArr.length && i13 < i10) {
            StringToken stringToken = stringTokenArr[i12];
            if (stringToken != null) {
                if (stringToken.string != null) {
                    int i14 = stringToken.group;
                    if (i11 != -1) {
                        i14 = i11;
                    }
                    if (i14 == -1) {
                        i13 += stringToken.length();
                    } else {
                        arrayList.add(new CachedToSpan(i14, i13, stringToken.length() + i13));
                    }
                } else if (stringToken.inside != null) {
                    spannable2 = spannable;
                    arrayList2 = arrayList;
                    colorize(spannable2, i13, i13 + stringToken.length(), stringToken.inside.toArray(), stringToken.group, arrayList2);
                    i13 += stringToken.length();
                    i12++;
                    spannable = spannable2;
                    arrayList = arrayList2;
                }
                spannable2 = spannable;
                arrayList2 = arrayList;
                i13 += stringToken.length();
                i12++;
                spannable = spannable2;
                arrayList = arrayList2;
            }
            spannable2 = spannable;
            arrayList2 = arrayList;
            i12++;
            spannable = spannable2;
            arrayList = arrayList2;
        }
    }

    private static TokenPattern[] flatRest(TokenPattern[] tokenPatternArr) {
        HashMap<String, TokenPattern[]> hashMap;
        TokenPattern[] tokenPatternArr2;
        ArrayList arrayList = null;
        if (tokenPatternArr == null) {
            return null;
        }
        for (int i9 = 0; i9 < tokenPatternArr.length; i9++) {
            CachedPattern cachedPattern = tokenPatternArr[i9].pattern;
            if (cachedPattern != null && "REST".equals(cachedPattern.patternSource)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Collections.addAll(arrayList, tokenPatternArr);
                }
                arrayList.remove(tokenPatternArr[i9]);
                if (!TextUtils.isEmpty(tokenPatternArr[i9].insideLanguage) && (hashMap = compiledPatterns) != null && (tokenPatternArr2 = hashMap.get(tokenPatternArr[i9].insideLanguage)) != null) {
                    Collections.addAll(arrayList, tokenPatternArr2);
                }
            }
        }
        return arrayList != null ? (TokenPattern[]) arrayList.toArray(new TokenPattern[0]) : tokenPatternArr;
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

    public static Set<String> getLanguages() {
        HashSet<String> hashSet = languages;
        if (hashSet == null) {
            return null;
        }
        return hashSet;
    }

    public static int getTextSizeDecrement(int i9) {
        if (i9 > 120) {
            return 5;
        }
        return i9 > 50 ? 3 : 2;
    }

    public static void highlight(Spannable spannable, int i9, int i10, String str, int i11, vz0 vz0Var, boolean z10) {
        if (spannable == null) {
            return;
        }
        Utilities.searchQueue.postRunnable(new w4(spannable, i9, i10, str, 1));
    }

    public static void highlightEditable(CharSequence charSequence, String str, Utilities.Callback<SpannableString> callback) {
        if (callback == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        SpannableString spannableString = new SpannableString(charSequence);
        if (TextUtils.isEmpty(str) || spannableString.length() == 0) {
            callback.run(spannableString);
        } else {
            Utilities.searchQueue.postRunnable(new gk(spannableString.toString(), str, spannableString, callback, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$highlight$3(Spannable spannable) {
        ((LockedSpannableString) spannable).unlock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiLoaded, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$highlight$4(ArrayList arrayList, Spannable spannable) {
        long currentTimeMillis = System.currentTimeMillis();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            CachedToSpan cachedToSpan = (CachedToSpan) arrayList.get(i9);
            spannable.setSpan(new ColorSpan(cachedToSpan.group), cachedToSpan.start, cachedToSpan.end, 33);
        }
        FileLog.d("[CodeHighlighter] applying " + arrayList.size() + " colorize spans took " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiLoaded, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$highlight$5(Spannable spannable, int i9, int i10, String str) {
        if (compiledPatterns == null) {
            parse();
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringToken[][] stringTokenArr = new StringToken[1][];
        try {
            String charSequence = spannable.subSequence(i9, i10).toString();
            HashMap<String, TokenPattern[]> hashMap = compiledPatterns;
            stringTokenArr[0] = tokenize(charSequence, hashMap == null ? null : hashMap.get(str), 0).toArray();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        FileLog.d("[CodeHighlighter] tokenize took " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        long currentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        colorize(spannable, i9, i10, stringTokenArr[0], -1, arrayList);
        FileLog.d("[CodeHighlighter] colorize took " + (System.currentTimeMillis() - currentTimeMillis2) + "ms");
        if (arrayList.isEmpty()) {
            return;
        }
        if (!(spannable instanceof LockedSpannableString)) {
            AndroidUtilities.runOnUIThread(new c3(21, arrayList, spannable));
            return;
        }
        long currentTimeMillis3 = System.currentTimeMillis();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            CachedToSpan cachedToSpan = (CachedToSpan) arrayList.get(i11);
            spannable.setSpan(new ColorSpan(cachedToSpan.group), cachedToSpan.start, cachedToSpan.end, 33);
        }
        FileLog.d("[CodeHighlighter] applying " + arrayList.size() + " colorize spans took " + (System.currentTimeMillis() - currentTimeMillis3) + "ms in another thread");
        AndroidUtilities.runOnUIThread(new e1((LockedSpannableString) spannable, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$highlightEditable$0(ArrayList arrayList, SpannableString spannableString, Utilities.Callback callback) {
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            CachedToSpan cachedToSpan = (CachedToSpan) arrayList.get(i9);
            spannableString.setSpan(new ColorSpan(cachedToSpan.group), cachedToSpan.start, cachedToSpan.end, 33);
        }
        callback.run(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$highlightEditable$1(String str, String str2, SpannableString spannableString, Utilities.Callback callback) {
        SpannableString spannableString2;
        HashMap<String, TokenPattern[]> hashMap;
        if (compiledPatterns == null) {
            parse();
        }
        ArrayList arrayList = new ArrayList();
        try {
            hashMap = compiledPatterns;
            spannableString2 = spannableString;
        } catch (Exception e10) {
            e = e10;
            spannableString2 = spannableString;
        }
        try {
            colorize(spannableString2, 0, spannableString.length(), tokenize(str, hashMap == null ? null : hashMap.get(str2), 0).toArray(), -1, arrayList);
        } catch (Exception e11) {
            e = e11;
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new f0(arrayList, (Object) spannableString2, (Object) callback, 12));
        }
        AndroidUtilities.runOnUIThread(new f0(arrayList, (Object) spannableString2, (Object) callback, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepare$2() {
        if (compiledPatterns == null) {
            parse();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void matchGrammar(String str, LinkedList linkedList, TokenPattern[] tokenPatternArr, Node node, int i9, RematchOptions rematchOptions, TokenPattern tokenPattern, int i10) {
        int i11;
        Match matchPattern;
        int i12;
        String substring;
        String substring2;
        int length;
        TokenPattern[] tokenPatternArr2;
        int i13;
        StringToken stringToken;
        int i14;
        String str2 = str;
        LinkedList linkedList2 = linkedList;
        TokenPattern[] tokenPatternArr3 = tokenPatternArr;
        if (tokenPatternArr3 == null || i10 > 20) {
            return;
        }
        int length2 = tokenPatternArr3.length;
        int i15 = 0;
        while (i15 < length2) {
            TokenPattern tokenPattern2 = tokenPatternArr3[i15];
            if (tokenPattern2 == tokenPattern) {
                return;
            }
            if (rematchOptions != null && rematchOptions.cause == tokenPattern2) {
                return;
            }
            Node node2 = node.next;
            int i16 = i9;
            while (node2 != linkedList2.tail) {
                if (rematchOptions != null && i16 >= rematchOptions.reach) {
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
                        matchPattern = matchPattern(tokenPattern2, i16, str2);
                        if (matchPattern != null && matchPattern.index < str2.length()) {
                            int i17 = matchPattern.index;
                            int i18 = matchPattern.length + i17;
                            int length3 = node2.value.length();
                            while (true) {
                                i16 += length3;
                                if (i17 < i16) {
                                    break;
                                }
                                node2 = node2.next;
                                length3 = node2.value.length();
                            }
                            i16 -= node2.value.length();
                            StringToken stringToken3 = node2.value;
                            if (stringToken3.string != null && !stringToken3.token) {
                                int i19 = i16;
                                int i20 = 1;
                                for (Node node3 = node2; node3 != linkedList2.tail && (i19 < i18 || !node3.value.token); node3 = node3.next) {
                                    i20++;
                                    i19 += node3.value.length();
                                }
                                str3 = str2.substring(i16, i19);
                                matchPattern.index -= i16;
                                i12 = i20 - 1;
                                i11 = 0;
                                int i21 = matchPattern.index;
                                substring = str3.substring(i11, i21);
                                substring2 = str3.substring(i21 + matchPattern.length);
                                length = str3.length() + i16;
                                if (rematchOptions != null && length > rematchOptions.reach) {
                                    rematchOptions.reach = length;
                                }
                                Node node4 = node2.prev;
                                if (substring.length() > 0) {
                                    node4 = linkedList2.addAfter(node4, new StringToken(substring));
                                    i16 += substring.length();
                                }
                                linkedList2.removeRange(node4, i12);
                                tokenPatternArr2 = tokenPattern2.insideTokenPatterns;
                                if (tokenPatternArr2 == null) {
                                    i13 = i16;
                                    stringToken = new StringToken(tokenPattern2.group, tokenize(matchPattern.string, tokenPatternArr2, tokenPattern2, i10 + 1), matchPattern.length);
                                } else {
                                    i13 = i16;
                                    String str4 = tokenPattern2.insideLanguage;
                                    stringToken = str4 != null ? new StringToken(tokenPattern2.group, tokenize(matchPattern.string, compiledPatterns.get(str4), tokenPattern2, i10 + 1), matchPattern.length) : new StringToken(tokenPattern2.group, matchPattern.string);
                                }
                                Node addAfter = linkedList2.addAfter(node4, stringToken);
                                if (substring2.length() > 0) {
                                    linkedList2.addAfter(addAfter, new StringToken(substring2));
                                }
                                if (i12 > 1) {
                                    RematchOptions rematchOptions2 = new RematchOptions();
                                    rematchOptions2.cause = tokenPattern2;
                                    rematchOptions2.reach = length;
                                    matchGrammar(str, linkedList2, tokenPatternArr, addAfter.prev, i13, rematchOptions2, tokenPattern, i10 + 1);
                                    if (rematchOptions != null && (i14 = rematchOptions2.reach) > rematchOptions.reach) {
                                        rematchOptions.reach = i14;
                                    }
                                }
                                node2 = addAfter;
                                i16 = i13;
                            }
                        }
                        i15++;
                        str2 = str;
                        linkedList2 = linkedList;
                        tokenPatternArr3 = tokenPatternArr;
                    } else {
                        i11 = 0;
                        matchPattern = matchPattern(tokenPattern2, 0, str3);
                        if (matchPattern != null) {
                            i12 = 1;
                            int i212 = matchPattern.index;
                            substring = str3.substring(i11, i212);
                            substring2 = str3.substring(i212 + matchPattern.length);
                            length = str3.length() + i16;
                            if (rematchOptions != null) {
                                rematchOptions.reach = length;
                            }
                            Node node42 = node2.prev;
                            if (substring.length() > 0) {
                            }
                            linkedList2.removeRange(node42, i12);
                            tokenPatternArr2 = tokenPattern2.insideTokenPatterns;
                            if (tokenPatternArr2 == null) {
                            }
                            Node addAfter2 = linkedList2.addAfter(node42, stringToken);
                            if (substring2.length() > 0) {
                            }
                            if (i12 > 1) {
                            }
                            node2 = addAfter2;
                            i16 = i13;
                        }
                    }
                }
                i16 += node2.value.length();
                node2 = node2.next;
                str2 = str;
                linkedList2 = linkedList;
            }
            i15++;
            str2 = str;
            linkedList2 = linkedList;
            tokenPatternArr3 = tokenPatternArr;
        }
    }

    private static Match matchPattern(TokenPattern tokenPattern, int i9, String str) {
        try {
            Matcher matcher = tokenPattern.pattern.getPattern().matcher(str);
            matcher.region(i9, str.length());
            if (!matcher.find()) {
                return null;
            }
            Match match = new Match();
            match.index = matcher.start();
            if (tokenPattern.lookbehind && matcher.groupCount() >= 1) {
                match.index = (matcher.end(1) - matcher.start(1)) + match.index;
            }
            int end = matcher.end();
            int i10 = match.index;
            int i11 = end - i10;
            match.length = i11;
            match.string = str.substring(i10, i11 + i10);
            return match;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0171 A[Catch: Exception -> 0x016d, TryCatch #2 {Exception -> 0x016d, blocks: (B:98:0x0169, B:87:0x0171, B:89:0x0176), top: B:97:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0176 A[Catch: Exception -> 0x016d, TRY_LEAVE, TryCatch #2 {Exception -> 0x016d, blocks: (B:98:0x0169, B:87:0x0171, B:89:0x0176), top: B:97:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [org.telegram.messenger.CodeHighlighting$1] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.InputStream, java.util.zip.GZIPInputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void parse() {
        InputStream inputStream;
        ?? r52;
        BufferedInputStream bufferedInputStream;
        long currentTimeMillis;
        ?? r12 = 0;
        r12 = 0;
        try {
            try {
                currentTimeMillis = System.currentTimeMillis();
                inputStream = ApplicationLoader.applicationContext.getAssets().open("codelng.gzip");
                try {
                    r52 = new GZIPInputStream(inputStream, 65536);
                    try {
                        bufferedInputStream = new BufferedInputStream(r52, 65536);
                    } catch (Exception e10) {
                        e = e10;
                        bufferedInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = null;
                    }
                } catch (Exception e11) {
                    e = e11;
                    bufferedInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    r52 = 0;
                    bufferedInputStream = r52;
                    Throwable th3 = th;
                    if (r52 != 0) {
                    }
                    if (bufferedInputStream != null) {
                    }
                    if (inputStream == null) {
                    }
                }
            } catch (Exception e12) {
                FileLog.e(e12);
                return;
            }
        } catch (Exception e13) {
            e = e13;
            inputStream = null;
            bufferedInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            r52 = 0;
        }
        try {
            StreamReader streamReader = new StreamReader(bufferedInputStream);
            HashMap hashMap = new HashMap();
            int readUint8 = streamReader.readUint8();
            for (int i9 = 0; i9 < readUint8; i9++) {
                int readUint82 = streamReader.readUint8();
                int readUint83 = streamReader.readUint8();
                String[] strArr = new String[readUint83];
                for (int i10 = 0; i10 < readUint83; i10++) {
                    strArr[i10] = streamReader.readString();
                }
                hashMap.put(Integer.valueOf(readUint82), strArr);
            }
            int readUint16 = streamReader.readUint16();
            ParsedPattern[] parsedPatternArr = new ParsedPattern[readUint16];
            for (int i11 = 0; i11 < readUint16; i11++) {
                parsedPatternArr[i11] = new ParsedPattern();
                int readUint84 = streamReader.readUint8();
                ParsedPattern parsedPattern = parsedPatternArr[i11];
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
            int i12 = 0;
            while (i12 < readUint8) {
                int readUint85 = streamReader.readUint8();
                TokenPattern[] readTokens = readTokens(streamReader, parsedPatternArr, hashMap);
                String[] strArr2 = (String[]) hashMap.get(Integer.valueOf(readUint85));
                int length = strArr2.length;
                int i13 = 0;
                while (i13 < length) {
                    compiledPatterns.put(strArr2[i13], readTokens);
                    i13++;
                    streamReader = streamReader;
                }
                StreamReader streamReader2 = streamReader;
                if (strArr2.length > 0 && !"plain".equals(strArr2[0]) && !strArr2[0].endsWith("like") && !strArr2[0].startsWith("markup")) {
                    languages.add(strArr2[0]);
                }
                i12++;
                streamReader = streamReader2;
            }
            FileLog.d("[CodeHighlighter] Successfully read " + readUint8 + " languages, " + readUint16 + " patterns in " + (System.currentTimeMillis() - currentTimeMillis) + "ms from codelng.gzip");
            r52.close();
            bufferedInputStream.close();
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Exception e14) {
            e = e14;
            r12 = r52;
            try {
                FileLog.e(e);
                if (r12 != 0) {
                    r12.close();
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th5) {
                th = th5;
                r52 = r12;
                Throwable th32 = th;
                if (r52 != 0) {
                    try {
                        r52.close();
                    } catch (Exception e15) {
                        FileLog.e(e15);
                        throw th32;
                    }
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream == null) {
                    throw th32;
                }
                inputStream.close();
                throw th32;
            }
        } catch (Throwable th6) {
            th = th6;
            Throwable th322 = th;
            if (r52 != 0) {
            }
            if (bufferedInputStream != null) {
            }
            if (inputStream == null) {
            }
        }
    }

    public static void prepare() {
        if (compiledPatterns != null) {
            return;
        }
        Utilities.searchQueue.postRunnable(new w1(7));
    }

    private static TokenPattern[] readTokens(StreamReader streamReader, ParsedPattern[] parsedPatternArr, HashMap<Integer, String[]> hashMap) {
        int readUint8 = streamReader.readUint8();
        TokenPattern[] tokenPatternArr = new TokenPattern[readUint8];
        for (int i9 = 0; i9 < readUint8; i9++) {
            int readUint82 = streamReader.readUint8();
            int i10 = readUint82 & 3;
            int i11 = (readUint82 >> 2) & 7;
            boolean z10 = (readUint82 & 32) != 0;
            boolean z11 = (readUint82 & 64) != 0;
            int readUint16 = streamReader.readUint16();
            if (i10 == 0) {
                tokenPatternArr[i9] = new TokenPattern(i11, parsedPatternArr[readUint16].getCachedPattern());
            } else if (i10 == 1) {
                if (i11 == 0) {
                    tokenPatternArr[i9] = new TokenPattern(parsedPatternArr[readUint16].getCachedPattern(), readTokens(streamReader, parsedPatternArr, hashMap));
                } else {
                    tokenPatternArr[i9] = new TokenPattern(i11, parsedPatternArr[readUint16].getCachedPattern(), readTokens(streamReader, parsedPatternArr, hashMap));
                }
            } else if (i10 == 2) {
                tokenPatternArr[i9] = new TokenPattern(parsedPatternArr[readUint16].getCachedPattern(), hashMap.get(Integer.valueOf(streamReader.readUint8()))[0]);
            }
            if (z10) {
                tokenPatternArr[i9].greedy = true;
            }
            if (z11) {
                tokenPatternArr[i9].lookbehind = true;
            }
        }
        return tokenPatternArr;
    }

    private static LinkedList tokenize(String str, TokenPattern[] tokenPatternArr, int i9) {
        return tokenize(str, tokenPatternArr, null, i9);
    }

    private static LinkedList tokenize(String str, TokenPattern[] tokenPatternArr, TokenPattern tokenPattern, int i9) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAfter(linkedList.head, new StringToken(str));
        matchGrammar(str, linkedList, flatRest(tokenPatternArr), linkedList.head, 0, null, tokenPattern, i9);
        return linkedList;
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class TokenPattern {
        public boolean greedy;
        public int group;
        public String insideLanguage;
        public TokenPattern[] insideTokenPatterns;
        public boolean lookbehind;
        public final CachedPattern pattern;

        public TokenPattern(int i9, CachedPattern cachedPattern) {
            this.pattern = cachedPattern;
            this.group = i9;
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

        public TokenPattern(int i9, CachedPattern cachedPattern, TokenPattern... tokenPatternArr) {
            this.group = i9;
            this.pattern = cachedPattern;
            this.insideTokenPatterns = tokenPatternArr;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class StringToken {
        final int group;
        final LinkedList inside;
        final int insideLength;
        final String string;
        final boolean token;

        public StringToken(int i9, String str) {
            this.token = true;
            this.group = i9;
            this.string = str;
            this.inside = null;
            this.insideLength = 0;
        }

        public int length() {
            String str = this.string;
            return str != null ? str.length() : this.insideLength;
        }

        public StringToken(int i9, LinkedList linkedList, int i10) {
            this.token = true;
            this.group = i9;
            this.string = null;
            this.inside = linkedList;
            this.insideLength = i10;
        }

        public StringToken(String str) {
            this.token = false;
            this.group = -1;
            this.string = str;
            this.inside = null;
            this.insideLength = 0;
        }
    }
}
