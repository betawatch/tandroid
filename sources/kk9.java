// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class kk9 extends jd9 implements vlb, fkb {
    public boolean E;
    public kg9 F;
    public fhb G;
    public boolean H;
    public final LinkedHashSet I;
    public hk9 J;
    public final i82 K;
    public final ylb n;
    public final ne9 r;
    public final gh9 s;
    public final mk9 w;
    public final jk9 x;
    public final ArrayList y;

    public kk9(Context context, ylb ylbVar) {
        super(context);
        this.y = new ArrayList();
        this.I = new LinkedHashSet();
        this.K = new i82(this, (byte) 4);
        this.n = ylbVar;
        setClipChildren(false);
        setClipToPadding(false);
        ne9 ne9Var = new ne9(context, ylbVar);
        this.r = ne9Var;
        ne9Var.setAllowNewlines(false);
        ne9Var.setInputType(147457);
        ne9Var.setGravity(49);
        ne9Var.setTextSize(1, Math.max(8, gda.S0 - 2));
        ne9Var.setIncludeFontPadding(false);
        ne9Var.setMinHeight(0);
        ne9Var.setBackground(null);
        ne9Var.setPadding(gm.L(2.0f), gm.L(4.0f), gm.L(2.0f), 0);
        ne9Var.setHint(jb6.M0(2131753954, null));
        ne9Var.setCenterEmptyHint(true);
        ne9Var.setListener(new cf9((Object) this, (byte) 2));
        ne9Var.setDelegate(new yf9(this, (byte) 5));
        addView(ne9Var);
        gh9 gh9Var = new gh9(this, context, (byte) 1);
        this.s = gh9Var;
        gh9Var.setClipChildren(false);
        gh9Var.setClipToPadding(false);
        gh9Var.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
        addView(gh9Var, qoe.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        mk9 mk9Var = new mk9(context, ylbVar);
        this.w = mk9Var;
        jk9 jk9Var = new jk9(this, context);
        this.x = jk9Var;
        jk9Var.addView(mk9Var);
        gh9Var.addView(jk9Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void B() {
        int i = 0;
        while (true) {
            mk9 mk9Var = this.w;
            if (i >= mk9Var.getChildCount()) {
                return;
            }
            View childAt = mk9Var.getChildAt(i);
            if (childAt instanceof nk9) {
                nk9 nk9Var = (nk9) childAt;
                ne9 ne9Var = nk9Var.a;
                ne9Var.setListener(new ek9(this, nk9Var));
                ne9Var.setDelegate(new xr8(this, nk9Var, (byte) 11));
            }
            i++;
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.G != null) {
            kg9 kg9Var = this.F;
            gkb textSelectionHelper = kg9Var != null ? kg9Var.a.getTextSelectionHelper() : null;
            if (textSelectionHelper != null) {
                ArrayList arrayList = this.y;
                arrayList.clear();
                k(arrayList);
                for (int i = 0; i < arrayList.size(); i++) {
                    qkb qkbVar = (qkb) arrayList.get(i);
                    canvas.save();
                    canvas.translate(qkbVar.getX(), qkbVar.getY());
                    textSelectionHelper.Y(canvas, this, i);
                    canvas.restore();
                }
            }
        }
    }

    @Override // jd9
    public final void e(int i) {
        requestLayout();
    }

    public final TL_iv.pageTableCell g(int i) {
        int i2;
        fhb fhbVar = this.G;
        if (fhbVar == null || i <= 0 || i - 1 >= fhbVar.g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.G.g.get(i2);
    }

    public mk9 getGrid() {
        return this.w;
    }

    public fhb getModel() {
        return this.G;
    }

    public ll0 getRow() {
        return this.a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.I;
    }

    public ne9 getTitleEditText() {
        return this.r;
    }

    public final void h(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.G != null) {
            LinkedHashSet linkedHashSet = this.I;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            if (z) {
                Iterator it = linkedHashSet.iterator();
                i = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (it.hasNext()) {
                    i = Math.min(i, this.G.a((TL_iv.pageTableCell) it.next()));
                }
            } else {
                Iterator it2 = linkedHashSet.iterator();
                i = 0;
                while (it2.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                    i = Math.max(i, fhb.n(pagetablecell) + this.G.a(pagetablecell));
                }
            }
            linkedHashSet.clear();
            fhb fhbVar = this.G;
            if (fhbVar.b == 0 || (i2 = fhbVar.c) == 0) {
                TL_iv.pageBlockTable pageblocktable = fhbVar.a;
                if (pageblocktable.rows.isEmpty()) {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    ArrayList<TL_iv.pageTableCell> arrayList = new ArrayList<>();
                    pagetablerow.cells = arrayList;
                    arrayList.add(fhb.f());
                    pageblocktable.rows.add(pagetablerow);
                } else {
                    ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                    int size = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size) {
                        TL_iv.pageTableRow pagetablerow2 = arrayList2.get(i5);
                        i5++;
                        TL_iv.pageTableRow pagetablerow3 = pagetablerow2;
                        ArrayList<TL_iv.pageTableCell> arrayList3 = pagetablerow3.cells;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList<>();
                            pagetablerow3.cells = arrayList3;
                        }
                        arrayList3.add(fhb.f());
                    }
                }
                fhbVar.i();
            } else {
                int i6 = i < 0 ? 0 : i;
                if (i6 <= i2) {
                    i2 = i6;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[fhbVar.b];
                ArrayList arrayList4 = fhbVar.g;
                int size2 = arrayList4.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj = arrayList4.get(i7);
                    i7++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b = fhbVar.b(pagetablecell2);
                    int a = fhbVar.a(pagetablecell2);
                    int o = fhb.o(pagetablecell2);
                    int i8 = pagetablecell2.colspan;
                    if (i8 == 0) {
                        i8 = 1;
                    }
                    int i9 = a >= i2 ? a + 1 : a;
                    if (a < i2 && a + i8 > i2) {
                        i8++;
                        for (int i10 = b; i10 < b + o && i10 < fhbVar.b; i10++) {
                            zArr[i10] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{b, i9, o, i8});
                }
                int i11 = 1;
                int i12 = 0;
                while (true) {
                    i3 = fhbVar.b;
                    if (i12 >= i3) {
                        break;
                    }
                    if (zArr[i12]) {
                        i4 = i11;
                    } else {
                        i4 = i11;
                        identityHashMap.put(fhb.f(), new int[]{i12, i2, i4, i4});
                    }
                    i12++;
                    i11 = i4;
                }
                fhbVar.j(identityHashMap, i3);
                fhbVar.i();
            }
            x();
            s(0, i);
            v();
        }
    }

    @Override // android.view.View, nkb
    public final void invalidate() {
        super.invalidate();
        mk9 mk9Var = this.w;
        if (mk9Var != null) {
            mk9Var.invalidate();
        }
    }

    public final void j(boolean z) {
        int i;
        int i2;
        if (this.G != null) {
            LinkedHashSet linkedHashSet = this.I;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            if (z) {
                Iterator it = linkedHashSet.iterator();
                i = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (it.hasNext()) {
                    i = Math.min(i, this.G.b((TL_iv.pageTableCell) it.next()));
                }
            } else {
                Iterator it2 = linkedHashSet.iterator();
                i = 0;
                while (it2.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                    i = Math.max(i, fhb.o(pagetablecell) + this.G.b(pagetablecell));
                }
            }
            linkedHashSet.clear();
            fhb fhbVar = this.G;
            int i3 = fhbVar.b;
            if (i3 == 0 || fhbVar.c == 0) {
                TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                pagetablerow.cells = new ArrayList<>();
                int max = Math.max(fhbVar.c, 1);
                for (int i4 = 0; i4 < max; i4++) {
                    pagetablerow.cells.add(fhb.f());
                }
                fhbVar.a.rows.add(pagetablerow);
                fhbVar.i();
            } else {
                int i5 = i < 0 ? 0 : i;
                if (i5 <= i3) {
                    i3 = i5;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[fhbVar.c];
                ArrayList arrayList = fhbVar.g;
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b = fhbVar.b(pagetablecell2);
                    int a = fhbVar.a(pagetablecell2);
                    int o = fhb.o(pagetablecell2);
                    int i7 = pagetablecell2.colspan;
                    if (i7 == 0) {
                        i7 = 1;
                    }
                    int i8 = b >= i3 ? b + 1 : b;
                    if (b < i3 && b + o > i3) {
                        o++;
                        for (int i9 = a; i9 < a + i7 && i9 < fhbVar.c; i9++) {
                            zArr[i9] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{i8, a, o, i7});
                }
                int i10 = 1;
                int i11 = 0;
                while (i11 < fhbVar.c) {
                    if (zArr[i11]) {
                        i2 = i10;
                    } else {
                        i2 = i10;
                        identityHashMap.put(fhb.f(), new int[]{i3, i11, i2, i2});
                    }
                    i11++;
                    i10 = i2;
                }
                fhbVar.j(identityHashMap, fhbVar.b + i10);
                fhbVar.i();
            }
            x();
            s(i, 0);
            v();
        }
    }

    @Override // fkb
    public final void k(ArrayList arrayList) {
        ne9 ne9Var;
        Layout layout;
        if (this.G != null) {
            ne9 ne9Var2 = this.r;
            Layout layout2 = ne9Var2.getLayout();
            if (layout2 != null) {
                arrayList.add(new fk9(this, layout2, ne9Var2.getPaddingLeft() + ne9Var2.getLeft(), ne9Var2.getPaddingTop() + ne9Var2.getTop()));
            }
            int size = this.G.g.size();
            for (int i = 0; i < size; i++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.G.g.get(i);
                mk9 mk9Var = this.w;
                nk9 m = mk9Var.m(pagetablecell);
                if (m != null && (layout = (ne9Var = m.a).getLayout()) != null) {
                    gh9 gh9Var = this.s;
                    int left = gh9Var.getLeft();
                    jk9 jk9Var = this.x;
                    arrayList.add(new gk9(layout, ne9Var.getPaddingLeft() + ne9Var.getLeft() + m.getLeft() + ((mk9Var.getLeft() + (jk9Var.getLeft() + left)) - gh9Var.getScrollX()), ne9Var.getPaddingTop() + ne9Var.getTop() + m.getTop() + mk9Var.getTop() + jk9Var.getTop() + gh9Var.getTop(), this.G.b(pagetablecell) + 10, pagetablecell));
                }
            }
        }
    }

    public final int m(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        fhb fhbVar = this.G;
        if (fhbVar != null && (indexOf = fhbVar.g.indexOf(pagetablecell)) >= 0) {
            return indexOf + 1;
        }
        return -1;
    }

    public final ne9 n(int i) {
        nk9 m;
        if (i == 0) {
            return this.r;
        }
        TL_iv.pageTableCell g = g(i);
        if (g == null || (m = this.w.m(g)) == null) {
            return null;
        }
        return m.a;
    }

    public final TL_iv.pageTableCell o(int i, int i2) {
        if (this.G == null) {
            return null;
        }
        gh9 gh9Var = this.s;
        int left = i - gh9Var.getLeft();
        jk9 jk9Var = this.x;
        int left2 = left - jk9Var.getLeft();
        mk9 mk9Var = this.w;
        int scrollX = gh9Var.getScrollX() + (left2 - mk9Var.getLeft());
        int top = ((i2 - gh9Var.getTop()) - jk9Var.getTop()) - mk9Var.getTop();
        for (int i3 = 0; i3 < mk9Var.getChildCount(); i3++) {
            View childAt = mk9Var.getChildAt(i3);
            if (childAt instanceof nk9) {
                nk9 nk9Var = (nk9) childAt;
                if (scrollX >= nk9Var.getLeft() && scrollX < nk9Var.getRight() && top >= nk9Var.getTop() && top < nk9Var.getBottom()) {
                    return nk9Var.b;
                }
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.K);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.K);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        int i7 = this.c;
        int d = uue.d(this.a);
        if (!this.E) {
            d = i7;
            i7 = d;
        }
        ne9 ne9Var = this.r;
        int measuredHeight = ne9Var.getMeasuredHeight();
        ll0 ll0Var = this.a;
        int i8 = 0;
        if (ll0Var != null && (i5 = ll0Var.l) > 0) {
            i8 = gm.L(((i5 - 1) << 4) + 10);
        }
        int i9 = i6 - i7;
        int i10 = measuredHeight + i8;
        ne9Var.layout(gm.L(16.0f) + d, i8, b10.c(16.0f, i9, gm.L(16.0f) + d), i10);
        int L = gm.L(9.0f) + i10;
        gh9 gh9Var = this.s;
        gh9Var.layout(d, L, i9, gh9Var.getMeasuredHeight() + L);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int i5 = 0;
        int max = Math.max(0, (size - this.c) - uue.d(this.a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (gm.L(16.0f) << 1)), TLObject.FLAG_30);
        ne9 ne9Var = this.r;
        ne9Var.measure(makeMeasureSpec, 0);
        int measuredHeight = ne9Var.getMeasuredHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        gh9 gh9Var = this.s;
        gh9Var.measure(makeMeasureSpec2, 0);
        ll0 ll0Var = this.a;
        int L = (ll0Var == null || (i4 = ll0Var.l) <= 0) ? 0 : gm.L(((i4 - 1) << 4) + 10);
        ll0 ll0Var2 = this.a;
        if (ll0Var2 != null && (i3 = ll0Var2.m) > 0) {
            i5 = gm.L(((i3 - 1) << 4) + 10);
        }
        setMeasuredDimension(size, gh9Var.getMeasuredHeight() + gm.L(9.0f) + i5 + L + measuredHeight);
    }

    public final int p(int i, int i2) {
        int i3;
        int a;
        if (this.G == null) {
            return -1;
        }
        gh9 gh9Var = this.s;
        int left = i - gh9Var.getLeft();
        jk9 jk9Var = this.x;
        int left2 = left - jk9Var.getLeft();
        mk9 mk9Var = this.w;
        int scrollX = gh9Var.getScrollX() + (left2 - mk9Var.getLeft());
        int top = ((i2 - gh9Var.getTop()) - jk9Var.getTop()) - mk9Var.getTop();
        fhb fhbVar = mk9Var.a;
        if (fhbVar == null || top < (i3 = mk9Var.f[fhbVar.b])) {
            return -1;
        }
        if (top >= gm.L(4.0f) + gm.L(16.0f) + i3) {
            return -1;
        }
        if (mk9Var.u()) {
            int j = mk9Var.j();
            int q = mk9Var.q();
            if (j < 0) {
                return -1;
            }
            int[] iArr = mk9Var.e;
            if (scrollX < iArr[j] || scrollX >= iArr[q + 1]) {
                return -1;
            }
            return j;
        }
        TL_iv.pageTableCell a2 = mk9Var.a();
        if (a2 == null || (a = mk9Var.a.a(a2)) < 0) {
            return -1;
        }
        int i4 = a2.colspan;
        int i5 = i4 != 0 ? i4 : 1;
        int[] iArr2 = mk9Var.e;
        int i6 = iArr2[a];
        int i7 = iArr2[Math.min(i5 + a, mk9Var.a.c)];
        if (scrollX < i6 || scrollX >= i7) {
            return -1;
        }
        return a;
    }

    public final nk9 q(ne9 ne9Var) {
        for (ViewParent parent = ne9Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof nk9) {
                return (nk9) parent;
            }
            if (parent == this) {
                return null;
            }
        }
        return null;
    }

    public final int r(int i, int i2) {
        int b;
        if (this.G == null) {
            return -1;
        }
        gh9 gh9Var = this.s;
        int left = i - gh9Var.getLeft();
        jk9 jk9Var = this.x;
        int left2 = left - jk9Var.getLeft();
        mk9 mk9Var = this.w;
        int scrollX = gh9Var.getScrollX() + (left2 - mk9Var.getLeft());
        int top = ((i2 - gh9Var.getTop()) - jk9Var.getTop()) - mk9Var.getTop();
        if (mk9Var.a == null || scrollX < (mk9Var.e[0] - gm.L(16.0f)) - gm.L(4.0f) || scrollX >= mk9Var.e[0]) {
            return -1;
        }
        if (mk9Var.v()) {
            int k = mk9Var.k();
            int r = mk9Var.r();
            if (k < 0) {
                return -1;
            }
            int[] iArr = mk9Var.f;
            if (top < iArr[k] || top >= iArr[r + 1]) {
                return -1;
            }
            return k;
        }
        TL_iv.pageTableCell a = mk9Var.a();
        if (a == null || (b = mk9Var.a.b(a)) < 0) {
            return -1;
        }
        int i3 = a.rowspan;
        int i4 = i3 != 0 ? i3 : 1;
        int[] iArr2 = mk9Var.f;
        int i5 = iArr2[b];
        int i6 = iArr2[Math.min(i4 + b, mk9Var.a.b)];
        if (top < i5 || top >= i6) {
            return -1;
        }
        return b;
    }

    public final void s(int i, int i2) {
        int i3;
        fhb fhbVar = this.G;
        if (fhbVar == null || (i3 = fhbVar.b) == 0 || fhbVar.c == 0) {
            return;
        }
        TL_iv.pageTableCell pagetablecell = this.G.d[Math.max(0, Math.min(i, i3 - 1))][Math.max(0, Math.min(i2, this.G.c - 1))];
        if (pagetablecell != null) {
            post(new ey8(this, pagetablecell, (byte) 27));
        }
    }

    public void setCellSelectionListener(hk9 hk9Var) {
        this.J = hk9Var;
    }

    public void setLocked(boolean z) {
        this.r.setLocked(z);
        int i = 0;
        while (true) {
            mk9 mk9Var = this.w;
            if (i >= mk9Var.getChildCount()) {
                return;
            }
            View childAt = mk9Var.getChildAt(i);
            if (childAt instanceof nk9) {
                ((nk9) childAt).setLocked(z);
            }
            i++;
        }
    }

    public final boolean t() {
        fhb fhbVar = this.G;
        if (fhbVar == null || fhbVar.g.isEmpty()) {
            return false;
        }
        nk9 m = this.w.m((TL_iv.pageTableCell) this.G.g.get(0));
        if (m == null) {
            return false;
        }
        ne9 ne9Var = m.a;
        ne9Var.O();
        ne9Var.setSelection(0);
        return true;
    }

    public final boolean u(nk9 nk9Var, boolean z) {
        int indexOf;
        fhb fhbVar = this.G;
        if (fhbVar == null || (indexOf = fhbVar.g.indexOf(nk9Var.b)) < 0) {
            return false;
        }
        int i = z ? indexOf - 1 : indexOf + 1;
        if (i < 0 || i >= this.G.g.size()) {
            return false;
        }
        nk9 m = this.w.m((TL_iv.pageTableCell) this.G.g.get(i));
        if (m == null) {
            return false;
        }
        ne9 ne9Var = m.a;
        ne9Var.O();
        ne9Var.setSelection(ne9Var.length());
        return true;
    }

    @Override // vlb
    public final void updateColors() {
        mk9 mk9Var;
        ne9 ne9Var = this.r;
        ne9Var.updateColors();
        int i = cmb.F6;
        ylb ylbVar = this.n;
        int v0 = cmb.v0(i, ylbVar);
        ne9Var.setTextColor(v0);
        ne9Var.setHintTextColor(cmb.p1(0.35f, v0));
        int i2 = 0;
        while (true) {
            mk9Var = this.w;
            if (i2 >= mk9Var.getChildCount()) {
                break;
            }
            View childAt = mk9Var.getChildAt(i2);
            if (childAt instanceof nk9) {
                ((nk9) childAt).a.updateColors();
            }
            i2++;
        }
        mk9Var.b();
        try {
            if (getBackground() instanceof gf9) {
                ((gf9) getBackground()).a(cmb.v0(cmb.c6, ylbVar));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void v() {
        z();
        hk9 hk9Var = this.J;
        if (hk9Var != null) {
            ch9 ch9Var = ((ag9) hk9Var).a;
            if (this == ch9Var.q4) {
                if (this.I.isEmpty()) {
                    ch9Var.I2();
                } else {
                    if (ch9Var.J3) {
                        return;
                    }
                    ch9Var.H4(this);
                }
            }
        }
    }

    public final void w() {
        ll0 ll0Var = this.a;
        if (ll0Var != null) {
            TL_iv.PageBlock pageBlock = ll0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = zk9.f(this.r.getText());
            }
        }
    }

    public final void x() {
        mk9 mk9Var = this.w;
        mk9Var.s();
        mk9Var.requestLayout();
        mk9Var.invalidate();
        B();
        kg9 kg9Var = this.F;
        if (kg9Var == null || this.a == null) {
            return;
        }
        kg9Var.a();
    }

    public final void y(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i;
        fhb fhbVar = this.G;
        if (fhbVar == null || pagetablecell == null) {
            return;
        }
        int b = fhbVar.b(pagetablecell);
        int a = this.G.a(pagetablecell);
        int b2 = this.G.b(pagetablecell2);
        int a2 = this.G.a(pagetablecell2);
        if (b < 0 || a < 0 || b2 < 0 || a2 < 0) {
            return;
        }
        int min = Math.min(b, b2);
        int min2 = Math.min(a, a2);
        int i2 = this.G.b - 1;
        int i3 = pagetablecell.rowspan;
        if (i3 == 0) {
            i3 = 1;
        }
        int i4 = (b + i3) - 1;
        int i5 = pagetablecell2.rowspan;
        if (i5 == 0) {
            i5 = 1;
        }
        int min3 = Math.min(i2, Math.max(i4, (b2 + i5) - 1));
        int i6 = this.G.c - 1;
        int i7 = pagetablecell.colspan;
        if (i7 == 0) {
            i7 = 1;
        }
        int i8 = (a + i7) - 1;
        int i9 = pagetablecell2.colspan;
        if (i9 == 0) {
            i9 = 1;
        }
        int min4 = Math.min(i6, Math.max(i8, (a2 + i9) - 1));
        while (true) {
            boolean z = false;
            i = min;
            while (min <= min3) {
                int i10 = min2;
                while (min2 <= min4) {
                    fhb fhbVar2 = this.G;
                    TL_iv.pageTableCell pagetablecell3 = fhbVar2.d[min][min2];
                    int i11 = fhbVar2.e[min][min2];
                    int i12 = fhbVar2.f[min][min2];
                    int min5 = Math.min(fhbVar2.b - 1, (fhb.o(pagetablecell3) + i11) - 1);
                    int i13 = this.G.c - 1;
                    int i14 = pagetablecell3.colspan;
                    if (i14 == 0) {
                        i14 = 1;
                    }
                    int min6 = Math.min(i13, (i14 + i12) - 1);
                    if (i11 < i) {
                        z = true;
                        i = i11;
                    }
                    if (i12 < i10) {
                        z = true;
                        i10 = i12;
                    }
                    if (min5 > min3) {
                        min3 = min5;
                        z = true;
                    }
                    if (min6 > min4) {
                        min4 = min6;
                        z = true;
                    }
                    min2++;
                }
                min++;
                min2 = i10;
            }
            if (!z) {
                break;
            } else {
                min = i;
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (i <= min3) {
            for (int i15 = min2; i15 <= min4; i15++) {
                linkedHashSet.add(this.G.d[i][i15]);
            }
            i++;
        }
        LinkedHashSet linkedHashSet2 = this.I;
        if (linkedHashSet2.equals(linkedHashSet)) {
            return;
        }
        linkedHashSet2.clear();
        linkedHashSet2.addAll(linkedHashSet);
        this.w.invalidate();
        v();
    }

    public final void z() {
        setTranslationZ((!this.I.isEmpty() || this.w.hasFocus()) ? gm.L(1.0f) : 0.0f);
        invalidate();
        this.s.invalidate();
        Object parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }
}
