package org.telegram.ui.Components;

import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g80 extends b8.lc {
    public final ArrayList a;
    public TL_iv.RichText b;
    public final ArrayList c = new ArrayList();
    public final StringBuilder d = new StringBuilder();
    public final xc.d e = new xc.d(new v7.s(27), new kb.a(28));
    public final ArrayDeque f;

    public g80(ArrayList arrayList, ArrayDeque arrayDeque) {
        this.a = arrayList;
        this.f = arrayDeque;
    }

    public static void A(int i3, List list, List list2) {
        for (Object obj : list) {
            if (obj instanceof e80) {
                list2.add(((e80) obj).a);
            } else if (obj instanceof f80) {
                C((f80) obj, list2, i3);
            }
        }
    }

    public static int B(gf.p pVar) {
        gf.s sVar;
        String str;
        gf.p pVar2 = (gf.p) pVar.c;
        if (!(pVar2 instanceof gf.r)) {
            return -1;
        }
        gf.p pVar3 = (gf.p) pVar2.c;
        if (!(pVar3 instanceof gf.s) || (str = (sVar = (gf.s) pVar3).g) == null) {
            return -1;
        }
        int i3 = 3;
        if (str.length() < 3) {
            return -1;
        }
        int i10 = 0;
        if (str.charAt(0) != '[' || str.charAt(2) != ']') {
            return -1;
        }
        char charAt = str.charAt(1);
        if (charAt != ' ') {
            if (charAt != 'x' && charAt != 'X') {
                return -1;
            }
            i10 = 1;
        }
        if (str.length() > 3 && str.charAt(3) == ' ') {
            i3 = 4;
        }
        sVar.g = str.substring(i3);
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void C(f80 f80Var, List list, int i3) {
        String str;
        xc.a aVar = f80Var.a;
        ArrayList arrayList = f80Var.c;
        String str2 = aVar.a;
        String lowerCase = str2 == null ? "" : str2.toLowerCase();
        if (i3 >= 64) {
            A(i3 + 1, arrayList, list);
        }
        switch (lowerCase.hashCode()) {
            case -1857640538:
                if (lowerCase.equals("summary")) {
                }
                A(i3 + 1, arrayList, list);
                break;
            case -1268861541:
                str = "footer";
                lowerCase.equals(str);
                A(i3 + 1, arrayList, list);
                break;
            case -1221270899:
                str = "header";
                lowerCase.equals(str);
                A(i3 + 1, arrayList, list);
                break;
            case -732377866:
                str = "article";
                lowerCase.equals(str);
                A(i3 + 1, arrayList, list);
                break;
            case org.telegram.messenger.hs.x1 /* 112 */:
                str = "p";
                lowerCase.equals(str);
                A(i3 + 1, arrayList, list);
                break;
            case 99473:
                str = "div";
                lowerCase.equals(str);
                A(i3 + 1, arrayList, list);
                break;
            case 108835:
                str = "nav";
                lowerCase.equals(str);
                A(i3 + 1, arrayList, list);
                break;
            case 3343801:
                str = "main";
                lowerCase.equals(str);
                A(i3 + 1, arrayList, list);
                break;
            case 93111608:
                str = "aside";
                lowerCase.equals(str);
                A(i3 + 1, arrayList, list);
                break;
            case 1557721666:
                if (lowerCase.equals("details")) {
                    TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
                    Map map = aVar.c;
                    int i10 = 0;
                    pageblockdetails.open = map != null && map.containsKey("open");
                    pageblockdetails.title = new TL_iv.textEmpty();
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        boolean z10 = obj instanceof f80;
                        if (z10) {
                            f80 f80Var2 = (f80) obj;
                            if ("summary".equalsIgnoreCase(f80Var2.a.a)) {
                                StringBuilder sb2 = new StringBuilder();
                                w(f80Var2.c, sb2);
                                String trim = sb2.toString().trim();
                                pageblockdetails.title = trim.isEmpty() ? new TL_iv.textEmpty() : k80.n(trim);
                            }
                        }
                        if (obj instanceof e80) {
                            arrayList2.add(((e80) obj).a);
                        } else if (z10) {
                            C((f80) obj, arrayList2, i3 + 1);
                        }
                    }
                    pageblockdetails.blocks.addAll(arrayList2);
                    list.add(pageblockdetails);
                    break;
                }
                A(i3 + 1, arrayList, list);
                break;
            case 1970241253:
                str = "section";
                lowerCase.equals(str);
                A(i3 + 1, arrayList, list);
                break;
            default:
                A(i3 + 1, arrayList, list);
                break;
        }
    }

    public static void w(List list, StringBuilder sb2) {
        for (Object obj : list) {
            if (obj instanceof e80) {
                TL_iv.PageBlock pageBlock = ((e80) obj).a;
                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(k80.p(((TL_iv.pageBlockParagraph) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(k80.p(((TL_iv.pageBlockHeader) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(k80.p(((TL_iv.pageBlockSubheader) pageBlock).text));
                }
            } else if (obj instanceof f80) {
                w(((f80) obj).c, sb2);
            }
        }
    }

    public static void z(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xc.a aVar = (xc.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f;
            z(arrayList, arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2));
        }
    }

    @Override // b8.lc
    public final void a(gf.b bVar) {
        for (TL_iv.RichText richText : k80.b(k80.a(bVar, null))) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = richText;
            pageblockblockquote.caption = new TL_iv.textEmpty();
            x(pageblockblockquote);
        }
    }

    @Override // b8.lc
    public final void b(gf.c cVar) {
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        for (gf.p pVar = (gf.p) cVar.c; pVar != null; pVar = (gf.p) pVar.f) {
            if (pVar instanceof gf.o) {
                int B = B(pVar);
                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                if (B >= 0) {
                    tL_pageListItemText.checkbox = true;
                    tL_pageListItemText.checked = B == 1;
                }
                tL_pageListItemText.text = k80.e(k80.a(pVar, pageblocklist));
                pageblocklist.items.add(tL_pageListItemText);
            }
        }
        x(pageblocklist);
    }

    @Override // b8.lc
    public final void f(gf.h hVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = k80.e(k80.n(hVar.k));
        String str = hVar.j;
        if (str == null) {
            str = "";
        }
        pageblockpreformatted.language = str;
        x(pageblockpreformatted);
    }

    @Override // b8.lc
    public final void g(gf.i iVar) {
        TL_iv.RichText e10 = k80.e(k80.a(iVar, null));
        if (this.c.isEmpty()) {
            this.b = e10;
        }
        switch (iVar.g) {
            case 1:
                TL_iv.pageBlockHeading1 pageblockheading1 = new TL_iv.pageBlockHeading1();
                pageblockheading1.text = e10;
                x(pageblockheading1);
                break;
            case 2:
                TL_iv.pageBlockHeading2 pageblockheading2 = new TL_iv.pageBlockHeading2();
                pageblockheading2.text = e10;
                x(pageblockheading2);
                break;
            case 3:
                TL_iv.pageBlockHeading3 pageblockheading3 = new TL_iv.pageBlockHeading3();
                pageblockheading3.text = e10;
                x(pageblockheading3);
                break;
            case 4:
                TL_iv.pageBlockHeading4 pageblockheading4 = new TL_iv.pageBlockHeading4();
                pageblockheading4.text = e10;
                x(pageblockheading4);
                break;
            case 5:
                TL_iv.pageBlockHeading5 pageblockheading5 = new TL_iv.pageBlockHeading5();
                pageblockheading5.text = e10;
                x(pageblockheading5);
                break;
            case 6:
                TL_iv.pageBlockHeading6 pageblockheading6 = new TL_iv.pageBlockHeading6();
                pageblockheading6.text = e10;
                x(pageblockheading6);
                break;
            default:
                TL_iv.pageBlockHeader pageblockheader = new TL_iv.pageBlockHeader();
                pageblockheader.text = e10;
                x(pageblockheader);
                break;
        }
    }

    @Override // b8.lc
    public final void h(gf.j jVar) {
        StringBuilder sb2 = this.d;
        String str = jVar.g;
        if (str == null) {
            return;
        }
        try {
            this.e.b(sb2, str);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            sb2.append(str);
        }
    }

    @Override // b8.lc
    public final void j(gf.l lVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = k80.e(k80.n(lVar.g));
        pageblockpreformatted.language = "";
        x(pageblockpreformatted);
    }

    @Override // b8.lc
    public final void k(gf.n nVar) {
        if (!(nVar instanceof bf.a)) {
            if (!(nVar instanceof wc.a)) {
                v(nVar);
                return;
            }
            TL_iv.PageBlock pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = k80.c(((wc.a) nVar).g);
            x(pageblockparagraph);
            return;
        }
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.title = new TL_iv.textEmpty();
        for (gf.p pVar = (gf.p) ((bf.a) nVar).c; pVar != null; pVar = (gf.p) pVar.f) {
            boolean z10 = pVar instanceof bf.e;
            if (z10 || (pVar instanceof bf.b)) {
                for (gf.p pVar2 = (gf.p) pVar.c; pVar2 != null; pVar2 = (gf.p) pVar2.f) {
                    if (pVar2 instanceof bf.f) {
                        ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        for (gf.p pVar3 = (gf.p) ((bf.f) pVar2).c; pVar3 != null; pVar3 = (gf.p) pVar3.f) {
                            if (pVar3 instanceof bf.d) {
                                ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                bf.d dVar = (bf.d) pVar3;
                                TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                pagetablecell.header = z10 || dVar.g;
                                bf.c cVar = dVar.h;
                                if (cVar == bf.c.b) {
                                    pagetablecell.align_center = true;
                                } else if (cVar == bf.c.c) {
                                    pagetablecell.align_right = true;
                                }
                                pagetablecell.text = k80.e(k80.a(dVar, null));
                                pagetablecell.flags |= 128;
                                arrayList2.add(pagetablecell);
                            }
                        }
                        arrayList.add(pagetablerow);
                    }
                }
            }
        }
        x(pageblocktable);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    @Override // b8.lc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(gf.q qVar) {
        String valueOf;
        int B;
        TL_iv.pageBlockOrderedList pageblockorderedlist = new TL_iv.pageBlockOrderedList();
        boolean z10 = ((gf.a) ((gf.p) qVar.b)) instanceof gf.f;
        int i3 = qVar.g;
        for (gf.p pVar = (gf.p) qVar.c; pVar != null; pVar = (gf.p) pVar.f) {
            if (pVar instanceof gf.o) {
                if (z10) {
                    ArrayDeque arrayDeque = this.f;
                    if (!arrayDeque.isEmpty()) {
                        valueOf = (String) arrayDeque.poll();
                        B = B(pVar);
                        TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                        if (B >= 0) {
                            tL_pageListOrderedItemText.checkbox = true;
                            tL_pageListOrderedItemText.checked = B == 1;
                        }
                        tL_pageListOrderedItemText.num = valueOf;
                        tL_pageListOrderedItemText.text = k80.e(k80.a(pVar, pageblockorderedlist));
                        pageblockorderedlist.items.add(tL_pageListOrderedItemText);
                    }
                }
                valueOf = String.valueOf(i3);
                i3++;
                B = B(pVar);
                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText2 = new TL_iv.TL_pageListOrderedItemText();
                if (B >= 0) {
                }
                tL_pageListOrderedItemText2.num = valueOf;
                tL_pageListOrderedItemText2.text = k80.e(k80.a(pVar, pageblockorderedlist));
                pageblockorderedlist.items.add(tL_pageListOrderedItemText2);
            }
        }
        x(pageblockorderedlist);
    }

    @Override // b8.lc
    public final void n(gf.r rVar) {
        for (TL_iv.RichText richText : k80.b(k80.a(rVar, null))) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = richText;
            x(pageblockparagraph);
        }
    }

    @Override // b8.lc
    public final void p(gf.t tVar) {
        x(new TL_iv.pageBlockDivider());
    }

    public final void x(TL_iv.PageBlock pageBlock) {
        StringBuilder sb2 = this.d;
        int length = sb2.length();
        sb2.append((char) 1);
        sb2.length();
        this.c.add(new e80(length, pageBlock));
    }

    public final void y() {
        StringBuilder sb2 = this.d;
        ArrayList arrayList = new ArrayList();
        try {
            xc.d dVar = this.e;
            int length = sb2.length();
            xc.a aVar = dVar.d;
            while (true) {
                xc.a aVar2 = aVar.e;
                if (aVar2 == null) {
                    break;
                } else {
                    aVar = aVar2;
                }
            }
            if (length > -1) {
                aVar.b(length);
            }
            ArrayList arrayList2 = aVar.f;
            List unmodifiableList = arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2);
            if (unmodifiableList.size() > 0) {
                arrayList.addAll(unmodifiableList);
            } else {
                arrayList.addAll(Collections.EMPTY_LIST);
            }
            dVar.d = new xc.a("", 0, Collections.EMPTY_MAP, null);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        ArrayList arrayList3 = new ArrayList();
        z(arrayList3, arrayList);
        HashMap hashMap = new HashMap();
        ArrayList arrayList4 = this.c;
        int size = arrayList4.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList4.get(i3);
            i3++;
            e80 e80Var = (e80) obj;
            hashMap.put(Integer.valueOf(e80Var.b), e80Var);
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(0);
        treeSet.add(Integer.valueOf(sb2.length()));
        for (Integer num : hashMap.keySet()) {
            treeSet.add(num);
            treeSet.add(Integer.valueOf(num.intValue() + 1));
        }
        int size2 = arrayList3.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            xc.a aVar3 = (xc.a) obj2;
            treeSet.add(Integer.valueOf(aVar3.b));
            treeSet.add(Integer.valueOf(aVar3.d));
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it = treeSet.iterator();
        Integer num2 = null;
        while (it.hasNext()) {
            Integer num3 = (Integer) it.next();
            if (num2 != null && num3.intValue() > num2.intValue()) {
                int intValue = num2.intValue();
                int intValue2 = num3.intValue();
                if (intValue2 - intValue == 1 && hashMap.containsKey(num2)) {
                    arrayList5.add((e80) hashMap.get(num2));
                } else {
                    String trim = sb2.substring(intValue, intValue2).trim();
                    if (!trim.isEmpty()) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = k80.e(k80.n(trim));
                        arrayList5.add(new e80(intValue, pageblockparagraph));
                    }
                }
            }
            num2 = num3;
        }
        Collections.sort(arrayList3, new d80(0));
        f80 f80Var = new f80(null, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(f80Var);
        int size3 = arrayList5.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList5.get(i12);
            i12++;
            e80 e80Var2 = (e80) obj3;
            while (i11 < arrayList3.size() && ((xc.a) arrayList3.get(i11)).b <= e80Var2.b) {
                int i13 = i11 + 1;
                xc.a aVar4 = (xc.a) arrayList3.get(i11);
                int i14 = aVar4.d;
                int i15 = aVar4.b;
                if (i14 >= e80Var2.b) {
                    while (arrayDeque.peek() != f80Var && ((f80) arrayDeque.peek()).b <= i15) {
                        arrayDeque.pop();
                    }
                    f80 f80Var2 = new f80(aVar4, aVar4.d);
                    ((f80) arrayDeque.peek()).c.add(f80Var2);
                    arrayDeque.push(f80Var2);
                }
                i11 = i13;
            }
            while (arrayDeque.peek() != f80Var && ((f80) arrayDeque.peek()).b <= e80Var2.b) {
                arrayDeque.pop();
            }
            TL_iv.PageBlock pageBlock = e80Var2.a;
            ((f80) arrayDeque.peek()).c.add(e80Var2);
        }
        A(0, f80Var.c, this.a);
    }
}
