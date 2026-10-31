package bi;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.tz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.u9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class z5 extends c0 implements org.telegram.ui.ActionBar.k6, j9 {
    public boolean D;
    public k3 E;
    public w6 F;
    public boolean G;
    public final LinkedHashSet H;
    public w5 I;
    public final l J;
    public final org.telegram.ui.ActionBar.p6 n;
    public final n1 r;
    public final h4 s;
    public final b6 w;
    public final y5 x;
    public final ArrayList y;

    public z5(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.y = new ArrayList();
        this.H = new LinkedHashSet();
        this.J = new l(this, 3);
        this.n = p6Var;
        setClipChildren(false);
        setClipToPadding(false);
        n1 n1Var = new n1(context, p6Var);
        this.r = n1Var;
        n1Var.setAllowNewlines(false);
        n1Var.setInputType(147457);
        n1Var.setGravity(49);
        n1Var.setTextSize(1, Math.max(8, tz.W0 - 2));
        n1Var.setIncludeFontPadding(false);
        n1Var.setMinHeight(0);
        n1Var.setBackground(null);
        n1Var.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(2.0f), 0);
        n1Var.setHint(cd.L0(2131753989, null));
        n1Var.setCenterEmptyHint(true);
        n1Var.setListener(new k6.h(this, 12));
        n1Var.setDelegate(new a1.c(this, 14));
        addView(n1Var);
        h4 h4Var = new h4(this, context, 1);
        this.s = h4Var;
        h4Var.setClipChildren(false);
        h4Var.setClipToPadding(false);
        h4Var.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
        addView(h4Var, w7.b6.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        b6 b6Var = new b6(context, p6Var);
        this.w = b6Var;
        y5 y5Var = new y5(this, context);
        this.x = y5Var;
        y5Var.addView(b6Var);
        h4Var.addView(y5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void A() {
        int i10 = 0;
        while (true) {
            b6 b6Var = this.w;
            if (i10 >= b6Var.getChildCount()) {
                return;
            }
            View childAt = b6Var.getChildAt(i10);
            if (childAt instanceof c6) {
                c6 c6Var = (c6) childAt;
                n1 n1Var = c6Var.a;
                n1Var.setListener(new t5(this, c6Var));
                n1Var.setDelegate(new ag.m(6, this, c6Var));
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.F == null) {
            return;
        }
        k3 k3Var = this.E;
        k9 textSelectionHelper = k3Var != null ? k3Var.a.getTextSelectionHelper() : null;
        if (textSelectionHelper == null) {
            return;
        }
        ArrayList arrayList = this.y;
        arrayList.clear();
        h(arrayList);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            u9 u9Var = (u9) arrayList.get(i10);
            canvas.save();
            canvas.translate(u9Var.getX(), u9Var.getY());
            textSelectionHelper.Z(canvas, this, i10);
            canvas.restore();
        }
    }

    @Override // bi.c0
    public final void e(int i10) {
        requestLayout();
    }

    public final TL_iv.pageTableCell g(int i10) {
        int i11;
        w6 w6Var = this.F;
        if (w6Var == null || i10 <= 0 || i10 - 1 >= w6Var.g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.F.g.get(i11);
    }

    public b6 getGrid() {
        return this.w;
    }

    public w6 getModel() {
        return this.F;
    }

    public a getRow() {
        return this.a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.H;
    }

    public n1 getTitleEditText() {
        return this.r;
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        n1 n1Var;
        Layout layout;
        if (this.F == null) {
            return;
        }
        n1 n1Var2 = this.r;
        Layout layout2 = n1Var2.getLayout();
        if (layout2 != null) {
            arrayList.add(new u5(this, layout2, n1Var2.getPaddingLeft() + n1Var2.getLeft(), n1Var2.getPaddingTop() + n1Var2.getTop()));
        }
        int size = this.F.g.size();
        for (int i10 = 0; i10 < size; i10++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.F.g.get(i10);
            b6 b6Var = this.w;
            c6 m10 = b6Var.m(pagetablecell);
            if (m10 != null && (layout = (n1Var = m10.a).getLayout()) != null) {
                h4 h4Var = this.s;
                int left = h4Var.getLeft();
                y5 y5Var = this.x;
                arrayList.add(new v5(layout, n1Var.getPaddingLeft() + n1Var.getLeft() + m10.getLeft() + ((b6Var.getLeft() + (y5Var.getLeft() + left)) - h4Var.getScrollX()), n1Var.getPaddingTop() + n1Var.getTop() + m10.getTop() + b6Var.getTop() + y5Var.getTop() + h4Var.getTop(), this.F.b(pagetablecell) + 10, pagetablecell));
            }
        }
    }

    @Override // android.view.View, org.telegram.ui.Cells.r9
    public final void invalidate() {
        super.invalidate();
        b6 b6Var = this.w;
        if (b6Var != null) {
            b6Var.invalidate();
        }
    }

    public final void j(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.F != null) {
            LinkedHashSet linkedHashSet = this.H;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            if (z10) {
                Iterator it = linkedHashSet.iterator();
                i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (it.hasNext()) {
                    i10 = Math.min(i10, this.F.a((TL_iv.pageTableCell) it.next()));
                }
            } else {
                Iterator it2 = linkedHashSet.iterator();
                i10 = 0;
                while (it2.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                    i10 = Math.max(i10, w6.n(pagetablecell) + this.F.a(pagetablecell));
                }
            }
            linkedHashSet.clear();
            w6 w6Var = this.F;
            if (w6Var.b == 0 || (i11 = w6Var.c) == 0) {
                TL_iv.pageBlockTable pageblocktable = w6Var.a;
                if (pageblocktable.rows.isEmpty()) {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    ArrayList<TL_iv.pageTableCell> arrayList = new ArrayList<>();
                    pagetablerow.cells = arrayList;
                    arrayList.add(w6.f());
                    pageblocktable.rows.add(pagetablerow);
                } else {
                    ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        TL_iv.pageTableRow pagetablerow2 = arrayList2.get(i14);
                        i14++;
                        TL_iv.pageTableRow pagetablerow3 = pagetablerow2;
                        if (pagetablerow3.cells == null) {
                            pagetablerow3.cells = new ArrayList<>();
                        }
                        pagetablerow3.cells.add(w6.f());
                    }
                }
                w6Var.i();
            } else {
                int i15 = i10 < 0 ? 0 : i10;
                if (i15 <= i11) {
                    i11 = i15;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[w6Var.b];
                ArrayList arrayList3 = w6Var.g;
                int size2 = arrayList3.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj = arrayList3.get(i16);
                    i16++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = w6Var.b(pagetablecell2);
                    int a2 = w6Var.a(pagetablecell2);
                    int o10 = w6.o(pagetablecell2);
                    int i17 = pagetablecell2.colspan;
                    if (i17 == 0) {
                        i17 = 1;
                    }
                    int i18 = a2 >= i11 ? a2 + 1 : a2;
                    if (a2 < i11 && a2 + i17 > i11) {
                        i17++;
                        for (int i19 = b10; i19 < b10 + o10 && i19 < w6Var.b; i19++) {
                            zArr[i19] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{b10, i18, o10, i17});
                }
                int i20 = 1;
                int i21 = 0;
                while (true) {
                    i12 = w6Var.b;
                    if (i21 >= i12) {
                        break;
                    }
                    if (zArr[i21]) {
                        i13 = i20;
                    } else {
                        i13 = i20;
                        identityHashMap.put(w6.f(), new int[]{i21, i11, i13, i13});
                    }
                    i21++;
                    i20 = i13;
                }
                w6Var.j(identityHashMap, i12);
                w6Var.i();
            }
            x();
            s(0, i10);
            v();
        }
    }

    public final void k(boolean z10) {
        int i10;
        int i11;
        if (this.F != null) {
            LinkedHashSet linkedHashSet = this.H;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            if (z10) {
                Iterator it = linkedHashSet.iterator();
                i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (it.hasNext()) {
                    i10 = Math.min(i10, this.F.b((TL_iv.pageTableCell) it.next()));
                }
            } else {
                Iterator it2 = linkedHashSet.iterator();
                i10 = 0;
                while (it2.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                    i10 = Math.max(i10, w6.o(pagetablecell) + this.F.b(pagetablecell));
                }
            }
            linkedHashSet.clear();
            w6 w6Var = this.F;
            int i12 = w6Var.b;
            if (i12 == 0 || w6Var.c == 0) {
                TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                pagetablerow.cells = new ArrayList<>();
                int max = Math.max(w6Var.c, 1);
                for (int i13 = 0; i13 < max; i13++) {
                    pagetablerow.cells.add(w6.f());
                }
                w6Var.a.rows.add(pagetablerow);
                w6Var.i();
            } else {
                int i14 = i10 < 0 ? 0 : i10;
                if (i14 <= i12) {
                    i12 = i14;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[w6Var.c];
                ArrayList arrayList = w6Var.g;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = w6Var.b(pagetablecell2);
                    int a2 = w6Var.a(pagetablecell2);
                    int o10 = w6.o(pagetablecell2);
                    int i16 = pagetablecell2.colspan;
                    if (i16 == 0) {
                        i16 = 1;
                    }
                    int i17 = b10 >= i12 ? b10 + 1 : b10;
                    if (b10 < i12 && b10 + o10 > i12) {
                        o10++;
                        for (int i18 = a2; i18 < a2 + i16 && i18 < w6Var.c; i18++) {
                            zArr[i18] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{i17, a2, o10, i16});
                }
                int i19 = 1;
                int i20 = 0;
                while (i20 < w6Var.c) {
                    if (zArr[i20]) {
                        i11 = i19;
                    } else {
                        i11 = i19;
                        identityHashMap.put(w6.f(), new int[]{i12, i20, i11, i11});
                    }
                    i20++;
                    i19 = i11;
                }
                w6Var.j(identityHashMap, w6Var.b + i19);
                w6Var.i();
            }
            x();
            s(i10, 0);
            v();
        }
    }

    public final int l(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        w6 w6Var = this.F;
        if (w6Var != null && (indexOf = w6Var.g.indexOf(pagetablecell)) >= 0) {
            return indexOf + 1;
        }
        return -1;
    }

    public final n1 m(int i10) {
        c6 m10;
        if (i10 == 0) {
            return this.r;
        }
        TL_iv.pageTableCell g10 = g(i10);
        if (g10 == null || (m10 = this.w.m(g10)) == null) {
            return null;
        }
        return m10.a;
    }

    public final TL_iv.pageTableCell o(int i10, int i11) {
        if (this.F == null) {
            return null;
        }
        h4 h4Var = this.s;
        int left = i10 - h4Var.getLeft();
        y5 y5Var = this.x;
        int left2 = left - y5Var.getLeft();
        b6 b6Var = this.w;
        int scrollX = h4Var.getScrollX() + (left2 - b6Var.getLeft());
        int top = ((i11 - h4Var.getTop()) - y5Var.getTop()) - b6Var.getTop();
        for (int i12 = 0; i12 < b6Var.getChildCount(); i12++) {
            View childAt = b6Var.getChildAt(i12);
            if (childAt instanceof c6) {
                c6 c6Var = (c6) childAt;
                if (scrollX >= c6Var.getLeft() && scrollX < c6Var.getRight() && top >= c6Var.getTop() && top < c6Var.getBottom()) {
                    return c6Var.b;
                }
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.J);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.J);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        int i16 = this.c;
        int d = v7.a5.d(this.a);
        boolean z11 = this.D;
        int i17 = z11 ? d : i16;
        if (!z11) {
            i16 = d;
        }
        n1 n1Var = this.r;
        int measuredHeight = n1Var.getMeasuredHeight();
        a aVar = this.a;
        int i18 = 0;
        if (aVar != null && (i14 = aVar.l) > 0) {
            i18 = org.telegram.messenger.i0.L(i0.a.e(i14, 1, 16, 10));
        }
        int i19 = i15 - i16;
        int i20 = measuredHeight + i18;
        n1Var.layout(org.telegram.messenger.i0.L(16.0f) + i17, i18, i0.a.d(16.0f, i19, org.telegram.messenger.i0.L(16.0f) + i17), i20);
        int L = org.telegram.messenger.i0.L(9.0f) + i20;
        h4 h4Var = this.s;
        h4Var.layout(i17, L, i19, h4Var.getMeasuredHeight() + L);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        int max = Math.max(0, (size - this.c) - v7.a5.d(this.a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (org.telegram.messenger.i0.L(16.0f) * 2)), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        n1 n1Var = this.r;
        n1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = n1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        h4 h4Var = this.s;
        h4Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.a;
        int L = (aVar != null && (i12 = aVar.l) > 0) ? org.telegram.messenger.i0.L(i0.a.e(i12, 1, 16, 10)) : 0;
        a aVar2 = this.a;
        if (aVar2 != null && (i13 = aVar2.m) > 0) {
            i14 = org.telegram.messenger.i0.L(i0.a.e(i13, 1, 16, 10));
        }
        setMeasuredDimension(size, h4Var.getMeasuredHeight() + org.telegram.messenger.i0.L(9.0f) + i14 + L + measuredHeight);
    }

    public final int p(int i10, int i11) {
        int i12;
        int a2;
        if (this.F == null) {
            return -1;
        }
        h4 h4Var = this.s;
        int left = i10 - h4Var.getLeft();
        y5 y5Var = this.x;
        int left2 = left - y5Var.getLeft();
        b6 b6Var = this.w;
        int scrollX = h4Var.getScrollX() + (left2 - b6Var.getLeft());
        int top = ((i11 - h4Var.getTop()) - y5Var.getTop()) - b6Var.getTop();
        w6 w6Var = b6Var.a;
        if (w6Var == null || top < (i12 = b6Var.f[w6Var.b])) {
            return -1;
        }
        if (top >= org.telegram.messenger.i0.L(4.0f) + org.telegram.messenger.i0.L(16.0f) + i12) {
            return -1;
        }
        if (b6Var.u()) {
            int j10 = b6Var.j();
            int q6 = b6Var.q();
            if (j10 < 0) {
                return -1;
            }
            int[] iArr = b6Var.e;
            if (scrollX < iArr[j10] || scrollX >= iArr[q6 + 1]) {
                return -1;
            }
            return j10;
        }
        TL_iv.pageTableCell a10 = b6Var.a();
        if (a10 == null || (a2 = b6Var.a.a(a10)) < 0) {
            return -1;
        }
        int i13 = a10.colspan;
        int i14 = i13 != 0 ? i13 : 1;
        int[] iArr2 = b6Var.e;
        int i15 = iArr2[a2];
        int i16 = iArr2[Math.min(i14 + a2, b6Var.a.c)];
        if (scrollX < i15 || scrollX >= i16) {
            return -1;
        }
        return a2;
    }

    public final c6 q(n1 n1Var) {
        for (ViewParent parent = n1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof c6) {
                return (c6) parent;
            }
            if (parent == this) {
                return null;
            }
        }
        return null;
    }

    public final int r(int i10, int i11) {
        int b10;
        if (this.F == null) {
            return -1;
        }
        h4 h4Var = this.s;
        int left = i10 - h4Var.getLeft();
        y5 y5Var = this.x;
        int left2 = left - y5Var.getLeft();
        b6 b6Var = this.w;
        int scrollX = h4Var.getScrollX() + (left2 - b6Var.getLeft());
        int top = ((i11 - h4Var.getTop()) - y5Var.getTop()) - b6Var.getTop();
        if (b6Var.a == null || scrollX < (b6Var.e[0] - org.telegram.messenger.i0.L(16.0f)) - org.telegram.messenger.i0.L(4.0f) || scrollX >= b6Var.e[0]) {
            return -1;
        }
        if (b6Var.v()) {
            int k10 = b6Var.k();
            int r10 = b6Var.r();
            if (k10 < 0) {
                return -1;
            }
            int[] iArr = b6Var.f;
            if (top < iArr[k10] || top >= iArr[r10 + 1]) {
                return -1;
            }
            return k10;
        }
        TL_iv.pageTableCell a2 = b6Var.a();
        if (a2 == null || (b10 = b6Var.a.b(a2)) < 0) {
            return -1;
        }
        int i12 = a2.rowspan;
        int i13 = i12 != 0 ? i12 : 1;
        int[] iArr2 = b6Var.f;
        int i14 = iArr2[b10];
        int i15 = iArr2[Math.min(i13 + b10, b6Var.a.b)];
        if (top < i14 || top >= i15) {
            return -1;
        }
        return b10;
    }

    public final void s(int i10, int i11) {
        int i12;
        w6 w6Var = this.F;
        if (w6Var == null || (i12 = w6Var.b) == 0 || w6Var.c == 0) {
            return;
        }
        TL_iv.pageTableCell pagetablecell = this.F.d[Math.max(0, Math.min(i10, i12 - 1))][Math.max(0, Math.min(i11, this.F.c - 1))];
        if (pagetablecell == null) {
            return;
        }
        post(new a1.f(25, this, pagetablecell));
    }

    public void setCellSelectionListener(w5 w5Var) {
        this.I = w5Var;
    }

    public void setLocked(boolean z10) {
        this.r.setLocked(z10);
        int i10 = 0;
        while (true) {
            b6 b6Var = this.w;
            if (i10 >= b6Var.getChildCount()) {
                return;
            }
            View childAt = b6Var.getChildAt(i10);
            if (childAt instanceof c6) {
                ((c6) childAt).setLocked(z10);
            }
            i10++;
        }
    }

    public final boolean t() {
        w6 w6Var = this.F;
        if (w6Var == null || w6Var.g.isEmpty()) {
            return false;
        }
        c6 m10 = this.w.m((TL_iv.pageTableCell) this.F.g.get(0));
        if (m10 == null) {
            return false;
        }
        n1 n1Var = m10.a;
        n1Var.N();
        n1Var.setSelection(0);
        return true;
    }

    public final boolean u(c6 c6Var, boolean z10) {
        int indexOf;
        w6 w6Var = this.F;
        if (w6Var == null || (indexOf = w6Var.g.indexOf(c6Var.b)) < 0) {
            return false;
        }
        int i10 = z10 ? indexOf - 1 : indexOf + 1;
        if (i10 < 0 || i10 >= this.F.g.size()) {
            return false;
        }
        c6 m10 = this.w.m((TL_iv.pageTableCell) this.F.g.get(i10));
        if (m10 == null) {
            return false;
        }
        n1 n1Var = m10.a;
        n1Var.N();
        n1Var.setSelection(n1Var.length());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        b6 b6Var;
        n1 n1Var = this.r;
        n1Var.updateColors();
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.n;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        n1Var.setTextColor(w02);
        n1Var.setHintTextColor(org.telegram.ui.ActionBar.t6.r1(0.35f, w02));
        int i11 = 0;
        while (true) {
            b6Var = this.w;
            if (i11 >= b6Var.getChildCount()) {
                break;
            }
            View childAt = b6Var.getChildAt(i11);
            if (childAt instanceof c6) {
                ((c6) childAt).a.updateColors();
            }
            i11++;
        }
        b6Var.b();
        try {
            if (getBackground() instanceof h2) {
                ((h2) getBackground()).a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final void v() {
        z();
        w5 w5Var = this.I;
        if (w5Var != null) {
            d4 d4Var = ((a3) w5Var).a;
            if (this != d4Var.p4) {
                return;
            }
            if (this.H.isEmpty()) {
                d4Var.P2();
            } else {
                if (d4Var.I3) {
                    return;
                }
                d4Var.I4(this);
            }
        }
    }

    public final void w() {
        a aVar = this.a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = s6.f(this.r.getText());
            }
        }
    }

    public final void x() {
        b6 b6Var = this.w;
        b6Var.s();
        b6Var.requestLayout();
        b6Var.invalidate();
        A();
        k3 k3Var = this.E;
        if (k3Var == null || this.a == null) {
            return;
        }
        k3Var.a();
    }

    public final void y(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i10;
        w6 w6Var = this.F;
        if (w6Var == null || pagetablecell == null) {
            return;
        }
        int b10 = w6Var.b(pagetablecell);
        int a2 = this.F.a(pagetablecell);
        int b11 = this.F.b(pagetablecell2);
        int a10 = this.F.a(pagetablecell2);
        if (b10 < 0 || a2 < 0 || b11 < 0 || a10 < 0) {
            return;
        }
        int min = Math.min(b10, b11);
        int min2 = Math.min(a2, a10);
        int i11 = this.F.b - 1;
        int i12 = pagetablecell.rowspan;
        if (i12 == 0) {
            i12 = 1;
        }
        int i13 = (b10 + i12) - 1;
        int i14 = pagetablecell2.rowspan;
        if (i14 == 0) {
            i14 = 1;
        }
        int min3 = Math.min(i11, Math.max(i13, (b11 + i14) - 1));
        int i15 = this.F.c - 1;
        int i16 = pagetablecell.colspan;
        if (i16 == 0) {
            i16 = 1;
        }
        int i17 = (a2 + i16) - 1;
        int i18 = pagetablecell2.colspan;
        if (i18 == 0) {
            i18 = 1;
        }
        int min4 = Math.min(i15, Math.max(i17, (a10 + i18) - 1));
        while (true) {
            boolean z10 = false;
            i10 = min;
            while (min <= min3) {
                int i19 = min2;
                while (min2 <= min4) {
                    w6 w6Var2 = this.F;
                    TL_iv.pageTableCell pagetablecell3 = w6Var2.d[min][min2];
                    int i20 = w6Var2.e[min][min2];
                    int i21 = w6Var2.f[min][min2];
                    int min5 = Math.min(w6Var2.b - 1, (w6.o(pagetablecell3) + i20) - 1);
                    int i22 = this.F.c - 1;
                    int i23 = pagetablecell3.colspan;
                    if (i23 == 0) {
                        i23 = 1;
                    }
                    int min6 = Math.min(i22, (i23 + i21) - 1);
                    if (i20 < i10) {
                        z10 = true;
                        i10 = i20;
                    }
                    if (i21 < i19) {
                        z10 = true;
                        i19 = i21;
                    }
                    if (min5 > min3) {
                        min3 = min5;
                        z10 = true;
                    }
                    if (min6 > min4) {
                        min4 = min6;
                        z10 = true;
                    }
                    min2++;
                }
                min++;
                min2 = i19;
            }
            if (!z10) {
                break;
            } else {
                min = i10;
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (i10 <= min3) {
            for (int i24 = min2; i24 <= min4; i24++) {
                linkedHashSet.add(this.F.d[i10][i24]);
            }
            i10++;
        }
        LinkedHashSet linkedHashSet2 = this.H;
        if (linkedHashSet2.equals(linkedHashSet)) {
            return;
        }
        linkedHashSet2.clear();
        linkedHashSet2.addAll(linkedHashSet);
        this.w.invalidate();
        v();
    }

    public final void z() {
        setTranslationZ((!this.H.isEmpty() || this.w.hasFocus()) ? org.telegram.messenger.i0.L(1.0f) : 0.0f);
        invalidate();
        this.s.invalidate();
        Object parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }
}
