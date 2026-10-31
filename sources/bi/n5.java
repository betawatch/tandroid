package bi;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.wh0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public abstract class n5 {
    public static Object a(Spanned spanned, int i10, int i11, Class cls) {
        for (Object obj : spanned.getSpans(i10, Math.max(i10, i11), cls)) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (spanStart <= i10 && spanEnd >= i11) {
                return obj;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(CharSequence charSequence) {
        int i10;
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
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (charSequence.charAt(i11) == '\n') {
                arrayList2.add(Integer.valueOf(i11 + 1));
            }
        }
        int size = arrayList2.size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
        }
        int length = charSequence.length();
        int i13 = 0;
        while (i13 < size) {
            int i14 = iArr[i13];
            i13++;
            boolean z11 = true;
            int i15 = i13 < size ? iArr[i13] - 1 : length;
            di.i iVar = spanned == null ? null : (di.i) a(spanned, i14, i15, di.i.class);
            wh0 wh0Var = (spanned == null || iVar != null) ? 0 : (wh0) a(spanned, i14, i15, wh0.class);
            if (iVar == null && wh0Var == 0) {
                CharSequence subSequence = charSequence.subSequence(i14, i15);
                TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                pageblockparagraph2.text = s6.f(subSequence);
                arrayList.add(pageblockparagraph2);
            } else {
                di.i iVar2 = iVar != null ? iVar : wh0Var;
                while (true) {
                    if (i13 >= size) {
                        i10 = length;
                        z10 = z11;
                        break;
                    }
                    int i16 = iArr[i13];
                    z10 = z11;
                    int i17 = i13 + 1;
                    if (i17 < size) {
                        i10 = length;
                        length = iArr[i17] - 1;
                    } else {
                        i10 = length;
                    }
                    if ((iVar != null ? a(spanned, i16, length, di.i.class) : a(spanned, i16, length, wh0.class)) != iVar2) {
                        break;
                    }
                    i15 = length;
                    i13 = i17;
                    z11 = z10;
                    length = i10;
                }
                CharSequence subSequence2 = charSequence.subSequence(i14, i15);
                if (iVar != null) {
                    TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                    pageblockpreformatted.text = s6.f(subSequence2);
                    String str = iVar.a;
                    if (str == null) {
                        str = "";
                    }
                    pageblockpreformatted.language = str;
                    arrayList.add(pageblockpreformatted);
                } else {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    pageblockblockquote.text = s6.f(subSequence2);
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                    pageblockblockquote.collapsed = (wh0Var == 0 || !wh0Var.e) ? false : z10;
                    arrayList.add(pageblockblockquote);
                }
                length = i10;
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
        int i10 = 0;
        while (i10 < size) {
            TL_iv.RichText richText2 = arrayList.get(i10);
            i10++;
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
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                a aVar = (a) obj;
                if (aVar == null) {
                    c10 = false;
                } else {
                    ArrayList arrayList2 = aVar.k;
                    if (!aVar.i && aVar.c <= 0) {
                        TL_iv.PageBlock pageBlock = aVar.b;
                        if (!(pageBlock instanceof TL_iv.pageBlockPullquote)) {
                            boolean z10 = pageBlock instanceof TL_iv.pageBlockBlockquote;
                            if (arrayList2.size() + (z10 ? 1 : 0) <= 1 && (!z10 || (richText = ((TL_iv.pageBlockBlockquote) pageBlock).caption) == null || (richText instanceof TL_iv.textEmpty) || s6.l(richText).isEmpty())) {
                                if (hashMap != null && !arrayList2.isEmpty()) {
                                    int size2 = arrayList2.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        Object obj2 = arrayList2.get(i11);
                                        i11++;
                                        TL_iv.RichText richText2 = (TL_iv.RichText) hashMap.get((Long) obj2);
                                        if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty) && !s6.l(richText2).isEmpty()) {
                                            break;
                                        }
                                    }
                                }
                                if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || z10) {
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

    public static SpannableStringBuilder e(a aVar, boolean z10) {
        SpannableStringBuilder r10;
        if (z10) {
            TL_iv.PageBlock pageBlock = aVar.b;
            r10 = s6.r(pageBlock != null ? pageBlock.text : null, pageBlock, false);
        } else {
            TL_iv.PageBlock pageBlock2 = aVar.b;
            r10 = s6.r(pageBlock2 != null ? pageBlock2.text : null, pageBlock2, true);
        }
        if (!(aVar.b instanceof TL_iv.pageBlockPreformatted)) {
            return r10;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r10);
        spannableStringBuilder.setSpan(new di.i(((TL_iv.pageBlockPreformatted) aVar.b).language, spannableStringBuilder.toString(), true), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f(List list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (list != null && i10 < list.size()) {
            a aVar = (a) list.get(i10);
            if (aVar.k.isEmpty()) {
                TL_iv.PageBlock pageBlock = aVar.b;
                if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z10 ? s6.r(pageBlock.text, pageBlock, false) : s6.r(pageBlock.text, pageBlock, true));
                    TL_iv.PageBlock pageBlock2 = aVar.b;
                    boolean z11 = (pageBlock2 instanceof TL_iv.pageBlockBlockquote) && ((TL_iv.pageBlockBlockquote) pageBlock2).collapsed;
                    if (spannableStringBuilder.length() > 0) {
                        wh0.b(spannableStringBuilder, 0, spannableStringBuilder.length(), z11);
                    }
                    arrayList.add(spannableStringBuilder);
                } else {
                    arrayList.add(e(aVar, z10));
                }
                i10++;
            } else {
                long longValue = ((Long) aVar.k.get(0)).longValue();
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                int i11 = i10;
                while (i11 < list.size() && !((a) list.get(i11)).k.isEmpty() && ((Long) ((a) list.get(i11)).k.get(0)).longValue() == longValue) {
                    if (i11 > i10) {
                        spannableStringBuilder2.append('\n');
                    }
                    spannableStringBuilder2.append((CharSequence) e((a) list.get(i11), z10));
                    i11++;
                }
                if (spannableStringBuilder2.length() > 0) {
                    wh0.b(spannableStringBuilder2, 0, spannableStringBuilder2.length(), false);
                }
                arrayList.add(spannableStringBuilder2);
                i10 = i11;
            }
        }
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (i12 > 0) {
                spannableStringBuilder3.append('\n');
            }
            spannableStringBuilder3.append((CharSequence) arrayList.get(i12));
        }
        return spannableStringBuilder3;
    }

    public static SpannableStringBuilder g(ArrayList arrayList) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f(arrayList, true));
        int length = spannableStringBuilder.length();
        s6.o(spannableStringBuilder, 0, length, 65536, false, null);
        s6.o(spannableStringBuilder, 0, length, TLObject.FLAG_14, false, null);
        s6.o(spannableStringBuilder, 0, length, 32768, false, null);
        for (v vVar : (v[]) spannableStringBuilder.getSpans(0, length, v.class)) {
            spannableStringBuilder.removeSpan(vVar);
        }
        return spannableStringBuilder;
    }
}
