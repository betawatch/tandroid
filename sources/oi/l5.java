package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import c8.ea;
import c8.ma;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.a8;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.t9;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class l5 extends x implements org.telegram.ui.ActionBar.c6, h9 {
    public boolean E;
    public a3 F;
    public d6 G;
    public boolean H;
    public final LinkedHashSet I;
    public i5 J;
    public final h K;
    public final i6 n;
    public final e1 r;
    public final w3 s;
    public final n5 w;
    public final k5 x;
    public final ArrayList y;

    public l5(Context context, i6 i6Var) {
        super(context);
        this.y = new ArrayList();
        this.I = new LinkedHashSet();
        this.K = new h(this, 3);
        this.n = i6Var;
        setClipChildren(false);
        setClipToPadding(false);
        e1 e1Var = new e1(context, i6Var);
        this.r = e1Var;
        e1Var.setAllowNewlines(false);
        e1Var.setInputType(147457);
        e1Var.setGravity(49);
        e1Var.setTextSize(1, Math.max(8, bz.W0 - 2));
        e1Var.setIncludeFontPadding(false);
        e1Var.setMinHeight(0);
        e1Var.setBackground(null);
        e1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), 0);
        e1Var.setHint(gd.M0(2131753987, null));
        e1Var.setCenterEmptyHint(true);
        e1Var.setListener(new hi.u5(this, 22));
        e1Var.setDelegate(new ki.e(this, 25));
        addView(e1Var);
        w3 w3Var = new w3(this, context, 1);
        this.s = w3Var;
        w3Var.setClipChildren(false);
        w3Var.setClipToPadding(false);
        w3Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(w3Var, ma.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        n5 n5Var = new n5(context, i6Var);
        this.w = n5Var;
        k5 k5Var = new k5(this, context);
        this.x = k5Var;
        k5Var.addView(n5Var);
        w3Var.addView(k5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void A() {
        int i7 = 0;
        while (true) {
            n5 n5Var = this.w;
            if (i7 >= n5Var.getChildCount()) {
                return;
            }
            View childAt = n5Var.getChildAt(i7);
            if (childAt instanceof o5) {
                o5 o5Var = (o5) childAt;
                e1 e1Var = o5Var.a;
                e1Var.setListener(new f5(this, o5Var));
                e1Var.setDelegate(new e0(2, this, o5Var));
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.G6));
        hashSet.add(Integer.valueOf(n6.d6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.G == null) {
            return;
        }
        a3 a3Var = this.F;
        i9 textSelectionHelper = a3Var != null ? a3Var.a.getTextSelectionHelper() : null;
        if (textSelectionHelper == null) {
            return;
        }
        ArrayList arrayList = this.y;
        arrayList.clear();
        k(arrayList);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            t9 t9Var = (t9) arrayList.get(i7);
            canvas.save();
            canvas.translate(t9Var.getX(), t9Var.getY());
            textSelectionHelper.Z(canvas, this, i7);
            canvas.restore();
        }
    }

    @Override // oi.x
    public final void e(int i7) {
        requestLayout();
    }

    public final TL_iv.pageTableCell g(int i7) {
        int i10;
        d6 d6Var = this.G;
        if (d6Var == null || i7 <= 0 || i7 - 1 >= d6Var.g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.G.g.get(i10);
    }

    public n5 getGrid() {
        return this.w;
    }

    public d6 getModel() {
        return this.G;
    }

    public a getRow() {
        return this.a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.I;
    }

    public e1 getTitleEditText() {
        return this.r;
    }

    public final void h(boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12;
        if (this.G != null) {
            LinkedHashSet linkedHashSet = this.I;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            if (z10) {
                Iterator it = linkedHashSet.iterator();
                i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (it.hasNext()) {
                    i7 = Math.min(i7, this.G.a((TL_iv.pageTableCell) it.next()));
                }
            } else {
                Iterator it2 = linkedHashSet.iterator();
                i7 = 0;
                while (it2.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                    i7 = Math.max(i7, d6.n(pagetablecell) + this.G.a(pagetablecell));
                }
            }
            linkedHashSet.clear();
            d6 d6Var = this.G;
            if (d6Var.b == 0 || (i10 = d6Var.c) == 0) {
                TL_iv.pageBlockTable pageblocktable = d6Var.a;
                if (pageblocktable.rows.isEmpty()) {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    ArrayList<TL_iv.pageTableCell> arrayList = new ArrayList<>();
                    pagetablerow.cells = arrayList;
                    arrayList.add(d6.f());
                    pageblocktable.rows.add(pagetablerow);
                } else {
                    ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TL_iv.pageTableRow pagetablerow2 = arrayList2.get(i13);
                        i13++;
                        TL_iv.pageTableRow pagetablerow3 = pagetablerow2;
                        if (pagetablerow3.cells == null) {
                            pagetablerow3.cells = new ArrayList<>();
                        }
                        pagetablerow3.cells.add(d6.f());
                    }
                }
                d6Var.i();
            } else {
                int i14 = i7 < 0 ? 0 : i7;
                if (i14 <= i10) {
                    i10 = i14;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[d6Var.b];
                ArrayList arrayList3 = d6Var.g;
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj = arrayList3.get(i15);
                    i15++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = d6Var.b(pagetablecell2);
                    int a10 = d6Var.a(pagetablecell2);
                    int o4 = d6.o(pagetablecell2);
                    int i16 = pagetablecell2.colspan;
                    if (i16 == 0) {
                        i16 = 1;
                    }
                    int i17 = a10 >= i10 ? a10 + 1 : a10;
                    if (a10 < i10 && a10 + i16 > i10) {
                        i16++;
                        for (int i18 = b10; i18 < b10 + o4 && i18 < d6Var.b; i18++) {
                            zArr[i18] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{b10, i17, o4, i16});
                }
                int i19 = 1;
                int i20 = 0;
                while (true) {
                    i11 = d6Var.b;
                    if (i20 >= i11) {
                        break;
                    }
                    if (zArr[i20]) {
                        i12 = i19;
                    } else {
                        i12 = i19;
                        identityHashMap.put(d6.f(), new int[]{i20, i10, i12, i12});
                    }
                    i20++;
                    i19 = i12;
                }
                d6Var.j(identityHashMap, i11);
                d6Var.i();
            }
            x();
            s(0, i7);
            v();
        }
    }

    @Override // android.view.View, org.telegram.ui.Cells.q9
    public final void invalidate() {
        super.invalidate();
        n5 n5Var = this.w;
        if (n5Var != null) {
            n5Var.invalidate();
        }
    }

    public final void j(boolean z10) {
        int i7;
        int i10;
        if (this.G != null) {
            LinkedHashSet linkedHashSet = this.I;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            if (z10) {
                Iterator it = linkedHashSet.iterator();
                i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (it.hasNext()) {
                    i7 = Math.min(i7, this.G.b((TL_iv.pageTableCell) it.next()));
                }
            } else {
                Iterator it2 = linkedHashSet.iterator();
                i7 = 0;
                while (it2.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                    i7 = Math.max(i7, d6.o(pagetablecell) + this.G.b(pagetablecell));
                }
            }
            linkedHashSet.clear();
            d6 d6Var = this.G;
            int i11 = d6Var.b;
            if (i11 == 0 || d6Var.c == 0) {
                TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                pagetablerow.cells = new ArrayList<>();
                int max = Math.max(d6Var.c, 1);
                for (int i12 = 0; i12 < max; i12++) {
                    pagetablerow.cells.add(d6.f());
                }
                d6Var.a.rows.add(pagetablerow);
                d6Var.i();
            } else {
                int i13 = i7 < 0 ? 0 : i7;
                if (i13 <= i11) {
                    i11 = i13;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[d6Var.c];
                ArrayList arrayList = d6Var.g;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = d6Var.b(pagetablecell2);
                    int a10 = d6Var.a(pagetablecell2);
                    int o4 = d6.o(pagetablecell2);
                    int i15 = pagetablecell2.colspan;
                    if (i15 == 0) {
                        i15 = 1;
                    }
                    int i16 = b10 >= i11 ? b10 + 1 : b10;
                    if (b10 < i11 && b10 + o4 > i11) {
                        o4++;
                        for (int i17 = a10; i17 < a10 + i15 && i17 < d6Var.c; i17++) {
                            zArr[i17] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{i16, a10, o4, i15});
                }
                int i18 = 1;
                int i19 = 0;
                while (i19 < d6Var.c) {
                    if (zArr[i19]) {
                        i10 = i18;
                    } else {
                        i10 = i18;
                        identityHashMap.put(d6.f(), new int[]{i11, i19, i10, i10});
                    }
                    i19++;
                    i18 = i10;
                }
                d6Var.j(identityHashMap, d6Var.b + i18);
                d6Var.i();
            }
            x();
            s(i7, 0);
            v();
        }
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        e1 e1Var;
        Layout layout;
        if (this.G == null) {
            return;
        }
        e1 e1Var2 = this.r;
        Layout layout2 = e1Var2.getLayout();
        if (layout2 != null) {
            arrayList.add(new g5(this, layout2, e1Var2.getPaddingLeft() + e1Var2.getLeft(), e1Var2.getPaddingTop() + e1Var2.getTop()));
        }
        int size = this.G.g.size();
        for (int i7 = 0; i7 < size; i7++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.G.g.get(i7);
            n5 n5Var = this.w;
            o5 m10 = n5Var.m(pagetablecell);
            if (m10 != null && (layout = (e1Var = m10.a).getLayout()) != null) {
                w3 w3Var = this.s;
                int left = w3Var.getLeft();
                k5 k5Var = this.x;
                arrayList.add(new h5(layout, e1Var.getPaddingLeft() + e1Var.getLeft() + m10.getLeft() + ((n5Var.getLeft() + (k5Var.getLeft() + left)) - w3Var.getScrollX()), e1Var.getPaddingTop() + e1Var.getTop() + m10.getTop() + n5Var.getTop() + k5Var.getTop() + w3Var.getTop(), this.G.b(pagetablecell) + 10, pagetablecell));
            }
        }
    }

    public final int l(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        d6 d6Var = this.G;
        if (d6Var != null && (indexOf = d6Var.g.indexOf(pagetablecell)) >= 0) {
            return indexOf + 1;
        }
        return -1;
    }

    public final e1 m(int i7) {
        o5 m10;
        if (i7 == 0) {
            return this.r;
        }
        TL_iv.pageTableCell g10 = g(i7);
        if (g10 == null || (m10 = this.w.m(g10)) == null) {
            return null;
        }
        return m10.a;
    }

    public final TL_iv.pageTableCell n(int i7, int i10) {
        if (this.G == null) {
            return null;
        }
        w3 w3Var = this.s;
        int left = i7 - w3Var.getLeft();
        k5 k5Var = this.x;
        int left2 = left - k5Var.getLeft();
        n5 n5Var = this.w;
        int scrollX = w3Var.getScrollX() + (left2 - n5Var.getLeft());
        int top = ((i10 - w3Var.getTop()) - k5Var.getTop()) - n5Var.getTop();
        for (int i11 = 0; i11 < n5Var.getChildCount(); i11++) {
            View childAt = n5Var.getChildAt(i11);
            if (childAt instanceof o5) {
                o5 o5Var = (o5) childAt;
                if (scrollX >= o5Var.getLeft() && scrollX < o5Var.getRight() && top >= o5Var.getTop() && top < o5Var.getBottom()) {
                    return o5Var.b;
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14 = i11 - i7;
        int i15 = this.c;
        int d = ea.d(this.a);
        boolean z11 = this.E;
        int i16 = z11 ? d : i15;
        if (!z11) {
            i15 = d;
        }
        e1 e1Var = this.r;
        int measuredHeight = e1Var.getMeasuredHeight();
        a aVar = this.a;
        int i17 = 0;
        if (aVar != null && (i13 = aVar.l) > 0) {
            i17 = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i13, 1, 16, 10));
        }
        int i18 = i14 - i15;
        int i19 = measuredHeight + i17;
        e1Var.layout(org.telegram.messenger.g0.L(16.0f) + i16, i17, i5.c.d(16.0f, i18, org.telegram.messenger.g0.L(16.0f) + i16), i19);
        int L = org.telegram.messenger.g0.L(9.0f) + i19;
        w3 w3Var = this.s;
        w3Var.layout(i16, L, i18, w3Var.getMeasuredHeight() + L);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i7);
        int i13 = 0;
        int max = Math.max(0, (size - this.c) - ea.d(this.a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (org.telegram.messenger.g0.L(16.0f) * 2)), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        e1 e1Var = this.r;
        e1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = e1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        w3 w3Var = this.s;
        w3Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.a;
        int L = (aVar != null && (i11 = aVar.l) > 0) ? org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i11, 1, 16, 10)) : 0;
        a aVar2 = this.a;
        if (aVar2 != null && (i12 = aVar2.m) > 0) {
            i13 = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i12, 1, 16, 10));
        }
        setMeasuredDimension(size, w3Var.getMeasuredHeight() + org.telegram.messenger.g0.L(9.0f) + i13 + L + measuredHeight);
    }

    public final int p(int i7, int i10) {
        int i11;
        int a10;
        if (this.G == null) {
            return -1;
        }
        w3 w3Var = this.s;
        int left = i7 - w3Var.getLeft();
        k5 k5Var = this.x;
        int left2 = left - k5Var.getLeft();
        n5 n5Var = this.w;
        int scrollX = w3Var.getScrollX() + (left2 - n5Var.getLeft());
        int top = ((i10 - w3Var.getTop()) - k5Var.getTop()) - n5Var.getTop();
        d6 d6Var = n5Var.a;
        if (d6Var == null || top < (i11 = n5Var.f[d6Var.b])) {
            return -1;
        }
        if (top >= org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(16.0f) + i11) {
            return -1;
        }
        if (n5Var.u()) {
            int j3 = n5Var.j();
            int q10 = n5Var.q();
            if (j3 < 0) {
                return -1;
            }
            int[] iArr = n5Var.e;
            if (scrollX < iArr[j3] || scrollX >= iArr[q10 + 1]) {
                return -1;
            }
            return j3;
        }
        TL_iv.pageTableCell a11 = n5Var.a();
        if (a11 == null || (a10 = n5Var.a.a(a11)) < 0) {
            return -1;
        }
        int i12 = a11.colspan;
        int i13 = i12 != 0 ? i12 : 1;
        int[] iArr2 = n5Var.e;
        int i14 = iArr2[a10];
        int i15 = iArr2[Math.min(i13 + a10, n5Var.a.c)];
        if (scrollX < i14 || scrollX >= i15) {
            return -1;
        }
        return a10;
    }

    public final o5 q(e1 e1Var) {
        for (ViewParent parent = e1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof o5) {
                return (o5) parent;
            }
            if (parent == this) {
                return null;
            }
        }
        return null;
    }

    public final int r(int i7, int i10) {
        int b10;
        if (this.G == null) {
            return -1;
        }
        w3 w3Var = this.s;
        int left = i7 - w3Var.getLeft();
        k5 k5Var = this.x;
        int left2 = left - k5Var.getLeft();
        n5 n5Var = this.w;
        int scrollX = w3Var.getScrollX() + (left2 - n5Var.getLeft());
        int top = ((i10 - w3Var.getTop()) - k5Var.getTop()) - n5Var.getTop();
        if (n5Var.a == null || scrollX < (n5Var.e[0] - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(4.0f) || scrollX >= n5Var.e[0]) {
            return -1;
        }
        if (n5Var.v()) {
            int k10 = n5Var.k();
            int r10 = n5Var.r();
            if (k10 < 0) {
                return -1;
            }
            int[] iArr = n5Var.f;
            if (top < iArr[k10] || top >= iArr[r10 + 1]) {
                return -1;
            }
            return k10;
        }
        TL_iv.pageTableCell a10 = n5Var.a();
        if (a10 == null || (b10 = n5Var.a.b(a10)) < 0) {
            return -1;
        }
        int i11 = a10.rowspan;
        int i12 = i11 != 0 ? i11 : 1;
        int[] iArr2 = n5Var.f;
        int i13 = iArr2[b10];
        int i14 = iArr2[Math.min(i12 + b10, n5Var.a.b)];
        if (top < i13 || top >= i14) {
            return -1;
        }
        return b10;
    }

    public final void s(int i7, int i10) {
        int i11;
        d6 d6Var = this.G;
        if (d6Var == null || (i11 = d6Var.b) == 0 || d6Var.c == 0) {
            return;
        }
        TL_iv.pageTableCell pagetablecell = this.G.d[Math.max(0, Math.min(i7, i11 - 1))][Math.max(0, Math.min(i10, this.G.c - 1))];
        if (pagetablecell == null) {
            return;
        }
        post(new s2(5, this, pagetablecell));
    }

    public void setCellSelectionListener(i5 i5Var) {
        this.J = i5Var;
    }

    public void setLocked(boolean z10) {
        this.r.setLocked(z10);
        int i7 = 0;
        while (true) {
            n5 n5Var = this.w;
            if (i7 >= n5Var.getChildCount()) {
                return;
            }
            View childAt = n5Var.getChildAt(i7);
            if (childAt instanceof o5) {
                ((o5) childAt).setLocked(z10);
            }
            i7++;
        }
    }

    public final boolean t() {
        d6 d6Var = this.G;
        if (d6Var == null || d6Var.g.isEmpty()) {
            return false;
        }
        o5 m10 = this.w.m((TL_iv.pageTableCell) this.G.g.get(0));
        if (m10 == null) {
            return false;
        }
        e1 e1Var = m10.a;
        e1Var.O();
        e1Var.setSelection(0);
        return true;
    }

    public final boolean u(o5 o5Var, boolean z10) {
        int indexOf;
        d6 d6Var = this.G;
        if (d6Var == null || (indexOf = d6Var.g.indexOf(o5Var.b)) < 0) {
            return false;
        }
        int i7 = z10 ? indexOf - 1 : indexOf + 1;
        if (i7 < 0 || i7 >= this.G.g.size()) {
            return false;
        }
        o5 m10 = this.w.m((TL_iv.pageTableCell) this.G.g.get(i7));
        if (m10 == null) {
            return false;
        }
        e1 e1Var = m10.a;
        e1Var.O();
        e1Var.setSelection(e1Var.length());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        n5 n5Var;
        e1 e1Var = this.r;
        e1Var.updateColors();
        int i7 = n6.G6;
        i6 i6Var = this.n;
        int w02 = n6.w0(i7, i6Var);
        e1Var.setTextColor(w02);
        e1Var.setHintTextColor(n6.r1(0.35f, w02));
        int i10 = 0;
        while (true) {
            n5Var = this.w;
            if (i10 >= n5Var.getChildCount()) {
                break;
            }
            View childAt = n5Var.getChildAt(i10);
            if (childAt instanceof o5) {
                ((o5) childAt).a.updateColors();
            }
            i10++;
        }
        n5Var.b();
        try {
            if (getBackground() instanceof w1) {
                ((w1) getBackground()).a(n6.w0(n6.d6, i6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void v() {
        z();
        i5 i5Var = this.J;
        if (i5Var != null) {
            s3 s3Var = ((q2) i5Var).a;
            if (this != s3Var.q4) {
                return;
            }
            if (this.I.isEmpty()) {
                s3Var.P2();
            } else {
                if (s3Var.J3) {
                    return;
                }
                s3Var.I4(this);
            }
        }
    }

    public final void w() {
        a aVar = this.a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = b6.f(this.r.getText());
            }
        }
    }

    public final void x() {
        n5 n5Var = this.w;
        n5Var.s();
        n5Var.requestLayout();
        n5Var.invalidate();
        A();
        a3 a3Var = this.F;
        if (a3Var == null || this.a == null) {
            return;
        }
        a3Var.a();
    }

    public final void y(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i7;
        d6 d6Var = this.G;
        if (d6Var == null || pagetablecell == null) {
            return;
        }
        int b10 = d6Var.b(pagetablecell);
        int a10 = this.G.a(pagetablecell);
        int b11 = this.G.b(pagetablecell2);
        int a11 = this.G.a(pagetablecell2);
        if (b10 < 0 || a10 < 0 || b11 < 0 || a11 < 0) {
            return;
        }
        int min = Math.min(b10, b11);
        int min2 = Math.min(a10, a11);
        int i10 = this.G.b - 1;
        int i11 = pagetablecell.rowspan;
        if (i11 == 0) {
            i11 = 1;
        }
        int i12 = (b10 + i11) - 1;
        int i13 = pagetablecell2.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        int min3 = Math.min(i10, Math.max(i12, (b11 + i13) - 1));
        int i14 = this.G.c - 1;
        int i15 = pagetablecell.colspan;
        if (i15 == 0) {
            i15 = 1;
        }
        int i16 = (a10 + i15) - 1;
        int i17 = pagetablecell2.colspan;
        if (i17 == 0) {
            i17 = 1;
        }
        int min4 = Math.min(i14, Math.max(i16, (a11 + i17) - 1));
        while (true) {
            boolean z10 = false;
            i7 = min;
            while (min <= min3) {
                int i18 = min2;
                while (min2 <= min4) {
                    d6 d6Var2 = this.G;
                    TL_iv.pageTableCell pagetablecell3 = d6Var2.d[min][min2];
                    int i19 = d6Var2.e[min][min2];
                    int i20 = d6Var2.f[min][min2];
                    int min5 = Math.min(d6Var2.b - 1, (d6.o(pagetablecell3) + i19) - 1);
                    int i21 = this.G.c - 1;
                    int i22 = pagetablecell3.colspan;
                    if (i22 == 0) {
                        i22 = 1;
                    }
                    int min6 = Math.min(i21, (i22 + i20) - 1);
                    if (i19 < i7) {
                        z10 = true;
                        i7 = i19;
                    }
                    if (i20 < i18) {
                        z10 = true;
                        i18 = i20;
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
                min2 = i18;
            }
            if (!z10) {
                break;
            } else {
                min = i7;
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (i7 <= min3) {
            for (int i23 = min2; i23 <= min4; i23++) {
                linkedHashSet.add(this.G.d[i7][i23]);
            }
            i7++;
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
        setTranslationZ((!this.I.isEmpty() || this.w.hasFocus()) ? org.telegram.messenger.g0.L(1.0f) : 0.0f);
        invalidate();
        this.s.invalidate();
        Object parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }
}
