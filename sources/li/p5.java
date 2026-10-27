package li;

import a8.zd;
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
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class p5 extends z implements p6, r9 {
    public b3 E;
    public h6 F;
    public boolean G;
    public final LinkedHashSet H;
    public m5 I;
    public final i J;
    public final u6 n;
    public final g1 r;
    public final z3 s;
    public final r5 v;
    public final o5 w;
    public final ArrayList x;
    public boolean y;

    public p5(Context context, u6 u6Var) {
        super(context);
        this.x = new ArrayList();
        this.H = new LinkedHashSet();
        this.J = new i(this, 3);
        this.n = u6Var;
        setClipChildren(false);
        setClipToPadding(false);
        g1 g1Var = new g1(context, u6Var);
        this.r = g1Var;
        g1Var.setAllowNewlines(false);
        g1Var.setInputType(147457);
        g1Var.setGravity(49);
        g1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        g1Var.setIncludeFontPadding(false);
        g1Var.setMinHeight(0);
        g1Var.setBackground(null);
        g1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), 0);
        g1Var.setHint(LocaleController.getString(R.string.ArticleTableTitleHint));
        g1Var.setCenterEmptyHint(true);
        g1Var.setListener(new h5(this));
        g1Var.setDelegate(new jg.e1(this, 13));
        addView(g1Var);
        z3 z3Var = new z3(this, context, 1);
        this.s = z3Var;
        z3Var.setClipChildren(false);
        z3Var.setClipToPadding(false);
        z3Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(z3Var, kb1.h(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        r5 r5Var = new r5(context, u6Var);
        this.v = r5Var;
        o5 o5Var = new o5(this, context);
        this.w = o5Var;
        o5Var.addView(r5Var);
        z3Var.addView(o5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.G6));
        hashSet.add(Integer.valueOf(y6.d6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.F == null) {
            return;
        }
        b3 b3Var = this.E;
        s9 textSelectionHelper = b3Var != null ? b3Var.a.getTextSelectionHelper() : null;
        if (textSelectionHelper == null) {
            return;
        }
        ArrayList arrayList = this.x;
        arrayList.clear();
        fillTextLayoutBlocks(arrayList);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            da daVar = (da) arrayList.get(i10);
            canvas.save();
            canvas.translate(daVar.getX(), daVar.getY());
            textSelectionHelper.Z(canvas, this, i10);
            canvas.restore();
        }
    }

    @Override // li.z
    public final void e(int i10) {
        requestLayout();
    }

    @Override // org.telegram.ui.Cells.r9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        g1 g1Var;
        Layout layout;
        if (this.F == null) {
            return;
        }
        g1 g1Var2 = this.r;
        Layout layout2 = g1Var2.getLayout();
        if (layout2 != null) {
            arrayList.add(new k5(this, layout2, g1Var2.getPaddingLeft() + g1Var2.getLeft(), g1Var2.getPaddingTop() + g1Var2.getTop()));
        }
        int size = this.F.g.size();
        for (int i10 = 0; i10 < size; i10++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.F.g.get(i10);
            r5 r5Var = this.v;
            s5 m10 = r5Var.m(pagetablecell);
            if (m10 != null && (layout = (g1Var = m10.a).getLayout()) != null) {
                z3 z3Var = this.s;
                int left = z3Var.getLeft();
                o5 o5Var = this.w;
                arrayList.add(new l5(layout, g1Var.getPaddingLeft() + g1Var.getLeft() + m10.getLeft() + ((r5Var.getLeft() + (o5Var.getLeft() + left)) - z3Var.getScrollX()), g1Var.getPaddingTop() + g1Var.getTop() + m10.getTop() + r5Var.getTop() + o5Var.getTop() + z3Var.getTop(), this.F.b(pagetablecell) + 10, pagetablecell));
            }
        }
    }

    public final TL_iv.pageTableCell g(int i10) {
        int i11;
        h6 h6Var = this.F;
        if (h6Var == null || i10 <= 0 || i10 - 1 >= h6Var.g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.F.g.get(i11);
    }

    public r5 getGrid() {
        return this.v;
    }

    public h6 getModel() {
        return this.F;
    }

    public a getRow() {
        return this.a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.H;
    }

    public g1 getTitleEditText() {
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
                    i10 = Math.max(i10, h6.n(pagetablecell) + this.F.a(pagetablecell));
                }
            }
            linkedHashSet.clear();
            h6 h6Var = this.F;
            if (h6Var.b == 0 || (i11 = h6Var.c) == 0) {
                TL_iv.pageBlockTable pageblocktable = h6Var.a;
                if (pageblocktable.rows.isEmpty()) {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    ArrayList<TL_iv.pageTableCell> arrayList = new ArrayList<>();
                    pagetablerow.cells = arrayList;
                    arrayList.add(h6.f());
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
                        pagetablerow3.cells.add(h6.f());
                    }
                }
                h6Var.i();
            } else {
                int i15 = i10 < 0 ? 0 : i10;
                if (i15 <= i11) {
                    i11 = i15;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[h6Var.b];
                ArrayList arrayList3 = h6Var.g;
                int size2 = arrayList3.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj = arrayList3.get(i16);
                    i16++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = h6Var.b(pagetablecell2);
                    int a2 = h6Var.a(pagetablecell2);
                    int o10 = h6.o(pagetablecell2);
                    int i17 = pagetablecell2.colspan;
                    if (i17 == 0) {
                        i17 = 1;
                    }
                    int i18 = a2 >= i11 ? a2 + 1 : a2;
                    if (a2 < i11 && a2 + i17 > i11) {
                        i17++;
                        for (int i19 = b10; i19 < b10 + o10 && i19 < h6Var.b; i19++) {
                            zArr[i19] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{b10, i18, o10, i17});
                }
                int i20 = 1;
                int i21 = 0;
                while (true) {
                    i12 = h6Var.b;
                    if (i21 >= i12) {
                        break;
                    }
                    if (zArr[i21]) {
                        i13 = i20;
                    } else {
                        i13 = i20;
                        identityHashMap.put(h6.f(), new int[]{i21, i11, i13, i13});
                    }
                    i21++;
                    i20 = i13;
                }
                h6Var.j(identityHashMap, i12);
                h6Var.i();
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
                    i10 = Math.max(i10, h6.o(pagetablecell) + this.F.b(pagetablecell));
                }
            }
            linkedHashSet.clear();
            h6 h6Var = this.F;
            int i12 = h6Var.b;
            if (i12 == 0 || h6Var.c == 0) {
                TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                pagetablerow.cells = new ArrayList<>();
                int max = Math.max(h6Var.c, 1);
                for (int i13 = 0; i13 < max; i13++) {
                    pagetablerow.cells.add(h6.f());
                }
                h6Var.a.rows.add(pagetablerow);
                h6Var.i();
            } else {
                int i14 = i10 < 0 ? 0 : i10;
                if (i14 <= i12) {
                    i12 = i14;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[h6Var.c];
                ArrayList arrayList = h6Var.g;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = h6Var.b(pagetablecell2);
                    int a2 = h6Var.a(pagetablecell2);
                    int o10 = h6.o(pagetablecell2);
                    int i16 = pagetablecell2.colspan;
                    if (i16 == 0) {
                        i16 = 1;
                    }
                    int i17 = b10 >= i12 ? b10 + 1 : b10;
                    if (b10 < i12 && b10 + o10 > i12) {
                        o10++;
                        for (int i18 = a2; i18 < a2 + i16 && i18 < h6Var.c; i18++) {
                            zArr[i18] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{i17, a2, o10, i16});
                }
                int i19 = 1;
                int i20 = 0;
                while (i20 < h6Var.c) {
                    if (zArr[i20]) {
                        i11 = i19;
                    } else {
                        i11 = i19;
                        identityHashMap.put(h6.f(), new int[]{i12, i20, i11, i11});
                    }
                    i20++;
                    i19 = i11;
                }
                h6Var.j(identityHashMap, h6Var.b + i19);
                h6Var.i();
            }
            u();
            p(i10, 0);
            s();
        }
    }

    @Override // android.view.View, org.telegram.ui.Cells.aa
    public final void invalidate() {
        super.invalidate();
        r5 r5Var = this.v;
        if (r5Var != null) {
            r5Var.invalidate();
        }
    }

    public final int j(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        h6 h6Var = this.F;
        if (h6Var != null && (indexOf = h6Var.g.indexOf(pagetablecell)) >= 0) {
            return indexOf + 1;
        }
        return -1;
    }

    public final g1 k(int i10) {
        s5 m10;
        if (i10 == 0) {
            return this.r;
        }
        TL_iv.pageTableCell g7 = g(i10);
        if (g7 == null || (m10 = this.v.m(g7)) == null) {
            return null;
        }
        return m10.a;
    }

    public final TL_iv.pageTableCell l(int i10, int i11) {
        if (this.F == null) {
            return null;
        }
        z3 z3Var = this.s;
        int left = i10 - z3Var.getLeft();
        o5 o5Var = this.w;
        int left2 = left - o5Var.getLeft();
        r5 r5Var = this.v;
        int scrollX = z3Var.getScrollX() + (left2 - r5Var.getLeft());
        int top = ((i11 - z3Var.getTop()) - o5Var.getTop()) - r5Var.getTop();
        for (int i12 = 0; i12 < r5Var.getChildCount(); i12++) {
            View childAt = r5Var.getChildAt(i12);
            if (childAt instanceof s5) {
                s5 s5Var = (s5) childAt;
                if (scrollX >= s5Var.getLeft() && scrollX < s5Var.getRight() && top >= s5Var.getTop() && top < s5Var.getBottom()) {
                    return s5Var.b;
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
        z3 z3Var = this.s;
        int left = i10 - z3Var.getLeft();
        o5 o5Var = this.w;
        int left2 = left - o5Var.getLeft();
        r5 r5Var = this.v;
        int scrollX = z3Var.getScrollX() + (left2 - r5Var.getLeft());
        int top = ((i11 - z3Var.getTop()) - o5Var.getTop()) - r5Var.getTop();
        h6 h6Var = r5Var.a;
        if (h6Var == null || top < (i12 = r5Var.f[h6Var.b])) {
            return -1;
        }
        if (top >= AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f) + i12) {
            return -1;
        }
        if (r5Var.u()) {
            int j10 = r5Var.j();
            int q5 = r5Var.q();
            if (j10 < 0) {
                return -1;
            }
            int[] iArr = r5Var.e;
            if (scrollX < iArr[j10] || scrollX >= iArr[q5 + 1]) {
                return -1;
            }
            return j10;
        }
        TL_iv.pageTableCell a10 = r5Var.a();
        if (a10 == null || (a2 = r5Var.a.a(a10)) < 0) {
            return -1;
        }
        int i13 = a10.colspan;
        int i14 = i13 != 0 ? i13 : 1;
        int[] iArr2 = r5Var.e;
        int i15 = iArr2[a2];
        int i16 = iArr2[Math.min(i14 + a2, r5Var.a.c)];
        if (scrollX < i15 || scrollX >= i16) {
            return -1;
        }
        return a2;
    }

    public final s5 n(g1 g1Var) {
        for (ViewParent parent = g1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof s5) {
                return (s5) parent;
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
        z3 z3Var = this.s;
        int left = i10 - z3Var.getLeft();
        o5 o5Var = this.w;
        int left2 = left - o5Var.getLeft();
        r5 r5Var = this.v;
        int scrollX = z3Var.getScrollX() + (left2 - r5Var.getLeft());
        int top = ((i11 - z3Var.getTop()) - o5Var.getTop()) - r5Var.getTop();
        if (r5Var.a == null || scrollX < (r5Var.e[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) || scrollX >= r5Var.e[0]) {
            return -1;
        }
        if (r5Var.v()) {
            int k10 = r5Var.k();
            int r6 = r5Var.r();
            if (k10 < 0) {
                return -1;
            }
            int[] iArr = r5Var.f;
            if (top < iArr[k10] || top >= iArr[r6 + 1]) {
                return -1;
            }
            return k10;
        }
        TL_iv.pageTableCell a2 = r5Var.a();
        if (a2 == null || (b10 = r5Var.a.b(a2)) < 0) {
            return -1;
        }
        int i12 = a2.rowspan;
        int i13 = i12 != 0 ? i12 : 1;
        int[] iArr2 = r5Var.f;
        int i14 = iArr2[b10];
        int i15 = iArr2[Math.min(i13 + b10, r5Var.a.b)];
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
        int d = zd.d(this.a);
        boolean z11 = this.y;
        int i17 = z11 ? d : i16;
        if (!z11) {
            i16 = d;
        }
        g1 g1Var = this.r;
        int measuredHeight = g1Var.getMeasuredHeight();
        a aVar = this.a;
        int i18 = 0;
        if (aVar != null && (i14 = aVar.l) > 0) {
            i18 = AndroidUtilities.dp(c3.h0.w(i14, 1, 16, 10));
        }
        int i19 = i15 - i16;
        int i20 = measuredHeight + i18;
        g1Var.layout(AndroidUtilities.dp(16.0f) + i17, i18, org.telegram.messenger.t.c(16.0f, i19, AndroidUtilities.dp(16.0f) + i17), i20);
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
        int max = Math.max(0, (size - this.c) - zd.d(this.a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (AndroidUtilities.dp(16.0f) * 2)), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        g1 g1Var = this.r;
        g1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = g1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        z3 z3Var = this.s;
        z3Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.a;
        int dp = (aVar != null && (i12 = aVar.l) > 0) ? AndroidUtilities.dp(c3.h0.w(i12, 1, 16, 10)) : 0;
        a aVar2 = this.a;
        if (aVar2 != null && (i13 = aVar2.m) > 0) {
            i14 = AndroidUtilities.dp(c3.h0.w(i13, 1, 16, 10));
        }
        setMeasuredDimension(size, z3Var.getMeasuredHeight() + AndroidUtilities.dp(9.0f) + i14 + dp + measuredHeight);
    }

    public final void p(int i10, int i11) {
        int i12;
        h6 h6Var = this.F;
        if (h6Var == null || (i12 = h6Var.b) == 0 || h6Var.c == 0) {
            return;
        }
        TL_iv.pageTableCell pagetablecell = this.F.d[Math.max(0, Math.min(i10, i12 - 1))][Math.max(0, Math.min(i11, this.F.c - 1))];
        if (pagetablecell == null) {
            return;
        }
        post(new k2.e0(9, this, pagetablecell));
    }

    public final boolean q() {
        h6 h6Var = this.F;
        if (h6Var == null || h6Var.g.isEmpty()) {
            return false;
        }
        s5 m10 = this.v.m((TL_iv.pageTableCell) this.F.g.get(0));
        if (m10 == null) {
            return false;
        }
        g1 g1Var = m10.a;
        g1Var.r();
        g1Var.setSelection(0);
        return true;
    }

    public final boolean r(s5 s5Var, boolean z10) {
        int indexOf;
        h6 h6Var = this.F;
        if (h6Var == null || (indexOf = h6Var.g.indexOf(s5Var.b)) < 0) {
            return false;
        }
        int i10 = z10 ? indexOf - 1 : indexOf + 1;
        if (i10 < 0 || i10 >= this.F.g.size()) {
            return false;
        }
        s5 m10 = this.v.m((TL_iv.pageTableCell) this.F.g.get(i10));
        if (m10 == null) {
            return false;
        }
        g1 g1Var = m10.a;
        g1Var.r();
        g1Var.setSelection(g1Var.length());
        return true;
    }

    public final void s() {
        w();
        m5 m5Var = this.I;
        if (m5Var != null) {
            v3 v3Var = ((r2) m5Var).a;
            if (this != v3Var.q4) {
                return;
            }
            if (this.H.isEmpty()) {
                v3Var.S2();
            } else {
                if (v3Var.J3) {
                    return;
                }
                v3Var.L4(this);
            }
        }
    }

    public void setCellSelectionListener(m5 m5Var) {
        this.I = m5Var;
    }

    public void setLocked(boolean z10) {
        this.r.setLocked(z10);
        int i10 = 0;
        while (true) {
            r5 r5Var = this.v;
            if (i10 >= r5Var.getChildCount()) {
                return;
            }
            View childAt = r5Var.getChildAt(i10);
            if (childAt instanceof s5) {
                ((s5) childAt).setLocked(z10);
            }
            i10++;
        }
    }

    public final void t() {
        a aVar = this.a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = f6.f(this.r.getText());
            }
        }
    }

    public final void u() {
        r5 r5Var = this.v;
        r5Var.s();
        r5Var.requestLayout();
        r5Var.invalidate();
        x();
        b3 b3Var = this.E;
        if (b3Var == null || this.a == null) {
            return;
        }
        b3Var.a();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        r5 r5Var;
        g1 g1Var = this.r;
        g1Var.updateColors();
        int i10 = y6.G6;
        u6 u6Var = this.n;
        int w02 = y6.w0(i10, u6Var);
        g1Var.setTextColor(w02);
        g1Var.setHintTextColor(y6.o1(0.35f, w02));
        int i11 = 0;
        while (true) {
            r5Var = this.v;
            if (i11 >= r5Var.getChildCount()) {
                break;
            }
            View childAt = r5Var.getChildAt(i11);
            if (childAt instanceof s5) {
                ((s5) childAt).a.updateColors();
            }
            i11++;
        }
        r5Var.b();
        try {
            if (getBackground() instanceof y1) {
                ((y1) getBackground()).a(y6.w0(y6.d6, u6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void v(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i10;
        h6 h6Var = this.F;
        if (h6Var == null || pagetablecell == null) {
            return;
        }
        int b10 = h6Var.b(pagetablecell);
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
                    h6 h6Var2 = this.F;
                    TL_iv.pageTableCell pagetablecell3 = h6Var2.d[min][min2];
                    int i20 = h6Var2.e[min][min2];
                    int i21 = h6Var2.f[min][min2];
                    int min5 = Math.min(h6Var2.b - 1, (h6.o(pagetablecell3) + i20) - 1);
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
            r5 r5Var = this.v;
            if (i10 >= r5Var.getChildCount()) {
                return;
            }
            View childAt = r5Var.getChildAt(i10);
            if (childAt instanceof s5) {
                s5 s5Var = (s5) childAt;
                g1 g1Var = s5Var.a;
                g1Var.setListener(new j5(this, s5Var));
                g1Var.setDelegate(new ai.f0(27, this, s5Var));
            }
            i10++;
        }
    }
}
