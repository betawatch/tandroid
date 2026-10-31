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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c90 extends w7.j8 {
    public final ArrayList a;
    public TL_iv.RichText b;
    public final ArrayList c = new ArrayList();
    public final StringBuilder d = new StringBuilder();
    public final uc.d e = new uc.d(new jb.b(22), new kb.a(22));
    public final ArrayDeque f;

    public c90(ArrayList arrayList, ArrayDeque arrayDeque) {
        this.a = arrayList;
        this.f = arrayDeque;
    }

    public static void A(int i10, List list, List list2) {
        for (Object obj : list) {
            if (obj instanceof a90) {
                list2.add(((a90) obj).a);
            } else if (obj instanceof b90) {
                C((b90) obj, list2, i10);
            }
        }
    }

    public static int B(df.c cVar) {
        ve.r rVar;
        String str;
        df.c cVar2 = (df.c) cVar.c;
        if (!(cVar2 instanceof ve.q)) {
            return -1;
        }
        df.c cVar3 = (df.c) cVar2.c;
        if (!(cVar3 instanceof ve.r) || (str = (rVar = (ve.r) cVar3).g) == null) {
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
        rVar.g = str.substring(i10);
        return i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void C(b90 b90Var, List list, int i10) {
        String str;
        uc.a aVar = b90Var.a;
        ArrayList arrayList = b90Var.c;
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
            case org.telegram.messenger.zs.x1 /* 112 */:
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
                        boolean z10 = obj instanceof b90;
                        if (z10) {
                            b90 b90Var2 = (b90) obj;
                            if ("summary".equalsIgnoreCase(b90Var2.a.a)) {
                                StringBuilder sb2 = new StringBuilder();
                                w(b90Var2.c, sb2);
                                String trim = sb2.toString().trim();
                                pageblockdetails.title = trim.isEmpty() ? new TL_iv.textEmpty() : g90.n(trim);
                            }
                        }
                        if (obj instanceof a90) {
                            arrayList2.add(((a90) obj).a);
                        } else if (z10) {
                            C((b90) obj, arrayList2, i10 + 1);
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
            if (obj instanceof a90) {
                TL_iv.PageBlock pageBlock = ((a90) obj).a;
                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(g90.p(((TL_iv.pageBlockParagraph) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(g90.p(((TL_iv.pageBlockHeader) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(g90.p(((TL_iv.pageBlockSubheader) pageBlock).text));
                }
            } else if (obj instanceof b90) {
                w(((b90) obj).c, sb2);
            }
        }
    }

    public static void z(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uc.a aVar = (uc.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f;
            z(arrayList, arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2));
        }
    }

    @Override // w7.j8
    public final void a(ve.b bVar) {
        for (TL_iv.RichText richText : g90.b(g90.a(bVar, null))) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = richText;
            pageblockblockquote.caption = new TL_iv.textEmpty();
            x(pageblockblockquote);
        }
    }

    @Override // w7.j8
    public final void b(ve.c cVar) {
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        for (df.c cVar2 = (df.c) cVar.c; cVar2 != null; cVar2 = (df.c) cVar2.f) {
            if (cVar2 instanceof ve.o) {
                int B = B(cVar2);
                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                if (B >= 0) {
                    tL_pageListItemText.checkbox = true;
                    tL_pageListItemText.checked = B == 1;
                }
                tL_pageListItemText.text = g90.e(g90.a(cVar2, pageblocklist));
                pageblocklist.items.add(tL_pageListItemText);
            }
        }
        x(pageblocklist);
    }

    @Override // w7.j8
    public final void f(ve.h hVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = g90.e(g90.n(hVar.k));
        String str = hVar.j;
        if (str == null) {
            str = "";
        }
        pageblockpreformatted.language = str;
        x(pageblockpreformatted);
    }

    @Override // w7.j8
    public final void g(ve.i iVar) {
        TL_iv.RichText e = g90.e(g90.a(iVar, null));
        if (this.c.isEmpty()) {
            this.b = e;
        }
        switch (iVar.g) {
            case 1:
                TL_iv.pageBlockHeading1 pageblockheading1 = new TL_iv.pageBlockHeading1();
                pageblockheading1.text = e;
                x(pageblockheading1);
                break;
            case 2:
                TL_iv.pageBlockHeading2 pageblockheading2 = new TL_iv.pageBlockHeading2();
                pageblockheading2.text = e;
                x(pageblockheading2);
                break;
            case 3:
                TL_iv.pageBlockHeading3 pageblockheading3 = new TL_iv.pageBlockHeading3();
                pageblockheading3.text = e;
                x(pageblockheading3);
                break;
            case 4:
                TL_iv.pageBlockHeading4 pageblockheading4 = new TL_iv.pageBlockHeading4();
                pageblockheading4.text = e;
                x(pageblockheading4);
                break;
            case 5:
                TL_iv.pageBlockHeading5 pageblockheading5 = new TL_iv.pageBlockHeading5();
                pageblockheading5.text = e;
                x(pageblockheading5);
                break;
            case 6:
                TL_iv.pageBlockHeading6 pageblockheading6 = new TL_iv.pageBlockHeading6();
                pageblockheading6.text = e;
                x(pageblockheading6);
                break;
            default:
                TL_iv.pageBlockHeader pageblockheader = new TL_iv.pageBlockHeader();
                pageblockheader.text = e;
                x(pageblockheader);
                break;
        }
    }

    @Override // w7.j8
    public final void h(ve.j jVar) {
        StringBuilder sb2 = this.d;
        String str = jVar.g;
        if (str == null) {
            return;
        }
        try {
            this.e.b(sb2, str);
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
            sb2.append(str);
        }
    }

    @Override // w7.j8
    public final void j(ve.l lVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = g90.e(g90.n(lVar.g));
        pageblockpreformatted.language = "";
        x(pageblockpreformatted);
    }

    @Override // w7.j8
    public final void k(ve.n nVar) {
        if (!(nVar instanceof qe.a)) {
            if (!(nVar instanceof tc.a)) {
                v(nVar);
                return;
            }
            TL_iv.PageBlock pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = g90.c(((tc.a) nVar).g);
            x(pageblockparagraph);
            return;
        }
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.title = new TL_iv.textEmpty();
        for (df.c cVar = (df.c) ((qe.a) nVar).c; cVar != null; cVar = (df.c) cVar.f) {
            boolean z10 = cVar instanceof qe.e;
            if (z10 || (cVar instanceof qe.b)) {
                for (df.c cVar2 = (df.c) cVar.c; cVar2 != null; cVar2 = (df.c) cVar2.f) {
                    if (cVar2 instanceof qe.f) {
                        ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        for (df.c cVar3 = (df.c) ((qe.f) cVar2).c; cVar3 != null; cVar3 = (df.c) cVar3.f) {
                            if (cVar3 instanceof qe.d) {
                                ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                qe.d dVar = (qe.d) cVar3;
                                TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                pagetablecell.header = z10 || dVar.g;
                                qe.c cVar4 = dVar.h;
                                if (cVar4 == qe.c.b) {
                                    pagetablecell.align_center = true;
                                } else if (cVar4 == qe.c.c) {
                                    pagetablecell.align_right = true;
                                }
                                pagetablecell.text = g90.e(g90.a(dVar, null));
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
    @Override // w7.j8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(ve.p pVar) {
        String valueOf;
        int B;
        TL_iv.pageBlockOrderedList pageblockorderedlist = new TL_iv.pageBlockOrderedList();
        boolean z10 = ((ve.a) ((df.c) pVar.b)) instanceof ve.f;
        int i10 = pVar.g;
        for (df.c cVar = (df.c) pVar.c; cVar != null; cVar = (df.c) cVar.f) {
            if (cVar instanceof ve.o) {
                if (z10) {
                    ArrayDeque arrayDeque = this.f;
                    if (!arrayDeque.isEmpty()) {
                        valueOf = (String) arrayDeque.poll();
                        B = B(cVar);
                        TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                        if (B >= 0) {
                            tL_pageListOrderedItemText.checkbox = true;
                            tL_pageListOrderedItemText.checked = B == 1;
                        }
                        tL_pageListOrderedItemText.num = valueOf;
                        tL_pageListOrderedItemText.text = g90.e(g90.a(cVar, pageblockorderedlist));
                        pageblockorderedlist.items.add(tL_pageListOrderedItemText);
                    }
                }
                valueOf = String.valueOf(i10);
                i10++;
                B = B(cVar);
                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText2 = new TL_iv.TL_pageListOrderedItemText();
                if (B >= 0) {
                }
                tL_pageListOrderedItemText2.num = valueOf;
                tL_pageListOrderedItemText2.text = g90.e(g90.a(cVar, pageblockorderedlist));
                pageblockorderedlist.items.add(tL_pageListOrderedItemText2);
            }
        }
        x(pageblockorderedlist);
    }

    @Override // w7.j8
    public final void n(ve.q qVar) {
        for (TL_iv.RichText richText : g90.b(g90.a(qVar, null))) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = richText;
            x(pageblockparagraph);
        }
    }

    @Override // w7.j8
    public final void p(ve.s sVar) {
        x(new TL_iv.pageBlockDivider());
    }

    public final void x(TL_iv.PageBlock pageBlock) {
        StringBuilder sb2 = this.d;
        int length = sb2.length();
        sb2.append((char) 1);
        sb2.length();
        this.c.add(new a90(length, pageBlock));
    }

    public final void y() {
        StringBuilder sb2 = this.d;
        ArrayList arrayList = new ArrayList();
        try {
            uc.d dVar = this.e;
            int length = sb2.length();
            uc.a aVar = dVar.d;
            while (true) {
                uc.a aVar2 = aVar.e;
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
            dVar.d = new uc.a("", 0, Collections.EMPTY_MAP, null);
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
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
            a90 a90Var = (a90) obj;
            hashMap.put(Integer.valueOf(a90Var.b), a90Var);
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
            uc.a aVar3 = (uc.a) obj2;
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
                    arrayList5.add((a90) hashMap.get(num2));
                } else {
                    String trim = sb2.substring(intValue, intValue2).trim();
                    if (!trim.isEmpty()) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = g90.e(g90.n(trim));
                        arrayList5.add(new a90(intValue, pageblockparagraph));
                    }
                }
            }
            num2 = num3;
        }
        Collections.sort(arrayList3, new org.telegram.ui.f6(12));
        b90 b90Var = new b90(null, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(b90Var);
        int size3 = arrayList5.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList5.get(i13);
            i13++;
            a90 a90Var2 = (a90) obj3;
            while (i12 < arrayList3.size() && ((uc.a) arrayList3.get(i12)).b <= a90Var2.b) {
                int i14 = i12 + 1;
                uc.a aVar4 = (uc.a) arrayList3.get(i12);
                int i15 = aVar4.d;
                int i16 = aVar4.b;
                if (i15 >= a90Var2.b) {
                    while (arrayDeque.peek() != b90Var && ((b90) arrayDeque.peek()).b <= i16) {
                        arrayDeque.pop();
                    }
                    b90 b90Var2 = new b90(aVar4, aVar4.d);
                    ((b90) arrayDeque.peek()).c.add(b90Var2);
                    arrayDeque.push(b90Var2);
                }
                i12 = i14;
            }
            while (arrayDeque.peek() != b90Var && ((b90) arrayDeque.peek()).b <= a90Var2.b) {
                arrayDeque.pop();
            }
            TL_iv.PageBlock pageBlock = a90Var2.a;
            ((b90) arrayDeque.peek()).c.add(a90Var2);
        }
        A(0, b90Var.c, this.a);
    }
}
