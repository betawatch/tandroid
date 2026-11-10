package li;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.t9;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class m5 extends y implements org.telegram.ui.ActionBar.c6, h9 {
    public boolean D;
    public a3 E;
    public e6 F;
    public boolean G;
    public final LinkedHashSet H;
    public j5 I;
    public final i J;
    public final h6 n;
    public final g1 r;
    public final x3 s;
    public final o5 w;
    public final l5 x;
    public final ArrayList y;

    public m5(Context context, h6 h6Var) {
        super(context);
        this.y = new ArrayList();
        this.H = new LinkedHashSet();
        this.J = new i(this, 3);
        this.n = h6Var;
        setClipChildren(false);
        setClipToPadding(false);
        g1 g1Var = new g1(context, h6Var);
        this.r = g1Var;
        g1Var.setAllowNewlines(false);
        g1Var.setInputType(147457);
        g1Var.setGravity(49);
        g1Var.setTextSize(1, Math.max(8, iz.W0 - 2));
        g1Var.setIncludeFontPadding(false);
        g1Var.setMinHeight(0);
        g1Var.setBackground(null);
        g1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), 0);
        g1Var.setHint(id.M0(2131753989, null));
        g1Var.setCenterEmptyHint(true);
        g1Var.setListener(new g6.d0(this, 15));
        g1Var.setDelegate(new l2.x(this, 11));
        addView(g1Var);
        x3 x3Var = new x3(this, context, 1);
        this.s = x3Var;
        x3Var.setClipChildren(false);
        x3Var.setClipToPadding(false);
        x3Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(x3Var, ha.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        o5 o5Var = new o5(context, h6Var);
        this.w = o5Var;
        l5 l5Var = new l5(this, context);
        this.x = l5Var;
        l5Var.addView(o5Var);
        x3Var.addView(l5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void A() {
        int i7 = 0;
        while (true) {
            o5 o5Var = this.w;
            if (i7 >= o5Var.getChildCount()) {
                return;
            }
            View childAt = o5Var.getChildAt(i7);
            if (childAt instanceof p5) {
                p5 p5Var = (p5) childAt;
                g1 g1Var = p5Var.a;
                g1Var.setListener(new g5(this, p5Var));
                g1Var.setDelegate(new ab.g(25, this, p5Var));
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.G6));
        hashSet.add(Integer.valueOf(m6.d6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.F == null) {
            return;
        }
        a3 a3Var = this.E;
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

    @Override // li.y
    public final void e(int i7) {
        requestLayout();
    }

    public final TL_iv.pageTableCell g(int i7) {
        int i10;
        e6 e6Var = this.F;
        if (e6Var == null || i7 <= 0 || i7 - 1 >= e6Var.g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.F.g.get(i10);
    }

    public o5 getGrid() {
        return this.w;
    }

    public e6 getModel() {
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

    public final void h(boolean z9) {
        int i7;
        int i10;
        int i11;
        int i12;
        if (this.F != null) {
            LinkedHashSet linkedHashSet = this.H;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            if (z9) {
                Iterator it = linkedHashSet.iterator();
                i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (it.hasNext()) {
                    i7 = Math.min(i7, this.F.a((TL_iv.pageTableCell) it.next()));
                }
            } else {
                Iterator it2 = linkedHashSet.iterator();
                i7 = 0;
                while (it2.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                    i7 = Math.max(i7, e6.n(pagetablecell) + this.F.a(pagetablecell));
                }
            }
            linkedHashSet.clear();
            e6 e6Var = this.F;
            if (e6Var.b == 0 || (i10 = e6Var.c) == 0) {
                TL_iv.pageBlockTable pageblocktable = e6Var.a;
                if (pageblocktable.rows.isEmpty()) {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    ArrayList<TL_iv.pageTableCell> arrayList = new ArrayList<>();
                    pagetablerow.cells = arrayList;
                    arrayList.add(e6.f());
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
                        pagetablerow3.cells.add(e6.f());
                    }
                }
                e6Var.i();
            } else {
                int i14 = i7 < 0 ? 0 : i7;
                if (i14 <= i10) {
                    i10 = i14;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[e6Var.b];
                ArrayList arrayList3 = e6Var.g;
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj = arrayList3.get(i15);
                    i15++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = e6Var.b(pagetablecell2);
                    int a10 = e6Var.a(pagetablecell2);
                    int o4 = e6.o(pagetablecell2);
                    int i16 = pagetablecell2.colspan;
                    if (i16 == 0) {
                        i16 = 1;
                    }
                    int i17 = a10 >= i10 ? a10 + 1 : a10;
                    if (a10 < i10 && a10 + i16 > i10) {
                        i16++;
                        for (int i18 = b10; i18 < b10 + o4 && i18 < e6Var.b; i18++) {
                            zArr[i18] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{b10, i17, o4, i16});
                }
                int i19 = 1;
                int i20 = 0;
                while (true) {
                    i11 = e6Var.b;
                    if (i20 >= i11) {
                        break;
                    }
                    if (zArr[i20]) {
                        i12 = i19;
                    } else {
                        i12 = i19;
                        identityHashMap.put(e6.f(), new int[]{i20, i10, i12, i12});
                    }
                    i20++;
                    i19 = i12;
                }
                e6Var.j(identityHashMap, i11);
                e6Var.i();
            }
            x();
            s(0, i7);
            v();
        }
    }

    @Override // android.view.View, org.telegram.ui.Cells.q9
    public final void invalidate() {
        super.invalidate();
        o5 o5Var = this.w;
        if (o5Var != null) {
            o5Var.invalidate();
        }
    }

    public final void j(boolean z9) {
        int i7;
        int i10;
        if (this.F != null) {
            LinkedHashSet linkedHashSet = this.H;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            if (z9) {
                Iterator it = linkedHashSet.iterator();
                i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (it.hasNext()) {
                    i7 = Math.min(i7, this.F.b((TL_iv.pageTableCell) it.next()));
                }
            } else {
                Iterator it2 = linkedHashSet.iterator();
                i7 = 0;
                while (it2.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                    i7 = Math.max(i7, e6.o(pagetablecell) + this.F.b(pagetablecell));
                }
            }
            linkedHashSet.clear();
            e6 e6Var = this.F;
            int i11 = e6Var.b;
            if (i11 == 0 || e6Var.c == 0) {
                TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                pagetablerow.cells = new ArrayList<>();
                int max = Math.max(e6Var.c, 1);
                for (int i12 = 0; i12 < max; i12++) {
                    pagetablerow.cells.add(e6.f());
                }
                e6Var.a.rows.add(pagetablerow);
                e6Var.i();
            } else {
                int i13 = i7 < 0 ? 0 : i7;
                if (i13 <= i11) {
                    i11 = i13;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[e6Var.c];
                ArrayList arrayList = e6Var.g;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = e6Var.b(pagetablecell2);
                    int a10 = e6Var.a(pagetablecell2);
                    int o4 = e6.o(pagetablecell2);
                    int i15 = pagetablecell2.colspan;
                    if (i15 == 0) {
                        i15 = 1;
                    }
                    int i16 = b10 >= i11 ? b10 + 1 : b10;
                    if (b10 < i11 && b10 + o4 > i11) {
                        o4++;
                        for (int i17 = a10; i17 < a10 + i15 && i17 < e6Var.c; i17++) {
                            zArr[i17] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{i16, a10, o4, i15});
                }
                int i18 = 1;
                int i19 = 0;
                while (i19 < e6Var.c) {
                    if (zArr[i19]) {
                        i10 = i18;
                    } else {
                        i10 = i18;
                        identityHashMap.put(e6.f(), new int[]{i11, i19, i10, i10});
                    }
                    i19++;
                    i18 = i10;
                }
                e6Var.j(identityHashMap, e6Var.b + i18);
                e6Var.i();
            }
            x();
            s(i7, 0);
            v();
        }
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        g1 g1Var;
        Layout layout;
        if (this.F == null) {
            return;
        }
        g1 g1Var2 = this.r;
        Layout layout2 = g1Var2.getLayout();
        if (layout2 != null) {
            arrayList.add(new h5(this, layout2, g1Var2.getPaddingLeft() + g1Var2.getLeft(), g1Var2.getPaddingTop() + g1Var2.getTop()));
        }
        int size = this.F.g.size();
        for (int i7 = 0; i7 < size; i7++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.F.g.get(i7);
            o5 o5Var = this.w;
            p5 m10 = o5Var.m(pagetablecell);
            if (m10 != null && (layout = (g1Var = m10.a).getLayout()) != null) {
                x3 x3Var = this.s;
                int left = x3Var.getLeft();
                l5 l5Var = this.x;
                arrayList.add(new i5(layout, g1Var.getPaddingLeft() + g1Var.getLeft() + m10.getLeft() + ((o5Var.getLeft() + (l5Var.getLeft() + left)) - x3Var.getScrollX()), g1Var.getPaddingTop() + g1Var.getTop() + m10.getTop() + o5Var.getTop() + l5Var.getTop() + x3Var.getTop(), this.F.b(pagetablecell) + 10, pagetablecell));
            }
        }
    }

    public final int l(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        e6 e6Var = this.F;
        if (e6Var != null && (indexOf = e6Var.g.indexOf(pagetablecell)) >= 0) {
            return indexOf + 1;
        }
        return -1;
    }

    public final g1 m(int i7) {
        p5 m10;
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
        if (this.F == null) {
            return null;
        }
        x3 x3Var = this.s;
        int left = i7 - x3Var.getLeft();
        l5 l5Var = this.x;
        int left2 = left - l5Var.getLeft();
        o5 o5Var = this.w;
        int scrollX = x3Var.getScrollX() + (left2 - o5Var.getLeft());
        int top = ((i10 - x3Var.getTop()) - l5Var.getTop()) - o5Var.getTop();
        for (int i11 = 0; i11 < o5Var.getChildCount(); i11++) {
            View childAt = o5Var.getChildAt(i11);
            if (childAt instanceof p5) {
                p5 p5Var = (p5) childAt;
                if (scrollX >= p5Var.getLeft() && scrollX < p5Var.getRight() && top >= p5Var.getTop() && top < p5Var.getBottom()) {
                    return p5Var.b;
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14 = i11 - i7;
        int i15 = this.c;
        int d = c8.l1.d(this.a);
        boolean z10 = this.D;
        int i16 = z10 ? d : i15;
        if (!z10) {
            i15 = d;
        }
        g1 g1Var = this.r;
        int measuredHeight = g1Var.getMeasuredHeight();
        a aVar = this.a;
        int i17 = 0;
        if (aVar != null && (i13 = aVar.l) > 0) {
            i17 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i13, 1, 16, 10));
        }
        int i18 = i14 - i15;
        int i19 = measuredHeight + i17;
        g1Var.layout(org.telegram.messenger.g0.L(16.0f) + i16, i17, jg.g.e(16.0f, i18, org.telegram.messenger.g0.L(16.0f) + i16), i19);
        int L = org.telegram.messenger.g0.L(9.0f) + i19;
        x3 x3Var = this.s;
        x3Var.layout(i16, L, i18, x3Var.getMeasuredHeight() + L);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i7);
        int i13 = 0;
        int max = Math.max(0, (size - this.c) - c8.l1.d(this.a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (org.telegram.messenger.g0.L(16.0f) * 2)), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        g1 g1Var = this.r;
        g1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = g1Var.getMeasuredHeight();
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

    public final int p(int i7, int i10) {
        int i11;
        int a10;
        if (this.F == null) {
            return -1;
        }
        x3 x3Var = this.s;
        int left = i7 - x3Var.getLeft();
        l5 l5Var = this.x;
        int left2 = left - l5Var.getLeft();
        o5 o5Var = this.w;
        int scrollX = x3Var.getScrollX() + (left2 - o5Var.getLeft());
        int top = ((i10 - x3Var.getTop()) - l5Var.getTop()) - o5Var.getTop();
        e6 e6Var = o5Var.a;
        if (e6Var == null || top < (i11 = o5Var.f[e6Var.b])) {
            return -1;
        }
        if (top >= org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(16.0f) + i11) {
            return -1;
        }
        if (o5Var.u()) {
            int j3 = o5Var.j();
            int q10 = o5Var.q();
            if (j3 < 0) {
                return -1;
            }
            int[] iArr = o5Var.e;
            if (scrollX < iArr[j3] || scrollX >= iArr[q10 + 1]) {
                return -1;
            }
            return j3;
        }
        TL_iv.pageTableCell a11 = o5Var.a();
        if (a11 == null || (a10 = o5Var.a.a(a11)) < 0) {
            return -1;
        }
        int i12 = a11.colspan;
        int i13 = i12 != 0 ? i12 : 1;
        int[] iArr2 = o5Var.e;
        int i14 = iArr2[a10];
        int i15 = iArr2[Math.min(i13 + a10, o5Var.a.c)];
        if (scrollX < i14 || scrollX >= i15) {
            return -1;
        }
        return a10;
    }

    public final p5 q(g1 g1Var) {
        for (ViewParent parent = g1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof p5) {
                return (p5) parent;
            }
            if (parent == this) {
                return null;
            }
        }
        return null;
    }

    public final int r(int i7, int i10) {
        int b10;
        if (this.F == null) {
            return -1;
        }
        x3 x3Var = this.s;
        int left = i7 - x3Var.getLeft();
        l5 l5Var = this.x;
        int left2 = left - l5Var.getLeft();
        o5 o5Var = this.w;
        int scrollX = x3Var.getScrollX() + (left2 - o5Var.getLeft());
        int top = ((i10 - x3Var.getTop()) - l5Var.getTop()) - o5Var.getTop();
        if (o5Var.a == null || scrollX < (o5Var.e[0] - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(4.0f) || scrollX >= o5Var.e[0]) {
            return -1;
        }
        if (o5Var.v()) {
            int k10 = o5Var.k();
            int r10 = o5Var.r();
            if (k10 < 0) {
                return -1;
            }
            int[] iArr = o5Var.f;
            if (top < iArr[k10] || top >= iArr[r10 + 1]) {
                return -1;
            }
            return k10;
        }
        TL_iv.pageTableCell a10 = o5Var.a();
        if (a10 == null || (b10 = o5Var.a.b(a10)) < 0) {
            return -1;
        }
        int i11 = a10.rowspan;
        int i12 = i11 != 0 ? i11 : 1;
        int[] iArr2 = o5Var.f;
        int i13 = iArr2[b10];
        int i14 = iArr2[Math.min(i12 + b10, o5Var.a.b)];
        if (top < i13 || top >= i14) {
            return -1;
        }
        return b10;
    }

    public final void s(int i7, int i10) {
        int i11;
        e6 e6Var = this.F;
        if (e6Var == null || (i11 = e6Var.b) == 0 || e6Var.c == 0) {
            return;
        }
        TL_iv.pageTableCell pagetablecell = this.F.d[Math.max(0, Math.min(i7, i11 - 1))][Math.max(0, Math.min(i10, this.F.c - 1))];
        if (pagetablecell == null) {
            return;
        }
        post(new j3(3, this, pagetablecell));
    }

    public void setCellSelectionListener(j5 j5Var) {
        this.I = j5Var;
    }

    public void setLocked(boolean z9) {
        this.r.setLocked(z9);
        int i7 = 0;
        while (true) {
            o5 o5Var = this.w;
            if (i7 >= o5Var.getChildCount()) {
                return;
            }
            View childAt = o5Var.getChildAt(i7);
            if (childAt instanceof p5) {
                ((p5) childAt).setLocked(z9);
            }
            i7++;
        }
    }

    public final boolean t() {
        e6 e6Var = this.F;
        if (e6Var == null || e6Var.g.isEmpty()) {
            return false;
        }
        p5 m10 = this.w.m((TL_iv.pageTableCell) this.F.g.get(0));
        if (m10 == null) {
            return false;
        }
        g1 g1Var = m10.a;
        g1Var.N();
        g1Var.setSelection(0);
        return true;
    }

    public final boolean u(p5 p5Var, boolean z9) {
        int indexOf;
        e6 e6Var = this.F;
        if (e6Var == null || (indexOf = e6Var.g.indexOf(p5Var.b)) < 0) {
            return false;
        }
        int i7 = z9 ? indexOf - 1 : indexOf + 1;
        if (i7 < 0 || i7 >= this.F.g.size()) {
            return false;
        }
        p5 m10 = this.w.m((TL_iv.pageTableCell) this.F.g.get(i7));
        if (m10 == null) {
            return false;
        }
        g1 g1Var = m10.a;
        g1Var.N();
        g1Var.setSelection(g1Var.length());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        o5 o5Var;
        g1 g1Var = this.r;
        g1Var.updateColors();
        int i7 = m6.G6;
        h6 h6Var = this.n;
        int w02 = m6.w0(i7, h6Var);
        g1Var.setTextColor(w02);
        g1Var.setHintTextColor(m6.r1(0.35f, w02));
        int i10 = 0;
        while (true) {
            o5Var = this.w;
            if (i10 >= o5Var.getChildCount()) {
                break;
            }
            View childAt = o5Var.getChildAt(i10);
            if (childAt instanceof p5) {
                ((p5) childAt).a.updateColors();
            }
            i10++;
        }
        o5Var.b();
        try {
            if (getBackground() instanceof y1) {
                ((y1) getBackground()).a(m6.w0(m6.d6, h6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void v() {
        z();
        j5 j5Var = this.I;
        if (j5Var != null) {
            t3 t3Var = ((r2) j5Var).a;
            if (this != t3Var.p4) {
                return;
            }
            if (this.H.isEmpty()) {
                t3Var.P2();
            } else {
                if (t3Var.I3) {
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
                ((TL_iv.pageBlockTable) pageBlock).title = c6.f(this.r.getText());
            }
        }
    }

    public final void x() {
        o5 o5Var = this.w;
        o5Var.s();
        o5Var.requestLayout();
        o5Var.invalidate();
        A();
        a3 a3Var = this.E;
        if (a3Var == null || this.a == null) {
            return;
        }
        a3Var.a();
    }

    public final void y(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i7;
        e6 e6Var = this.F;
        if (e6Var == null || pagetablecell == null) {
            return;
        }
        int b10 = e6Var.b(pagetablecell);
        int a10 = this.F.a(pagetablecell);
        int b11 = this.F.b(pagetablecell2);
        int a11 = this.F.a(pagetablecell2);
        if (b10 < 0 || a10 < 0 || b11 < 0 || a11 < 0) {
            return;
        }
        int min = Math.min(b10, b11);
        int min2 = Math.min(a10, a11);
        int i10 = this.F.b - 1;
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
        int i14 = this.F.c - 1;
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
            boolean z9 = false;
            i7 = min;
            while (min <= min3) {
                int i18 = min2;
                while (min2 <= min4) {
                    e6 e6Var2 = this.F;
                    TL_iv.pageTableCell pagetablecell3 = e6Var2.d[min][min2];
                    int i19 = e6Var2.e[min][min2];
                    int i20 = e6Var2.f[min][min2];
                    int min5 = Math.min(e6Var2.b - 1, (e6.o(pagetablecell3) + i19) - 1);
                    int i21 = this.F.c - 1;
                    int i22 = pagetablecell3.colspan;
                    if (i22 == 0) {
                        i22 = 1;
                    }
                    int min6 = Math.min(i21, (i22 + i20) - 1);
                    if (i19 < i7) {
                        z9 = true;
                        i7 = i19;
                    }
                    if (i20 < i18) {
                        z9 = true;
                        i18 = i20;
                    }
                    if (min5 > min3) {
                        min3 = min5;
                        z9 = true;
                    }
                    if (min6 > min4) {
                        min4 = min6;
                        z9 = true;
                    }
                    min2++;
                }
                min++;
                min2 = i18;
            }
            if (!z9) {
                break;
            } else {
                min = i7;
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (i7 <= min3) {
            for (int i23 = min2; i23 <= min4; i23++) {
                linkedHashSet.add(this.F.d[i7][i23]);
            }
            i7++;
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
        setTranslationZ((!this.H.isEmpty() || this.w.hasFocus()) ? org.telegram.messenger.g0.L(1.0f) : 0.0f);
        invalidate();
        this.s.invalidate();
        Object parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }
}
