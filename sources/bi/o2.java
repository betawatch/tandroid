package bi;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.f8;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class o2 {
    public final a4.l a;
    public boolean e;
    public boolean f;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();
    public final a3.d g = new a3.d(this, 23);
    public n2 d = b();

    public o2(a4.l lVar) {
        this.a = lVar;
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
        int i10 = 0;
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
            int i11 = 0;
            while (i11 < size) {
                TL_iv.PageBlock pageBlock2 = arrayList.get(i11);
                i11++;
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
            int i12 = 0;
            while (i12 < size2) {
                TL_iv.pageTableRow pagetablerow = arrayList2.get(i12);
                i12++;
                TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                if (pagetablerow2 != null) {
                    if (pagetablerow2.cells == null) {
                        pagetablerow2.cells = new ArrayList<>();
                    }
                    ArrayList<TL_iv.pageTableCell> arrayList3 = pagetablerow2.cells;
                    int size3 = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        TL_iv.pageTableCell pagetablecell = arrayList3.get(i13);
                        i13++;
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
            while (i10 < size4) {
                TL_keyboard.PageButton pageButton = arrayList4.get(i10);
                i10++;
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
            while (i10 < size5) {
                TL_iv.PageBlock pageBlock3 = arrayList5.get(i10);
                i10++;
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
            while (i10 < size6) {
                TL_iv.PageBlock pageBlock4 = arrayList6.get(i10);
                i10++;
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
    public final void a(n2 n2Var) {
        m2 m2Var;
        ArrayList arrayList;
        TL_iv.PageBlock pageBlock;
        this.e = false;
        boolean z10 = true;
        this.f = true;
        ArrayList arrayList2 = new ArrayList(n2Var.a.length);
        m2[] m2VarArr = n2Var.a;
        int length = m2VarArr.length;
        int i10 = 0;
        while (i10 < length) {
            m2Var = m2VarArr[i10];
            byte[] bArr = m2Var.b;
            arrayList = m2Var.i;
            try {
                SerializedData serializedData = new SerializedData(bArr);
                pageBlock = TL_iv.PageBlock.TLdeserialize(serializedData, serializedData.readInt32(z10), z10);
                serializedData.cleanup();
            } catch (Throwable th2) {
                f8.g(th2, z10);
            }
        }
        l2 l2Var = n2Var.b;
        a4.l lVar = this.a;
        d4 d4Var = (d4) lVar.b;
        d4Var.u3.f(false);
        ArrayList arrayList3 = d4Var.s3;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        d4Var.v4();
        d4Var.f3.O(false);
        if (l2Var.a >= 0) {
            d4Var.post(new a1.f(21, d4Var, l2Var));
        }
        d4Var.o3.onContentChanged();
        this.f = false;
        ((d4) lVar.b).o3.Z();
        return;
        pageBlock = new TL_iv.pageBlockParagraph();
        pageBlock.text = new TL_iv.textEmpty();
        a aVar = new a(pageBlock, m2Var.c, m2Var.d, m2Var.a);
        aVar.e = m2Var.e;
        aVar.f = m2Var.f;
        aVar.i = m2Var.g;
        aVar.g = m2Var.h;
        aVar.h = arrayList != null ? new ArrayList(arrayList) : null;
        aVar.k.addAll(m2Var.j);
        arrayList2.add(aVar);
        i10++;
        z10 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, android.widget.TextView, bi.n1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v4, types: [bi.z5] */
    public final n2 b() {
        l2 l2Var;
        o0 o0Var;
        a4.l lVar = this.a;
        ArrayList arrayList = ((d4) lVar.b).s3;
        HashMap hashMap = new HashMap();
        n2 n2Var = this.d;
        if (n2Var != null) {
            for (m2 m2Var : n2Var.a) {
                hashMap.put(Long.valueOf(m2Var.a), m2Var);
            }
        }
        m2[] m2VarArr = new m2[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            a aVar = (a) arrayList.get(i10);
            TL_iv.PageBlock pageBlock = aVar.b;
            ArrayList arrayList2 = aVar.k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            m2 m2Var2 = (m2) hashMap.get(Long.valueOf(aVar.a));
            if (m2Var2 != null && m2Var2.c == aVar.c && m2Var2.d == aVar.d && m2Var2.e == aVar.e && m2Var2.f == aVar.f && m2Var2.g == aVar.i && m2Var2.h == aVar.g) {
                ArrayList arrayList3 = m2Var2.i;
                ArrayList arrayList4 = aVar.h;
                if (arrayList3 != arrayList4) {
                    if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                            if (arrayList3.get(i11) != arrayList4.get(i11)) {
                                break;
                            }
                        }
                    }
                }
                if (m2Var2.j.equals(arrayList2) && Arrays.equals(m2Var2.b, byteArray)) {
                    m2VarArr[i10] = m2Var2;
                }
            }
            m2VarArr[i10] = new m2(aVar.a, byteArray, aVar.c, aVar.d, aVar.e, aVar.f, aVar.i, aVar.g, aVar.h != null ? new ArrayList(aVar.h) : null, new ArrayList(arrayList2));
        }
        View findFocus = ((d4) lVar.b).findFocus();
        if (findFocus instanceof n1) {
            ?? r12 = (n1) findFocus;
            int selectionStart = r12.getSelectionStart();
            int selectionEnd = r12.getSelectionEnd();
            ?? X2 = d4.X2(r12);
            if (X2 == 0 || X2.getRow() == null) {
                if (!(r12 instanceof o0)) {
                    ViewParent parent = r12.getParent();
                    while (true) {
                        if (parent == null) {
                            o0Var = null;
                            break;
                        }
                        if (parent instanceof o0) {
                            o0Var = (o0) parent;
                            break;
                        }
                        parent = parent.getParent();
                    }
                } else {
                    o0Var = (o0) r12;
                }
                if (o0Var == null || o0Var.getRow() == null) {
                    while (r12 != 0 && !(r12 instanceof q6)) {
                        Object parent2 = r12.getParent();
                        r12 = parent2 instanceof View ? (View) parent2 : 0;
                    }
                    if (r12 instanceof q6) {
                        q6 q6Var = (q6) r12;
                        if (q6Var.getRow() != null) {
                            l2Var = new l2(-1, selectionStart, selectionEnd, q6Var.getRow().a);
                        }
                    }
                } else {
                    l2Var = new l2(-1, selectionStart, selectionEnd, o0Var.getRow().a);
                }
            } else if (r12 == X2.getTitleEditText()) {
                l2Var = new l2(0, selectionStart, selectionEnd, X2.getRow().a);
            } else {
                c6 q6 = X2.q(r12);
                l2Var = new l2(q6 != null ? X2.l(q6.b) : -1, selectionStart, selectionEnd, X2.getRow().a);
            }
            return new n2(m2VarArr, l2Var);
        }
        l2Var = l2.e;
        return new n2(m2VarArr, l2Var);
    }

    public final void c() {
        org.telegram.messenger.i0.r(this.g);
        if (!this.e || this.f) {
            return;
        }
        n2 b10 = b();
        this.e = false;
        n2 n2Var = this.d;
        if (n2Var != null) {
            m2[] m2VarArr = n2Var.a;
            m2[] m2VarArr2 = b10.a;
            if (m2VarArr.length == m2VarArr2.length) {
                for (int i10 = 0; i10 < m2VarArr.length; i10++) {
                    if (m2VarArr[i10] == m2VarArr2[i10]) {
                    }
                }
                return;
            }
        }
        n2 n2Var2 = this.d;
        ArrayDeque arrayDeque = this.b;
        arrayDeque.addLast(n2Var2);
        while (arrayDeque.size() > 150) {
            arrayDeque.removeFirst();
        }
        this.c.clear();
        this.d = b10;
        ((d4) this.a.b).o3.Z();
    }

    public final void d() {
        org.telegram.messenger.i0.r(this.g);
        c();
    }

    public final void f(int i10, int i11) {
        if (this.f) {
            return;
        }
        if (i10 > 16 || i11 > 16) {
            d();
        }
    }

    public final void g() {
        if (this.f) {
            return;
        }
        this.e = true;
        a3.d dVar = this.g;
        org.telegram.messenger.i0.r(dVar);
        org.telegram.messenger.i0.h3(dVar, 800L);
        ((d4) this.a.b).o3.Z();
    }

    public final void h() {
        if (this.f) {
            return;
        }
        org.telegram.messenger.i0.r(this.g);
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
        n2 n2Var = (n2) arrayDeque.removeLast();
        this.d = n2Var;
        a(n2Var);
    }

    public final void j() {
        org.telegram.messenger.i0.r(this.g);
        this.b.clear();
        this.c.clear();
        this.d = b();
        this.e = false;
        ((d4) this.a.b).o3.Z();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.c.addLast(this.d);
        n2 n2Var = (n2) arrayDeque.removeLast();
        this.d = n2Var;
        a(n2Var);
    }
}
