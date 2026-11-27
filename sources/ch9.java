// default package

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class ch9 {
    public final k09 a;
    public boolean e;
    public boolean f;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();
    public final v59 g = new v59(this, 8);
    public bh9 d = b();

    public ch9(k09 k09Var) {
        this.a = k09Var;
    }

    public static void e(TL_iv.PageBlock pageBlock) {
        if (pageBlock != null) {
            if (pageBlock.text == null) {
                pageBlock.text = new TL_iv.textEmpty();
            }
            if (pageBlock.caption == null) {
                TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                pageCaption.text = new TL_iv.textEmpty();
                pageCaption.credit = new TL_iv.textEmpty();
                pageBlock.caption = pageCaption;
            }
            int i = 0;
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                if (pageblockblockquote.caption == null) {
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                }
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                ArrayList<TL_iv.PageBlock> arrayList = pageblockblockquoteblocks.blocks;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    pageblockblockquoteblocks.blocks = arrayList;
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    TL_iv.PageBlock pageBlock2 = arrayList.get(i2);
                    i2++;
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
                ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    pageblocktable.rows = arrayList2;
                }
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    TL_iv.pageTableRow pagetablerow = arrayList2.get(i3);
                    i3++;
                    TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                    if (pagetablerow2 != null) {
                        ArrayList<TL_iv.pageTableCell> arrayList3 = pagetablerow2.cells;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList<>();
                            pagetablerow2.cells = arrayList3;
                        }
                        int size3 = arrayList3.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            TL_iv.pageTableCell pagetablecell = arrayList3.get(i4);
                            i4++;
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
                ArrayList<TL_keyboard.PageButton> arrayList4 = pageblockbuttonrow.buttons;
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList<>();
                    pageblockbuttonrow.buttons = arrayList4;
                }
                int size4 = arrayList4.size();
                while (i < size4) {
                    TL_keyboard.PageButton pageButton = arrayList4.get(i);
                    i++;
                    TL_keyboard.PageButton pageButton2 = pageButton;
                    if (pageButton2 != null && pageButton2.text == null) {
                        pageButton2.text = new TL_iv.textEmpty();
                    }
                }
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                ArrayList<TL_iv.PageBlock> arrayList5 = pageblockcollage.items;
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList<>();
                    pageblockcollage.items = arrayList5;
                }
                int size5 = arrayList5.size();
                while (i < size5) {
                    TL_iv.PageBlock pageBlock3 = arrayList5.get(i);
                    i++;
                    e(pageBlock3);
                }
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                ArrayList<TL_iv.PageBlock> arrayList6 = pageblockslideshow.items;
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList<>();
                    pageblockslideshow.items = arrayList6;
                }
                int size6 = arrayList6.size();
                while (i < size6) {
                    TL_iv.PageBlock pageBlock4 = arrayList6.get(i);
                    i++;
                    e(pageBlock4);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(bh9 bh9Var) {
        ah9 ah9Var;
        ArrayList arrayList;
        TL_iv.PageBlock pageBlock;
        this.e = false;
        boolean z = true;
        this.f = true;
        ArrayList arrayList2 = new ArrayList(bh9Var.a.length);
        ah9[] ah9VarArr = bh9Var.a;
        int length = ah9VarArr.length;
        int i = 0;
        while (i < length) {
            ah9Var = ah9VarArr[i];
            byte[] bArr = ah9Var.b;
            arrayList = ah9Var.i;
            try {
                SerializedData serializedData = new SerializedData(bArr);
                pageBlock = TL_iv.PageBlock.TLdeserialize(serializedData, serializedData.readInt32(z), z);
                serializedData.cleanup();
            } catch (Throwable th) {
                cc4.g(th, z);
            }
        }
        zg9 zg9Var = bh9Var.b;
        k09 k09Var = this.a;
        pi9 pi9Var = (pi9) k09Var.b;
        pi9Var.v3.e(false);
        ArrayList arrayList3 = pi9Var.t3;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        pi9Var.u4();
        pi9Var.g3.O(false);
        if (zg9Var.a >= 0) {
            pi9Var.post(new z09(pi9Var, zg9Var, (byte) 20));
        }
        pi9Var.p3.onContentChanged();
        this.f = false;
        ((pi9) k09Var.b).p3.R();
        return;
        pageBlock = new TL_iv.pageBlockParagraph();
        pageBlock.text = new TL_iv.textEmpty();
        mk0 mk0Var = new mk0(pageBlock, ah9Var.c, ah9Var.d, ah9Var.a);
        mk0Var.e = ah9Var.e;
        mk0Var.f = ah9Var.f;
        mk0Var.i = ah9Var.g;
        mk0Var.g = ah9Var.h;
        mk0Var.h = arrayList != null ? new ArrayList(arrayList) : null;
        mk0Var.k.addAll(ah9Var.j);
        arrayList2.add(mk0Var);
        i++;
        z = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, android.widget.TextView, dg9] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v4, types: [xl9] */
    public final bh9 b() {
        zg9 zg9Var;
        jf9 jf9Var;
        ArrayList arrayList;
        k09 k09Var = this.a;
        ArrayList arrayList2 = ((pi9) k09Var.b).t3;
        HashMap hashMap = new HashMap();
        bh9 bh9Var = this.d;
        if (bh9Var != null) {
            for (ah9 ah9Var : bh9Var.a) {
                hashMap.put(Long.valueOf(ah9Var.a), ah9Var);
            }
        }
        ah9[] ah9VarArr = new ah9[arrayList2.size()];
        int i = 0;
        while (i < arrayList2.size()) {
            mk0 mk0Var = (mk0) arrayList2.get(i);
            TL_iv.PageBlock pageBlock = mk0Var.b;
            ArrayList arrayList3 = mk0Var.k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            ah9 ah9Var2 = (ah9) hashMap.get(Long.valueOf(mk0Var.a));
            if (ah9Var2 != null && ah9Var2.c == mk0Var.c && ah9Var2.d == mk0Var.d && ah9Var2.e == mk0Var.e && ah9Var2.f == mk0Var.f && ah9Var2.g == mk0Var.i && ah9Var2.h == mk0Var.g) {
                ArrayList arrayList4 = ah9Var2.i;
                ArrayList arrayList5 = mk0Var.h;
                if (arrayList4 != arrayList5) {
                    if (arrayList4 != null && arrayList5 != null && arrayList4.size() == arrayList5.size()) {
                        for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                            if (arrayList4.get(i2) != arrayList5.get(i2)) {
                                break;
                            }
                        }
                    }
                }
                if (ah9Var2.j.equals(arrayList3) && Arrays.equals(ah9Var2.b, byteArray)) {
                    ah9VarArr[i] = ah9Var2;
                    arrayList = arrayList2;
                    i++;
                    arrayList2 = arrayList;
                }
            }
            arrayList = arrayList2;
            ah9VarArr[i] = new ah9(mk0Var.a, byteArray, mk0Var.c, mk0Var.d, mk0Var.e, mk0Var.f, mk0Var.i, mk0Var.g, mk0Var.h != null ? new ArrayList(mk0Var.h) : null, new ArrayList(arrayList3));
            i++;
            arrayList2 = arrayList;
        }
        View findFocus = ((pi9) k09Var.b).findFocus();
        if (findFocus instanceof dg9) {
            ?? r1 = (dg9) findFocus;
            int selectionStart = r1.getSelectionStart();
            int selectionEnd = r1.getSelectionEnd();
            ?? R2 = pi9.R2(r1);
            if (R2 == 0 || R2.getRow() == null) {
                if (!(r1 instanceof jf9)) {
                    ViewParent parent = r1.getParent();
                    while (true) {
                        if (parent == null) {
                            jf9Var = null;
                            break;
                        }
                        if (parent instanceof jf9) {
                            jf9Var = (jf9) parent;
                            break;
                        }
                        parent = parent.getParent();
                    }
                } else {
                    jf9Var = (jf9) r1;
                }
                if (jf9Var == null || jf9Var.getRow() == null) {
                    while (r1 != 0 && !(r1 instanceof km9)) {
                        Object parent2 = r1.getParent();
                        r1 = parent2 instanceof View ? (View) parent2 : 0;
                    }
                    if (r1 instanceof km9) {
                        km9 km9Var = (km9) r1;
                        if (km9Var.getRow() != null) {
                            zg9Var = new zg9(-1, selectionStart, selectionEnd, km9Var.getRow().a);
                        }
                    }
                } else {
                    zg9Var = new zg9(-1, selectionStart, selectionEnd, jf9Var.getRow().a);
                }
            } else if (r1 == R2.getTitleEditText()) {
                zg9Var = new zg9(0, selectionStart, selectionEnd, R2.getRow().a);
            } else {
                am9 q = R2.q(r1);
                zg9Var = new zg9(q != null ? R2.m(q.b) : -1, selectionStart, selectionEnd, R2.getRow().a);
            }
            return new bh9(ah9VarArr, zg9Var);
        }
        zg9Var = zg9.e;
        return new bh9(ah9VarArr, zg9Var);
    }

    public final void c() {
        hl.r(this.g);
        if (!this.e || this.f) {
            return;
        }
        bh9 b = b();
        this.e = false;
        bh9 bh9Var = this.d;
        if (bh9Var != null) {
            ah9[] ah9VarArr = bh9Var.a;
            ah9[] ah9VarArr2 = b.a;
            if (ah9VarArr.length == ah9VarArr2.length) {
                for (int i = 0; i < ah9VarArr.length; i++) {
                    if (ah9VarArr[i] == ah9VarArr2[i]) {
                    }
                }
                return;
            }
        }
        bh9 bh9Var2 = this.d;
        ArrayDeque arrayDeque = this.b;
        arrayDeque.addLast(bh9Var2);
        while (arrayDeque.size() > 150) {
            arrayDeque.removeFirst();
        }
        this.c.clear();
        this.d = b;
        ((pi9) this.a.b).p3.R();
    }

    public final void d() {
        hl.r(this.g);
        c();
    }

    public final void f(int i, int i2) {
        if (this.f) {
            return;
        }
        if (i > 16 || i2 > 16) {
            d();
        }
    }

    public final void g() {
        if (this.f) {
            return;
        }
        this.e = true;
        v59 v59Var = this.g;
        hl.r(v59Var);
        hl.d3(v59Var, 800L);
        ((pi9) this.a.b).p3.R();
    }

    public final void h() {
        if (this.f) {
            return;
        }
        hl.r(this.g);
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
        bh9 bh9Var = (bh9) arrayDeque.removeLast();
        this.d = bh9Var;
        a(bh9Var);
    }

    public final void j() {
        hl.r(this.g);
        this.b.clear();
        this.c.clear();
        this.d = b();
        this.e = false;
        ((pi9) this.a.b).p3.R();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.c.addLast(this.d);
        bh9 bh9Var = (bh9) arrayDeque.removeLast();
        this.d = bh9Var;
        a(bh9Var);
    }
}
