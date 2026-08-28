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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v80 extends f7.p8 {
    public final ArrayList a;
    public TL_iv.RichText b;
    public final ArrayList c = new ArrayList();
    public final StringBuilder d = new StringBuilder();
    public final ic.d e = new ic.d(new wa.a(10), new ya.b(10));
    public final ArrayDeque f;

    public v80(ArrayList arrayList, ArrayDeque arrayDeque) {
        this.a = arrayList;
        this.f = arrayDeque;
    }

    public static void A(int i9, List list, List list2) {
        for (Object obj : list) {
            if (obj instanceof t80) {
                list2.add(((t80) obj).a);
            } else if (obj instanceof u80) {
                C((u80) obj, list2, i9);
            }
        }
    }

    public static int B(ie.p pVar) {
        ie.s sVar;
        String str;
        ie.p pVar2 = (ie.p) pVar.c;
        if (!(pVar2 instanceof ie.r)) {
            return -1;
        }
        ie.p pVar3 = (ie.p) pVar2.c;
        if (!(pVar3 instanceof ie.s) || (str = (sVar = (ie.s) pVar3).g) == null) {
            return -1;
        }
        int i9 = 3;
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
            i9 = 4;
        }
        sVar.g = str.substring(i9);
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void C(u80 u80Var, List list, int i9) {
        String str;
        ic.a aVar = u80Var.a;
        ArrayList arrayList = u80Var.c;
        String str2 = aVar.a;
        String lowerCase = str2 == null ? "" : str2.toLowerCase();
        if (i9 >= 64) {
            A(i9 + 1, arrayList, list);
        }
        switch (lowerCase.hashCode()) {
            case -1857640538:
                if (lowerCase.equals("summary")) {
                }
                A(i9 + 1, arrayList, list);
                break;
            case -1268861541:
                str = "footer";
                lowerCase.equals(str);
                A(i9 + 1, arrayList, list);
                break;
            case -1221270899:
                str = "header";
                lowerCase.equals(str);
                A(i9 + 1, arrayList, list);
                break;
            case -732377866:
                str = "article";
                lowerCase.equals(str);
                A(i9 + 1, arrayList, list);
                break;
            case 112:
                str = "p";
                lowerCase.equals(str);
                A(i9 + 1, arrayList, list);
                break;
            case 99473:
                str = "div";
                lowerCase.equals(str);
                A(i9 + 1, arrayList, list);
                break;
            case 108835:
                str = "nav";
                lowerCase.equals(str);
                A(i9 + 1, arrayList, list);
                break;
            case 3343801:
                str = "main";
                lowerCase.equals(str);
                A(i9 + 1, arrayList, list);
                break;
            case 93111608:
                str = "aside";
                lowerCase.equals(str);
                A(i9 + 1, arrayList, list);
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
                        boolean z10 = obj instanceof u80;
                        if (z10) {
                            u80 u80Var2 = (u80) obj;
                            if ("summary".equalsIgnoreCase(u80Var2.a.a)) {
                                StringBuilder sb2 = new StringBuilder();
                                w(u80Var2.c, sb2);
                                String trim = sb2.toString().trim();
                                pageblockdetails.title = trim.isEmpty() ? new TL_iv.textEmpty() : z80.j(trim);
                            }
                        }
                        if (obj instanceof t80) {
                            arrayList2.add(((t80) obj).a);
                        } else if (z10) {
                            C((u80) obj, arrayList2, i9 + 1);
                        }
                    }
                    pageblockdetails.blocks.addAll(arrayList2);
                    list.add(pageblockdetails);
                    break;
                }
                A(i9 + 1, arrayList, list);
                break;
            case 1970241253:
                str = "section";
                lowerCase.equals(str);
                A(i9 + 1, arrayList, list);
                break;
            default:
                A(i9 + 1, arrayList, list);
                break;
        }
    }

    public static void w(List list, StringBuilder sb2) {
        for (Object obj : list) {
            if (obj instanceof t80) {
                TL_iv.PageBlock pageBlock = ((t80) obj).a;
                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(z80.l(((TL_iv.pageBlockParagraph) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(z80.l(((TL_iv.pageBlockHeader) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(z80.l(((TL_iv.pageBlockSubheader) pageBlock).text));
                }
            } else if (obj instanceof u80) {
                w(((u80) obj).c, sb2);
            }
        }
    }

    public static void z(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ic.a aVar = (ic.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f;
            z(arrayList, arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2));
        }
    }

    @Override // f7.p8
    public final void a(ie.b bVar) {
        for (TL_iv.RichText richText : z80.b(z80.a(bVar, null))) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = richText;
            pageblockblockquote.caption = new TL_iv.textEmpty();
            x(pageblockblockquote);
        }
    }

    @Override // f7.p8
    public final void b(ie.c cVar) {
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        for (ie.p pVar = (ie.p) cVar.c; pVar != null; pVar = (ie.p) pVar.f) {
            if (pVar instanceof ie.o) {
                int B = B(pVar);
                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                if (B >= 0) {
                    tL_pageListItemText.checkbox = true;
                    tL_pageListItemText.checked = B == 1;
                }
                tL_pageListItemText.text = z80.d(z80.a(pVar, pageblocklist));
                pageblocklist.items.add(tL_pageListItemText);
            }
        }
        x(pageblocklist);
    }

    @Override // f7.p8
    public final void f(ie.h hVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = z80.d(z80.j(hVar.k));
        String str = hVar.j;
        if (str == null) {
            str = "";
        }
        pageblockpreformatted.language = str;
        x(pageblockpreformatted);
    }

    @Override // f7.p8
    public final void g(ie.i iVar) {
        TL_iv.RichText d = z80.d(z80.a(iVar, null));
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

    @Override // f7.p8
    public final void h(ie.j jVar) {
        StringBuilder sb2 = this.d;
        String str = jVar.g;
        if (str == null) {
            return;
        }
        try {
            this.e.b(sb2, str);
        } catch (Throwable th) {
            FileLog.e(th);
            sb2.append(str);
        }
    }

    @Override // f7.p8
    public final void j(ie.l lVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = z80.d(z80.j(lVar.g));
        pageblockpreformatted.language = "";
        x(pageblockpreformatted);
    }

    @Override // f7.p8
    public final void k(ie.n nVar) {
        if (!(nVar instanceof de.a)) {
            if (!(nVar instanceof hc.a)) {
                v(nVar);
                return;
            }
            TL_iv.PageBlock pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = z80.c(((hc.a) nVar).g);
            x(pageblockparagraph);
            return;
        }
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.title = new TL_iv.textEmpty();
        for (ie.p pVar = (ie.p) ((de.a) nVar).c; pVar != null; pVar = (ie.p) pVar.f) {
            boolean z10 = pVar instanceof de.e;
            if (z10 || (pVar instanceof de.b)) {
                for (ie.p pVar2 = (ie.p) pVar.c; pVar2 != null; pVar2 = (ie.p) pVar2.f) {
                    if (pVar2 instanceof de.f) {
                        ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        for (ie.p pVar3 = (ie.p) ((de.f) pVar2).c; pVar3 != null; pVar3 = (ie.p) pVar3.f) {
                            if (pVar3 instanceof de.d) {
                                ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                de.d dVar = (de.d) pVar3;
                                TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                pagetablecell.header = z10 || dVar.g;
                                de.c cVar = dVar.h;
                                if (cVar == de.c.b) {
                                    pagetablecell.align_center = true;
                                } else if (cVar == de.c.c) {
                                    pagetablecell.align_right = true;
                                }
                                pagetablecell.text = z80.d(z80.a(dVar, null));
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
    @Override // f7.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(ie.q qVar) {
        String valueOf;
        int B;
        TL_iv.pageBlockOrderedList pageblockorderedlist = new TL_iv.pageBlockOrderedList();
        boolean z10 = ((ie.a) ((ie.p) qVar.b)) instanceof ie.f;
        int i9 = qVar.g;
        for (ie.p pVar = (ie.p) qVar.c; pVar != null; pVar = (ie.p) pVar.f) {
            if (pVar instanceof ie.o) {
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
                        tL_pageListOrderedItemText.text = z80.d(z80.a(pVar, pageblockorderedlist));
                        pageblockorderedlist.items.add(tL_pageListOrderedItemText);
                    }
                }
                valueOf = String.valueOf(i9);
                i9++;
                B = B(pVar);
                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText2 = new TL_iv.TL_pageListOrderedItemText();
                if (B >= 0) {
                }
                tL_pageListOrderedItemText2.num = valueOf;
                tL_pageListOrderedItemText2.text = z80.d(z80.a(pVar, pageblockorderedlist));
                pageblockorderedlist.items.add(tL_pageListOrderedItemText2);
            }
        }
        x(pageblockorderedlist);
    }

    @Override // f7.p8
    public final void n(ie.r rVar) {
        for (TL_iv.RichText richText : z80.b(z80.a(rVar, null))) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = richText;
            x(pageblockparagraph);
        }
    }

    @Override // f7.p8
    public final void p(ie.t tVar) {
        x(new TL_iv.pageBlockDivider());
    }

    public final void x(TL_iv.PageBlock pageBlock) {
        StringBuilder sb2 = this.d;
        int length = sb2.length();
        sb2.append((char) 1);
        sb2.length();
        this.c.add(new t80(length, pageBlock));
    }

    public final void y() {
        StringBuilder sb2 = this.d;
        ArrayList arrayList = new ArrayList();
        try {
            ic.d dVar = this.e;
            int length = sb2.length();
            ic.a aVar = dVar.d;
            while (true) {
                ic.a aVar2 = aVar.e;
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
            dVar.d = new ic.a("", 0, Collections.EMPTY_MAP, null);
        } catch (Throwable th) {
            FileLog.e(th);
        }
        ArrayList arrayList3 = new ArrayList();
        z(arrayList3, arrayList);
        HashMap hashMap = new HashMap();
        ArrayList arrayList4 = this.c;
        int size = arrayList4.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList4.get(i9);
            i9++;
            t80 t80Var = (t80) obj;
            hashMap.put(Integer.valueOf(t80Var.b), t80Var);
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
            ic.a aVar3 = (ic.a) obj2;
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
                    arrayList5.add((t80) hashMap.get(num2));
                } else {
                    String trim = sb2.substring(intValue, intValue2).trim();
                    if (!trim.isEmpty()) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = z80.d(z80.j(trim));
                        arrayList5.add(new t80(intValue, pageblockparagraph));
                    }
                }
            }
            num2 = num3;
        }
        Collections.sort(arrayList3, new j9.a(26));
        u80 u80Var = new u80(null, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(u80Var);
        int size3 = arrayList5.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList5.get(i12);
            i12++;
            t80 t80Var2 = (t80) obj3;
            while (i11 < arrayList3.size() && ((ic.a) arrayList3.get(i11)).b <= t80Var2.b) {
                int i13 = i11 + 1;
                ic.a aVar4 = (ic.a) arrayList3.get(i11);
                int i14 = aVar4.d;
                int i15 = aVar4.b;
                if (i14 >= t80Var2.b) {
                    while (arrayDeque.peek() != u80Var && ((u80) arrayDeque.peek()).b <= i15) {
                        arrayDeque.pop();
                    }
                    u80 u80Var2 = new u80(aVar4, aVar4.d);
                    ((u80) arrayDeque.peek()).c.add(u80Var2);
                    arrayDeque.push(u80Var2);
                }
                i11 = i13;
            }
            while (arrayDeque.peek() != u80Var && ((u80) arrayDeque.peek()).b <= t80Var2.b) {
                arrayDeque.pop();
            }
            TL_iv.PageBlock pageBlock = t80Var2.a;
            ((u80) arrayDeque.peek()).c.add(t80Var2);
        }
        A(0, u80Var.c, this.a);
    }
}
