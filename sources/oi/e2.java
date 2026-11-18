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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class e2 {
    public final h9.g1 a;
    public boolean e;
    public boolean f;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();
    public final a2 g = new a2(this, 0);
    public d2 d = b();

    public e2(h9.g1 g1Var) {
        this.a = g1Var;
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
    public final void a(d2 d2Var) {
        c2 c2Var;
        ArrayList arrayList;
        TL_iv.PageBlock pageBlock;
        this.e = false;
        boolean z10 = true;
        this.f = true;
        ArrayList arrayList2 = new ArrayList(d2Var.a.length);
        c2[] c2VarArr = d2Var.a;
        int length = c2VarArr.length;
        int i7 = 0;
        while (i7 < length) {
            c2Var = c2VarArr[i7];
            byte[] bArr = c2Var.b;
            arrayList = c2Var.i;
            try {
                SerializedData serializedData = new SerializedData(bArr);
                pageBlock = TL_iv.PageBlock.TLdeserialize(serializedData, serializedData.readInt32(z10), z10);
                serializedData.cleanup();
            } catch (Throwable th2) {
                a8.g(th2, z10);
            }
        }
        b2 b2Var = d2Var.b;
        h9.g1 g1Var = this.a;
        s3 s3Var = (s3) g1Var.b;
        s3Var.v3.f(false);
        ArrayList arrayList3 = s3Var.t3;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        s3Var.v4();
        s3Var.g3.O(false);
        if (b2Var.a >= 0) {
            s3Var.post(new s2(1, s3Var, b2Var));
        }
        s3Var.p3.onContentChanged();
        this.f = false;
        ((s3) g1Var.b).p3.j1();
        return;
        pageBlock = new TL_iv.pageBlockParagraph();
        pageBlock.text = new TL_iv.textEmpty();
        a aVar = new a(pageBlock, c2Var.c, c2Var.d, c2Var.a);
        aVar.e = c2Var.e;
        aVar.f = c2Var.f;
        aVar.i = c2Var.g;
        aVar.g = c2Var.h;
        aVar.h = arrayList != null ? new ArrayList(arrayList) : null;
        aVar.k.addAll(c2Var.j);
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
    /* JADX WARN: Type inference failed for: r2v4, types: [oi.l5] */
    public final d2 b() {
        b2 b2Var;
        i0 i0Var;
        h9.g1 g1Var = this.a;
        ArrayList arrayList = ((s3) g1Var.b).t3;
        HashMap hashMap = new HashMap();
        d2 d2Var = this.d;
        if (d2Var != null) {
            for (c2 c2Var : d2Var.a) {
                hashMap.put(Long.valueOf(c2Var.a), c2Var);
            }
        }
        c2[] c2VarArr = new c2[arrayList.size()];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            a aVar = (a) arrayList.get(i7);
            TL_iv.PageBlock pageBlock = aVar.b;
            ArrayList arrayList2 = aVar.k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            c2 c2Var2 = (c2) hashMap.get(Long.valueOf(aVar.a));
            if (c2Var2 != null && c2Var2.c == aVar.c && c2Var2.d == aVar.d && c2Var2.e == aVar.e && c2Var2.f == aVar.f && c2Var2.g == aVar.i && c2Var2.h == aVar.g) {
                ArrayList arrayList3 = c2Var2.i;
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
                if (c2Var2.j.equals(arrayList2) && Arrays.equals(c2Var2.b, byteArray)) {
                    c2VarArr[i7] = c2Var2;
                }
            }
            c2VarArr[i7] = new c2(aVar.a, byteArray, aVar.c, aVar.d, aVar.e, aVar.f, aVar.i, aVar.g, aVar.h != null ? new ArrayList(aVar.h) : null, new ArrayList(arrayList2));
        }
        View findFocus = ((s3) g1Var.b).findFocus();
        if (findFocus instanceof e1) {
            ?? r12 = (e1) findFocus;
            int selectionStart = r12.getSelectionStart();
            int selectionEnd = r12.getSelectionEnd();
            ?? X2 = s3.X2(r12);
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
                    while (r12 != 0 && !(r12 instanceof z5)) {
                        Object parent2 = r12.getParent();
                        r12 = parent2 instanceof View ? (View) parent2 : 0;
                    }
                    if (r12 instanceof z5) {
                        z5 z5Var = (z5) r12;
                        if (z5Var.getRow() != null) {
                            b2Var = new b2(-1, selectionStart, selectionEnd, z5Var.getRow().a);
                        }
                    }
                } else {
                    b2Var = new b2(-1, selectionStart, selectionEnd, i0Var.getRow().a);
                }
            } else if (r12 == X2.getTitleEditText()) {
                b2Var = new b2(0, selectionStart, selectionEnd, X2.getRow().a);
            } else {
                o5 q10 = X2.q(r12);
                b2Var = new b2(q10 != null ? X2.l(q10.b) : -1, selectionStart, selectionEnd, X2.getRow().a);
            }
            return new d2(c2VarArr, b2Var);
        }
        b2Var = b2.e;
        return new d2(c2VarArr, b2Var);
    }

    public final void c() {
        org.telegram.messenger.g0.r(this.g);
        if (!this.e || this.f) {
            return;
        }
        d2 b10 = b();
        this.e = false;
        d2 d2Var = this.d;
        if (d2Var != null) {
            c2[] c2VarArr = d2Var.a;
            c2[] c2VarArr2 = b10.a;
            if (c2VarArr.length == c2VarArr2.length) {
                for (int i7 = 0; i7 < c2VarArr.length; i7++) {
                    if (c2VarArr[i7] == c2VarArr2[i7]) {
                    }
                }
                return;
            }
        }
        d2 d2Var2 = this.d;
        ArrayDeque arrayDeque = this.b;
        arrayDeque.addLast(d2Var2);
        while (arrayDeque.size() > 150) {
            arrayDeque.removeFirst();
        }
        this.c.clear();
        this.d = b10;
        ((s3) this.a.b).p3.j1();
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
        a2 a2Var = this.g;
        org.telegram.messenger.g0.r(a2Var);
        org.telegram.messenger.g0.h3(a2Var, 800L);
        ((s3) this.a.b).p3.j1();
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
        d2 d2Var = (d2) arrayDeque.removeLast();
        this.d = d2Var;
        a(d2Var);
    }

    public final void j() {
        org.telegram.messenger.g0.r(this.g);
        this.b.clear();
        this.c.clear();
        this.d = b();
        this.e = false;
        ((s3) this.a.b).p3.j1();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.c.addLast(this.d);
        d2 d2Var = (d2) arrayDeque.removeLast();
        this.d = d2Var;
        a(d2Var);
    }
}
