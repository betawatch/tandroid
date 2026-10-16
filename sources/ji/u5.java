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
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.z9;
import v7.u8;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class u5 extends a0 implements org.telegram.ui.ActionBar.x5, n9 {
    public d3 E;
    public m6 F;
    public boolean G;
    public final LinkedHashSet H;
    public r5 I;
    public final i J;
    public final org.telegram.ui.ActionBar.c6 n;
    public final h1 r;
    public final b4 s;
    public final w5 v;
    public final t5 w;
    public final ArrayList x;
    public boolean y;

    public u5(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.x = new ArrayList();
        this.H = new LinkedHashSet();
        this.J = new i(this, 3);
        this.n = c6Var;
        setClipChildren(false);
        setClipToPadding(false);
        h1 h1Var = new h1(context, c6Var);
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
        h1Var.setListener(new a4.l(this, 28));
        h1Var.setDelegate(new f1.a(this, 29));
        addView(h1Var);
        b4 b4Var = new b4(this, context, 1);
        this.s = b4Var;
        b4Var.setClipChildren(false);
        b4Var.setClipToPadding(false);
        b4Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(b4Var, w7.z5.a(-2.0f, 0.0f, 6.0f, 0.0f, 0.0f, -1, 51));
        w5 w5Var = new w5(context, c6Var);
        this.v = w5Var;
        t5 t5Var = new t5(this, context);
        this.w = t5Var;
        t5Var.addView(w5Var);
        b4Var.addView(t5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        h1 h1Var = this.r;
        h1Var.t();
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, this.n);
        h1Var.setTextColor(w02);
        h1Var.setHintTextColor(org.telegram.ui.ActionBar.g6.m1(0.35f, w02));
        int i10 = 0;
        while (true) {
            w5 w5Var = this.v;
            if (i10 >= w5Var.getChildCount()) {
                w5Var.b();
                return;
            }
            View childAt = w5Var.getChildAt(i10);
            if (childAt instanceof x5) {
                ((x5) childAt).a.t();
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
        d3 d3Var = this.E;
        o9 textSelectionHelper = d3Var != null ? d3Var.a.getTextSelectionHelper() : null;
        if (textSelectionHelper == null) {
            return;
        }
        ArrayList arrayList = this.x;
        arrayList.clear();
        fillTextLayoutBlocks(arrayList);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            z9 z9Var = (z9) arrayList.get(i10);
            canvas.save();
            canvas.translate(z9Var.getX(), z9Var.getY());
            textSelectionHelper.Z(canvas, this, i10);
            canvas.restore();
        }
    }

    @Override // ji.a0
    public final void f(int i10) {
        requestLayout();
    }

    @Override // org.telegram.ui.Cells.n9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        h1 h1Var;
        Layout layout;
        if (this.F == null) {
            return;
        }
        h1 h1Var2 = this.r;
        Layout layout2 = h1Var2.getLayout();
        if (layout2 != null) {
            arrayList.add(new p5(this, layout2, h1Var2.getPaddingLeft() + h1Var2.getLeft(), h1Var2.getPaddingTop() + h1Var2.getTop()));
        }
        int size = this.F.g.size();
        for (int i10 = 0; i10 < size; i10++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.F.g.get(i10);
            w5 w5Var = this.v;
            x5 m10 = w5Var.m(pagetablecell);
            if (m10 != null && (layout = (h1Var = m10.a).getLayout()) != null) {
                b4 b4Var = this.s;
                int left = b4Var.getLeft();
                t5 t5Var = this.w;
                arrayList.add(new q5(layout, h1Var.getPaddingLeft() + h1Var.getLeft() + m10.getLeft() + ((w5Var.getLeft() + (t5Var.getLeft() + left)) - b4Var.getScrollX()), h1Var.getPaddingTop() + h1Var.getTop() + m10.getTop() + w5Var.getTop() + t5Var.getTop() + b4Var.getTop(), this.F.b(pagetablecell) + 10, pagetablecell));
            }
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public w5 getGrid() {
        return this.v;
    }

    public m6 getModel() {
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
        m6 m6Var = this.F;
        if (m6Var == null || i10 <= 0 || i10 - 1 >= m6Var.g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.F.g.get(i11);
    }

    public final void i(boolean z10) {
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
                    i10 = Math.max(i10, m6.n(pagetablecell) + this.F.a(pagetablecell));
                }
            }
            linkedHashSet.clear();
            m6 m6Var = this.F;
            if (m6Var.b == 0 || (i11 = m6Var.c) == 0) {
                TL_iv.pageBlockTable pageblocktable = m6Var.a;
                if (pageblocktable.rows.isEmpty()) {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    ArrayList<TL_iv.pageTableCell> arrayList = new ArrayList<>();
                    pagetablerow.cells = arrayList;
                    arrayList.add(m6.f());
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
                        pagetablerow3.cells.add(m6.f());
                    }
                }
                m6Var.i();
            } else {
                int i15 = i10 < 0 ? 0 : i10;
                if (i15 <= i11) {
                    i11 = i15;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[m6Var.b];
                ArrayList arrayList3 = m6Var.g;
                int size2 = arrayList3.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj = arrayList3.get(i16);
                    i16++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = m6Var.b(pagetablecell2);
                    int a2 = m6Var.a(pagetablecell2);
                    int o10 = m6.o(pagetablecell2);
                    int i17 = pagetablecell2.colspan;
                    if (i17 == 0) {
                        i17 = 1;
                    }
                    int i18 = a2 >= i11 ? a2 + 1 : a2;
                    if (a2 < i11 && a2 + i17 > i11) {
                        i17++;
                        for (int i19 = b10; i19 < b10 + o10 && i19 < m6Var.b; i19++) {
                            zArr[i19] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{b10, i18, o10, i17});
                }
                int i20 = 1;
                int i21 = 0;
                while (true) {
                    i12 = m6Var.b;
                    if (i21 >= i12) {
                        break;
                    }
                    if (zArr[i21]) {
                        i13 = i20;
                    } else {
                        i13 = i20;
                        identityHashMap.put(m6.f(), new int[]{i21, i11, i13, i13});
                    }
                    i21++;
                    i20 = i13;
                }
                m6Var.j(identityHashMap, i12);
                m6Var.i();
            }
            v();
            q(0, i10);
            t();
        }
    }

    @Override // android.view.View, org.telegram.ui.Cells.w9
    public final void invalidate() {
        super.invalidate();
        w5 w5Var = this.v;
        if (w5Var != null) {
            w5Var.invalidate();
        }
    }

    public final void j(boolean z10) {
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
                    i10 = Math.max(i10, m6.o(pagetablecell) + this.F.b(pagetablecell));
                }
            }
            linkedHashSet.clear();
            m6 m6Var = this.F;
            int i12 = m6Var.b;
            if (i12 == 0 || m6Var.c == 0) {
                TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                pagetablerow.cells = new ArrayList<>();
                int max = Math.max(m6Var.c, 1);
                for (int i13 = 0; i13 < max; i13++) {
                    pagetablerow.cells.add(m6.f());
                }
                m6Var.a.rows.add(pagetablerow);
                m6Var.i();
            } else {
                int i14 = i10 < 0 ? 0 : i10;
                if (i14 <= i12) {
                    i12 = i14;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[m6Var.c];
                ArrayList arrayList = m6Var.g;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = m6Var.b(pagetablecell2);
                    int a2 = m6Var.a(pagetablecell2);
                    int o10 = m6.o(pagetablecell2);
                    int i16 = pagetablecell2.colspan;
                    if (i16 == 0) {
                        i16 = 1;
                    }
                    int i17 = b10 >= i12 ? b10 + 1 : b10;
                    if (b10 < i12 && b10 + o10 > i12) {
                        o10++;
                        for (int i18 = a2; i18 < a2 + i16 && i18 < m6Var.c; i18++) {
                            zArr[i18] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{i17, a2, o10, i16});
                }
                int i19 = 1;
                int i20 = 0;
                while (i20 < m6Var.c) {
                    if (zArr[i20]) {
                        i11 = i19;
                    } else {
                        i11 = i19;
                        identityHashMap.put(m6.f(), new int[]{i12, i20, i11, i11});
                    }
                    i20++;
                    i19 = i11;
                }
                m6Var.j(identityHashMap, m6Var.b + i19);
                m6Var.i();
            }
            v();
            q(i10, 0);
            t();
        }
    }

    public final int k(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        m6 m6Var = this.F;
        if (m6Var != null && (indexOf = m6Var.g.indexOf(pagetablecell)) >= 0) {
            return indexOf + 1;
        }
        return -1;
    }

    public final h1 l(int i10) {
        x5 m10;
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
        b4 b4Var = this.s;
        int left = i10 - b4Var.getLeft();
        t5 t5Var = this.w;
        int left2 = left - t5Var.getLeft();
        w5 w5Var = this.v;
        int scrollX = b4Var.getScrollX() + (left2 - w5Var.getLeft());
        int top = ((i11 - b4Var.getTop()) - t5Var.getTop()) - w5Var.getTop();
        for (int i12 = 0; i12 < w5Var.getChildCount(); i12++) {
            View childAt = w5Var.getChildAt(i12);
            if (childAt instanceof x5) {
                x5 x5Var = (x5) childAt;
                if (scrollX >= x5Var.getLeft() && scrollX < x5Var.getRight() && top >= x5Var.getTop() && top < x5Var.getBottom()) {
                    return x5Var.b;
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
        b4 b4Var = this.s;
        int left = i10 - b4Var.getLeft();
        t5 t5Var = this.w;
        int left2 = left - t5Var.getLeft();
        w5 w5Var = this.v;
        int scrollX = b4Var.getScrollX() + (left2 - w5Var.getLeft());
        int top = ((i11 - b4Var.getTop()) - t5Var.getTop()) - w5Var.getTop();
        m6 m6Var = w5Var.a;
        if (m6Var == null || top < (i12 = w5Var.f[m6Var.b])) {
            return -1;
        }
        if (top >= AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f) + i12) {
            return -1;
        }
        if (w5Var.u()) {
            int j10 = w5Var.j();
            int q6 = w5Var.q();
            if (j10 < 0) {
                return -1;
            }
            int[] iArr = w5Var.e;
            if (scrollX < iArr[j10] || scrollX >= iArr[q6 + 1]) {
                return -1;
            }
            return j10;
        }
        TL_iv.pageTableCell a10 = w5Var.a();
        if (a10 == null || (a2 = w5Var.a.a(a10)) < 0) {
            return -1;
        }
        int i13 = a10.colspan;
        int i14 = i13 != 0 ? i13 : 1;
        int[] iArr2 = w5Var.e;
        int i15 = iArr2[a2];
        int i16 = iArr2[Math.min(i14 + a2, w5Var.a.c)];
        if (scrollX < i15 || scrollX >= i16) {
            return -1;
        }
        return a2;
    }

    public final x5 o(h1 h1Var) {
        for (ViewParent parent = h1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof x5) {
                return (x5) parent;
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
        int d = u8.d(this.a);
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
            i18 = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(i14, 1, 16, 10));
        }
        int i19 = i15 - i16;
        int i20 = measuredHeight + i18;
        h1Var.layout(AndroidUtilities.dp(16.0f) + i17, i18, org.telegram.messenger.g0.b(16.0f, i19, AndroidUtilities.dp(16.0f) + i17), i20);
        int dp = AndroidUtilities.dp(9.0f) + i20;
        b4 b4Var = this.s;
        b4Var.layout(i17, dp, i19, b4Var.getMeasuredHeight() + dp);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        int max = Math.max(0, (size - this.c) - u8.d(this.a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (AndroidUtilities.dp(16.0f) * 2)), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        h1 h1Var = this.r;
        h1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = h1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        b4 b4Var = this.s;
        b4Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.a;
        int dp = (aVar != null && (i12 = aVar.l) > 0) ? AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(i12, 1, 16, 10)) : 0;
        a aVar2 = this.a;
        if (aVar2 != null && (i13 = aVar2.m) > 0) {
            i14 = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(i13, 1, 16, 10));
        }
        setMeasuredDimension(size, b4Var.getMeasuredHeight() + AndroidUtilities.dp(9.0f) + i14 + dp + measuredHeight);
    }

    public final int p(int i10, int i11) {
        int b10;
        if (this.F == null) {
            return -1;
        }
        b4 b4Var = this.s;
        int left = i10 - b4Var.getLeft();
        t5 t5Var = this.w;
        int left2 = left - t5Var.getLeft();
        w5 w5Var = this.v;
        int scrollX = b4Var.getScrollX() + (left2 - w5Var.getLeft());
        int top = ((i11 - b4Var.getTop()) - t5Var.getTop()) - w5Var.getTop();
        if (w5Var.a == null || scrollX < (w5Var.e[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) || scrollX >= w5Var.e[0]) {
            return -1;
        }
        if (w5Var.v()) {
            int k10 = w5Var.k();
            int r10 = w5Var.r();
            if (k10 < 0) {
                return -1;
            }
            int[] iArr = w5Var.f;
            if (top < iArr[k10] || top >= iArr[r10 + 1]) {
                return -1;
            }
            return k10;
        }
        TL_iv.pageTableCell a2 = w5Var.a();
        if (a2 == null || (b10 = w5Var.a.b(a2)) < 0) {
            return -1;
        }
        int i12 = a2.rowspan;
        int i13 = i12 != 0 ? i12 : 1;
        int[] iArr2 = w5Var.f;
        int i14 = iArr2[b10];
        int i15 = iArr2[Math.min(i13 + b10, w5Var.a.b)];
        if (top < i14 || top >= i15) {
            return -1;
        }
        return b10;
    }

    public final void q(int i10, int i11) {
        int i12;
        m6 m6Var = this.F;
        if (m6Var == null || (i12 = m6Var.b) == 0 || m6Var.c == 0) {
            return;
        }
        TL_iv.pageTableCell pagetablecell = this.F.d[Math.max(0, Math.min(i10, i12 - 1))][Math.max(0, Math.min(i11, this.F.c - 1))];
        if (pagetablecell == null) {
            return;
        }
        post(new v2(4, this, pagetablecell));
    }

    public final boolean r() {
        m6 m6Var = this.F;
        if (m6Var == null || m6Var.g.isEmpty()) {
            return false;
        }
        x5 m10 = this.v.m((TL_iv.pageTableCell) this.F.g.get(0));
        if (m10 == null) {
            return false;
        }
        h1 h1Var = m10.a;
        h1Var.r();
        h1Var.setSelection(0);
        return true;
    }

    public final boolean s(x5 x5Var, boolean z10) {
        int indexOf;
        m6 m6Var = this.F;
        if (m6Var == null || (indexOf = m6Var.g.indexOf(x5Var.b)) < 0) {
            return false;
        }
        int i10 = z10 ? indexOf - 1 : indexOf + 1;
        if (i10 < 0 || i10 >= this.F.g.size()) {
            return false;
        }
        x5 m10 = this.v.m((TL_iv.pageTableCell) this.F.g.get(i10));
        if (m10 == null) {
            return false;
        }
        h1 h1Var = m10.a;
        h1Var.r();
        h1Var.setSelection(h1Var.length());
        return true;
    }

    public void setCellSelectionListener(r5 r5Var) {
        this.I = r5Var;
    }

    public void setLocked(boolean z10) {
        this.r.setLocked(z10);
        int i10 = 0;
        while (true) {
            w5 w5Var = this.v;
            if (i10 >= w5Var.getChildCount()) {
                return;
            }
            View childAt = w5Var.getChildAt(i10);
            if (childAt instanceof x5) {
                ((x5) childAt).setLocked(z10);
            }
            i10++;
        }
    }

    public final void t() {
        x();
        r5 r5Var = this.I;
        if (r5Var != null) {
            x3 x3Var = ((t2) r5Var).a;
            if (this != x3Var.g4) {
                return;
            }
            if (this.H.isEmpty()) {
                x3Var.N2();
            } else {
                if (x3Var.z3) {
                    return;
                }
                x3Var.G4(this);
            }
        }
    }

    public final void u() {
        a aVar = this.a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = k6.f(this.r.getText());
            }
        }
    }

    public final void v() {
        w5 w5Var = this.v;
        w5Var.s();
        w5Var.requestLayout();
        w5Var.invalidate();
        y();
        d3 d3Var = this.E;
        if (d3Var == null || this.a == null) {
            return;
        }
        d3Var.a();
    }

    public final void w(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i10;
        m6 m6Var = this.F;
        if (m6Var == null || pagetablecell == null) {
            return;
        }
        int b10 = m6Var.b(pagetablecell);
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
                    m6 m6Var2 = this.F;
                    TL_iv.pageTableCell pagetablecell3 = m6Var2.d[min][min2];
                    int i20 = m6Var2.e[min][min2];
                    int i21 = m6Var2.f[min][min2];
                    int min5 = Math.min(m6Var2.b - 1, (m6.o(pagetablecell3) + i20) - 1);
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
            w5 w5Var = this.v;
            if (i10 >= w5Var.getChildCount()) {
                return;
            }
            View childAt = w5Var.getChildAt(i10);
            if (childAt instanceof x5) {
                x5 x5Var = (x5) childAt;
                h1 h1Var = x5Var.a;
                h1Var.setListener(new o5(this, x5Var));
                h1Var.setDelegate(new ah.h0(23, this, x5Var));
            }
            i10++;
        }
    }
}
