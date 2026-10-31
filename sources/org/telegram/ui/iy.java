package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class iy extends org.telegram.ui.ActionBar.k2 {
    public y0 D;
    public fy a;
    public org.telegram.ui.Components.tk0 b;
    public s4.x c;
    public ImageView d;
    public final ArrayList e;
    public hy f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public final int x;
    public final int y;

    public iy(int i10, int i11) {
        super(null);
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.x = i10;
        this.y = i11;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        getMessagesStorage().q0(i11, i10, arrayList, arrayList2, arrayList3, true);
        getMessagesController().V3(arrayList2, true);
        getMessagesController().P3(arrayList3, true);
        d0();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Y(iy iyVar, Context context, int i10) {
        org.telegram.ui.Components.l60 l60Var;
        float max;
        int i11;
        int i12;
        int min;
        if (i10 == iyVar.h) {
            org.telegram.ui.Components.m60 m60Var = new org.telegram.ui.Components.m60(context, iyVar.currentAccount, null, 0L, iyVar, null);
            m60Var.d2 = new tt(iyVar, 7);
            org.telegram.messenger.zs.f(m60Var.a).c(m60Var, org.telegram.messenger.zs.s);
            m60Var.e2 = new ArrayList(org.telegram.messenger.vp.r1(m60Var.a).E);
            m60Var.T0();
            ArrayList arrayList = iyVar.e;
            int size = arrayList.size();
            int i13 = 0;
            while (true) {
                l60Var = m60Var.L1;
                if (i13 >= size) {
                    break;
                }
                Long l4 = (Long) arrayList.get(i13);
                long longValue = l4.longValue();
                org.telegram.ui.Components.s20 s20Var = new org.telegram.ui.Components.s20(l60Var.getContext(), org.telegram.messenger.o5.z(longValue) ? org.telegram.messenger.vp.r1(m60Var.a).L0(Long.valueOf(-longValue)) : org.telegram.messenger.vp.r1(m60Var.a).Z1(l4));
                l60Var.a(s20Var, false);
                s20Var.setOnClickListener(m60Var.i2);
                i13++;
            }
            m60Var.S0(false);
            int childCount = l60Var.getChildCount();
            Point point = org.telegram.messenger.i0.q;
            boolean z10 = point.x < point.y;
            if (org.telegram.messenger.i0.Q1() || z10) {
                m60Var.j2 = org.telegram.messenger.i0.L(144.0f);
            } else {
                m60Var.j2 = org.telegram.messenger.i0.L(56.0f);
            }
            if (org.telegram.messenger.i0.Q1()) {
                max = Math.min(point.x, point.y) * 0.8f;
            } else {
                if (z10) {
                    i11 = point.x;
                    int L = i11 - org.telegram.messenger.i0.L(26.0f);
                    int L2 = org.telegram.messenger.i0.L(10.0f);
                    int i14 = 0;
                    for (i12 = 0; i12 < childCount; i12++) {
                        View childAt = l60Var.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Components.s20) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30));
                            if (childAt.getMeasuredWidth() + i14 > L) {
                                L2 = org.telegram.messenger.m5.C(8.0f, childAt.getMeasuredHeight(), L2);
                                i14 = 0;
                            }
                            i14 = org.telegram.messenger.m5.C(9.0f, childAt.getMeasuredWidth(), i14);
                        }
                    }
                    int L3 = org.telegram.messenger.i0.L(42.0f) + L2;
                    min = m60Var.d2 == null ? m60Var.X1 ? Math.min(m60Var.j2, L3) : 0 : i0.a.d(52.0f, Math.min(m60Var.j2, L3), 0);
                    int i15 = m60Var.l2;
                    int L4 = m60Var.W1.m() > 0 ? org.telegram.messenger.i0.L(56.0f) : 0;
                    m60Var.l2 = L4;
                    if (min == m60Var.f2 || i15 != L4) {
                        m60Var.f2 = min;
                    }
                    iyVar.showDialog(m60Var);
                }
                max = Math.max(point.x * 0.8f, Math.min(org.telegram.messenger.i0.L(480.0f), point.x));
            }
            i11 = (int) max;
            int L5 = i11 - org.telegram.messenger.i0.L(26.0f);
            int L22 = org.telegram.messenger.i0.L(10.0f);
            int i142 = 0;
            while (i12 < childCount) {
            }
            int L32 = org.telegram.messenger.i0.L(42.0f) + L22;
            if (m60Var.d2 == null) {
            }
            int i152 = m60Var.l2;
            if (m60Var.W1.m() > 0) {
            }
            m60Var.l2 = L4;
            if (min == m60Var.f2) {
            }
            m60Var.f2 = min;
            iyVar.showDialog(m60Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    public final void c0() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        org.telegram.messenger.i0.h3(new rh(this, 27), 1000L);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.x == 0) {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131742903, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131742893, null));
        }
        this.actionBar.p().e(1, org.telegram.messenger.cd.L0(2131751355, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new ar(this, 19));
        this.a = new fy(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.b = tk0Var;
        tk0Var.setLayoutManager(new s4.a0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((s4.j) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, w7.b6.c(-1.0f, -1));
        s4.x xVar = new s4.x(new gy(this));
        this.c = xVar;
        xVar.h(this.b);
        this.b.setOnItemClickListener(new mg.q0(16, this, context));
        this.b.setOnItemLongClickListener(new m5.e(this));
        return this.fragmentView;
    }

    public final void d0() {
        this.w = 2;
        this.h = 1;
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i10 = this.w;
            this.n = i10;
            int size = arrayList.size() + i10;
            this.w = size;
            this.r = size;
        }
        int i11 = this.w;
        this.w = i11 + 1;
        this.s = i11;
        fy fyVar = this.a;
        if (fyVar != null) {
            fyVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.F8));
        int i10 = org.telegram.ui.ActionBar.t6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (this.D != null) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        c0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        ay.t4(org.telegram.messenger.c.a(this.currentAccount));
        getMediaDataController().M0(true);
        return super.onFragmentCreate();
    }
}
