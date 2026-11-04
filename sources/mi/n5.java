package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import b8.mf;
import b8.ne;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.s9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class n5 extends y implements org.telegram.ui.ActionBar.z5, g9 {
    public boolean E;
    public b3 F;
    public f6 G;
    public boolean H;
    public final LinkedHashSet I;
    public k5 J;
    public final i K;
    public final org.telegram.ui.ActionBar.e6 n;
    public final h1 r;
    public final x3 s;
    public final p5 w;
    public final m5 x;
    public final ArrayList y;

    public n5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.y = new ArrayList();
        this.I = new LinkedHashSet();
        this.K = new i(this, 3);
        this.n = e6Var;
        setClipChildren(false);
        setClipToPadding(false);
        h1 h1Var = new h1(context, e6Var);
        this.r = h1Var;
        h1Var.setAllowNewlines(false);
        h1Var.setInputType(147457);
        h1Var.setGravity(49);
        h1Var.setTextSize(1, Math.max(8, az.W0 - 2));
        h1Var.setIncludeFontPadding(false);
        h1Var.setMinHeight(0);
        h1Var.setBackground(null);
        h1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), 0);
        h1Var.setHint(bd.M0(2131753989, null));
        h1Var.setCenterEmptyHint(true);
        h1Var.setListener(new hi.d(this, 16));
        h1Var.setDelegate(new l5.b(this, 13));
        addView(h1Var);
        x3 x3Var = new x3(this, context, 1);
        this.s = x3Var;
        x3Var.setClipChildren(false);
        x3Var.setClipToPadding(false);
        x3Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(x3Var, mf.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        p5 p5Var = new p5(context, e6Var);
        this.w = p5Var;
        m5 m5Var = new m5(this, context);
        this.x = m5Var;
        m5Var.addView(p5Var);
        x3Var.addView(m5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void A() {
        int i3 = 0;
        while (true) {
            p5 p5Var = this.w;
            if (i3 >= p5Var.getChildCount()) {
                return;
            }
            View childAt = p5Var.getChildAt(i3);
            if (childAt instanceof q5) {
                q5 q5Var = (q5) childAt;
                h1 h1Var = q5Var.a;
                h1Var.setListener(new h5(this, q5Var));
                h1Var.setDelegate(new d4(1, this, q5Var));
            }
            i3++;
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.G6));
        hashSet.add(Integer.valueOf(k6.d6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.G == null) {
            return;
        }
        b3 b3Var = this.F;
        h9 textSelectionHelper = b3Var != null ? b3Var.a.getTextSelectionHelper() : null;
        if (textSelectionHelper == null) {
            return;
        }
        ArrayList arrayList = this.y;
        arrayList.clear();
        k(arrayList);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            s9 s9Var = (s9) arrayList.get(i3);
            canvas.save();
            canvas.translate(s9Var.getX(), s9Var.getY());
            textSelectionHelper.Z(canvas, this, i3);
            canvas.restore();
        }
    }

    @Override // mi.y
    public final void e(int i3) {
        requestLayout();
    }

    public final TL_iv.pageTableCell g(int i3) {
        int i10;
        f6 f6Var = this.G;
        if (f6Var == null || i3 <= 0 || i3 - 1 >= f6Var.g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.G.g.get(i10);
    }

    public p5 getGrid() {
        return this.w;
    }

    public f6 getModel() {
        return this.G;
    }

    public a getRow() {
        return this.a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.I;
    }

    public h1 getTitleEditText() {
        return this.r;
    }

    public final void h(boolean z10) {
        int i3;
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
                i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (it.hasNext()) {
                    i3 = Math.min(i3, this.G.a((TL_iv.pageTableCell) it.next()));
                }
            } else {
                Iterator it2 = linkedHashSet.iterator();
                i3 = 0;
                while (it2.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                    i3 = Math.max(i3, f6.n(pagetablecell) + this.G.a(pagetablecell));
                }
            }
            linkedHashSet.clear();
            f6 f6Var = this.G;
            if (f6Var.b == 0 || (i10 = f6Var.c) == 0) {
                TL_iv.pageBlockTable pageblocktable = f6Var.a;
                if (pageblocktable.rows.isEmpty()) {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    ArrayList<TL_iv.pageTableCell> arrayList = new ArrayList<>();
                    pagetablerow.cells = arrayList;
                    arrayList.add(f6.f());
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
                        pagetablerow3.cells.add(f6.f());
                    }
                }
                f6Var.i();
            } else {
                int i14 = i3 < 0 ? 0 : i3;
                if (i14 <= i10) {
                    i10 = i14;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[f6Var.b];
                ArrayList arrayList3 = f6Var.g;
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj = arrayList3.get(i15);
                    i15++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = f6Var.b(pagetablecell2);
                    int a10 = f6Var.a(pagetablecell2);
                    int o10 = f6.o(pagetablecell2);
                    int i16 = pagetablecell2.colspan;
                    if (i16 == 0) {
                        i16 = 1;
                    }
                    int i17 = a10 >= i10 ? a10 + 1 : a10;
                    if (a10 < i10 && a10 + i16 > i10) {
                        i16++;
                        for (int i18 = b10; i18 < b10 + o10 && i18 < f6Var.b; i18++) {
                            zArr[i18] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{b10, i17, o10, i16});
                }
                int i19 = 1;
                int i20 = 0;
                while (true) {
                    i11 = f6Var.b;
                    if (i20 >= i11) {
                        break;
                    }
                    if (zArr[i20]) {
                        i12 = i19;
                    } else {
                        i12 = i19;
                        identityHashMap.put(f6.f(), new int[]{i20, i10, i12, i12});
                    }
                    i20++;
                    i19 = i12;
                }
                f6Var.j(identityHashMap, i11);
                f6Var.i();
            }
            x();
            s(0, i3);
            v();
        }
    }

    @Override // android.view.View, org.telegram.ui.Cells.p9
    public final void invalidate() {
        super.invalidate();
        p5 p5Var = this.w;
        if (p5Var != null) {
            p5Var.invalidate();
        }
    }

    public final void j(boolean z10) {
        int i3;
        int i10;
        if (this.G != null) {
            LinkedHashSet linkedHashSet = this.I;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            if (z10) {
                Iterator it = linkedHashSet.iterator();
                i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (it.hasNext()) {
                    i3 = Math.min(i3, this.G.b((TL_iv.pageTableCell) it.next()));
                }
            } else {
                Iterator it2 = linkedHashSet.iterator();
                i3 = 0;
                while (it2.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                    i3 = Math.max(i3, f6.o(pagetablecell) + this.G.b(pagetablecell));
                }
            }
            linkedHashSet.clear();
            f6 f6Var = this.G;
            int i11 = f6Var.b;
            if (i11 == 0 || f6Var.c == 0) {
                TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                pagetablerow.cells = new ArrayList<>();
                int max = Math.max(f6Var.c, 1);
                for (int i12 = 0; i12 < max; i12++) {
                    pagetablerow.cells.add(f6.f());
                }
                f6Var.a.rows.add(pagetablerow);
                f6Var.i();
            } else {
                int i13 = i3 < 0 ? 0 : i3;
                if (i13 <= i11) {
                    i11 = i13;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[f6Var.c];
                ArrayList arrayList = f6Var.g;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = f6Var.b(pagetablecell2);
                    int a10 = f6Var.a(pagetablecell2);
                    int o10 = f6.o(pagetablecell2);
                    int i15 = pagetablecell2.colspan;
                    if (i15 == 0) {
                        i15 = 1;
                    }
                    int i16 = b10 >= i11 ? b10 + 1 : b10;
                    if (b10 < i11 && b10 + o10 > i11) {
                        o10++;
                        for (int i17 = a10; i17 < a10 + i15 && i17 < f6Var.c; i17++) {
                            zArr[i17] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{i16, a10, o10, i15});
                }
                int i18 = 1;
                int i19 = 0;
                while (i19 < f6Var.c) {
                    if (zArr[i19]) {
                        i10 = i18;
                    } else {
                        i10 = i18;
                        identityHashMap.put(f6.f(), new int[]{i11, i19, i10, i10});
                    }
                    i19++;
                    i18 = i10;
                }
                f6Var.j(identityHashMap, f6Var.b + i18);
                f6Var.i();
            }
            x();
            s(i3, 0);
            v();
        }
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        h1 h1Var;
        Layout layout;
        if (this.G == null) {
            return;
        }
        h1 h1Var2 = this.r;
        Layout layout2 = h1Var2.getLayout();
        if (layout2 != null) {
            arrayList.add(new i5(this, layout2, h1Var2.getPaddingLeft() + h1Var2.getLeft(), h1Var2.getPaddingTop() + h1Var2.getTop()));
        }
        int size = this.G.g.size();
        for (int i3 = 0; i3 < size; i3++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.G.g.get(i3);
            p5 p5Var = this.w;
            q5 m10 = p5Var.m(pagetablecell);
            if (m10 != null && (layout = (h1Var = m10.a).getLayout()) != null) {
                x3 x3Var = this.s;
                int left = x3Var.getLeft();
                m5 m5Var = this.x;
                arrayList.add(new j5(layout, h1Var.getPaddingLeft() + h1Var.getLeft() + m10.getLeft() + ((p5Var.getLeft() + (m5Var.getLeft() + left)) - x3Var.getScrollX()), h1Var.getPaddingTop() + h1Var.getTop() + m10.getTop() + p5Var.getTop() + m5Var.getTop() + x3Var.getTop(), this.G.b(pagetablecell) + 10, pagetablecell));
            }
        }
    }

    public final int l(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        f6 f6Var = this.G;
        if (f6Var != null && (indexOf = f6Var.g.indexOf(pagetablecell)) >= 0) {
            return indexOf + 1;
        }
        return -1;
    }

    public final h1 m(int i3) {
        q5 m10;
        if (i3 == 0) {
            return this.r;
        }
        TL_iv.pageTableCell g7 = g(i3);
        if (g7 == null || (m10 = this.w.m(g7)) == null) {
            return null;
        }
        return m10.a;
    }

    public final TL_iv.pageTableCell n(int i3, int i10) {
        if (this.G == null) {
            return null;
        }
        x3 x3Var = this.s;
        int left = i3 - x3Var.getLeft();
        m5 m5Var = this.x;
        int left2 = left - m5Var.getLeft();
        p5 p5Var = this.w;
        int scrollX = x3Var.getScrollX() + (left2 - p5Var.getLeft());
        int top = ((i10 - x3Var.getTop()) - m5Var.getTop()) - p5Var.getTop();
        for (int i11 = 0; i11 < p5Var.getChildCount(); i11++) {
            View childAt = p5Var.getChildAt(i11);
            if (childAt instanceof q5) {
                q5 q5Var = (q5) childAt;
                if (scrollX >= q5Var.getLeft() && scrollX < q5Var.getRight() && top >= q5Var.getTop() && top < q5Var.getBottom()) {
                    return q5Var.b;
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14 = i11 - i3;
        int i15 = this.c;
        int d = ne.d(this.a);
        boolean z11 = this.E;
        int i16 = z11 ? d : i15;
        if (!z11) {
            i15 = d;
        }
        h1 h1Var = this.r;
        int measuredHeight = h1Var.getMeasuredHeight();
        a aVar = this.a;
        int i17 = 0;
        if (aVar != null && (i13 = aVar.l) > 0) {
            i17 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i13, 1, 16, 10));
        }
        int i18 = i14 - i15;
        int i19 = measuredHeight + i17;
        h1Var.layout(org.telegram.messenger.g0.L(16.0f) + i16, i17, k2.p1.d(16.0f, i18, org.telegram.messenger.g0.L(16.0f) + i16), i19);
        int L = org.telegram.messenger.g0.L(9.0f) + i19;
        x3 x3Var = this.s;
        x3Var.layout(i16, L, i18, x3Var.getMeasuredHeight() + L);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i3);
        int i13 = 0;
        int max = Math.max(0, (size - this.c) - ne.d(this.a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (org.telegram.messenger.g0.L(16.0f) * 2)), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        h1 h1Var = this.r;
        h1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = h1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        x3 x3Var = this.s;
        x3Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.a;
        int L = (aVar != null && (i11 = aVar.l) > 0) ? org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i11, 1, 16, 10)) : 0;
        a aVar2 = this.a;
        if (aVar2 != null && (i12 = aVar2.m) > 0) {
            i13 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i12, 1, 16, 10));
        }
        setMeasuredDimension(size, x3Var.getMeasuredHeight() + org.telegram.messenger.g0.L(9.0f) + i13 + L + measuredHeight);
    }

    public final int p(int i3, int i10) {
        int i11;
        int a10;
        if (this.G == null) {
            return -1;
        }
        x3 x3Var = this.s;
        int left = i3 - x3Var.getLeft();
        m5 m5Var = this.x;
        int left2 = left - m5Var.getLeft();
        p5 p5Var = this.w;
        int scrollX = x3Var.getScrollX() + (left2 - p5Var.getLeft());
        int top = ((i10 - x3Var.getTop()) - m5Var.getTop()) - p5Var.getTop();
        f6 f6Var = p5Var.a;
        if (f6Var == null || top < (i11 = p5Var.f[f6Var.b])) {
            return -1;
        }
        if (top >= org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(16.0f) + i11) {
            return -1;
        }
        if (p5Var.u()) {
            int j10 = p5Var.j();
            int q10 = p5Var.q();
            if (j10 < 0) {
                return -1;
            }
            int[] iArr = p5Var.e;
            if (scrollX < iArr[j10] || scrollX >= iArr[q10 + 1]) {
                return -1;
            }
            return j10;
        }
        TL_iv.pageTableCell a11 = p5Var.a();
        if (a11 == null || (a10 = p5Var.a.a(a11)) < 0) {
            return -1;
        }
        int i12 = a11.colspan;
        int i13 = i12 != 0 ? i12 : 1;
        int[] iArr2 = p5Var.e;
        int i14 = iArr2[a10];
        int i15 = iArr2[Math.min(i13 + a10, p5Var.a.c)];
        if (scrollX < i14 || scrollX >= i15) {
            return -1;
        }
        return a10;
    }

    public final q5 q(h1 h1Var) {
        for (ViewParent parent = h1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof q5) {
                return (q5) parent;
            }
            if (parent == this) {
                return null;
            }
        }
        return null;
    }

    public final int r(int i3, int i10) {
        int b10;
        if (this.G == null) {
            return -1;
        }
        x3 x3Var = this.s;
        int left = i3 - x3Var.getLeft();
        m5 m5Var = this.x;
        int left2 = left - m5Var.getLeft();
        p5 p5Var = this.w;
        int scrollX = x3Var.getScrollX() + (left2 - p5Var.getLeft());
        int top = ((i10 - x3Var.getTop()) - m5Var.getTop()) - p5Var.getTop();
        if (p5Var.a == null || scrollX < (p5Var.e[0] - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(4.0f) || scrollX >= p5Var.e[0]) {
            return -1;
        }
        if (p5Var.v()) {
            int k10 = p5Var.k();
            int r5 = p5Var.r();
            if (k10 < 0) {
                return -1;
            }
            int[] iArr = p5Var.f;
            if (top < iArr[k10] || top >= iArr[r5 + 1]) {
                return -1;
            }
            return k10;
        }
        TL_iv.pageTableCell a10 = p5Var.a();
        if (a10 == null || (b10 = p5Var.a.b(a10)) < 0) {
            return -1;
        }
        int i11 = a10.rowspan;
        int i12 = i11 != 0 ? i11 : 1;
        int[] iArr2 = p5Var.f;
        int i13 = iArr2[b10];
        int i14 = iArr2[Math.min(i12 + b10, p5Var.a.b)];
        if (top < i13 || top >= i14) {
            return -1;
        }
        return b10;
    }

    public final void s(int i3, int i10) {
        int i11;
        f6 f6Var = this.G;
        if (f6Var == null || (i11 = f6Var.b) == 0 || f6Var.c == 0) {
            return;
        }
        TL_iv.pageTableCell pagetablecell = this.G.d[Math.max(0, Math.min(i3, i11 - 1))][Math.max(0, Math.min(i10, this.G.c - 1))];
        if (pagetablecell == null) {
            return;
        }
        post(new m2.s(11, this, pagetablecell));
    }

    public void setCellSelectionListener(k5 k5Var) {
        this.J = k5Var;
    }

    public void setLocked(boolean z10) {
        this.r.setLocked(z10);
        int i3 = 0;
        while (true) {
            p5 p5Var = this.w;
            if (i3 >= p5Var.getChildCount()) {
                return;
            }
            View childAt = p5Var.getChildAt(i3);
            if (childAt instanceof q5) {
                ((q5) childAt).setLocked(z10);
            }
            i3++;
        }
    }

    public final boolean t() {
        f6 f6Var = this.G;
        if (f6Var == null || f6Var.g.isEmpty()) {
            return false;
        }
        q5 m10 = this.w.m((TL_iv.pageTableCell) this.G.g.get(0));
        if (m10 == null) {
            return false;
        }
        h1 h1Var = m10.a;
        h1Var.N();
        h1Var.setSelection(0);
        return true;
    }

    public final boolean u(q5 q5Var, boolean z10) {
        int indexOf;
        f6 f6Var = this.G;
        if (f6Var == null || (indexOf = f6Var.g.indexOf(q5Var.b)) < 0) {
            return false;
        }
        int i3 = z10 ? indexOf - 1 : indexOf + 1;
        if (i3 < 0 || i3 >= this.G.g.size()) {
            return false;
        }
        q5 m10 = this.w.m((TL_iv.pageTableCell) this.G.g.get(i3));
        if (m10 == null) {
            return false;
        }
        h1 h1Var = m10.a;
        h1Var.N();
        h1Var.setSelection(h1Var.length());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        p5 p5Var;
        h1 h1Var = this.r;
        h1Var.updateColors();
        int i3 = k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.n;
        int w02 = k6.w0(i3, e6Var);
        h1Var.setTextColor(w02);
        h1Var.setHintTextColor(k6.r1(0.35f, w02));
        int i10 = 0;
        while (true) {
            p5Var = this.w;
            if (i10 >= p5Var.getChildCount()) {
                break;
            }
            View childAt = p5Var.getChildAt(i10);
            if (childAt instanceof q5) {
                ((q5) childAt).a.updateColors();
            }
            i10++;
        }
        p5Var.b();
        try {
            if (getBackground() instanceof z1) {
                ((z1) getBackground()).a(k6.w0(k6.d6, e6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void v() {
        z();
        k5 k5Var = this.J;
        if (k5Var != null) {
            t3 t3Var = ((s2) k5Var).a;
            if (this != t3Var.q4) {
                return;
            }
            if (this.I.isEmpty()) {
                t3Var.P2();
            } else {
                if (t3Var.J3) {
                    return;
                }
                t3Var.I4(this);
            }
        }
    }

    public final void w() {
        a aVar = this.a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = d6.f(this.r.getText());
            }
        }
    }

    public final void x() {
        p5 p5Var = this.w;
        p5Var.s();
        p5Var.requestLayout();
        p5Var.invalidate();
        A();
        b3 b3Var = this.F;
        if (b3Var == null || this.a == null) {
            return;
        }
        b3Var.a();
    }

    public final void y(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i3;
        f6 f6Var = this.G;
        if (f6Var == null || pagetablecell == null) {
            return;
        }
        int b10 = f6Var.b(pagetablecell);
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
            i3 = min;
            while (min <= min3) {
                int i18 = min2;
                while (min2 <= min4) {
                    f6 f6Var2 = this.G;
                    TL_iv.pageTableCell pagetablecell3 = f6Var2.d[min][min2];
                    int i19 = f6Var2.e[min][min2];
                    int i20 = f6Var2.f[min][min2];
                    int min5 = Math.min(f6Var2.b - 1, (f6.o(pagetablecell3) + i19) - 1);
                    int i21 = this.G.c - 1;
                    int i22 = pagetablecell3.colspan;
                    if (i22 == 0) {
                        i22 = 1;
                    }
                    int min6 = Math.min(i21, (i22 + i20) - 1);
                    if (i19 < i3) {
                        z10 = true;
                        i3 = i19;
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
                min = i3;
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (i3 <= min3) {
            for (int i23 = min2; i23 <= min4; i23++) {
                linkedHashSet.add(this.G.d[i3][i23]);
            }
            i3++;
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
