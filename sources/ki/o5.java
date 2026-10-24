package ki;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.z9;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class o5 extends a0 implements org.telegram.ui.ActionBar.b6, n9 {
    public c3 E;
    public g6 F;
    public boolean G;
    public final LinkedHashSet H;
    public l5 I;
    public final i J;
    public final org.telegram.ui.ActionBar.g6 n;
    public final h1 r;
    public final a4 s;
    public final q5 v;
    public final n5 w;
    public final ArrayList x;
    public boolean y;

    public o5(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.x = new ArrayList();
        this.H = new LinkedHashSet();
        this.J = new i(this, 3);
        this.n = g6Var;
        setClipChildren(false);
        setClipToPadding(false);
        h1 h1Var = new h1(context, g6Var);
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
        h1Var.setListener(new ya.c(this, 29));
        h1Var.setDelegate(new j5.b(this, 9));
        addView(h1Var);
        a4 a4Var = new a4(this, context, 1);
        this.s = a4Var;
        a4Var.setClipChildren(false);
        a4Var.setClipToPadding(false);
        a4Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(a4Var, w7.z5.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        q5 q5Var = new q5(context, g6Var);
        this.v = q5Var;
        n5 n5Var = new n5(this, context);
        this.w = n5Var;
        n5Var.addView(q5Var);
        a4Var.addView(n5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.G6));
        hashSet.add(Integer.valueOf(k6.d6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.F == null) {
            return;
        }
        c3 c3Var = this.E;
        o9 textSelectionHelper = c3Var != null ? c3Var.a.getTextSelectionHelper() : null;
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

    @Override // ki.a0
    public final void e(int i10) {
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
            arrayList.add(new j5(this, layout2, h1Var2.getPaddingLeft() + h1Var2.getLeft(), h1Var2.getPaddingTop() + h1Var2.getTop()));
        }
        int size = this.F.g.size();
        for (int i10 = 0; i10 < size; i10++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.F.g.get(i10);
            q5 q5Var = this.v;
            r5 m10 = q5Var.m(pagetablecell);
            if (m10 != null && (layout = (h1Var = m10.a).getLayout()) != null) {
                a4 a4Var = this.s;
                int left = a4Var.getLeft();
                n5 n5Var = this.w;
                arrayList.add(new k5(layout, h1Var.getPaddingLeft() + h1Var.getLeft() + m10.getLeft() + ((q5Var.getLeft() + (n5Var.getLeft() + left)) - a4Var.getScrollX()), h1Var.getPaddingTop() + h1Var.getTop() + m10.getTop() + q5Var.getTop() + n5Var.getTop() + a4Var.getTop(), this.F.b(pagetablecell) + 10, pagetablecell));
            }
        }
    }

    public final TL_iv.pageTableCell g(int i10) {
        int i11;
        g6 g6Var = this.F;
        if (g6Var == null || i10 <= 0 || i10 - 1 >= g6Var.g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.F.g.get(i11);
    }

    public q5 getGrid() {
        return this.v;
    }

    public g6 getModel() {
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

    public final void h(boolean z10) {
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
                    i10 = Math.max(i10, g6.n(pagetablecell) + this.F.a(pagetablecell));
                }
            }
            linkedHashSet.clear();
            g6 g6Var = this.F;
            if (g6Var.b == 0 || (i11 = g6Var.c) == 0) {
                TL_iv.pageBlockTable pageblocktable = g6Var.a;
                if (pageblocktable.rows.isEmpty()) {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    ArrayList<TL_iv.pageTableCell> arrayList = new ArrayList<>();
                    pagetablerow.cells = arrayList;
                    arrayList.add(g6.f());
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
                        pagetablerow3.cells.add(g6.f());
                    }
                }
                g6Var.i();
            } else {
                int i15 = i10 < 0 ? 0 : i10;
                if (i15 <= i11) {
                    i11 = i15;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[g6Var.b];
                ArrayList arrayList3 = g6Var.g;
                int size2 = arrayList3.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj = arrayList3.get(i16);
                    i16++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = g6Var.b(pagetablecell2);
                    int a2 = g6Var.a(pagetablecell2);
                    int o10 = g6.o(pagetablecell2);
                    int i17 = pagetablecell2.colspan;
                    if (i17 == 0) {
                        i17 = 1;
                    }
                    int i18 = a2 >= i11 ? a2 + 1 : a2;
                    if (a2 < i11 && a2 + i17 > i11) {
                        i17++;
                        for (int i19 = b10; i19 < b10 + o10 && i19 < g6Var.b; i19++) {
                            zArr[i19] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{b10, i18, o10, i17});
                }
                int i20 = 1;
                int i21 = 0;
                while (true) {
                    i12 = g6Var.b;
                    if (i21 >= i12) {
                        break;
                    }
                    if (zArr[i21]) {
                        i13 = i20;
                    } else {
                        i13 = i20;
                        identityHashMap.put(g6.f(), new int[]{i21, i11, i13, i13});
                    }
                    i21++;
                    i20 = i13;
                }
                g6Var.j(identityHashMap, i12);
                g6Var.i();
            }
            u();
            p(0, i10);
            s();
        }
    }

    public final void i(boolean z10) {
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
                    i10 = Math.max(i10, g6.o(pagetablecell) + this.F.b(pagetablecell));
                }
            }
            linkedHashSet.clear();
            g6 g6Var = this.F;
            int i12 = g6Var.b;
            if (i12 == 0 || g6Var.c == 0) {
                TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                pagetablerow.cells = new ArrayList<>();
                int max = Math.max(g6Var.c, 1);
                for (int i13 = 0; i13 < max; i13++) {
                    pagetablerow.cells.add(g6.f());
                }
                g6Var.a.rows.add(pagetablerow);
                g6Var.i();
            } else {
                int i14 = i10 < 0 ? 0 : i10;
                if (i14 <= i12) {
                    i12 = i14;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[g6Var.c];
                ArrayList arrayList = g6Var.g;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = g6Var.b(pagetablecell2);
                    int a2 = g6Var.a(pagetablecell2);
                    int o10 = g6.o(pagetablecell2);
                    int i16 = pagetablecell2.colspan;
                    if (i16 == 0) {
                        i16 = 1;
                    }
                    int i17 = b10 >= i12 ? b10 + 1 : b10;
                    if (b10 < i12 && b10 + o10 > i12) {
                        o10++;
                        for (int i18 = a2; i18 < a2 + i16 && i18 < g6Var.c; i18++) {
                            zArr[i18] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{i17, a2, o10, i16});
                }
                int i19 = 1;
                int i20 = 0;
                while (i20 < g6Var.c) {
                    if (zArr[i20]) {
                        i11 = i19;
                    } else {
                        i11 = i19;
                        identityHashMap.put(g6.f(), new int[]{i12, i20, i11, i11});
                    }
                    i20++;
                    i19 = i11;
                }
                g6Var.j(identityHashMap, g6Var.b + i19);
                g6Var.i();
            }
            u();
            p(i10, 0);
            s();
        }
    }

    @Override // android.view.View, org.telegram.ui.Cells.w9
    public final void invalidate() {
        super.invalidate();
        q5 q5Var = this.v;
        if (q5Var != null) {
            q5Var.invalidate();
        }
    }

    public final int j(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        g6 g6Var = this.F;
        if (g6Var != null && (indexOf = g6Var.g.indexOf(pagetablecell)) >= 0) {
            return indexOf + 1;
        }
        return -1;
    }

    public final h1 k(int i10) {
        r5 m10;
        if (i10 == 0) {
            return this.r;
        }
        TL_iv.pageTableCell g10 = g(i10);
        if (g10 == null || (m10 = this.v.m(g10)) == null) {
            return null;
        }
        return m10.a;
    }

    public final TL_iv.pageTableCell l(int i10, int i11) {
        if (this.F == null) {
            return null;
        }
        a4 a4Var = this.s;
        int left = i10 - a4Var.getLeft();
        n5 n5Var = this.w;
        int left2 = left - n5Var.getLeft();
        q5 q5Var = this.v;
        int scrollX = a4Var.getScrollX() + (left2 - q5Var.getLeft());
        int top = ((i11 - a4Var.getTop()) - n5Var.getTop()) - q5Var.getTop();
        for (int i12 = 0; i12 < q5Var.getChildCount(); i12++) {
            View childAt = q5Var.getChildAt(i12);
            if (childAt instanceof r5) {
                r5 r5Var = (r5) childAt;
                if (scrollX >= r5Var.getLeft() && scrollX < r5Var.getRight() && top >= r5Var.getTop() && top < r5Var.getBottom()) {
                    return r5Var.b;
                }
            }
        }
        return null;
    }

    public final int m(int i10, int i11) {
        int i12;
        int a2;
        if (this.F == null) {
            return -1;
        }
        a4 a4Var = this.s;
        int left = i10 - a4Var.getLeft();
        n5 n5Var = this.w;
        int left2 = left - n5Var.getLeft();
        q5 q5Var = this.v;
        int scrollX = a4Var.getScrollX() + (left2 - q5Var.getLeft());
        int top = ((i11 - a4Var.getTop()) - n5Var.getTop()) - q5Var.getTop();
        g6 g6Var = q5Var.a;
        if (g6Var == null || top < (i12 = q5Var.f[g6Var.b])) {
            return -1;
        }
        if (top >= AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f) + i12) {
            return -1;
        }
        if (q5Var.u()) {
            int j10 = q5Var.j();
            int q6 = q5Var.q();
            if (j10 < 0) {
                return -1;
            }
            int[] iArr = q5Var.e;
            if (scrollX < iArr[j10] || scrollX >= iArr[q6 + 1]) {
                return -1;
            }
            return j10;
        }
        TL_iv.pageTableCell a10 = q5Var.a();
        if (a10 == null || (a2 = q5Var.a.a(a10)) < 0) {
            return -1;
        }
        int i13 = a10.colspan;
        int i14 = i13 != 0 ? i13 : 1;
        int[] iArr2 = q5Var.e;
        int i15 = iArr2[a2];
        int i16 = iArr2[Math.min(i14 + a2, q5Var.a.c)];
        if (scrollX < i15 || scrollX >= i16) {
            return -1;
        }
        return a2;
    }

    public final r5 n(h1 h1Var) {
        for (ViewParent parent = h1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof r5) {
                return (r5) parent;
            }
            if (parent == this) {
                return null;
            }
        }
        return null;
    }

    public final int o(int i10, int i11) {
        int b10;
        if (this.F == null) {
            return -1;
        }
        a4 a4Var = this.s;
        int left = i10 - a4Var.getLeft();
        n5 n5Var = this.w;
        int left2 = left - n5Var.getLeft();
        q5 q5Var = this.v;
        int scrollX = a4Var.getScrollX() + (left2 - q5Var.getLeft());
        int top = ((i11 - a4Var.getTop()) - n5Var.getTop()) - q5Var.getTop();
        if (q5Var.a == null || scrollX < (q5Var.e[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) || scrollX >= q5Var.e[0]) {
            return -1;
        }
        if (q5Var.v()) {
            int k10 = q5Var.k();
            int r10 = q5Var.r();
            if (k10 < 0) {
                return -1;
            }
            int[] iArr = q5Var.f;
            if (top < iArr[k10] || top >= iArr[r10 + 1]) {
                return -1;
            }
            return k10;
        }
        TL_iv.pageTableCell a2 = q5Var.a();
        if (a2 == null || (b10 = q5Var.a.b(a2)) < 0) {
            return -1;
        }
        int i12 = a2.rowspan;
        int i13 = i12 != 0 ? i12 : 1;
        int[] iArr2 = q5Var.f;
        int i14 = iArr2[b10];
        int i15 = iArr2[Math.min(i13 + b10, q5Var.a.b)];
        if (top < i14 || top >= i15) {
            return -1;
        }
        return b10;
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
        int d = w7.i.d(this.a);
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
        h1Var.layout(AndroidUtilities.dp(16.0f) + i17, i18, i2.o1.g(16.0f, i19, AndroidUtilities.dp(16.0f) + i17), i20);
        int dp = AndroidUtilities.dp(9.0f) + i20;
        a4 a4Var = this.s;
        a4Var.layout(i17, dp, i19, a4Var.getMeasuredHeight() + dp);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        int max = Math.max(0, (size - this.c) - w7.i.d(this.a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (AndroidUtilities.dp(16.0f) * 2)), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        h1 h1Var = this.r;
        h1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = h1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        a4 a4Var = this.s;
        a4Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.a;
        int dp = (aVar != null && (i12 = aVar.l) > 0) ? AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(i12, 1, 16, 10)) : 0;
        a aVar2 = this.a;
        if (aVar2 != null && (i13 = aVar2.m) > 0) {
            i14 = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(i13, 1, 16, 10));
        }
        setMeasuredDimension(size, a4Var.getMeasuredHeight() + AndroidUtilities.dp(9.0f) + i14 + dp + measuredHeight);
    }

    public final void p(int i10, int i11) {
        int i12;
        g6 g6Var = this.F;
        if (g6Var == null || (i12 = g6Var.b) == 0 || g6Var.c == 0) {
            return;
        }
        TL_iv.pageTableCell pagetablecell = this.F.d[Math.max(0, Math.min(i10, i12 - 1))][Math.max(0, Math.min(i11, this.F.c - 1))];
        if (pagetablecell == null) {
            return;
        }
        post(new hi.t(27, this, pagetablecell));
    }

    public final boolean q() {
        g6 g6Var = this.F;
        if (g6Var == null || g6Var.g.isEmpty()) {
            return false;
        }
        r5 m10 = this.v.m((TL_iv.pageTableCell) this.F.g.get(0));
        if (m10 == null) {
            return false;
        }
        h1 h1Var = m10.a;
        h1Var.r();
        h1Var.setSelection(0);
        return true;
    }

    public final boolean r(r5 r5Var, boolean z10) {
        int indexOf;
        g6 g6Var = this.F;
        if (g6Var == null || (indexOf = g6Var.g.indexOf(r5Var.b)) < 0) {
            return false;
        }
        int i10 = z10 ? indexOf - 1 : indexOf + 1;
        if (i10 < 0 || i10 >= this.F.g.size()) {
            return false;
        }
        r5 m10 = this.v.m((TL_iv.pageTableCell) this.F.g.get(i10));
        if (m10 == null) {
            return false;
        }
        h1 h1Var = m10.a;
        h1Var.r();
        h1Var.setSelection(h1Var.length());
        return true;
    }

    public final void s() {
        w();
        l5 l5Var = this.I;
        if (l5Var != null) {
            w3 w3Var = ((t2) l5Var).a;
            if (this != w3Var.j4) {
                return;
            }
            if (this.H.isEmpty()) {
                w3Var.S2();
            } else {
                if (w3Var.C3) {
                    return;
                }
                w3Var.L4(this);
            }
        }
    }

    public void setCellSelectionListener(l5 l5Var) {
        this.I = l5Var;
    }

    public void setLocked(boolean z10) {
        this.r.setLocked(z10);
        int i10 = 0;
        while (true) {
            q5 q5Var = this.v;
            if (i10 >= q5Var.getChildCount()) {
                return;
            }
            View childAt = q5Var.getChildAt(i10);
            if (childAt instanceof r5) {
                ((r5) childAt).setLocked(z10);
            }
            i10++;
        }
    }

    public final void t() {
        a aVar = this.a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = e6.f(this.r.getText());
            }
        }
    }

    public final void u() {
        q5 q5Var = this.v;
        q5Var.s();
        q5Var.requestLayout();
        q5Var.invalidate();
        x();
        c3 c3Var = this.E;
        if (c3Var == null || this.a == null) {
            return;
        }
        c3Var.a();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        q5 q5Var;
        h1 h1Var = this.r;
        h1Var.updateColors();
        int i10 = k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.n;
        int w02 = k6.w0(i10, g6Var);
        h1Var.setTextColor(w02);
        h1Var.setHintTextColor(k6.o1(0.35f, w02));
        int i11 = 0;
        while (true) {
            q5Var = this.v;
            if (i11 >= q5Var.getChildCount()) {
                break;
            }
            View childAt = q5Var.getChildAt(i11);
            if (childAt instanceof r5) {
                ((r5) childAt).a.updateColors();
            }
            i11++;
        }
        q5Var.b();
        try {
            if (getBackground() instanceof a2) {
                ((a2) getBackground()).a(k6.w0(k6.d6, g6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void v(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i10;
        g6 g6Var = this.F;
        if (g6Var == null || pagetablecell == null) {
            return;
        }
        int b10 = g6Var.b(pagetablecell);
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
                    g6 g6Var2 = this.F;
                    TL_iv.pageTableCell pagetablecell3 = g6Var2.d[min][min2];
                    int i20 = g6Var2.e[min][min2];
                    int i21 = g6Var2.f[min][min2];
                    int min5 = Math.min(g6Var2.b - 1, (g6.o(pagetablecell3) + i20) - 1);
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
        s();
    }

    public final void w() {
        setTranslationZ((!this.H.isEmpty() || this.v.hasFocus()) ? AndroidUtilities.dp(1.0f) : 0.0f);
        invalidate();
        this.s.invalidate();
        Object parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }

    public final void x() {
        int i10 = 0;
        while (true) {
            q5 q5Var = this.v;
            if (i10 >= q5Var.getChildCount()) {
                return;
            }
            View childAt = q5Var.getChildAt(i10);
            if (childAt instanceof r5) {
                r5 r5Var = (r5) childAt;
                h1 h1Var = r5Var.a;
                h1Var.setListener(new i5(this, r5Var));
                h1Var.setDelegate(new ah.h0(25, this, r5Var));
            }
            i10++;
        }
    }
}
