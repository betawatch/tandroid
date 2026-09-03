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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class p90 extends k7.g0 {
    public final ArrayList a;
    public TL_iv.RichText b;
    public final ArrayList c = new ArrayList();
    public final StringBuilder d = new StringBuilder();
    public final mc.d e = new mc.d(new db.a(12), new h7.u(12));
    public final ArrayDeque f;

    public p90(ArrayList arrayList, ArrayDeque arrayDeque) {
        this.a = arrayList;
        this.f = arrayDeque;
    }

    public static void A(int i10, List list, List list2) {
        for (Object obj : list) {
            if (obj instanceof n90) {
                list2.add(((n90) obj).a);
            } else if (obj instanceof o90) {
                C((o90) obj, list2, i10);
            }
        }
    }

    public static int B(ne.p pVar) {
        ne.s sVar;
        String str;
        ne.p pVar2 = (ne.p) pVar.c;
        if (!(pVar2 instanceof ne.r)) {
            return -1;
        }
        ne.p pVar3 = (ne.p) pVar2.c;
        if (!(pVar3 instanceof ne.s) || (str = (sVar = (ne.s) pVar3).g) == null) {
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
    public static void C(o90 o90Var, List list, int i10) {
        String str;
        mc.a aVar = o90Var.a;
        ArrayList arrayList = o90Var.c;
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
                        boolean z4 = obj instanceof o90;
                        if (z4) {
                            o90 o90Var2 = (o90) obj;
                            if ("summary".equalsIgnoreCase(o90Var2.a.a)) {
                                StringBuilder sb = new StringBuilder();
                                w(o90Var2.c, sb);
                                String trim = sb.toString().trim();
                                pageblockdetails.title = trim.isEmpty() ? new TL_iv.textEmpty() : t90.j(trim);
                            }
                        }
                        if (obj instanceof n90) {
                            arrayList2.add(((n90) obj).a);
                        } else if (z4) {
                            C((o90) obj, arrayList2, i10 + 1);
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

    public static void w(List list, StringBuilder sb) {
        for (Object obj : list) {
            if (obj instanceof n90) {
                TL_iv.PageBlock pageBlock = ((n90) obj).a;
                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(t90.l(((TL_iv.pageBlockParagraph) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(t90.l(((TL_iv.pageBlockHeader) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(t90.l(((TL_iv.pageBlockSubheader) pageBlock).text));
                }
            } else if (obj instanceof o90) {
                w(((o90) obj).c, sb);
            }
        }
    }

    public static void z(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mc.a aVar = (mc.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f;
            z(arrayList, arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2));
        }
    }

    @Override // k7.g0
    public final void a(ne.b bVar) {
        for (TL_iv.RichText richText : t90.b(t90.a(bVar, null))) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = richText;
            pageblockblockquote.caption = new TL_iv.textEmpty();
            x(pageblockblockquote);
        }
    }

    @Override // k7.g0
    public final void b(ne.c cVar) {
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        for (ne.p pVar = (ne.p) cVar.c; pVar != null; pVar = (ne.p) pVar.f) {
            if (pVar instanceof ne.o) {
                int B = B(pVar);
                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                if (B >= 0) {
                    tL_pageListItemText.checkbox = true;
                    tL_pageListItemText.checked = B == 1;
                }
                tL_pageListItemText.text = t90.d(t90.a(pVar, pageblocklist));
                pageblocklist.items.add(tL_pageListItemText);
            }
        }
        x(pageblocklist);
    }

    @Override // k7.g0
    public final void f(ne.h hVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = t90.d(t90.j(hVar.k));
        String str = hVar.j;
        if (str == null) {
            str = "";
        }
        pageblockpreformatted.language = str;
        x(pageblockpreformatted);
    }

    @Override // k7.g0
    public final void g(ne.i iVar) {
        TL_iv.RichText d = t90.d(t90.a(iVar, null));
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

    @Override // k7.g0
    public final void h(ne.j jVar) {
        StringBuilder sb = this.d;
        String str = jVar.g;
        if (str == null) {
            return;
        }
        try {
            this.e.b(sb, str);
        } catch (Throwable th2) {
            FileLog.e(th2);
            sb.append(str);
        }
    }

    @Override // k7.g0
    public final void j(ne.l lVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = t90.d(t90.j(lVar.g));
        pageblockpreformatted.language = "";
        x(pageblockpreformatted);
    }

    @Override // k7.g0
    public final void k(ne.n nVar) {
        if (!(nVar instanceof ie.a)) {
            if (!(nVar instanceof lc.a)) {
                v(nVar);
                return;
            }
            TL_iv.PageBlock pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = t90.c(((lc.a) nVar).g);
            x(pageblockparagraph);
            return;
        }
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.title = new TL_iv.textEmpty();
        for (ne.p pVar = (ne.p) ((ie.a) nVar).c; pVar != null; pVar = (ne.p) pVar.f) {
            boolean z4 = pVar instanceof ie.e;
            if (z4 || (pVar instanceof ie.b)) {
                for (ne.p pVar2 = (ne.p) pVar.c; pVar2 != null; pVar2 = (ne.p) pVar2.f) {
                    if (pVar2 instanceof ie.f) {
                        ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        for (ne.p pVar3 = (ne.p) ((ie.f) pVar2).c; pVar3 != null; pVar3 = (ne.p) pVar3.f) {
                            if (pVar3 instanceof ie.d) {
                                ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                ie.d dVar = (ie.d) pVar3;
                                TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                pagetablecell.header = z4 || dVar.g;
                                ie.c cVar = dVar.h;
                                if (cVar == ie.c.b) {
                                    pagetablecell.align_center = true;
                                } else if (cVar == ie.c.c) {
                                    pagetablecell.align_right = true;
                                }
                                pagetablecell.text = t90.d(t90.a(dVar, null));
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
    @Override // k7.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(ne.q qVar) {
        String valueOf;
        int B;
        TL_iv.pageBlockOrderedList pageblockorderedlist = new TL_iv.pageBlockOrderedList();
        boolean z4 = ((ne.a) ((ne.p) qVar.b)) instanceof ne.f;
        int i10 = qVar.g;
        for (ne.p pVar = (ne.p) qVar.c; pVar != null; pVar = (ne.p) pVar.f) {
            if (pVar instanceof ne.o) {
                if (z4) {
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
                        tL_pageListOrderedItemText.text = t90.d(t90.a(pVar, pageblockorderedlist));
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
                tL_pageListOrderedItemText2.text = t90.d(t90.a(pVar, pageblockorderedlist));
                pageblockorderedlist.items.add(tL_pageListOrderedItemText2);
            }
        }
        x(pageblockorderedlist);
    }

    @Override // k7.g0
    public final void n(ne.r rVar) {
        for (TL_iv.RichText richText : t90.b(t90.a(rVar, null))) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = richText;
            x(pageblockparagraph);
        }
    }

    @Override // k7.g0
    public final void p(ne.t tVar) {
        x(new TL_iv.pageBlockDivider());
    }

    public final void x(TL_iv.PageBlock pageBlock) {
        StringBuilder sb = this.d;
        int length = sb.length();
        sb.append((char) 1);
        sb.length();
        this.c.add(new n90(length, pageBlock));
    }

    public final void y() {
        StringBuilder sb = this.d;
        ArrayList arrayList = new ArrayList();
        try {
            mc.d dVar = this.e;
            int length = sb.length();
            mc.a aVar = dVar.d;
            while (true) {
                mc.a aVar2 = aVar.e;
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
            dVar.d = new mc.a("", 0, Collections.EMPTY_MAP, null);
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
            n90 n90Var = (n90) obj;
            hashMap.put(Integer.valueOf(n90Var.b), n90Var);
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(0);
        treeSet.add(Integer.valueOf(sb.length()));
        for (Integer num : hashMap.keySet()) {
            treeSet.add(num);
            treeSet.add(Integer.valueOf(num.intValue() + 1));
        }
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            mc.a aVar3 = (mc.a) obj2;
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
                    arrayList5.add((n90) hashMap.get(num2));
                } else {
                    String trim = sb.substring(intValue, intValue2).trim();
                    if (!trim.isEmpty()) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = t90.d(t90.j(trim));
                        arrayList5.add(new n90(intValue, pageblockparagraph));
                    }
                }
            }
            num2 = num3;
        }
        Collections.sort(arrayList3, new nh.e4(21));
        o90 o90Var = new o90(null, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(o90Var);
        int size3 = arrayList5.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList5.get(i13);
            i13++;
            n90 n90Var2 = (n90) obj3;
            while (i12 < arrayList3.size() && ((mc.a) arrayList3.get(i12)).b <= n90Var2.b) {
                int i14 = i12 + 1;
                mc.a aVar4 = (mc.a) arrayList3.get(i12);
                int i15 = aVar4.d;
                int i16 = aVar4.b;
                if (i15 >= n90Var2.b) {
                    while (arrayDeque.peek() != o90Var && ((o90) arrayDeque.peek()).b <= i16) {
                        arrayDeque.pop();
                    }
                    o90 o90Var2 = new o90(aVar4, aVar4.d);
                    ((o90) arrayDeque.peek()).c.add(o90Var2);
                    arrayDeque.push(o90Var2);
                }
                i12 = i14;
            }
            while (arrayDeque.peek() != o90Var && ((o90) arrayDeque.peek()).b <= n90Var2.b) {
                arrayDeque.pop();
            }
            TL_iv.PageBlock pageBlock = n90Var2.a;
            ((o90) arrayDeque.peek()).c.add(n90Var2);
        }
        A(0, o90Var.c, this.a);
    }
}
