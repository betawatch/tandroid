package li;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ug0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public abstract class a5 {
    public static Object a(Spanned spanned, int i7, int i10, Class cls) {
        for (Object obj : spanned.getSpans(i7, Math.max(i7, i10), cls)) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (spanStart <= i7 && spanEnd >= i10) {
                return obj;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(CharSequence charSequence) {
        int i7;
        boolean z9;
        ArrayList arrayList = new ArrayList();
        if (charSequence == null) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = new TL_iv.textEmpty();
            arrayList.add(pageblockparagraph);
            return arrayList;
        }
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(0);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (charSequence.charAt(i10) == '\n') {
                arrayList2.add(Integer.valueOf(i10 + 1));
            }
        }
        int size = arrayList2.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = ((Integer) arrayList2.get(i11)).intValue();
        }
        int length = charSequence.length();
        int i12 = 0;
        while (i12 < size) {
            int i13 = iArr[i12];
            i12++;
            boolean z10 = true;
            int i14 = i12 < size ? iArr[i12] - 1 : length;
            ni.j jVar = spanned == null ? null : (ni.j) a(spanned, i13, i14, ni.j.class);
            ug0 ug0Var = (spanned == null || jVar != null) ? 0 : (ug0) a(spanned, i13, i14, ug0.class);
            if (jVar == null && ug0Var == 0) {
                CharSequence subSequence = charSequence.subSequence(i13, i14);
                TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                pageblockparagraph2.text = c6.f(subSequence);
                arrayList.add(pageblockparagraph2);
            } else {
                ni.j jVar2 = jVar != null ? jVar : ug0Var;
                while (true) {
                    if (i12 >= size) {
                        i7 = length;
                        z9 = z10;
                        break;
                    }
                    int i15 = iArr[i12];
                    z9 = z10;
                    int i16 = i12 + 1;
                    if (i16 < size) {
                        i7 = length;
                        length = iArr[i16] - 1;
                    } else {
                        i7 = length;
                    }
                    if ((jVar != null ? a(spanned, i15, length, ni.j.class) : a(spanned, i15, length, ug0.class)) != jVar2) {
                        break;
                    }
                    i14 = length;
                    i12 = i16;
                    z10 = z9;
                    length = i7;
                }
                CharSequence subSequence2 = charSequence.subSequence(i13, i14);
                if (jVar != null) {
                    TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                    pageblockpreformatted.text = c6.f(subSequence2);
                    String str = jVar.a;
                    if (str == null) {
                        str = "";
                    }
                    pageblockpreformatted.language = str;
                    arrayList.add(pageblockpreformatted);
                } else {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    pageblockblockquote.text = c6.f(subSequence2);
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                    pageblockblockquote.collapsed = (ug0Var == 0 || !ug0Var.e) ? false : z9;
                    arrayList.add(pageblockblockquote);
                }
                length = i7;
            }
        }
        if (arrayList.isEmpty()) {
            TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
            pageblockparagraph3.text = new TL_iv.textEmpty();
            arrayList.add(pageblockparagraph3);
        }
        return arrayList;
    }

    public static boolean c(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textPlain) || (richText instanceof TL_iv.textCustomEmoji)) {
            return false;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if ((richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMath) || (richText instanceof TL_iv.textButton)) {
                return true;
            }
            return c(richText.text);
        }
        ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_iv.RichText richText2 = arrayList.get(i7);
            i7++;
            if (c(richText2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(ArrayList arrayList, HashMap hashMap) {
        boolean c10;
        TL_iv.RichText richText;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                a aVar = (a) obj;
                if (aVar == null) {
                    c10 = false;
                } else {
                    ArrayList arrayList2 = aVar.k;
                    if (!aVar.i && aVar.c <= 0) {
                        TL_iv.PageBlock pageBlock = aVar.b;
                        if (!(pageBlock instanceof TL_iv.pageBlockPullquote)) {
                            boolean z9 = pageBlock instanceof TL_iv.pageBlockBlockquote;
                            if (arrayList2.size() + (z9 ? 1 : 0) <= 1 && (!z9 || (richText = ((TL_iv.pageBlockBlockquote) pageBlock).caption) == null || (richText instanceof TL_iv.textEmpty) || c6.l(richText).isEmpty())) {
                                if (hashMap != null && !arrayList2.isEmpty()) {
                                    int size2 = arrayList2.size();
                                    int i10 = 0;
                                    while (i10 < size2) {
                                        Object obj2 = arrayList2.get(i10);
                                        i10++;
                                        TL_iv.RichText richText2 = (TL_iv.RichText) hashMap.get((Long) obj2);
                                        if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty) && !c6.l(richText2).isEmpty()) {
                                            break;
                                        }
                                    }
                                }
                                if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || z9) {
                                    c10 = c(pageBlock.text);
                                }
                            }
                        }
                    }
                    c10 = true;
                }
                if (c10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static SpannableStringBuilder e(a aVar, boolean z9) {
        SpannableStringBuilder r10;
        if (z9) {
            TL_iv.PageBlock pageBlock = aVar.b;
            r10 = c6.r(pageBlock != null ? pageBlock.text : null, pageBlock, false);
        } else {
            TL_iv.PageBlock pageBlock2 = aVar.b;
            r10 = c6.r(pageBlock2 != null ? pageBlock2.text : null, pageBlock2, true);
        }
        if (!(aVar.b instanceof TL_iv.pageBlockPreformatted)) {
            return r10;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r10);
        spannableStringBuilder.setSpan(new ni.j(((TL_iv.pageBlockPreformatted) aVar.b).language, spannableStringBuilder.toString(), true), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f(List list, boolean z9) {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (list != null && i7 < list.size()) {
            a aVar = (a) list.get(i7);
            if (aVar.k.isEmpty()) {
                TL_iv.PageBlock pageBlock = aVar.b;
                if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z9 ? c6.r(pageBlock.text, pageBlock, false) : c6.r(pageBlock.text, pageBlock, true));
                    TL_iv.PageBlock pageBlock2 = aVar.b;
                    boolean z10 = (pageBlock2 instanceof TL_iv.pageBlockBlockquote) && ((TL_iv.pageBlockBlockquote) pageBlock2).collapsed;
                    if (spannableStringBuilder.length() > 0) {
                        ug0.b(spannableStringBuilder, 0, spannableStringBuilder.length(), z10);
                    }
                    arrayList.add(spannableStringBuilder);
                } else {
                    arrayList.add(e(aVar, z9));
                }
                i7++;
            } else {
                long longValue = ((Long) aVar.k.get(0)).longValue();
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                int i10 = i7;
                while (i10 < list.size() && !((a) list.get(i10)).k.isEmpty() && ((Long) ((a) list.get(i10)).k.get(0)).longValue() == longValue) {
                    if (i10 > i7) {
                        spannableStringBuilder2.append('\n');
                    }
                    spannableStringBuilder2.append((CharSequence) e((a) list.get(i10), z9));
                    i10++;
                }
                if (spannableStringBuilder2.length() > 0) {
                    ug0.b(spannableStringBuilder2, 0, spannableStringBuilder2.length(), false);
                }
                arrayList.add(spannableStringBuilder2);
                i7 = i10;
            }
        }
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i11 > 0) {
                spannableStringBuilder3.append('\n');
            }
            spannableStringBuilder3.append((CharSequence) arrayList.get(i11));
        }
        return spannableStringBuilder3;
    }

    public static SpannableStringBuilder g(ArrayList arrayList) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f(arrayList, true));
        int length = spannableStringBuilder.length();
        c6.o(spannableStringBuilder, 0, length, 65536, false, null);
        c6.o(spannableStringBuilder, 0, length, TLObject.FLAG_14, false, null);
        c6.o(spannableStringBuilder, 0, length, 32768, false, null);
        for (r rVar : (r[]) spannableStringBuilder.getSpans(0, length, r.class)) {
            spannableStringBuilder.removeSpan(rVar);
        }
        return spannableStringBuilder;
    }
}
