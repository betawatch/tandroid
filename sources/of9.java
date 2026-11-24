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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class of9 {
    public final oo8 a;
    public boolean e;
    public boolean f;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();
    public final kf9 g = new kf9(this, 0);
    public nf9 d = b();

    public of9(oo8 oo8Var) {
        this.a = oo8Var;
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
    public final void a(nf9 nf9Var) {
        mf9 mf9Var;
        ArrayList arrayList;
        TL_iv.PageBlock pageBlock;
        this.e = false;
        boolean z = true;
        this.f = true;
        ArrayList arrayList2 = new ArrayList(nf9Var.a.length);
        mf9[] mf9VarArr = nf9Var.a;
        int length = mf9VarArr.length;
        int i = 0;
        while (i < length) {
            mf9Var = mf9VarArr[i];
            byte[] bArr = mf9Var.b;
            arrayList = mf9Var.i;
            try {
                SerializedData serializedData = new SerializedData(bArr);
                pageBlock = TL_iv.PageBlock.TLdeserialize(serializedData, serializedData.readInt32(z), z);
                serializedData.cleanup();
            } catch (Throwable th) {
                fc4.g(th, z);
            }
        }
        lf9 lf9Var = nf9Var.b;
        oo8 oo8Var = this.a;
        ch9 ch9Var = (ch9) oo8Var.b;
        ch9Var.v3.e(false);
        ArrayList arrayList3 = ch9Var.t3;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        ch9Var.t4();
        ch9Var.g3.O(false);
        if (lf9Var.a >= 0) {
            ch9Var.post(new ey8(ch9Var, lf9Var, (byte) 23));
        }
        ch9Var.p3.onContentChanged();
        this.f = false;
        ((ch9) oo8Var.b).p3.E();
        return;
        pageBlock = new TL_iv.pageBlockParagraph();
        pageBlock.text = new TL_iv.textEmpty();
        ll0 ll0Var = new ll0(pageBlock, mf9Var.c, mf9Var.d, mf9Var.a);
        ll0Var.e = mf9Var.e;
        ll0Var.f = mf9Var.f;
        ll0Var.i = mf9Var.g;
        ll0Var.g = mf9Var.h;
        ll0Var.h = arrayList != null ? new ArrayList(arrayList) : null;
        ll0Var.k.addAll(mf9Var.j);
        arrayList2.add(ll0Var);
        i++;
        z = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, android.widget.TextView, ne9] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kk9] */
    public final nf9 b() {
        lf9 lf9Var;
        td9 td9Var;
        ArrayList arrayList;
        oo8 oo8Var = this.a;
        ArrayList arrayList2 = ((ch9) oo8Var.b).t3;
        HashMap hashMap = new HashMap();
        nf9 nf9Var = this.d;
        if (nf9Var != null) {
            for (mf9 mf9Var : nf9Var.a) {
                hashMap.put(Long.valueOf(mf9Var.a), mf9Var);
            }
        }
        mf9[] mf9VarArr = new mf9[arrayList2.size()];
        int i = 0;
        while (i < arrayList2.size()) {
            ll0 ll0Var = (ll0) arrayList2.get(i);
            TL_iv.PageBlock pageBlock = ll0Var.b;
            ArrayList arrayList3 = ll0Var.k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            mf9 mf9Var2 = (mf9) hashMap.get(Long.valueOf(ll0Var.a));
            if (mf9Var2 != null && mf9Var2.c == ll0Var.c && mf9Var2.d == ll0Var.d && mf9Var2.e == ll0Var.e && mf9Var2.f == ll0Var.f && mf9Var2.g == ll0Var.i && mf9Var2.h == ll0Var.g) {
                ArrayList arrayList4 = mf9Var2.i;
                ArrayList arrayList5 = ll0Var.h;
                if (arrayList4 != arrayList5) {
                    if (arrayList4 != null && arrayList5 != null && arrayList4.size() == arrayList5.size()) {
                        for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                            if (arrayList4.get(i2) != arrayList5.get(i2)) {
                                break;
                            }
                        }
                    }
                }
                if (mf9Var2.j.equals(arrayList3) && Arrays.equals(mf9Var2.b, byteArray)) {
                    mf9VarArr[i] = mf9Var2;
                    arrayList = arrayList2;
                    i++;
                    arrayList2 = arrayList;
                }
            }
            arrayList = arrayList2;
            mf9VarArr[i] = new mf9(ll0Var.a, byteArray, ll0Var.c, ll0Var.d, ll0Var.e, ll0Var.f, ll0Var.i, ll0Var.g, ll0Var.h != null ? new ArrayList(ll0Var.h) : null, new ArrayList(arrayList3));
            i++;
            arrayList2 = arrayList;
        }
        View findFocus = ((ch9) oo8Var.b).findFocus();
        if (findFocus instanceof ne9) {
            ?? r1 = (ne9) findFocus;
            int selectionStart = r1.getSelectionStart();
            int selectionEnd = r1.getSelectionEnd();
            ?? Q2 = ch9.Q2(r1);
            if (Q2 == 0 || Q2.getRow() == null) {
                if (!(r1 instanceof td9)) {
                    ViewParent parent = r1.getParent();
                    while (true) {
                        if (parent == null) {
                            td9Var = null;
                            break;
                        }
                        if (parent instanceof td9) {
                            td9Var = (td9) parent;
                            break;
                        }
                        parent = parent.getParent();
                    }
                } else {
                    td9Var = (td9) r1;
                }
                if (td9Var == null || td9Var.getRow() == null) {
                    while (r1 != 0 && !(r1 instanceof xk9)) {
                        Object parent2 = r1.getParent();
                        r1 = parent2 instanceof View ? (View) parent2 : 0;
                    }
                    if (r1 instanceof xk9) {
                        xk9 xk9Var = (xk9) r1;
                        if (xk9Var.getRow() != null) {
                            lf9Var = new lf9(-1, selectionStart, selectionEnd, xk9Var.getRow().a);
                        }
                    }
                } else {
                    lf9Var = new lf9(-1, selectionStart, selectionEnd, td9Var.getRow().a);
                }
            } else if (r1 == Q2.getTitleEditText()) {
                lf9Var = new lf9(0, selectionStart, selectionEnd, Q2.getRow().a);
            } else {
                nk9 q = Q2.q(r1);
                lf9Var = new lf9(q != null ? Q2.m(q.b) : -1, selectionStart, selectionEnd, Q2.getRow().a);
            }
            return new nf9(mf9VarArr, lf9Var);
        }
        lf9Var = lf9.e;
        return new nf9(mf9VarArr, lf9Var);
    }

    public final void c() {
        gm.r(this.g);
        if (!this.e || this.f) {
            return;
        }
        nf9 b = b();
        this.e = false;
        nf9 nf9Var = this.d;
        if (nf9Var != null) {
            mf9[] mf9VarArr = nf9Var.a;
            mf9[] mf9VarArr2 = b.a;
            if (mf9VarArr.length == mf9VarArr2.length) {
                for (int i = 0; i < mf9VarArr.length; i++) {
                    if (mf9VarArr[i] == mf9VarArr2[i]) {
                    }
                }
                return;
            }
        }
        nf9 nf9Var2 = this.d;
        ArrayDeque arrayDeque = this.b;
        arrayDeque.addLast(nf9Var2);
        while (arrayDeque.size() > 150) {
            arrayDeque.removeFirst();
        }
        this.c.clear();
        this.d = b;
        ((ch9) this.a.b).p3.E();
    }

    public final void d() {
        gm.r(this.g);
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
        kf9 kf9Var = this.g;
        gm.r(kf9Var);
        gm.d3(kf9Var, 800L);
        ((ch9) this.a.b).p3.E();
    }

    public final void h() {
        if (this.f) {
            return;
        }
        gm.r(this.g);
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
        nf9 nf9Var = (nf9) arrayDeque.removeLast();
        this.d = nf9Var;
        a(nf9Var);
    }

    public final void j() {
        gm.r(this.g);
        this.b.clear();
        this.c.clear();
        this.d = b();
        this.e = false;
        ((ch9) this.a.b).p3.E();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.c.addLast(this.d);
        nf9 nf9Var = (nf9) arrayDeque.removeLast();
        this.d = nf9Var;
        a(nf9Var);
    }
}
