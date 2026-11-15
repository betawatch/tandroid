package oi;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class d2 {
    public final hi.l0 a;
    public boolean e;
    public boolean f;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();
    public final kg.j1 g = new kg.j1(this, 26);
    public c2 d = b();

    public d2(hi.l0 l0Var) {
        this.a = l0Var;
    }

    public static void e(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return;
        }
        if (pageBlock.text == null) {
            pageBlock.text = new TL_iv.textEmpty();
        }
        if (pageBlock.caption == null) {
            TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
            pageCaption.text = new TL_iv.textEmpty();
            pageCaption.credit = new TL_iv.textEmpty();
            pageBlock.caption = pageCaption;
        }
        int i7 = 0;
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.caption == null) {
                pageblockblockquote.caption = new TL_iv.textEmpty();
            }
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
            if (pageblockblockquoteblocks.blocks == null) {
                pageblockblockquoteblocks.blocks = new ArrayList<>();
            }
            ArrayList<TL_iv.PageBlock> arrayList = pageblockblockquoteblocks.blocks;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_iv.PageBlock pageBlock2 = arrayList.get(i10);
                i10++;
                e(pageBlock2);
            }
            if (pageblockblockquoteblocks.caption == null) {
                pageblockblockquoteblocks.caption = new TL_iv.textEmpty();
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.caption == null) {
                pageblockpullquote.caption = new TL_iv.textEmpty();
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
            if (pageblockpreformatted.language == null) {
                pageblockpreformatted.language = "";
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock;
            if (pageblockmath.source == null) {
                pageblockmath.source = "";
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
            if (pageblockmap.geo == null) {
                pageblockmap.geo = new TLRPC.TL_geoPointEmpty();
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
            if (pageblocktable.title == null) {
                pageblocktable.title = new TL_iv.textEmpty();
            }
            if (pageblocktable.rows == null) {
                pageblocktable.rows = new ArrayList<>();
            }
            ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                TL_iv.pageTableRow pagetablerow = arrayList2.get(i11);
                i11++;
                TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                if (pagetablerow2 != null) {
                    if (pagetablerow2.cells == null) {
                        pagetablerow2.cells = new ArrayList<>();
                    }
                    ArrayList<TL_iv.pageTableCell> arrayList3 = pagetablerow2.cells;
                    int size3 = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        TL_iv.pageTableCell pagetablecell = arrayList3.get(i12);
                        i12++;
                        TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                        if (pagetablecell2 != null && pagetablecell2.text == null) {
                            pagetablecell2.text = new TL_iv.textEmpty();
                        }
                    }
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
            if (pageblockbuttonrow.buttons == null) {
                pageblockbuttonrow.buttons = new ArrayList<>();
            }
            ArrayList<TL_keyboard.PageButton> arrayList4 = pageblockbuttonrow.buttons;
            int size4 = arrayList4.size();
            while (i7 < size4) {
                TL_keyboard.PageButton pageButton = arrayList4.get(i7);
                i7++;
                TL_keyboard.PageButton pageButton2 = pageButton;
                if (pageButton2 != null && pageButton2.text == null) {
                    pageButton2.text = new TL_iv.textEmpty();
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            if (pageblockcollage.items == null) {
                pageblockcollage.items = new ArrayList<>();
            }
            ArrayList<TL_iv.PageBlock> arrayList5 = pageblockcollage.items;
            int size5 = arrayList5.size();
            while (i7 < size5) {
                TL_iv.PageBlock pageBlock3 = arrayList5.get(i7);
                i7++;
                e(pageBlock3);
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            if (pageblockslideshow.items == null) {
                pageblockslideshow.items = new ArrayList<>();
            }
            ArrayList<TL_iv.PageBlock> arrayList6 = pageblockslideshow.items;
            int size6 = arrayList6.size();
            while (i7 < size6) {
                TL_iv.PageBlock pageBlock4 = arrayList6.get(i7);
                i7++;
                e(pageBlock4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(c2 c2Var) {
        b2 b2Var;
        ArrayList arrayList;
        TL_iv.PageBlock pageBlock;
        this.e = false;
        boolean z10 = true;
        this.f = true;
        ArrayList arrayList2 = new ArrayList(c2Var.a.length);
        b2[] b2VarArr = c2Var.a;
        int length = b2VarArr.length;
        int i7 = 0;
        while (i7 < length) {
            b2Var = b2VarArr[i7];
            byte[] bArr = b2Var.b;
            arrayList = b2Var.i;
            try {
                SerializedData serializedData = new SerializedData(bArr);
                pageBlock = TL_iv.PageBlock.TLdeserialize(serializedData, serializedData.readInt32(z10), z10);
                serializedData.cleanup();
            } catch (Throwable th2) {
                a8.g(th2, z10);
            }
        }
        a2 a2Var = c2Var.b;
        hi.l0 l0Var = this.a;
        q3 q3Var = (q3) l0Var.b;
        q3Var.v3.f(false);
        ArrayList arrayList3 = q3Var.t3;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        q3Var.v4();
        q3Var.g3.O(false);
        if (a2Var.a >= 0) {
            q3Var.post(new kg.t1(28, q3Var, a2Var));
        }
        q3Var.p3.onContentChanged();
        this.f = false;
        ((q3) l0Var.b).p3.m0();
        return;
        pageBlock = new TL_iv.pageBlockParagraph();
        pageBlock.text = new TL_iv.textEmpty();
        a aVar = new a(pageBlock, b2Var.c, b2Var.d, b2Var.a);
        aVar.e = b2Var.e;
        aVar.f = b2Var.f;
        aVar.i = b2Var.g;
        aVar.g = b2Var.h;
        aVar.h = arrayList != null ? new ArrayList(arrayList) : null;
        aVar.k.addAll(b2Var.j);
        arrayList2.add(aVar);
        i7++;
        z10 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, android.widget.TextView, oi.e1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v4, types: [oi.k5] */
    public final c2 b() {
        a2 a2Var;
        i0 i0Var;
        hi.l0 l0Var = this.a;
        ArrayList arrayList = ((q3) l0Var.b).t3;
        HashMap hashMap = new HashMap();
        c2 c2Var = this.d;
        if (c2Var != null) {
            for (b2 b2Var : c2Var.a) {
                hashMap.put(Long.valueOf(b2Var.a), b2Var);
            }
        }
        b2[] b2VarArr = new b2[arrayList.size()];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            a aVar = (a) arrayList.get(i7);
            TL_iv.PageBlock pageBlock = aVar.b;
            ArrayList arrayList2 = aVar.k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            b2 b2Var2 = (b2) hashMap.get(Long.valueOf(aVar.a));
            if (b2Var2 != null && b2Var2.c == aVar.c && b2Var2.d == aVar.d && b2Var2.e == aVar.e && b2Var2.f == aVar.f && b2Var2.g == aVar.i && b2Var2.h == aVar.g) {
                ArrayList arrayList3 = b2Var2.i;
                ArrayList arrayList4 = aVar.h;
                if (arrayList3 != arrayList4) {
                    if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                            if (arrayList3.get(i10) != arrayList4.get(i10)) {
                                break;
                            }
                        }
                    }
                }
                if (b2Var2.j.equals(arrayList2) && Arrays.equals(b2Var2.b, byteArray)) {
                    b2VarArr[i7] = b2Var2;
                }
            }
            b2VarArr[i7] = new b2(aVar.a, byteArray, aVar.c, aVar.d, aVar.e, aVar.f, aVar.i, aVar.g, aVar.h != null ? new ArrayList(aVar.h) : null, new ArrayList(arrayList2));
        }
        View findFocus = ((q3) l0Var.b).findFocus();
        if (findFocus instanceof e1) {
            ?? r12 = (e1) findFocus;
            int selectionStart = r12.getSelectionStart();
            int selectionEnd = r12.getSelectionEnd();
            ?? X2 = q3.X2(r12);
            if (X2 == 0 || X2.getRow() == null) {
                if (!(r12 instanceof i0)) {
                    ViewParent parent = r12.getParent();
                    while (true) {
                        if (parent == null) {
                            i0Var = null;
                            break;
                        }
                        if (parent instanceof i0) {
                            i0Var = (i0) parent;
                            break;
                        }
                        parent = parent.getParent();
                    }
                } else {
                    i0Var = (i0) r12;
                }
                if (i0Var == null || i0Var.getRow() == null) {
                    while (r12 != 0 && !(r12 instanceof y5)) {
                        Object parent2 = r12.getParent();
                        r12 = parent2 instanceof View ? (View) parent2 : 0;
                    }
                    if (r12 instanceof y5) {
                        y5 y5Var = (y5) r12;
                        if (y5Var.getRow() != null) {
                            a2Var = new a2(-1, selectionStart, selectionEnd, y5Var.getRow().a);
                        }
                    }
                } else {
                    a2Var = new a2(-1, selectionStart, selectionEnd, i0Var.getRow().a);
                }
            } else if (r12 == X2.getTitleEditText()) {
                a2Var = new a2(0, selectionStart, selectionEnd, X2.getRow().a);
            } else {
                n5 q10 = X2.q(r12);
                a2Var = new a2(q10 != null ? X2.l(q10.b) : -1, selectionStart, selectionEnd, X2.getRow().a);
            }
            return new c2(b2VarArr, a2Var);
        }
        a2Var = a2.e;
        return new c2(b2VarArr, a2Var);
    }

    public final void c() {
        org.telegram.messenger.g0.r(this.g);
        if (!this.e || this.f) {
            return;
        }
        c2 b10 = b();
        this.e = false;
        c2 c2Var = this.d;
        if (c2Var != null) {
            b2[] b2VarArr = c2Var.a;
            b2[] b2VarArr2 = b10.a;
            if (b2VarArr.length == b2VarArr2.length) {
                for (int i7 = 0; i7 < b2VarArr.length; i7++) {
                    if (b2VarArr[i7] == b2VarArr2[i7]) {
                    }
                }
                return;
            }
        }
        c2 c2Var2 = this.d;
        ArrayDeque arrayDeque = this.b;
        arrayDeque.addLast(c2Var2);
        while (arrayDeque.size() > 150) {
            arrayDeque.removeFirst();
        }
        this.c.clear();
        this.d = b10;
        ((q3) this.a.b).p3.m0();
    }

    public final void d() {
        org.telegram.messenger.g0.r(this.g);
        c();
    }

    public final void f(int i7, int i10) {
        if (this.f) {
            return;
        }
        if (i7 > 16 || i10 > 16) {
            d();
        }
    }

    public final void g() {
        if (this.f) {
            return;
        }
        this.e = true;
        kg.j1 j1Var = this.g;
        org.telegram.messenger.g0.r(j1Var);
        org.telegram.messenger.g0.i3(j1Var, 800L);
        ((q3) this.a.b).p3.m0();
    }

    public final void h() {
        if (this.f) {
            return;
        }
        org.telegram.messenger.g0.r(this.g);
        this.e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.b.addLast(this.d);
        c2 c2Var = (c2) arrayDeque.removeLast();
        this.d = c2Var;
        a(c2Var);
    }

    public final void j() {
        org.telegram.messenger.g0.r(this.g);
        this.b.clear();
        this.c.clear();
        this.d = b();
        this.e = false;
        ((q3) this.a.b).p3.m0();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.c.addLast(this.d);
        c2 c2Var = (c2) arrayDeque.removeLast();
        this.d = c2Var;
        a(c2Var);
    }
}
