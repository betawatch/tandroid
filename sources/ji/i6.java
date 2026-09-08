package ji;

import android.graphics.Paint;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.o01;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public abstract class i6 {
    public static final int[] a = {1, 2, 16, 8, 4, 256, 16384, 32768, 65536};

    public static void a(SpannableStringBuilder spannableStringBuilder, TL_iv.RichText richText, int i10, TL_iv.PageBlock pageBlock, boolean z10) {
        String str;
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return;
        }
        int i11 = 0;
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
            int size = arrayList.size();
            while (i11 < size) {
                TL_iv.RichText richText2 = arrayList.get(i11);
                i11++;
                a(spannableStringBuilder, richText2, i10, pageBlock, z10);
            }
            return;
        }
        if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            boolean j3 = j(textdiff.text);
            boolean j10 = j(textdiff.old_text);
            int length = spannableStringBuilder.length();
            if (j3) {
                a(spannableStringBuilder, textdiff.old_text, i10, pageBlock, z10);
                if (spannableStringBuilder.length() > length) {
                    n01 n01Var = new n01();
                    n01Var.a = 8192;
                    spannableStringBuilder.setSpan(new o01(n01Var, 0), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            }
            a(spannableStringBuilder, textdiff.text, i10, pageBlock, z10);
            if (!j10) {
                if (spannableStringBuilder.length() > length) {
                    spannableStringBuilder.setSpan(new aw0(), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            } else {
                if (spannableStringBuilder.length() > length) {
                    n01 n01Var2 = new n01();
                    n01Var2.a = 4096;
                    spannableStringBuilder.setSpan(new o01(n01Var2, 0), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            }
        }
        if (richText instanceof TL_iv.textPlain) {
            b(spannableStringBuilder, ((TL_iv.textPlain) richText).text, i10, pageBlock);
            return;
        }
        if (richText instanceof TL_iv.textCustomEmoji) {
            TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
            String str2 = textcustomemoji.alt;
            CharSequence charSequence = (str2 == null || str2.isEmpty()) ? "😀" : textcustomemoji.alt;
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append(charSequence);
            org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(textcustomemoji.document_id, (Paint.FontMetricsInt) null);
            z5Var.cacheType = org.telegram.ui.Components.q5.g();
            spannableStringBuilder.setSpan(z5Var, length2, spannableStringBuilder.length(), 33);
            if (i10 != 0) {
                spannableStringBuilder.setSpan(p(i10, pageBlock), length2, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText;
            int length3 = spannableStringBuilder.length();
            a(spannableStringBuilder, texturl.text, i10, pageBlock, z10);
            if (spannableStringBuilder.length() <= length3 || (str = texturl.url) == null) {
                return;
            }
            spannableStringBuilder.setSpan(k(str), length3, spannableStringBuilder.length(), 33);
            return;
        }
        if (richText instanceof TL_iv.textDate) {
            TL_iv.textDate textdate = (TL_iv.textDate) richText;
            int length4 = spannableStringBuilder.length();
            a(spannableStringBuilder, textdate.text, i10, pageBlock, z10);
            if (spannableStringBuilder.length() > length4) {
                String charSequence2 = spannableStringBuilder.subSequence(length4, spannableStringBuilder.length()).toString();
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.flags = textdate.flags;
                tL_messageEntityFormattedDate.date = textdate.date;
                tL_messageEntityFormattedDate.applyFlags();
                n01 n01Var3 = new n01();
                n01Var3.a |= 128;
                spannableStringBuilder.setSpan(new h10(charSequence2, n01Var3, tL_messageEntityFormattedDate), length4, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textMath) {
            TL_iv.textMath textmath = (TL_iv.textMath) richText;
            int length5 = spannableStringBuilder.length();
            spannableStringBuilder.append(" ");
            Object a2 = t.a(textmath.source, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), AndroidUtilities.dp(SharedConfig.fontSize + 4));
            if (a2 != null) {
                spannableStringBuilder.setSpan(a2, length5, spannableStringBuilder.length(), 33);
            } else {
                int length6 = spannableStringBuilder.length();
                CharSequence charSequence3 = textmath.source;
                if (charSequence3 == null) {
                    charSequence3 = "";
                }
                spannableStringBuilder.replace(length5, length6, charSequence3);
            }
            if (spannableStringBuilder.length() <= length5 || i10 == 0) {
                return;
            }
            spannableStringBuilder.setSpan(p(i10, pageBlock), length5, spannableStringBuilder.length(), 33);
            return;
        }
        if (richText instanceof TL_iv.textButton) {
            TL_iv.textButton textbutton = (TL_iv.textButton) richText;
            int length7 = spannableStringBuilder.length();
            a(spannableStringBuilder, textbutton.text, i10, pageBlock, z10);
            if (z10 && spannableStringBuilder.length() > length7 && k4.c(textbutton.type)) {
                spannableStringBuilder.setSpan(new k4(textbutton), length7, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textBold) {
            i11 = 1;
        } else if (richText instanceof TL_iv.textItalic) {
            i11 = 2;
        } else if (richText instanceof TL_iv.textUnderline) {
            i11 = 16;
        } else if (richText instanceof TL_iv.textStrike) {
            i11 = 8;
        } else if (richText instanceof TL_iv.textFixed) {
            i11 = 4;
        } else if (richText instanceof TL_iv.textSpoiler) {
            i11 = 256;
        } else if (richText instanceof TL_iv.textSubscript) {
            i11 = 16384;
        } else if (richText instanceof TL_iv.textSuperscript) {
            i11 = 32768;
        } else if (richText instanceof TL_iv.textMarked) {
            i11 = 65536;
        }
        if (i11 != 0) {
            a(spannableStringBuilder, richText.text, i10 | i11, pageBlock, z10);
        } else {
            b(spannableStringBuilder, l(richText), i10, pageBlock);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, String str, int i10, TL_iv.PageBlock pageBlock) {
        if (str == null || str.isEmpty()) {
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        if (i10 != 0) {
            spannableStringBuilder.setSpan(p(i10, pageBlock), length, spannableStringBuilder.length(), 33);
        }
    }

    public static void c(Spannable spannable, int i10, int i11, int i12, TL_iv.PageBlock pageBlock) {
        if (i10 >= i11 || i12 == 0) {
            return;
        }
        spannable.setSpan(p(i12, pageBlock), i10, i11, 33);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(CharSequence charSequence) {
        int i10;
        if (!(charSequence instanceof Spanned) || charSequence.length() == 0) {
            return 0;
        }
        Spanned spanned = (Spanned) charSequence;
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.Components.z5[] z5VarArr = (org.telegram.ui.Components.z5[]) spanned.getSpans(0, charSequence.length(), org.telegram.ui.Components.z5.class);
        for (org.telegram.ui.Components.z5 z5Var : z5VarArr) {
            arrayList.add(z5Var);
        }
        for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spanned.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)) {
            int spanStart = spanned.getSpanStart(emojiSpan);
            int spanEnd = spanned.getSpanEnd(emojiSpan);
            int length = z5VarArr.length;
            while (true) {
                if (i10 >= length) {
                    arrayList.add(emojiSpan);
                    break;
                }
                org.telegram.ui.Components.z5 z5Var2 = z5VarArr[i10];
                i10 = (spanned.getSpanStart(z5Var2) == spanStart && spanned.getSpanEnd(z5Var2) == spanEnd) ? 0 : i10 + 1;
            }
        }
        if (arrayList.isEmpty()) {
            return 0;
        }
        int i11 = 0;
        while (i11 < charSequence.length()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                if (spanned.getSpanStart(obj) > i11 || spanned.getSpanEnd(obj) <= i11) {
                }
            }
            return 0;
        }
        return arrayList.size();
    }

    public static int e(Spanned spanned, int i10, int i11) {
        o01[] o01VarArr = (o01[]) spanned.getSpans(i10, i11, o01.class);
        int i12 = 0;
        for (o01 o01Var : o01VarArr) {
            int i13 = o01Var.b.a;
            if ((i13 & 512) != 0) {
                i13 |= 256;
            }
            i12 |= i13;
        }
        return 114975 & i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        if (r4.c != r8.c) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TL_iv.RichText f(CharSequence charSequence) {
        int i10;
        int length = charSequence == null ? 0 : charSequence.length();
        if (length == 0) {
            return new TL_iv.textEmpty();
        }
        if (!(charSequence instanceof Spanned)) {
            String charSequence2 = charSequence.toString();
            TL_iv.textPlain textplain = new TL_iv.textPlain();
            textplain.text = charSequence2;
            return textplain;
        }
        Spanned spanned = (Spanned) charSequence;
        ArrayList<TL_iv.RichText> arrayList = new ArrayList<>();
        h6 h6Var = null;
        int i11 = 0;
        while (i10 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i10, length, CharacterStyle.class);
            h6 h6Var2 = new h6();
            h6Var2.a = e(spanned, i10, nextSpanTransition);
            if (((k51[]) spanned.getSpans(i10, nextSpanTransition, k51.class)).length > 0) {
                h6Var2.a |= 4;
            }
            n51[] n51VarArr = (n51[]) spanned.getSpans(i10, nextSpanTransition, n51.class);
            if (n51VarArr.length > 0) {
                h6Var2.b = n51VarArr[0].getURL();
            }
            h10[] h10VarArr = (h10[]) spanned.getSpans(i10, nextSpanTransition, h10.class);
            if (h10VarArr.length > 0) {
                h6Var2.c = h10VarArr[0];
            }
            org.telegram.ui.Components.z5[] z5VarArr = (org.telegram.ui.Components.z5[]) spanned.getSpans(i10, nextSpanTransition, org.telegram.ui.Components.z5.class);
            if (z5VarArr.length > 0) {
                h6Var2.d = z5VarArr[0].getDocumentId();
            }
            t[] tVarArr = (t[]) spanned.getSpans(i10, nextSpanTransition, t.class);
            if (tVarArr.length > 0) {
                h6Var2.e = tVarArr[0].a;
            }
            k4[] k4VarArr = (k4[]) spanned.getSpans(i10, nextSpanTransition, k4.class);
            if (k4VarArr.length > 0) {
                h6Var2.f = k4VarArr[0];
            }
            if (h6Var != null) {
                k4 k4Var = h6Var.f;
                if (k4Var == null && h6Var2.f == null) {
                    if (h6Var.d == 0 && h6Var2.d == 0 && h6Var.e == null && h6Var2.e == null && h6Var.a == h6Var2.a) {
                        if ((r9 = h6Var.b) == null) {
                        }
                    }
                    arrayList.add(s(charSequence.subSequence(i11, i10).toString(), h6Var));
                    i11 = i10;
                } else {
                    i10 = (k4Var != null && k4Var == h6Var2.f) ? nextSpanTransition : 0;
                    arrayList.add(s(charSequence.subSequence(i11, i10).toString(), h6Var));
                    i11 = i10;
                }
            }
            h6Var = h6Var2;
        }
        String charSequence3 = charSequence.subSequence(i11, length).toString();
        if (h6Var == null) {
            h6Var = new h6();
        }
        arrayList.add(s(charSequence3, h6Var));
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        TL_iv.textConcat textconcat = new TL_iv.textConcat();
        textconcat.texts = arrayList;
        return textconcat;
    }

    public static boolean g(Editable editable, int i10, int i11) {
        int length = editable == null ? 0 : editable.length();
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max < max2 && com.google.android.gms.internal.vision.e2.u(editable)) {
            while (max < max2) {
                int nextSpanTransition = editable.nextSpanTransition(max, max2, h10.class);
                if (((h10[]) editable.getSpans(max, nextSpanTransition, h10.class)).length != 0) {
                    max = nextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean h(Editable editable, int i10, int i11) {
        int length = editable == null ? 0 : editable.length();
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max < max2 && com.google.android.gms.internal.vision.e2.u(editable)) {
            while (max < max2) {
                int nextSpanTransition = editable.nextSpanTransition(max, max2, n51.class);
                if (((n51[]) editable.getSpans(max, nextSpanTransition, n51.class)).length != 0) {
                    max = nextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean i(int i10, int i11, int i12, CharSequence charSequence) {
        int length = charSequence == null ? 0 : charSequence.length();
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max >= max2 || !(charSequence instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) charSequence;
        while (max < max2) {
            int nextSpanTransition = spanned.nextSpanTransition(max, max2, o01.class);
            if ((e(spanned, max, nextSpanTransition) & i12) == 0) {
                return false;
            }
            max = nextSpanTransition;
        }
        return true;
    }

    public static boolean j(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return true;
        }
        if (richText instanceof TL_iv.textPlain) {
            String str = ((TL_iv.textPlain) richText).text;
            return str == null || str.isEmpty();
        }
        if (richText instanceof TL_iv.textCustomEmoji) {
            return false;
        }
        if (richText instanceof TL_iv.textMath) {
            String str2 = ((TL_iv.textMath) richText).source;
            return str2 == null || str2.isEmpty();
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if (!(richText instanceof TL_iv.textDiff)) {
                return j(richText.text);
            }
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            return j(textdiff.text) && j(textdiff.old_text);
        }
        ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_iv.RichText richText2 = arrayList.get(i10);
            i10++;
            if (!j(richText2)) {
                return false;
            }
        }
        return true;
    }

    public static n51 k(String str) {
        n01 n01Var = new n01();
        n01Var.a = 1024;
        return new n51(str, n01Var);
    }

    public static String l(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return "";
        }
        if (richText instanceof TL_iv.textPlain) {
            String str = ((TL_iv.textPlain) richText).text;
            return str == null ? "" : str;
        }
        if (richText instanceof TL_iv.textCustomEmoji) {
            String str2 = ((TL_iv.textCustomEmoji) richText).alt;
            return str2 == null ? "" : str2;
        }
        if (richText instanceof TL_iv.textMath) {
            return " ";
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if (!(richText instanceof TL_iv.textDiff)) {
                return l(richText.text);
            }
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            return j(textdiff.text) ? l(textdiff.old_text) : l(textdiff.text);
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_iv.RichText richText2 = arrayList.get(i10);
            i10++;
            sb2.append(l(richText2));
        }
        return sb2.toString();
    }

    public static void m(Editable editable, int i10, int i11) {
        int length = editable.length();
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max >= max2) {
            return;
        }
        for (h10 h10Var : (h10[]) editable.getSpans(max, max2, h10.class)) {
            editable.removeSpan(h10Var);
        }
    }

    public static void n(Editable editable, int i10, int i11) {
        int length = editable.length();
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max >= max2) {
            return;
        }
        for (n51 n51Var : (n51[]) editable.getSpans(max, max2, n51.class)) {
            int spanStart = editable.getSpanStart(n51Var);
            int spanEnd = editable.getSpanEnd(n51Var);
            editable.removeSpan(n51Var);
            if (spanStart < max) {
                editable.setSpan(k(n51Var.getURL()), spanStart, max, 33);
            }
            if (spanEnd > max2) {
                editable.setSpan(k(n51Var.getURL()), max2, spanEnd, 33);
            }
        }
    }

    public static void o(Spannable spannable, int i10, int i11, int i12, boolean z10, TL_iv.PageBlock pageBlock) {
        int length = spannable.length();
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max >= max2) {
            return;
        }
        for (o01 o01Var : (o01[]) spannable.getSpans(max, max2, o01.class)) {
            int spanStart = spannable.getSpanStart(o01Var);
            int spanEnd = spannable.getSpanEnd(o01Var);
            int i13 = o01Var.b.a;
            spannable.removeSpan(o01Var);
            c(spannable, spanStart, max, i13, pageBlock);
            c(spannable, max2, spanEnd, i13, pageBlock);
            c(spannable, Math.max(spanStart, max), Math.min(spanEnd, max2), z10 ? i13 | i12 : (~i12) & i13, pageBlock);
        }
        if (z10) {
            while (max < max2) {
                int nextSpanTransition = spannable.nextSpanTransition(max, max2, o01.class);
                if (e(spannable, max, nextSpanTransition) == 0) {
                    c(spannable, max, nextSpanTransition, i12, pageBlock);
                }
                max = nextSpanTransition;
            }
        }
    }

    public static o01 p(int i10, TL_iv.PageBlock pageBlock) {
        n01 n01Var = new n01();
        n01Var.a = i10;
        n01Var.e = (pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockSubheader) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        return new o01(n01Var, 0);
    }

    public static int q(int i10, int i11, CharSequence charSequence) {
        int i12 = 0;
        for (int i13 = 0; i13 < 9; i13++) {
            int i14 = a[i13];
            if (i(i10, i11, i14, charSequence)) {
                i12 |= i14;
            }
        }
        return i12;
    }

    public static SpannableStringBuilder r(TL_iv.RichText richText, TL_iv.PageBlock pageBlock, boolean z10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        a(spannableStringBuilder, richText, 0, pageBlock, z10);
        return spannableStringBuilder;
    }

    public static TL_iv.RichText s(String str, h6 h6Var) {
        TL_iv.RichText richText;
        k4 k4Var = h6Var.f;
        if (k4Var != null) {
            return k4Var.a;
        }
        if (h6Var.e != null) {
            TL_iv.textMath textmath = new TL_iv.textMath();
            textmath.source = h6Var.e;
            return textmath;
        }
        long j3 = h6Var.d;
        if (j3 != 0) {
            TL_iv.textCustomEmoji textcustomemoji = new TL_iv.textCustomEmoji();
            textcustomemoji.document_id = j3;
            if (str == null) {
                str = "";
            }
            textcustomemoji.alt = str;
            richText = textcustomemoji;
        } else {
            TL_iv.textPlain textplain = new TL_iv.textPlain();
            textplain.text = str;
            richText = textplain;
        }
        int i10 = h6Var.a;
        TL_iv.RichText richText2 = richText;
        if ((i10 & 1) != 0) {
            TL_iv.RichText textbold = new TL_iv.textBold();
            textbold.text = richText;
            richText2 = textbold;
        }
        TL_iv.RichText richText3 = richText2;
        if ((i10 & 2) != 0) {
            TL_iv.RichText textitalic = new TL_iv.textItalic();
            textitalic.text = richText2;
            richText3 = textitalic;
        }
        TL_iv.RichText richText4 = richText3;
        if ((i10 & 16) != 0) {
            TL_iv.RichText textunderline = new TL_iv.textUnderline();
            textunderline.text = richText3;
            richText4 = textunderline;
        }
        TL_iv.RichText richText5 = richText4;
        if ((i10 & 8) != 0) {
            TL_iv.RichText textstrike = new TL_iv.textStrike();
            textstrike.text = richText4;
            richText5 = textstrike;
        }
        TL_iv.RichText richText6 = richText5;
        if ((i10 & 4) != 0) {
            TL_iv.RichText textfixed = new TL_iv.textFixed();
            textfixed.text = richText5;
            richText6 = textfixed;
        }
        TL_iv.RichText richText7 = richText6;
        if ((i10 & 256) != 0) {
            TL_iv.RichText textspoiler = new TL_iv.textSpoiler();
            textspoiler.text = richText6;
            richText7 = textspoiler;
        }
        TL_iv.RichText richText8 = richText7;
        if ((i10 & 16384) != 0) {
            TL_iv.RichText textsubscript = new TL_iv.textSubscript();
            textsubscript.text = richText7;
            richText8 = textsubscript;
        }
        TL_iv.RichText richText9 = richText8;
        if ((32768 & i10) != 0) {
            TL_iv.RichText textsuperscript = new TL_iv.textSuperscript();
            textsuperscript.text = richText8;
            richText9 = textsuperscript;
        }
        TL_iv.RichText richText10 = richText9;
        if ((i10 & 65536) != 0) {
            TL_iv.RichText textmarked = new TL_iv.textMarked();
            textmarked.text = richText9;
            richText10 = textmarked;
        }
        TL_iv.RichText richText11 = richText10;
        if (h6Var.b != null) {
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = richText10;
            texturl.url = h6Var.b;
            richText11 = texturl;
        }
        h10 h10Var = h6Var.c;
        if (h10Var == null) {
            return richText11;
        }
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = h10Var.b;
        TL_iv.textDate textdate = new TL_iv.textDate();
        textdate.text = richText11;
        textdate.flags = tL_messageEntityFormattedDate.flags;
        textdate.relative = tL_messageEntityFormattedDate.relative;
        textdate.short_time = tL_messageEntityFormattedDate.short_time;
        textdate.long_time = tL_messageEntityFormattedDate.long_time;
        textdate.short_date = tL_messageEntityFormattedDate.short_date;
        textdate.long_date = tL_messageEntityFormattedDate.long_date;
        textdate.day_of_week = tL_messageEntityFormattedDate.day_of_week;
        textdate.date = tL_messageEntityFormattedDate.date;
        return textdate;
    }
}
