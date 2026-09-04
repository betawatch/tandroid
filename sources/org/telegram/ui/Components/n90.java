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
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class n90 extends v7.i0 {
    public final ArrayList a;
    public TL_iv.RichText b;
    public final ArrayList c = new ArrayList();
    public final StringBuilder d = new StringBuilder();
    public final ad.d e = new ad.d(new qb.b(1), new rb.a(1));
    public final ArrayDeque f;

    public n90(ArrayList arrayList, ArrayDeque arrayDeque) {
        this.a = arrayList;
        this.f = arrayDeque;
    }

    public static void A(int i10, List list, List list2) {
        for (Object obj : list) {
            if (obj instanceof l90) {
                list2.add(((l90) obj).a);
            } else if (obj instanceof m90) {
                C((m90) obj, list2, i10);
            }
        }
    }

    public static int B(bf.p pVar) {
        bf.s sVar;
        String str;
        bf.p pVar2 = (bf.p) pVar.c;
        if (!(pVar2 instanceof bf.r)) {
            return -1;
        }
        bf.p pVar3 = (bf.p) pVar2.c;
        if (!(pVar3 instanceof bf.s) || (str = (sVar = (bf.s) pVar3).g) == null) {
            return -1;
        }
        int i10 = 3;
        if (str.length() < 3) {
            return -1;
        }
        int i11 = 0;
        if (str.charAt(0) != '[' || str.charAt(2) != ']') {
            return -1;
        }
        char charAt = str.charAt(1);
        if (charAt != ' ') {
            if (charAt != 'x' && charAt != 'X') {
                return -1;
            }
            i11 = 1;
        }
        if (str.length() > 3 && str.charAt(3) == ' ') {
            i10 = 4;
        }
        sVar.g = str.substring(i10);
        return i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void C(m90 m90Var, List list, int i10) {
        String str;
        ad.a aVar = m90Var.a;
        ArrayList arrayList = m90Var.c;
        String str2 = aVar.a;
        String lowerCase = str2 == null ? "" : str2.toLowerCase();
        if (i10 >= 64) {
            A(i10 + 1, arrayList, list);
        }
        switch (lowerCase.hashCode()) {
            case -1857640538:
                if (lowerCase.equals("summary")) {
                }
                A(i10 + 1, arrayList, list);
                break;
            case -1268861541:
                str = "footer";
                lowerCase.equals(str);
                A(i10 + 1, arrayList, list);
                break;
            case -1221270899:
                str = "header";
                lowerCase.equals(str);
                A(i10 + 1, arrayList, list);
                break;
            case -732377866:
                str = "article";
                lowerCase.equals(str);
                A(i10 + 1, arrayList, list);
                break;
            case 112:
                str = "p";
                lowerCase.equals(str);
                A(i10 + 1, arrayList, list);
                break;
            case 99473:
                str = "div";
                lowerCase.equals(str);
                A(i10 + 1, arrayList, list);
                break;
            case 108835:
                str = "nav";
                lowerCase.equals(str);
                A(i10 + 1, arrayList, list);
                break;
            case 3343801:
                str = "main";
                lowerCase.equals(str);
                A(i10 + 1, arrayList, list);
                break;
            case 93111608:
                str = "aside";
                lowerCase.equals(str);
                A(i10 + 1, arrayList, list);
                break;
            case 1557721666:
                if (lowerCase.equals("details")) {
                    TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
                    Map map = aVar.c;
                    int i11 = 0;
                    pageblockdetails.open = map != null && map.containsKey("open");
                    pageblockdetails.title = new TL_iv.textEmpty();
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        boolean z10 = obj instanceof m90;
                        if (z10) {
                            m90 m90Var2 = (m90) obj;
                            if ("summary".equalsIgnoreCase(m90Var2.a.a)) {
                                StringBuilder sb2 = new StringBuilder();
                                w(m90Var2.c, sb2);
                                String trim = sb2.toString().trim();
                                pageblockdetails.title = trim.isEmpty() ? new TL_iv.textEmpty() : r90.j(trim);
                            }
                        }
                        if (obj instanceof l90) {
                            arrayList2.add(((l90) obj).a);
                        } else if (z10) {
                            C((m90) obj, arrayList2, i10 + 1);
                        }
                    }
                    pageblockdetails.blocks.addAll(arrayList2);
                    list.add(pageblockdetails);
                    break;
                }
                A(i10 + 1, arrayList, list);
                break;
            case 1970241253:
                str = "section";
                lowerCase.equals(str);
                A(i10 + 1, arrayList, list);
                break;
            default:
                A(i10 + 1, arrayList, list);
                break;
        }
    }

    public static void w(List list, StringBuilder sb2) {
        for (Object obj : list) {
            if (obj instanceof l90) {
                TL_iv.PageBlock pageBlock = ((l90) obj).a;
                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(r90.l(((TL_iv.pageBlockParagraph) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(r90.l(((TL_iv.pageBlockHeader) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(r90.l(((TL_iv.pageBlockSubheader) pageBlock).text));
                }
            } else if (obj instanceof m90) {
                w(((m90) obj).c, sb2);
            }
        }
    }

    public static void z(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ad.a aVar = (ad.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f;
            z(arrayList, arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2));
        }
    }

    @Override // v7.i0
    public final void a(bf.b bVar) {
        for (TL_iv.RichText richText : r90.b(r90.a(bVar, null))) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = richText;
            pageblockblockquote.caption = new TL_iv.textEmpty();
            x(pageblockblockquote);
        }
    }

    @Override // v7.i0
    public final void b(bf.c cVar) {
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        for (bf.p pVar = (bf.p) cVar.c; pVar != null; pVar = (bf.p) pVar.f) {
            if (pVar instanceof bf.o) {
                int B = B(pVar);
                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                if (B >= 0) {
                    tL_pageListItemText.checkbox = true;
                    tL_pageListItemText.checked = B == 1;
                }
                tL_pageListItemText.text = r90.d(r90.a(pVar, pageblocklist));
                pageblocklist.items.add(tL_pageListItemText);
            }
        }
        x(pageblocklist);
    }

    @Override // v7.i0
    public final void f(bf.h hVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = r90.d(r90.j(hVar.k));
        String str = hVar.j;
        if (str == null) {
            str = "";
        }
        pageblockpreformatted.language = str;
        x(pageblockpreformatted);
    }

    @Override // v7.i0
    public final void g(bf.i iVar) {
        TL_iv.RichText d = r90.d(r90.a(iVar, null));
        if (this.c.isEmpty()) {
            this.b = d;
        }
        switch (iVar.g) {
            case 1:
                TL_iv.pageBlockHeading1 pageblockheading1 = new TL_iv.pageBlockHeading1();
                pageblockheading1.text = d;
                x(pageblockheading1);
                break;
            case 2:
                TL_iv.pageBlockHeading2 pageblockheading2 = new TL_iv.pageBlockHeading2();
                pageblockheading2.text = d;
                x(pageblockheading2);
                break;
            case 3:
                TL_iv.pageBlockHeading3 pageblockheading3 = new TL_iv.pageBlockHeading3();
                pageblockheading3.text = d;
                x(pageblockheading3);
                break;
            case 4:
                TL_iv.pageBlockHeading4 pageblockheading4 = new TL_iv.pageBlockHeading4();
                pageblockheading4.text = d;
                x(pageblockheading4);
                break;
            case 5:
                TL_iv.pageBlockHeading5 pageblockheading5 = new TL_iv.pageBlockHeading5();
                pageblockheading5.text = d;
                x(pageblockheading5);
                break;
            case 6:
                TL_iv.pageBlockHeading6 pageblockheading6 = new TL_iv.pageBlockHeading6();
                pageblockheading6.text = d;
                x(pageblockheading6);
                break;
            default:
                TL_iv.pageBlockHeader pageblockheader = new TL_iv.pageBlockHeader();
                pageblockheader.text = d;
                x(pageblockheader);
                break;
        }
    }

    @Override // v7.i0
    public final void h(bf.j jVar) {
        StringBuilder sb2 = this.d;
        String str = jVar.g;
        if (str == null) {
            return;
        }
        try {
            this.e.b(sb2, str);
        } catch (Throwable th2) {
            FileLog.e(th2);
            sb2.append(str);
        }
    }

    @Override // v7.i0
    public final void j(bf.l lVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = r90.d(r90.j(lVar.g));
        pageblockpreformatted.language = "";
        x(pageblockpreformatted);
    }

    @Override // v7.i0
    public final void k(bf.n nVar) {
        if (!(nVar instanceof we.a)) {
            if (!(nVar instanceof zc.a)) {
                v(nVar);
                return;
            }
            TL_iv.PageBlock pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = r90.c(((zc.a) nVar).g);
            x(pageblockparagraph);
            return;
        }
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.title = new TL_iv.textEmpty();
        for (bf.p pVar = (bf.p) ((we.a) nVar).c; pVar != null; pVar = (bf.p) pVar.f) {
            boolean z10 = pVar instanceof we.e;
            if (z10 || (pVar instanceof we.b)) {
                for (bf.p pVar2 = (bf.p) pVar.c; pVar2 != null; pVar2 = (bf.p) pVar2.f) {
                    if (pVar2 instanceof we.f) {
                        ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        for (bf.p pVar3 = (bf.p) ((we.f) pVar2).c; pVar3 != null; pVar3 = (bf.p) pVar3.f) {
                            if (pVar3 instanceof we.d) {
                                ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                we.d dVar = (we.d) pVar3;
                                TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                pagetablecell.header = z10 || dVar.g;
                                we.c cVar = dVar.h;
                                if (cVar == we.c.b) {
                                    pagetablecell.align_center = true;
                                } else if (cVar == we.c.c) {
                                    pagetablecell.align_right = true;
                                }
                                pagetablecell.text = r90.d(r90.a(dVar, null));
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
    @Override // v7.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(bf.q qVar) {
        String valueOf;
        int B;
        TL_iv.pageBlockOrderedList pageblockorderedlist = new TL_iv.pageBlockOrderedList();
        boolean z10 = ((bf.a) ((bf.p) qVar.b)) instanceof bf.f;
        int i10 = qVar.g;
        for (bf.p pVar = (bf.p) qVar.c; pVar != null; pVar = (bf.p) pVar.f) {
            if (pVar instanceof bf.o) {
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
                        tL_pageListOrderedItemText.text = r90.d(r90.a(pVar, pageblockorderedlist));
                        pageblockorderedlist.items.add(tL_pageListOrderedItemText);
                    }
                }
                valueOf = String.valueOf(i10);
                i10++;
                B = B(pVar);
                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText2 = new TL_iv.TL_pageListOrderedItemText();
                if (B >= 0) {
                }
                tL_pageListOrderedItemText2.num = valueOf;
                tL_pageListOrderedItemText2.text = r90.d(r90.a(pVar, pageblockorderedlist));
                pageblockorderedlist.items.add(tL_pageListOrderedItemText2);
            }
        }
        x(pageblockorderedlist);
    }

    @Override // v7.i0
    public final void n(bf.r rVar) {
        for (TL_iv.RichText richText : r90.b(r90.a(rVar, null))) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = richText;
            x(pageblockparagraph);
        }
    }

    @Override // v7.i0
    public final void p(bf.t tVar) {
        x(new TL_iv.pageBlockDivider());
    }

    public final void x(TL_iv.PageBlock pageBlock) {
        StringBuilder sb2 = this.d;
        int length = sb2.length();
        sb2.append((char) 1);
        sb2.length();
        this.c.add(new l90(length, pageBlock));
    }

    public final void y() {
        StringBuilder sb2 = this.d;
        ArrayList arrayList = new ArrayList();
        try {
            ad.d dVar = this.e;
            int length = sb2.length();
            ad.a aVar = dVar.d;
            while (true) {
                ad.a aVar2 = aVar.e;
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
            dVar.d = new ad.a("", 0, Collections.EMPTY_MAP, null);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        ArrayList arrayList3 = new ArrayList();
        z(arrayList3, arrayList);
        HashMap hashMap = new HashMap();
        ArrayList arrayList4 = this.c;
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList4.get(i10);
            i10++;
            l90 l90Var = (l90) obj;
            hashMap.put(Integer.valueOf(l90Var.b), l90Var);
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(0);
        treeSet.add(Integer.valueOf(sb2.length()));
        for (Integer num : hashMap.keySet()) {
            treeSet.add(num);
            treeSet.add(Integer.valueOf(num.intValue() + 1));
        }
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            ad.a aVar3 = (ad.a) obj2;
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
                    arrayList5.add((l90) hashMap.get(num2));
                } else {
                    String trim = sb2.substring(intValue, intValue2).trim();
                    if (!trim.isEmpty()) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = r90.d(r90.j(trim));
                        arrayList5.add(new l90(intValue, pageblockparagraph));
                    }
                }
            }
            num2 = num3;
        }
        Collections.sort(arrayList3, new org.telegram.ui.f6(12));
        m90 m90Var = new m90(null, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(m90Var);
        int size3 = arrayList5.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList5.get(i13);
            i13++;
            l90 l90Var2 = (l90) obj3;
            while (i12 < arrayList3.size() && ((ad.a) arrayList3.get(i12)).b <= l90Var2.b) {
                int i14 = i12 + 1;
                ad.a aVar4 = (ad.a) arrayList3.get(i12);
                int i15 = aVar4.d;
                int i16 = aVar4.b;
                if (i15 >= l90Var2.b) {
                    while (arrayDeque.peek() != m90Var && ((m90) arrayDeque.peek()).b <= i16) {
                        arrayDeque.pop();
                    }
                    m90 m90Var2 = new m90(aVar4, aVar4.d);
                    ((m90) arrayDeque.peek()).c.add(m90Var2);
                    arrayDeque.push(m90Var2);
                }
                i12 = i14;
            }
            while (arrayDeque.peek() != m90Var && ((m90) arrayDeque.peek()).b <= l90Var2.b) {
                arrayDeque.pop();
            }
            TL_iv.PageBlock pageBlock = l90Var2.a;
            ((m90) arrayDeque.peek()).c.add(l90Var2);
        }
        A(0, m90Var.c, this.a);
    }
}
