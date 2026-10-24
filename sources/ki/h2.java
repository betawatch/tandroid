package ki;

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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class h2 {
    public final k2.w0 a;
    public boolean e;
    public boolean f;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();
    public final u g = new u(this, 4);
    public g2 d = b();

    public h2(k2.w0 w0Var) {
        this.a = w0Var;
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
    public final void a(g2 g2Var) {
        f2 f2Var;
        ArrayList arrayList;
        TL_iv.PageBlock pageBlock;
        this.e = false;
        boolean z10 = true;
        this.f = true;
        ArrayList arrayList2 = new ArrayList(g2Var.a.length);
        f2[] f2VarArr = g2Var.a;
        int length = f2VarArr.length;
        int i10 = 0;
        while (i10 < length) {
            f2Var = f2VarArr[i10];
            byte[] bArr = f2Var.b;
            arrayList = f2Var.i;
            try {
                SerializedData serializedData = new SerializedData(bArr);
                pageBlock = TL_iv.PageBlock.TLdeserialize(serializedData, serializedData.readInt32(z10), z10);
                serializedData.cleanup();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        e2 e2Var = g2Var.b;
        k2.w0 w0Var = this.a;
        w3 w3Var = (w3) w0Var.b;
        w3Var.o3.f(false);
        ArrayList arrayList3 = w3Var.m3;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        w3Var.y4();
        w3Var.Z2.N(false);
        if (e2Var.a >= 0) {
            w3Var.post(new hi.t(23, w3Var, e2Var));
        }
        w3Var.i3.onContentChanged();
        this.f = false;
        ((w3) w0Var.b).i3.P();
        return;
        pageBlock = new TL_iv.pageBlockParagraph();
        pageBlock.text = new TL_iv.textEmpty();
        a aVar = new a(pageBlock, f2Var.c, f2Var.d, f2Var.a);
        aVar.e = f2Var.e;
        aVar.f = f2Var.f;
        aVar.i = f2Var.g;
        aVar.g = f2Var.h;
        aVar.h = arrayList != null ? new ArrayList(arrayList) : null;
        aVar.k.addAll(f2Var.j);
        arrayList2.add(aVar);
        i10++;
        z10 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, android.widget.TextView, ki.h1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ki.o5] */
    public final g2 b() {
        e2 e2Var;
        l0 l0Var;
        k2.w0 w0Var = this.a;
        ArrayList arrayList = ((w3) w0Var.b).m3;
        HashMap hashMap = new HashMap();
        g2 g2Var = this.d;
        if (g2Var != null) {
            for (f2 f2Var : g2Var.a) {
                hashMap.put(Long.valueOf(f2Var.a), f2Var);
            }
        }
        f2[] f2VarArr = new f2[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            a aVar = (a) arrayList.get(i10);
            TL_iv.PageBlock pageBlock = aVar.b;
            ArrayList arrayList2 = aVar.k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            f2 f2Var2 = (f2) hashMap.get(Long.valueOf(aVar.a));
            if (f2Var2 != null && f2Var2.c == aVar.c && f2Var2.d == aVar.d && f2Var2.e == aVar.e && f2Var2.f == aVar.f && f2Var2.g == aVar.i && f2Var2.h == aVar.g) {
                ArrayList arrayList3 = f2Var2.i;
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
                if (f2Var2.j.equals(arrayList2) && Arrays.equals(f2Var2.b, byteArray)) {
                    f2VarArr[i10] = f2Var2;
                }
            }
            f2VarArr[i10] = new f2(aVar.a, byteArray, aVar.c, aVar.d, aVar.e, aVar.f, aVar.i, aVar.g, aVar.h != null ? new ArrayList(aVar.h) : null, new ArrayList(arrayList2));
        }
        View findFocus = ((w3) w0Var.b).findFocus();
        if (findFocus instanceof h1) {
            ?? r12 = (h1) findFocus;
            int selectionStart = r12.getSelectionStart();
            int selectionEnd = r12.getSelectionEnd();
            ?? a32 = w3.a3(r12);
            if (a32 == 0 || a32.getRow() == null) {
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
                    while (r12 != 0 && !(r12 instanceof c6)) {
                        Object parent2 = r12.getParent();
                        r12 = parent2 instanceof View ? (View) parent2 : 0;
                    }
                    if (r12 instanceof c6) {
                        c6 c6Var = (c6) r12;
                        if (c6Var.getRow() != null) {
                            e2Var = new e2(c6Var.getRow().a, -1, selectionStart, selectionEnd);
                        }
                    }
                } else {
                    e2Var = new e2(l0Var.getRow().a, -1, selectionStart, selectionEnd);
                }
            } else if (r12 == a32.getTitleEditText()) {
                e2Var = new e2(a32.getRow().a, 0, selectionStart, selectionEnd);
            } else {
                r5 n10 = a32.n(r12);
                e2Var = new e2(a32.getRow().a, n10 != null ? a32.j(n10.b) : -1, selectionStart, selectionEnd);
            }
            return new g2(f2VarArr, e2Var);
        }
        e2Var = e2.e;
        return new g2(f2VarArr, e2Var);
    }

    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.g);
        if (!this.e || this.f) {
            return;
        }
        g2 b10 = b();
        this.e = false;
        g2 g2Var = this.d;
        if (g2Var != null) {
            f2[] f2VarArr = g2Var.a;
            f2[] f2VarArr2 = b10.a;
            if (f2VarArr.length == f2VarArr2.length) {
                for (int i10 = 0; i10 < f2VarArr.length; i10++) {
                    if (f2VarArr[i10] == f2VarArr2[i10]) {
                    }
                }
                return;
            }
        }
        g2 g2Var2 = this.d;
        ArrayDeque arrayDeque = this.b;
        arrayDeque.addLast(g2Var2);
        while (arrayDeque.size() > 150) {
            arrayDeque.removeFirst();
        }
        this.c.clear();
        this.d = b10;
        ((w3) this.a.b).i3.P();
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
        u uVar = this.g;
        AndroidUtilities.cancelRunOnUIThread(uVar);
        AndroidUtilities.runOnUIThread(uVar, 800L);
        ((w3) this.a.b).i3.P();
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
        g2 g2Var = (g2) arrayDeque.removeLast();
        this.d = g2Var;
        a(g2Var);
    }

    public final void j() {
        AndroidUtilities.cancelRunOnUIThread(this.g);
        this.b.clear();
        this.c.clear();
        this.d = b();
        this.e = false;
        ((w3) this.a.b).i3.P();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.c.addLast(this.d);
        g2 g2Var = (g2) arrayDeque.removeLast();
        this.d = g2Var;
        a(g2Var);
    }
}
