package mi;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.xg0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public abstract class b5 {
    public static Object a(Spanned spanned, int i3, int i10, Class cls) {
        for (Object obj : spanned.getSpans(i3, Math.max(i3, i10), cls)) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (spanStart <= i3 && spanEnd >= i10) {
                return obj;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(CharSequence charSequence) {
        int i3;
        boolean z10;
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
            boolean z11 = true;
            int i14 = i12 < size ? iArr[i12] - 1 : length;
            oi.h hVar = spanned == null ? null : (oi.h) a(spanned, i13, i14, oi.h.class);
            xg0 xg0Var = (spanned == null || hVar != null) ? 0 : (xg0) a(spanned, i13, i14, xg0.class);
            if (hVar == null && xg0Var == 0) {
                CharSequence subSequence = charSequence.subSequence(i13, i14);
                TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                pageblockparagraph2.text = d6.f(subSequence);
                arrayList.add(pageblockparagraph2);
            } else {
                oi.h hVar2 = hVar != null ? hVar : xg0Var;
                while (true) {
                    if (i12 >= size) {
                        i3 = length;
                        z10 = z11;
                        break;
                    }
                    int i15 = iArr[i12];
                    z10 = z11;
                    int i16 = i12 + 1;
                    if (i16 < size) {
                        i3 = length;
                        length = iArr[i16] - 1;
                    } else {
                        i3 = length;
                    }
                    if ((hVar != null ? a(spanned, i15, length, oi.h.class) : a(spanned, i15, length, xg0.class)) != hVar2) {
                        break;
                    }
                    i14 = length;
                    i12 = i16;
                    z11 = z10;
                    length = i3;
                }
                CharSequence subSequence2 = charSequence.subSequence(i13, i14);
                if (hVar != null) {
                    TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                    pageblockpreformatted.text = d6.f(subSequence2);
                    String str = hVar.a;
                    if (str == null) {
                        str = "";
                    }
                    pageblockpreformatted.language = str;
                    arrayList.add(pageblockpreformatted);
                } else {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    pageblockblockquote.text = d6.f(subSequence2);
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                    pageblockblockquote.collapsed = (xg0Var == 0 || !xg0Var.e) ? false : z10;
                    arrayList.add(pageblockblockquote);
                }
                length = i3;
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
        int i3 = 0;
        while (i3 < size) {
            TL_iv.RichText richText2 = arrayList.get(i3);
            i3++;
            if (c(richText2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(ArrayList arrayList, HashMap hashMap) {
        boolean c2;
        TL_iv.RichText richText;
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                a aVar = (a) obj;
                if (aVar == null) {
                    c2 = false;
                } else {
                    ArrayList arrayList2 = aVar.k;
                    if (!aVar.i && aVar.c <= 0) {
                        TL_iv.PageBlock pageBlock = aVar.b;
                        if (!(pageBlock instanceof TL_iv.pageBlockPullquote)) {
                            boolean z10 = pageBlock instanceof TL_iv.pageBlockBlockquote;
                            if (arrayList2.size() + (z10 ? 1 : 0) <= 1 && (!z10 || (richText = ((TL_iv.pageBlockBlockquote) pageBlock).caption) == null || (richText instanceof TL_iv.textEmpty) || d6.l(richText).isEmpty())) {
                                if (hashMap != null && !arrayList2.isEmpty()) {
                                    int size2 = arrayList2.size();
                                    int i10 = 0;
                                    while (i10 < size2) {
                                        Object obj2 = arrayList2.get(i10);
                                        i10++;
                                        TL_iv.RichText richText2 = (TL_iv.RichText) hashMap.get((Long) obj2);
                                        if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty) && !d6.l(richText2).isEmpty()) {
                                            break;
                                        }
                                    }
                                }
                                if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || z10) {
                                    c2 = c(pageBlock.text);
                                }
                            }
                        }
                    }
                    c2 = true;
                }
                if (c2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static SpannableStringBuilder e(a aVar, boolean z10) {
        SpannableStringBuilder r5;
        if (z10) {
            TL_iv.PageBlock pageBlock = aVar.b;
            r5 = d6.r(pageBlock != null ? pageBlock.text : null, pageBlock, false);
        } else {
            TL_iv.PageBlock pageBlock2 = aVar.b;
            r5 = d6.r(pageBlock2 != null ? pageBlock2.text : null, pageBlock2, true);
        }
        if (!(aVar.b instanceof TL_iv.pageBlockPreformatted)) {
            return r5;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r5);
        spannableStringBuilder.setSpan(new oi.h(((TL_iv.pageBlockPreformatted) aVar.b).language, spannableStringBuilder.toString(), true), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f(List list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (list != null && i3 < list.size()) {
            a aVar = (a) list.get(i3);
            if (aVar.k.isEmpty()) {
                TL_iv.PageBlock pageBlock = aVar.b;
                if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z10 ? d6.r(pageBlock.text, pageBlock, false) : d6.r(pageBlock.text, pageBlock, true));
                    TL_iv.PageBlock pageBlock2 = aVar.b;
                    boolean z11 = (pageBlock2 instanceof TL_iv.pageBlockBlockquote) && ((TL_iv.pageBlockBlockquote) pageBlock2).collapsed;
                    if (spannableStringBuilder.length() > 0) {
                        xg0.b(spannableStringBuilder, 0, spannableStringBuilder.length(), z11);
                    }
                    arrayList.add(spannableStringBuilder);
                } else {
                    arrayList.add(e(aVar, z10));
                }
                i3++;
            } else {
                long longValue = ((Long) aVar.k.get(0)).longValue();
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                int i10 = i3;
                while (i10 < list.size() && !((a) list.get(i10)).k.isEmpty() && ((Long) ((a) list.get(i10)).k.get(0)).longValue() == longValue) {
                    if (i10 > i3) {
                        spannableStringBuilder2.append('\n');
                    }
                    spannableStringBuilder2.append((CharSequence) e((a) list.get(i10), z10));
                    i10++;
                }
                if (spannableStringBuilder2.length() > 0) {
                    xg0.b(spannableStringBuilder2, 0, spannableStringBuilder2.length(), false);
                }
                arrayList.add(spannableStringBuilder2);
                i3 = i10;
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
        d6.o(spannableStringBuilder, 0, length, 65536, false, null);
        d6.o(spannableStringBuilder, 0, length, TLObject.FLAG_14, false, null);
        d6.o(spannableStringBuilder, 0, length, 32768, false, null);
        for (r rVar : (r[]) spannableStringBuilder.getSpans(0, length, r.class)) {
            spannableStringBuilder.removeSpan(rVar);
        }
        return spannableStringBuilder;
    }
}
