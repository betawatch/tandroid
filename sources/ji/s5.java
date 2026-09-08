package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import v7.c9;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class s5 extends a0 implements org.telegram.ui.ActionBar.z5, p9 {
    public b3 E;
    public k6 F;
    public boolean G;
    public final LinkedHashSet H;
    public p5 I;
    public final i J;
    public final org.telegram.ui.ActionBar.f6 n;
    public final h1 r;
    public final z3 s;
    public final u5 v;
    public final r5 w;
    public final ArrayList x;
    public boolean y;

    public s5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.x = new ArrayList();
        this.H = new LinkedHashSet();
        this.J = new i(this, 3);
        this.n = f6Var;
        setClipChildren(false);
        setClipToPadding(false);
        h1 h1Var = new h1(context, f6Var);
        this.r = h1Var;
        h1Var.setAllowNewlines(false);
        h1Var.setInputType(147457);
        h1Var.setGravity(49);
        h1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        h1Var.setIncludeFontPadding(false);
        h1Var.setMinHeight(0);
        h1Var.setBackground(null);
        h1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), 0);
        h1Var.setHint(LocaleController.getString(R.string.ArticleTableTitleHint));
        h1Var.setCenterEmptyHint(true);
        h1Var.setListener(new xa.c(this, 24));
        h1Var.setDelegate(new fi.f(this, 29));
        addView(h1Var);
        z3 z3Var = new z3(this, context, 1);
        this.s = z3Var;
        z3Var.setClipChildren(false);
        z3Var.setClipToPadding(false);
        z3Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(z3Var, w7.x5.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        u5 u5Var = new u5(context, f6Var);
        this.v = u5Var;
        r5 r5Var = new r5(this, context);
        this.w = r5Var;
        r5Var.addView(u5Var);
        z3Var.addView(r5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void d() {
        h1 h1Var = this.r;
        h1Var.t();
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.n);
        h1Var.setTextColor(v02);
        h1Var.setHintTextColor(org.telegram.ui.ActionBar.j6.l1(0.35f, v02));
        int i10 = 0;
        while (true) {
            u5 u5Var = this.v;
            if (i10 >= u5Var.getChildCount()) {
                u5Var.b();
                return;
            }
            View childAt = u5Var.getChildAt(i10);
            if (childAt instanceof v5) {
                ((v5) childAt).a.t();
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.F == null) {
            return;
        }
        b3 b3Var = this.E;
        q9 textSelectionHelper = b3Var != null ? b3Var.a.getTextSelectionHelper() : null;
        if (textSelectionHelper == null) {
            return;
        }
        ArrayList arrayList = this.x;
        arrayList.clear();
        fillTextLayoutBlocks(arrayList);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ba baVar = (ba) arrayList.get(i10);
            canvas.save();
            canvas.translate(baVar.getX(), baVar.getY());
            textSelectionHelper.a0(canvas, this, i10);
            canvas.restore();
        }
    }

    @Override // ji.a0
    public final void f(int i10) {
        requestLayout();
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        h1 h1Var;
        Layout layout;
        if (this.F == null) {
            return;
        }
        h1 h1Var2 = this.r;
        Layout layout2 = h1Var2.getLayout();
        if (layout2 != null) {
            arrayList.add(new n5(this, layout2, h1Var2.getPaddingLeft() + h1Var2.getLeft(), h1Var2.getPaddingTop() + h1Var2.getTop()));
        }
        int size = this.F.g.size();
        for (int i10 = 0; i10 < size; i10++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.F.g.get(i10);
            u5 u5Var = this.v;
            v5 m10 = u5Var.m(pagetablecell);
            if (m10 != null && (layout = (h1Var = m10.a).getLayout()) != null) {
                z3 z3Var = this.s;
                int left = z3Var.getLeft();
                r5 r5Var = this.w;
                arrayList.add(new o5(layout, h1Var.getPaddingLeft() + h1Var.getLeft() + m10.getLeft() + ((u5Var.getLeft() + (r5Var.getLeft() + left)) - z3Var.getScrollX()), h1Var.getPaddingTop() + h1Var.getTop() + m10.getTop() + u5Var.getTop() + r5Var.getTop() + z3Var.getTop(), this.F.b(pagetablecell) + 10, pagetablecell));
            }
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public u5 getGrid() {
        return this.v;
    }

    public k6 getModel() {
        return this.F;
    }

    public a getRow() {
        return this.a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.H;
    }

    public h1 getTitleEditText() {
        return this.r;
    }

    public final TL_iv.pageTableCell h(int i10) {
        int i11;
        k6 k6Var = this.F;
        if (k6Var == null || i10 <= 0 || i10 - 1 >= k6Var.g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.F.g.get(i11);
    }

    public final void i(boolean z10) {
        int i10;
        int i11;
        int i12;
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
                    i10 = Math.max(i10, k6.n(pagetablecell) + this.F.a(pagetablecell));
                }
            }
            linkedHashSet.clear();
            k6 k6Var = this.F;
            if (k6Var.b == 0 || (i11 = k6Var.c) == 0) {
                TL_iv.pageBlockTable pageblocktable = k6Var.a;
                if (pageblocktable.rows.isEmpty()) {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    ArrayList<TL_iv.pageTableCell> arrayList = new ArrayList<>();
                    pagetablerow.cells = arrayList;
                    arrayList.add(k6.f());
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
                        pagetablerow3.cells.add(k6.f());
                    }
                }
                k6Var.i();
            } else {
                int i14 = i10 < 0 ? 0 : i10;
                if (i14 <= i11) {
                    i11 = i14;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[k6Var.b];
                ArrayList arrayList3 = k6Var.g;
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj = arrayList3.get(i15);
                    i15++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = k6Var.b(pagetablecell2);
                    int a2 = k6Var.a(pagetablecell2);
                    int o9 = k6.o(pagetablecell2);
                    int i16 = pagetablecell2.colspan;
                    if (i16 == 0) {
                        i16 = 1;
                    }
                    int i17 = a2 >= i11 ? a2 + 1 : a2;
                    if (a2 < i11 && a2 + i16 > i11) {
                        i16++;
                        for (int i18 = b10; i18 < b10 + o9 && i18 < k6Var.b; i18++) {
                            zArr[i18] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{b10, i17, o9, i16});
                }
                int i19 = 0;
                while (true) {
                    i12 = k6Var.b;
                    if (i19 >= i12) {
                        break;
                    }
                    if (!zArr[i19]) {
                        identityHashMap.put(k6.f(), new int[]{i19, i11, 1, 1});
                    }
                    i19++;
                }
                k6Var.j(identityHashMap, i12);
                k6Var.i();
            }
            v();
            q(0, i10);
            t();
        }
    }

    @Override // android.view.View, org.telegram.ui.Cells.y9
    public final void invalidate() {
        super.invalidate();
        u5 u5Var = this.v;
        if (u5Var != null) {
            u5Var.invalidate();
        }
    }

    public final void j(boolean z10) {
        int i10;
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
                    i10 = Math.max(i10, k6.o(pagetablecell) + this.F.b(pagetablecell));
                }
            }
            linkedHashSet.clear();
            k6 k6Var = this.F;
            int i11 = k6Var.b;
            if (i11 == 0 || k6Var.c == 0) {
                TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                pagetablerow.cells = new ArrayList<>();
                int max = Math.max(k6Var.c, 1);
                for (int i12 = 0; i12 < max; i12++) {
                    pagetablerow.cells.add(k6.f());
                }
                k6Var.a.rows.add(pagetablerow);
                k6Var.i();
            } else {
                int i13 = i10 < 0 ? 0 : i10;
                if (i13 <= i11) {
                    i11 = i13;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[k6Var.c];
                ArrayList arrayList = k6Var.g;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = k6Var.b(pagetablecell2);
                    int a2 = k6Var.a(pagetablecell2);
                    int o9 = k6.o(pagetablecell2);
                    int i15 = pagetablecell2.colspan;
                    if (i15 == 0) {
                        i15 = 1;
                    }
                    int i16 = b10 >= i11 ? b10 + 1 : b10;
                    if (b10 < i11 && b10 + o9 > i11) {
                        o9++;
                        for (int i17 = a2; i17 < a2 + i15 && i17 < k6Var.c; i17++) {
                            zArr[i17] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{i16, a2, o9, i15});
                }
                for (int i18 = 0; i18 < k6Var.c; i18++) {
                    if (!zArr[i18]) {
                        identityHashMap.put(k6.f(), new int[]{i11, i18, 1, 1});
                    }
                }
                k6Var.j(identityHashMap, k6Var.b + 1);
                k6Var.i();
            }
            v();
            q(i10, 0);
            t();
        }
    }

    public final int k(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        k6 k6Var = this.F;
        if (k6Var != null && (indexOf = k6Var.g.indexOf(pagetablecell)) >= 0) {
            return indexOf + 1;
        }
        return -1;
    }

    public final h1 l(int i10) {
        v5 m10;
        if (i10 == 0) {
            return this.r;
        }
        TL_iv.pageTableCell h = h(i10);
        if (h == null || (m10 = this.v.m(h)) == null) {
            return null;
        }
        return m10.a;
    }

    public final TL_iv.pageTableCell m(int i10, int i11) {
        if (this.F == null) {
            return null;
        }
        z3 z3Var = this.s;
        int left = i10 - z3Var.getLeft();
        r5 r5Var = this.w;
        int left2 = left - r5Var.getLeft();
        u5 u5Var = this.v;
        int scrollX = z3Var.getScrollX() + (left2 - u5Var.getLeft());
        int top = ((i11 - z3Var.getTop()) - r5Var.getTop()) - u5Var.getTop();
        for (int i12 = 0; i12 < u5Var.getChildCount(); i12++) {
            View childAt = u5Var.getChildAt(i12);
            if (childAt instanceof v5) {
                v5 v5Var = (v5) childAt;
                if (scrollX >= v5Var.getLeft() && scrollX < v5Var.getRight() && top >= v5Var.getTop() && top < v5Var.getBottom()) {
                    return v5Var.b;
                }
            }
        }
        return null;
    }

    public final int n(int i10, int i11) {
        int i12;
        int a2;
        if (this.F == null) {
            return -1;
        }
        z3 z3Var = this.s;
        int left = i10 - z3Var.getLeft();
        r5 r5Var = this.w;
        int left2 = left - r5Var.getLeft();
        u5 u5Var = this.v;
        int scrollX = z3Var.getScrollX() + (left2 - u5Var.getLeft());
        int top = ((i11 - z3Var.getTop()) - r5Var.getTop()) - u5Var.getTop();
        k6 k6Var = u5Var.a;
        if (k6Var == null || top < (i12 = u5Var.f[k6Var.b])) {
            return -1;
        }
        if (top >= AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f) + i12) {
            return -1;
        }
        if (u5Var.u()) {
            int j3 = u5Var.j();
            int q6 = u5Var.q();
            if (j3 < 0) {
                return -1;
            }
            int[] iArr = u5Var.e;
            if (scrollX < iArr[j3] || scrollX >= iArr[q6 + 1]) {
                return -1;
            }
            return j3;
        }
        TL_iv.pageTableCell a10 = u5Var.a();
        if (a10 == null || (a2 = u5Var.a.a(a10)) < 0) {
            return -1;
        }
        int i13 = a10.colspan;
        int i14 = i13 != 0 ? i13 : 1;
        int[] iArr2 = u5Var.e;
        int i15 = iArr2[a2];
        int i16 = iArr2[Math.min(i14 + a2, u5Var.a.c)];
        if (scrollX < i15 || scrollX >= i16) {
            return -1;
        }
        return a2;
    }

    public final v5 o(h1 h1Var) {
        for (ViewParent parent = h1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof v5) {
                return (v5) parent;
            }
            if (parent == this) {
                return null;
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
        int d = c9.d(this.a);
        boolean z11 = this.y;
        int i17 = z11 ? d : i16;
        if (!z11) {
            i16 = d;
        }
        h1 h1Var = this.r;
        int measuredHeight = h1Var.getMeasuredHeight();
        a aVar = this.a;
        int i18 = 0;
        if (aVar != null && (i14 = aVar.l) > 0) {
            i18 = AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(i14, 1, 16, 10));
        }
        int i19 = i15 - i16;
        int i20 = measuredHeight + i18;
        h1Var.layout(AndroidUtilities.dp(16.0f) + i17, i18, i2.g.f(16.0f, i19, AndroidUtilities.dp(16.0f) + i17), i20);
        int dp = AndroidUtilities.dp(9.0f) + i20;
        z3 z3Var = this.s;
        z3Var.layout(i17, dp, i19, z3Var.getMeasuredHeight() + dp);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        int max = Math.max(0, (size - this.c) - c9.d(this.a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (AndroidUtilities.dp(16.0f) * 2)), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        h1 h1Var = this.r;
        h1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = h1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        z3 z3Var = this.s;
        z3Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.a;
        int dp = (aVar != null && (i12 = aVar.l) > 0) ? AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(i12, 1, 16, 10)) : 0;
        a aVar2 = this.a;
        if (aVar2 != null && (i13 = aVar2.m) > 0) {
            i14 = AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(i13, 1, 16, 10));
        }
        setMeasuredDimension(size, z3Var.getMeasuredHeight() + AndroidUtilities.dp(9.0f) + i14 + dp + measuredHeight);
    }

    public final int p(int i10, int i11) {
        int b10;
        if (this.F == null) {
            return -1;
        }
        z3 z3Var = this.s;
        int left = i10 - z3Var.getLeft();
        r5 r5Var = this.w;
        int left2 = left - r5Var.getLeft();
        u5 u5Var = this.v;
        int scrollX = z3Var.getScrollX() + (left2 - u5Var.getLeft());
        int top = ((i11 - z3Var.getTop()) - r5Var.getTop()) - u5Var.getTop();
        if (u5Var.a == null || scrollX < (u5Var.e[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) || scrollX >= u5Var.e[0]) {
            return -1;
        }
        if (u5Var.v()) {
            int k10 = u5Var.k();
            int r10 = u5Var.r();
            if (k10 < 0) {
                return -1;
            }
            int[] iArr = u5Var.f;
            if (top < iArr[k10] || top >= iArr[r10 + 1]) {
                return -1;
            }
            return k10;
        }
        TL_iv.pageTableCell a2 = u5Var.a();
        if (a2 == null || (b10 = u5Var.a.b(a2)) < 0) {
            return -1;
        }
        int i12 = a2.rowspan;
        int i13 = i12 != 0 ? i12 : 1;
        int[] iArr2 = u5Var.f;
        int i14 = iArr2[b10];
        int i15 = iArr2[Math.min(i13 + b10, u5Var.a.b)];
        if (top < i14 || top >= i15) {
            return -1;
        }
        return b10;
    }

    public final void q(int i10, int i11) {
        int i12;
        k6 k6Var = this.F;
        if (k6Var == null || (i12 = k6Var.b) == 0 || k6Var.c == 0) {
            return;
        }
        TL_iv.pageTableCell pagetablecell = this.F.d[Math.max(0, Math.min(i10, i12 - 1))][Math.max(0, Math.min(i11, this.F.c - 1))];
        if (pagetablecell == null) {
            return;
        }
        post(new b5(2, this, pagetablecell));
    }

    public final boolean r() {
        k6 k6Var = this.F;
        if (k6Var == null || k6Var.g.isEmpty()) {
            return false;
        }
        v5 m10 = this.v.m((TL_iv.pageTableCell) this.F.g.get(0));
        if (m10 == null) {
            return false;
        }
        h1 h1Var = m10.a;
        h1Var.r();
        h1Var.setSelection(0);
        return true;
    }

    public final boolean s(v5 v5Var, boolean z10) {
        int indexOf;
        k6 k6Var = this.F;
        if (k6Var == null || (indexOf = k6Var.g.indexOf(v5Var.b)) < 0) {
            return false;
        }
        int i10 = z10 ? indexOf - 1 : indexOf + 1;
        if (i10 < 0 || i10 >= this.F.g.size()) {
            return false;
        }
        v5 m10 = this.v.m((TL_iv.pageTableCell) this.F.g.get(i10));
        if (m10 == null) {
            return false;
        }
        h1 h1Var = m10.a;
        h1Var.r();
        h1Var.setSelection(h1Var.length());
        return true;
    }

    public void setCellSelectionListener(p5 p5Var) {
        this.I = p5Var;
    }

    public void setLocked(boolean z10) {
        this.r.setLocked(z10);
        int i10 = 0;
        while (true) {
            u5 u5Var = this.v;
            if (i10 >= u5Var.getChildCount()) {
                return;
            }
            View childAt = u5Var.getChildAt(i10);
            if (childAt instanceof v5) {
                ((v5) childAt).setLocked(z10);
            }
            i10++;
        }
    }

    public final void t() {
        x();
        p5 p5Var = this.I;
        if (p5Var != null) {
            v3 v3Var = ((s2) p5Var).a;
            if (this != v3Var.i4) {
                return;
            }
            if (this.H.isEmpty()) {
                v3Var.L2();
            } else {
                if (v3Var.B3) {
                    return;
                }
                v3Var.E4(this);
            }
        }
    }

    public final void u() {
        a aVar = this.a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = i6.f(this.r.getText());
            }
        }
    }

    public final void v() {
        u5 u5Var = this.v;
        u5Var.s();
        u5Var.requestLayout();
        u5Var.invalidate();
        y();
        b3 b3Var = this.E;
        if (b3Var == null || this.a == null) {
            return;
        }
        b3Var.a();
    }

    public final void w(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i10;
        k6 k6Var = this.F;
        if (k6Var == null || pagetablecell == null) {
            return;
        }
        int b10 = k6Var.b(pagetablecell);
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
                    k6 k6Var2 = this.F;
                    TL_iv.pageTableCell pagetablecell3 = k6Var2.d[min][min2];
                    int i20 = k6Var2.e[min][min2];
                    int i21 = k6Var2.f[min][min2];
                    int min5 = Math.min(k6Var2.b - 1, (k6.o(pagetablecell3) + i20) - 1);
                    int i22 = this.F.c - 1;
                    int i23 = pagetablecell3.colspan;
                    if (i23 == 0) {
                        i23 = 1;
                    }
                    int min6 = Math.min(i22, (i23 + i21) - 1);
                    if (i20 < i10) {
                        i10 = i20;
                        z10 = true;
                    }
                    if (i21 < i19) {
                        i19 = i21;
                        z10 = true;
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
        this.v.invalidate();
        t();
    }

    public final void x() {
        setTranslationZ((!this.H.isEmpty() || this.v.hasFocus()) ? AndroidUtilities.dp(1.0f) : 0.0f);
        invalidate();
        this.s.invalidate();
        Object parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }

    public final void y() {
        int i10 = 0;
        while (true) {
            u5 u5Var = this.v;
            if (i10 >= u5Var.getChildCount()) {
                return;
            }
            View childAt = u5Var.getChildAt(i10);
            if (childAt instanceof v5) {
                v5 v5Var = (v5) childAt;
                h1 h1Var = v5Var.a;
                h1Var.setListener(new m5(this, v5Var));
                h1Var.setDelegate(new ah.i0(23, this, v5Var));
            }
            i10++;
        }
    }
}
