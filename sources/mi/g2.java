package mi;

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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class g2 {
    public final gi.w5 a;
    public boolean e;
    public boolean f;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();
    public final lg.n g = new lg.n(this, 15);
    public f2 d = b();

    public g2(gi.w5 w5Var) {
        this.a = w5Var;
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
        int i3 = 0;
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
            while (i3 < size4) {
                TL_keyboard.PageButton pageButton = arrayList4.get(i3);
                i3++;
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
            while (i3 < size5) {
                TL_iv.PageBlock pageBlock3 = arrayList5.get(i3);
                i3++;
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
            while (i3 < size6) {
                TL_iv.PageBlock pageBlock4 = arrayList6.get(i3);
                i3++;
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
    public final void a(f2 f2Var) {
        e2 e2Var;
        ArrayList arrayList;
        TL_iv.PageBlock pageBlock;
        this.e = false;
        boolean z10 = true;
        this.f = true;
        ArrayList arrayList2 = new ArrayList(f2Var.a.length);
        e2[] e2VarArr = f2Var.a;
        int length = e2VarArr.length;
        int i3 = 0;
        while (i3 < length) {
            e2Var = e2VarArr[i3];
            byte[] bArr = e2Var.b;
            arrayList = e2Var.i;
            try {
                SerializedData serializedData = new SerializedData(bArr);
                pageBlock = TL_iv.PageBlock.TLdeserialize(serializedData, serializedData.readInt32(z10), z10);
                serializedData.cleanup();
            } catch (Throwable th2) {
                a8.g(th2, z10);
            }
        }
        d2 d2Var = f2Var.b;
        gi.w5 w5Var = this.a;
        t3 t3Var = (t3) w5Var.b;
        t3Var.v3.f(false);
        ArrayList arrayList3 = t3Var.t3;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        t3Var.v4();
        t3Var.g3.O(false);
        if (d2Var.a >= 0) {
            t3Var.post(new m2.s(7, t3Var, d2Var));
        }
        t3Var.p3.onContentChanged();
        this.f = false;
        ((t3) w5Var.b).p3.O1();
        return;
        pageBlock = new TL_iv.pageBlockParagraph();
        pageBlock.text = new TL_iv.textEmpty();
        a aVar = new a(pageBlock, e2Var.c, e2Var.d, e2Var.a);
        aVar.e = e2Var.e;
        aVar.f = e2Var.f;
        aVar.i = e2Var.g;
        aVar.g = e2Var.h;
        aVar.h = arrayList != null ? new ArrayList(arrayList) : null;
        aVar.k.addAll(e2Var.j);
        arrayList2.add(aVar);
        i3++;
        z10 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, android.widget.TextView, mi.h1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v4, types: [mi.n5] */
    public final f2 b() {
        d2 d2Var;
        l0 l0Var;
        gi.w5 w5Var = this.a;
        ArrayList arrayList = ((t3) w5Var.b).t3;
        HashMap hashMap = new HashMap();
        f2 f2Var = this.d;
        if (f2Var != null) {
            for (e2 e2Var : f2Var.a) {
                hashMap.put(Long.valueOf(e2Var.a), e2Var);
            }
        }
        e2[] e2VarArr = new e2[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            a aVar = (a) arrayList.get(i3);
            TL_iv.PageBlock pageBlock = aVar.b;
            ArrayList arrayList2 = aVar.k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            e2 e2Var2 = (e2) hashMap.get(Long.valueOf(aVar.a));
            if (e2Var2 != null && e2Var2.c == aVar.c && e2Var2.d == aVar.d && e2Var2.e == aVar.e && e2Var2.f == aVar.f && e2Var2.g == aVar.i && e2Var2.h == aVar.g) {
                ArrayList arrayList3 = e2Var2.i;
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
                if (e2Var2.j.equals(arrayList2) && Arrays.equals(e2Var2.b, byteArray)) {
                    e2VarArr[i3] = e2Var2;
                }
            }
            e2VarArr[i3] = new e2(aVar.a, byteArray, aVar.c, aVar.d, aVar.e, aVar.f, aVar.i, aVar.g, aVar.h != null ? new ArrayList(aVar.h) : null, new ArrayList(arrayList2));
        }
        View findFocus = ((t3) w5Var.b).findFocus();
        if (findFocus instanceof h1) {
            ?? r12 = (h1) findFocus;
            int selectionStart = r12.getSelectionStart();
            int selectionEnd = r12.getSelectionEnd();
            ?? X2 = t3.X2(r12);
            if (X2 == 0 || X2.getRow() == null) {
                if (!(r12 instanceof l0)) {
                    ViewParent parent = r12.getParent();
                    while (true) {
                        if (parent == null) {
                            l0Var = null;
                            break;
                        }
                        if (parent instanceof l0) {
                            l0Var = (l0) parent;
                            break;
                        }
                        parent = parent.getParent();
                    }
                } else {
                    l0Var = (l0) r12;
                }
                if (l0Var == null || l0Var.getRow() == null) {
                    while (r12 != 0 && !(r12 instanceof b6)) {
                        Object parent2 = r12.getParent();
                        r12 = parent2 instanceof View ? (View) parent2 : 0;
                    }
                    if (r12 instanceof b6) {
                        b6 b6Var = (b6) r12;
                        if (b6Var.getRow() != null) {
                            d2Var = new d2(-1, selectionStart, selectionEnd, b6Var.getRow().a);
                        }
                    }
                } else {
                    d2Var = new d2(-1, selectionStart, selectionEnd, l0Var.getRow().a);
                }
            } else if (r12 == X2.getTitleEditText()) {
                d2Var = new d2(0, selectionStart, selectionEnd, X2.getRow().a);
            } else {
                q5 q10 = X2.q(r12);
                d2Var = new d2(q10 != null ? X2.l(q10.b) : -1, selectionStart, selectionEnd, X2.getRow().a);
            }
            return new f2(e2VarArr, d2Var);
        }
        d2Var = d2.e;
        return new f2(e2VarArr, d2Var);
    }

    public final void c() {
        org.telegram.messenger.g0.r(this.g);
        if (!this.e || this.f) {
            return;
        }
        f2 b10 = b();
        this.e = false;
        f2 f2Var = this.d;
        if (f2Var != null) {
            e2[] e2VarArr = f2Var.a;
            e2[] e2VarArr2 = b10.a;
            if (e2VarArr.length == e2VarArr2.length) {
                for (int i3 = 0; i3 < e2VarArr.length; i3++) {
                    if (e2VarArr[i3] == e2VarArr2[i3]) {
                    }
                }
                return;
            }
        }
        f2 f2Var2 = this.d;
        ArrayDeque arrayDeque = this.b;
        arrayDeque.addLast(f2Var2);
        while (arrayDeque.size() > 150) {
            arrayDeque.removeFirst();
        }
        this.c.clear();
        this.d = b10;
        ((t3) this.a.b).p3.O1();
    }

    public final void d() {
        org.telegram.messenger.g0.r(this.g);
        c();
    }

    public final void f(int i3, int i10) {
        if (this.f) {
            return;
        }
        if (i3 > 16 || i10 > 16) {
            d();
        }
    }

    public final void g() {
        if (this.f) {
            return;
        }
        this.e = true;
        lg.n nVar = this.g;
        org.telegram.messenger.g0.r(nVar);
        org.telegram.messenger.g0.i3(nVar, 800L);
        ((t3) this.a.b).p3.O1();
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
        f2 f2Var = (f2) arrayDeque.removeLast();
        this.d = f2Var;
        a(f2Var);
    }

    public final void j() {
        org.telegram.messenger.g0.r(this.g);
        this.b.clear();
        this.c.clear();
        this.d = b();
        this.e = false;
        ((t3) this.a.b).p3.O1();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.c.addLast(this.d);
        f2 f2Var = (f2) arrayDeque.removeLast();
        this.d = f2Var;
        a(f2Var);
    }
}
