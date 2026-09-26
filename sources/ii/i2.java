package ii;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class i2 {
    public final a4.m a;
    public boolean e;
    public boolean f;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();
    public final i2.h0 g = new i2.h0(this, 6);
    public h2 d = b();

    public i2(a4.m mVar) {
        this.a = mVar;
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
    public final void a(h2 h2Var) {
        g2 g2Var;
        ArrayList arrayList;
        TL_iv.PageBlock pageBlock;
        this.e = false;
        boolean z10 = true;
        this.f = true;
        ArrayList arrayList2 = new ArrayList(h2Var.a.length);
        g2[] g2VarArr = h2Var.a;
        int length = g2VarArr.length;
        int i10 = 0;
        while (i10 < length) {
            g2Var = g2VarArr[i10];
            byte[] bArr = g2Var.b;
            arrayList = g2Var.i;
            try {
                SerializedData serializedData = new SerializedData(bArr);
                pageBlock = TL_iv.PageBlock.TLdeserialize(serializedData, serializedData.readInt32(z10), z10);
                serializedData.cleanup();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        f2 f2Var = h2Var.b;
        a4.m mVar = this.a;
        x3 x3Var = (x3) mVar.b;
        x3Var.n3.f(false);
        ArrayList arrayList3 = x3Var.l3;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        x3Var.s4();
        x3Var.Y2.N(false);
        if (f2Var.a >= 0) {
            x3Var.post(new gg.x1(15, x3Var, f2Var));
        }
        x3Var.h3.onContentChanged();
        this.f = false;
        ((x3) mVar.b).h3.G();
        return;
        pageBlock = new TL_iv.pageBlockParagraph();
        pageBlock.text = new TL_iv.textEmpty();
        a aVar = new a(pageBlock, g2Var.c, g2Var.d, g2Var.a);
        aVar.e = g2Var.e;
        aVar.f = g2Var.f;
        aVar.i = g2Var.g;
        aVar.g = g2Var.h;
        aVar.h = arrayList != null ? new ArrayList(arrayList) : null;
        aVar.k.addAll(g2Var.j);
        arrayList2.add(aVar);
        i10++;
        z10 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, android.widget.TextView, ii.i1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ii.p5] */
    public final h2 b() {
        f2 f2Var;
        m0 m0Var;
        a4.m mVar = this.a;
        ArrayList arrayList = ((x3) mVar.b).l3;
        HashMap hashMap = new HashMap();
        h2 h2Var = this.d;
        if (h2Var != null) {
            for (g2 g2Var : h2Var.a) {
                hashMap.put(Long.valueOf(g2Var.a), g2Var);
            }
        }
        g2[] g2VarArr = new g2[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            a aVar = (a) arrayList.get(i10);
            TL_iv.PageBlock pageBlock = aVar.b;
            ArrayList arrayList2 = aVar.k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            g2 g2Var2 = (g2) hashMap.get(Long.valueOf(aVar.a));
            if (g2Var2 != null && g2Var2.c == aVar.c && g2Var2.d == aVar.d && g2Var2.e == aVar.e && g2Var2.f == aVar.f && g2Var2.g == aVar.i && g2Var2.h == aVar.g) {
                ArrayList arrayList3 = g2Var2.i;
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
                if (g2Var2.j.equals(arrayList2) && Arrays.equals(g2Var2.b, byteArray)) {
                    g2VarArr[i10] = g2Var2;
                }
            }
            g2VarArr[i10] = new g2(aVar.a, byteArray, aVar.c, aVar.d, aVar.e, aVar.f, aVar.i, aVar.g, aVar.h != null ? new ArrayList(aVar.h) : null, new ArrayList(arrayList2));
        }
        View findFocus = ((x3) mVar.b).findFocus();
        if (findFocus instanceof i1) {
            ?? r12 = (i1) findFocus;
            int selectionStart = r12.getSelectionStart();
            int selectionEnd = r12.getSelectionEnd();
            ?? U2 = x3.U2(r12);
            if (U2 == 0 || U2.getRow() == null) {
                if (!(r12 instanceof m0)) {
                    ViewParent parent = r12.getParent();
                    while (true) {
                        if (parent == null) {
                            m0Var = null;
                            break;
                        }
                        if (parent instanceof m0) {
                            m0Var = (m0) parent;
                            break;
                        }
                        parent = parent.getParent();
                    }
                } else {
                    m0Var = (m0) r12;
                }
                if (m0Var == null || m0Var.getRow() == null) {
                    while (r12 != 0 && !(r12 instanceof e6)) {
                        Object parent2 = r12.getParent();
                        r12 = parent2 instanceof View ? (View) parent2 : 0;
                    }
                    if (r12 instanceof e6) {
                        e6 e6Var = (e6) r12;
                        if (e6Var.getRow() != null) {
                            f2Var = new f2(e6Var.getRow().a, -1, selectionStart, selectionEnd);
                        }
                    }
                } else {
                    f2Var = new f2(m0Var.getRow().a, -1, selectionStart, selectionEnd);
                }
            } else if (r12 == U2.getTitleEditText()) {
                f2Var = new f2(U2.getRow().a, 0, selectionStart, selectionEnd);
            } else {
                s5 o9 = U2.o(r12);
                f2Var = new f2(U2.getRow().a, o9 != null ? U2.k(o9.b) : -1, selectionStart, selectionEnd);
            }
            return new h2(g2VarArr, f2Var);
        }
        f2Var = f2.e;
        return new h2(g2VarArr, f2Var);
    }

    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.g);
        if (!this.e || this.f) {
            return;
        }
        h2 b10 = b();
        this.e = false;
        h2 h2Var = this.d;
        if (h2Var != null) {
            g2[] g2VarArr = h2Var.a;
            g2[] g2VarArr2 = b10.a;
            if (g2VarArr.length == g2VarArr2.length) {
                for (int i10 = 0; i10 < g2VarArr.length; i10++) {
                    if (g2VarArr[i10] == g2VarArr2[i10]) {
                    }
                }
                return;
            }
        }
        h2 h2Var2 = this.d;
        ArrayDeque arrayDeque = this.b;
        arrayDeque.addLast(h2Var2);
        while (arrayDeque.size() > 150) {
            arrayDeque.removeFirst();
        }
        this.c.clear();
        this.d = b10;
        ((x3) this.a.b).h3.G();
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(this.g);
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
        i2.h0 h0Var = this.g;
        AndroidUtilities.cancelRunOnUIThread(h0Var);
        AndroidUtilities.runOnUIThread(h0Var, 800L);
        ((x3) this.a.b).h3.G();
    }

    public final void h() {
        if (this.f) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.g);
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
        h2 h2Var = (h2) arrayDeque.removeLast();
        this.d = h2Var;
        a(h2Var);
    }

    public final void j() {
        AndroidUtilities.cancelRunOnUIThread(this.g);
        this.b.clear();
        this.c.clear();
        this.d = b();
        this.e = false;
        ((x3) this.a.b).h3.G();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.c.addLast(this.d);
        h2 h2Var = (h2) arrayDeque.removeLast();
        this.d = h2Var;
        a(h2Var);
    }
}
