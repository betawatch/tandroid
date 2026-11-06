package li;

import android.graphics.Paint;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.f6;
import org.telegram.messenger.iz;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.d41;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.zz;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public abstract class c6 {
    public static final int[] a = {1, 2, 16, 8, 4, 256, TLObject.FLAG_14, 32768, 65536};

    public static void a(SpannableStringBuilder spannableStringBuilder, TL_iv.RichText richText, int i7, TL_iv.PageBlock pageBlock, boolean z9) {
        String str;
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return;
        }
        int i10 = 0;
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
            int size = arrayList.size();
            while (i10 < size) {
                TL_iv.RichText richText2 = arrayList.get(i10);
                i10++;
                a(spannableStringBuilder, richText2, i7, pageBlock, z9);
            }
            return;
        }
        if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            boolean j3 = j(textdiff.text);
            boolean j10 = j(textdiff.old_text);
            int length = spannableStringBuilder.length();
            if (j3) {
                a(spannableStringBuilder, textdiff.old_text, i7, pageBlock, z9);
                if (spannableStringBuilder.length() > length) {
                    uy0 uy0Var = new uy0();
                    uy0Var.a = TLObject.FLAG_13;
                    spannableStringBuilder.setSpan(new vy0(uy0Var, 0), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            }
            a(spannableStringBuilder, textdiff.text, i7, pageBlock, z9);
            if (!j10) {
                if (spannableStringBuilder.length() > length) {
                    spannableStringBuilder.setSpan(new eu0(), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            } else {
                if (spannableStringBuilder.length() > length) {
                    uy0 uy0Var2 = new uy0();
                    uy0Var2.a = TLObject.FLAG_12;
                    spannableStringBuilder.setSpan(new vy0(uy0Var2, 0), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            }
        }
        if (richText instanceof TL_iv.textPlain) {
            b(spannableStringBuilder, ((TL_iv.textPlain) richText).text, i7, pageBlock);
            return;
        }
        if (richText instanceof TL_iv.textCustomEmoji) {
            TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
            String str2 = textcustomemoji.alt;
            CharSequence charSequence = (str2 == null || str2.isEmpty()) ? "😀" : textcustomemoji.alt;
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append(charSequence);
            org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(textcustomemoji.document_id, (Paint.FontMetricsInt) null);
            r5Var.cacheType = org.telegram.ui.Components.i5.f();
            spannableStringBuilder.setSpan(r5Var, length2, spannableStringBuilder.length(), 33);
            if (i7 != 0) {
                spannableStringBuilder.setSpan(p(i7, pageBlock), length2, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText;
            int length3 = spannableStringBuilder.length();
            a(spannableStringBuilder, texturl.text, i7, pageBlock, z9);
            if (spannableStringBuilder.length() <= length3 || (str = texturl.url) == null) {
                return;
            }
            spannableStringBuilder.setSpan(k(str), length3, spannableStringBuilder.length(), 33);
            return;
        }
        if (richText instanceof TL_iv.textDate) {
            TL_iv.textDate textdate = (TL_iv.textDate) richText;
            int length4 = spannableStringBuilder.length();
            a(spannableStringBuilder, textdate.text, i7, pageBlock, z9);
            if (spannableStringBuilder.length() > length4) {
                String charSequence2 = spannableStringBuilder.subSequence(length4, spannableStringBuilder.length()).toString();
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.flags = textdate.flags;
                tL_messageEntityFormattedDate.date = textdate.date;
                tL_messageEntityFormattedDate.applyFlags();
                uy0 uy0Var3 = new uy0();
                uy0Var3.a |= 128;
                spannableStringBuilder.setSpan(new zz(charSequence2, uy0Var3, tL_messageEntityFormattedDate), length4, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textMath) {
            TL_iv.textMath textmath = (TL_iv.textMath) richText;
            int length5 = spannableStringBuilder.length();
            spannableStringBuilder.append(" ");
            Object a10 = r.a(textmath.source, k6.x0(null, k6.G6, false), org.telegram.messenger.g0.L(iz.W0 + 4));
            if (a10 != null) {
                spannableStringBuilder.setSpan(a10, length5, spannableStringBuilder.length(), 33);
            } else {
                int length6 = spannableStringBuilder.length();
                CharSequence charSequence3 = textmath.source;
                if (charSequence3 == null) {
                    charSequence3 = "";
                }
                spannableStringBuilder.replace(length5, length6, charSequence3);
            }
            if (spannableStringBuilder.length() <= length5 || i7 == 0) {
                return;
            }
            spannableStringBuilder.setSpan(p(i7, pageBlock), length5, spannableStringBuilder.length(), 33);
            return;
        }
        if (richText instanceof TL_iv.textButton) {
            TL_iv.textButton textbutton = (TL_iv.textButton) richText;
            int length7 = spannableStringBuilder.length();
            a(spannableStringBuilder, textbutton.text, i7, pageBlock, z9);
            if (z9 && spannableStringBuilder.length() > length7 && i4.c(textbutton.type)) {
                spannableStringBuilder.setSpan(new i4(textbutton), length7, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textBold) {
            i10 = 1;
        } else if (richText instanceof TL_iv.textItalic) {
            i10 = 2;
        } else if (richText instanceof TL_iv.textUnderline) {
            i10 = 16;
        } else if (richText instanceof TL_iv.textStrike) {
            i10 = 8;
        } else if (richText instanceof TL_iv.textFixed) {
            i10 = 4;
        } else if (richText instanceof TL_iv.textSpoiler) {
            i10 = 256;
        } else if (richText instanceof TL_iv.textSubscript) {
            i10 = TLObject.FLAG_14;
        } else if (richText instanceof TL_iv.textSuperscript) {
            i10 = 32768;
        } else if (richText instanceof TL_iv.textMarked) {
            i10 = 65536;
        }
        if (i10 != 0) {
            a(spannableStringBuilder, richText.text, i7 | i10, pageBlock, z9);
        } else {
            b(spannableStringBuilder, l(richText), i7, pageBlock);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, String str, int i7, TL_iv.PageBlock pageBlock) {
        if (str == null || str.isEmpty()) {
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        if (i7 != 0) {
            spannableStringBuilder.setSpan(p(i7, pageBlock), length, spannableStringBuilder.length(), 33);
        }
    }

    public static void c(Spannable spannable, int i7, int i10, int i11, TL_iv.PageBlock pageBlock) {
        if (i7 >= i10 || i11 == 0) {
            return;
        }
        spannable.setSpan(p(i11, pageBlock), i7, i10, 33);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(CharSequence charSequence) {
        int i7;
        if (!(charSequence instanceof Spanned) || charSequence.length() == 0) {
            return 0;
        }
        Spanned spanned = (Spanned) charSequence;
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.Components.r5[] r5VarArr = (org.telegram.ui.Components.r5[]) spanned.getSpans(0, charSequence.length(), org.telegram.ui.Components.r5.class);
        for (org.telegram.ui.Components.r5 r5Var : r5VarArr) {
            arrayList.add(r5Var);
        }
        for (f6 f6Var : (f6[]) spanned.getSpans(0, charSequence.length(), f6.class)) {
            int spanStart = spanned.getSpanStart(f6Var);
            int spanEnd = spanned.getSpanEnd(f6Var);
            int length = r5VarArr.length;
            while (true) {
                if (i7 >= length) {
                    arrayList.add(f6Var);
                    break;
                }
                org.telegram.ui.Components.r5 r5Var2 = r5VarArr[i7];
                i7 = (spanned.getSpanStart(r5Var2) == spanStart && spanned.getSpanEnd(r5Var2) == spanEnd) ? 0 : i7 + 1;
            }
        }
        if (arrayList.isEmpty()) {
            return 0;
        }
        int i10 = 0;
        while (i10 < charSequence.length()) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                if (spanned.getSpanStart(obj) > i10 || spanned.getSpanEnd(obj) <= i10) {
                }
            }
            return 0;
        }
        return arrayList.size();
    }

    public static int e(Spanned spanned, int i7, int i10) {
        vy0[] vy0VarArr = (vy0[]) spanned.getSpans(i7, i10, vy0.class);
        int i11 = 0;
        for (vy0 vy0Var : vy0VarArr) {
            int i12 = vy0Var.b.a;
            if ((i12 & 512) != 0) {
                i12 |= 256;
            }
            i11 |= i12;
        }
        return 114975 & i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f8, code lost:
    
        if (((org.telegram.ui.Components.zz) r4.e) != ((org.telegram.ui.Components.zz) r8.e)) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TL_iv.RichText f(CharSequence charSequence) {
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
        b6 b6Var = null;
        int i7 = 0;
        int i10 = 0;
        while (i7 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i7, length, CharacterStyle.class);
            b6 b6Var2 = new b6();
            b6Var2.a = e(spanned, i7, nextSpanTransition);
            if (((a41[]) spanned.getSpans(i7, nextSpanTransition, a41.class)).length > 0) {
                b6Var2.a |= 4;
            }
            d41[] d41VarArr = (d41[]) spanned.getSpans(i7, nextSpanTransition, d41.class);
            if (d41VarArr.length > 0) {
                b6Var2.c = d41VarArr[0].getURL();
            }
            zz[] zzVarArr = (zz[]) spanned.getSpans(i7, nextSpanTransition, zz.class);
            if (zzVarArr.length > 0) {
                b6Var2.e = zzVarArr[0];
            }
            org.telegram.ui.Components.r5[] r5VarArr = (org.telegram.ui.Components.r5[]) spanned.getSpans(i7, nextSpanTransition, org.telegram.ui.Components.r5.class);
            if (r5VarArr.length > 0) {
                b6Var2.b = r5VarArr[0].getDocumentId();
            }
            r[] rVarArr = (r[]) spanned.getSpans(i7, nextSpanTransition, r.class);
            if (rVarArr.length > 0) {
                b6Var2.d = rVarArr[0].a;
            }
            i4[] i4VarArr = (i4[]) spanned.getSpans(i7, nextSpanTransition, i4.class);
            if (i4VarArr.length > 0) {
                b6Var2.f = i4VarArr[0];
            }
            if (b6Var != null) {
                i4 i4Var = (i4) b6Var.f;
                if (i4Var == null && ((i4) b6Var2.f) == null) {
                    if (b6Var.b == 0 && b6Var2.b == 0 && ((String) b6Var.d) == null && ((String) b6Var2.d) == null && b6Var.a == b6Var2.a) {
                        if ((r9 = (String) b6Var.c) == null) {
                        }
                    }
                    arrayList.add(s(charSequence.subSequence(i10, i7).toString(), b6Var));
                    i10 = i7;
                } else {
                    if (i4Var != null && i4Var == ((i4) b6Var2.f)) {
                        i7 = nextSpanTransition;
                    }
                    arrayList.add(s(charSequence.subSequence(i10, i7).toString(), b6Var));
                    i10 = i7;
                }
            }
            b6Var = b6Var2;
            i7 = nextSpanTransition;
        }
        String charSequence3 = charSequence.subSequence(i10, length).toString();
        if (b6Var == null) {
            b6Var = new b6();
        }
        arrayList.add(s(charSequence3, b6Var));
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        TL_iv.textConcat textconcat = new TL_iv.textConcat();
        textconcat.texts = arrayList;
        return textconcat;
    }

    public static boolean g(Editable editable, int i7, int i10) {
        int length = editable == null ? 0 : editable.length();
        int max = Math.max(0, Math.min(i7, length));
        int max2 = Math.max(0, Math.min(i10, length));
        if (max < max2 && com.google.android.recaptcha.internal.a.u(editable)) {
            while (max < max2) {
                int nextSpanTransition = editable.nextSpanTransition(max, max2, zz.class);
                if (((zz[]) editable.getSpans(max, nextSpanTransition, zz.class)).length != 0) {
                    max = nextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean h(Editable editable, int i7, int i10) {
        int length = editable == null ? 0 : editable.length();
        int max = Math.max(0, Math.min(i7, length));
        int max2 = Math.max(0, Math.min(i10, length));
        if (max < max2 && com.google.android.recaptcha.internal.a.u(editable)) {
            while (max < max2) {
                int nextSpanTransition = editable.nextSpanTransition(max, max2, d41.class);
                if (((d41[]) editable.getSpans(max, nextSpanTransition, d41.class)).length != 0) {
                    max = nextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean i(int i7, int i10, int i11, CharSequence charSequence) {
        int length = charSequence == null ? 0 : charSequence.length();
        int max = Math.max(0, Math.min(i7, length));
        int max2 = Math.max(0, Math.min(i10, length));
        if (max >= max2 || !(charSequence instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) charSequence;
        while (max < max2) {
            int nextSpanTransition = spanned.nextSpanTransition(max, max2, vy0.class);
            if ((e(spanned, max, nextSpanTransition) & i11) == 0) {
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
        int i7 = 0;
        while (i7 < size) {
            TL_iv.RichText richText2 = arrayList.get(i7);
            i7++;
            if (!j(richText2)) {
                return false;
            }
        }
        return true;
    }

    public static d41 k(String str) {
        uy0 uy0Var = new uy0();
        uy0Var.a = 1024;
        return new d41(str, uy0Var);
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
        int i7 = 0;
        while (i7 < size) {
            TL_iv.RichText richText2 = arrayList.get(i7);
            i7++;
            sb2.append(l(richText2));
        }
        return sb2.toString();
    }

    public static void m(Editable editable, int i7, int i10) {
        int length = editable.length();
        int max = Math.max(0, Math.min(i7, length));
        int max2 = Math.max(0, Math.min(i10, length));
        if (max >= max2) {
            return;
        }
        for (zz zzVar : (zz[]) editable.getSpans(max, max2, zz.class)) {
            editable.removeSpan(zzVar);
        }
    }

    public static void n(Editable editable, int i7, int i10) {
        int length = editable.length();
        int max = Math.max(0, Math.min(i7, length));
        int max2 = Math.max(0, Math.min(i10, length));
        if (max >= max2) {
            return;
        }
        for (d41 d41Var : (d41[]) editable.getSpans(max, max2, d41.class)) {
            int spanStart = editable.getSpanStart(d41Var);
            int spanEnd = editable.getSpanEnd(d41Var);
            editable.removeSpan(d41Var);
            if (spanStart < max) {
                editable.setSpan(k(d41Var.getURL()), spanStart, max, 33);
            }
            if (spanEnd > max2) {
                editable.setSpan(k(d41Var.getURL()), max2, spanEnd, 33);
            }
        }
    }

    public static void o(Spannable spannable, int i7, int i10, int i11, boolean z9, TL_iv.PageBlock pageBlock) {
        int length = spannable.length();
        int max = Math.max(0, Math.min(i7, length));
        int max2 = Math.max(0, Math.min(i10, length));
        if (max >= max2) {
            return;
        }
        for (vy0 vy0Var : (vy0[]) spannable.getSpans(max, max2, vy0.class)) {
            int spanStart = spannable.getSpanStart(vy0Var);
            int spanEnd = spannable.getSpanEnd(vy0Var);
            int i12 = vy0Var.b.a;
            spannable.removeSpan(vy0Var);
            c(spannable, spanStart, max, i12, pageBlock);
            c(spannable, max2, spanEnd, i12, pageBlock);
            c(spannable, Math.max(spanStart, max), Math.min(spanEnd, max2), z9 ? i12 | i11 : (~i11) & i12, pageBlock);
        }
        if (z9) {
            while (max < max2) {
                int nextSpanTransition = spannable.nextSpanTransition(max, max2, vy0.class);
                if (e(spannable, max, nextSpanTransition) == 0) {
                    c(spannable, max, nextSpanTransition, i11, pageBlock);
                }
                max = nextSpanTransition;
            }
        }
    }

    public static vy0 p(int i7, TL_iv.PageBlock pageBlock) {
        uy0 uy0Var = new uy0();
        uy0Var.a = i7;
        uy0Var.e = (pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockSubheader) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        return new vy0(uy0Var, 0);
    }

    public static int q(int i7, int i10, CharSequence charSequence) {
        int i11 = 0;
        for (int i12 = 0; i12 < 9; i12++) {
            int i13 = a[i12];
            if (i(i7, i10, i13, charSequence)) {
                i11 |= i13;
            }
        }
        return i11;
    }

    public static SpannableStringBuilder r(TL_iv.RichText richText, TL_iv.PageBlock pageBlock, boolean z9) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        a(spannableStringBuilder, richText, 0, pageBlock, z9);
        return spannableStringBuilder;
    }

    public static TL_iv.RichText s(String str, b6 b6Var) {
        TL_iv.RichText richText;
        i4 i4Var = (i4) b6Var.f;
        if (i4Var != null) {
            return i4Var.a;
        }
        if (((String) b6Var.d) != null) {
            TL_iv.textMath textmath = new TL_iv.textMath();
            textmath.source = (String) b6Var.d;
            return textmath;
        }
        long j3 = b6Var.b;
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
        int i7 = b6Var.a;
        TL_iv.RichText richText2 = richText;
        if ((i7 & 1) != 0) {
            TL_iv.RichText textbold = new TL_iv.textBold();
            textbold.text = richText;
            richText2 = textbold;
        }
        TL_iv.RichText richText3 = richText2;
        if ((i7 & 2) != 0) {
            TL_iv.RichText textitalic = new TL_iv.textItalic();
            textitalic.text = richText2;
            richText3 = textitalic;
        }
        TL_iv.RichText richText4 = richText3;
        if ((i7 & 16) != 0) {
            TL_iv.RichText textunderline = new TL_iv.textUnderline();
            textunderline.text = richText3;
            richText4 = textunderline;
        }
        TL_iv.RichText richText5 = richText4;
        if ((i7 & 8) != 0) {
            TL_iv.RichText textstrike = new TL_iv.textStrike();
            textstrike.text = richText4;
            richText5 = textstrike;
        }
        TL_iv.RichText richText6 = richText5;
        if ((i7 & 4) != 0) {
            TL_iv.RichText textfixed = new TL_iv.textFixed();
            textfixed.text = richText5;
            richText6 = textfixed;
        }
        TL_iv.RichText richText7 = richText6;
        if ((i7 & 256) != 0) {
            TL_iv.RichText textspoiler = new TL_iv.textSpoiler();
            textspoiler.text = richText6;
            richText7 = textspoiler;
        }
        TL_iv.RichText richText8 = richText7;
        if ((i7 & TLObject.FLAG_14) != 0) {
            TL_iv.RichText textsubscript = new TL_iv.textSubscript();
            textsubscript.text = richText7;
            richText8 = textsubscript;
        }
        TL_iv.RichText richText9 = richText8;
        if ((32768 & i7) != 0) {
            TL_iv.RichText textsuperscript = new TL_iv.textSuperscript();
            textsuperscript.text = richText8;
            richText9 = textsuperscript;
        }
        TL_iv.RichText richText10 = richText9;
        if ((i7 & 65536) != 0) {
            TL_iv.RichText textmarked = new TL_iv.textMarked();
            textmarked.text = richText9;
            richText10 = textmarked;
        }
        TL_iv.RichText richText11 = richText10;
        if (((String) b6Var.c) != null) {
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = richText10;
            texturl.url = (String) b6Var.c;
            richText11 = texturl;
        }
        zz zzVar = (zz) b6Var.e;
        if (zzVar == null) {
            return richText11;
        }
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = zzVar.b;
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
