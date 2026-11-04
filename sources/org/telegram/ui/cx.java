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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cx extends org.telegram.ui.ActionBar.d2 {
    public yw E;
    public zw a;
    public org.telegram.ui.Components.tj0 b;
    public u4.y c;
    public ImageView d;
    public final ArrayList e;
    public bx f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public final int x;
    public final int y;

    public cx(int i3, int i10) {
        super(null);
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.x = i3;
        this.y = i10;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        getMessagesStorage().q0(i10, i3, arrayList, arrayList2, arrayList3, true);
        getMessagesController().Y3(arrayList2, true);
        getMessagesController().S3(arrayList3, true);
        e0();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(cx cxVar, Context context, int i3) {
        org.telegram.ui.Components.s50 s50Var;
        float max;
        int i10;
        int i11;
        int min;
        if (i3 == cxVar.h) {
            org.telegram.ui.Components.t50 t50Var = new org.telegram.ui.Components.t50(context, cxVar.currentAccount, null, 0L, cxVar, null);
            t50Var.e2 = new ur(cxVar, 8);
            org.telegram.messenger.hs.f(t50Var.a).c(t50Var, org.telegram.messenger.hs.s);
            t50Var.f2 = new ArrayList(org.telegram.messenger.hp.s1(t50Var.a).F);
            t50Var.T0();
            ArrayList arrayList = cxVar.e;
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                s50Var = t50Var.M1;
                if (i12 >= size) {
                    break;
                }
                Long l10 = (Long) arrayList.get(i12);
                long longValue = l10.longValue();
                org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(s50Var.getContext(), org.telegram.messenger.m5.z(longValue) ? org.telegram.messenger.hp.s1(t50Var.a).M0(Long.valueOf(-longValue)) : org.telegram.messenger.hp.s1(t50Var.a).a2(l10));
                s50Var.a(y10Var, false);
                y10Var.setOnClickListener(t50Var.j2);
                i12++;
            }
            t50Var.S0(false);
            int childCount = s50Var.getChildCount();
            Point point = org.telegram.messenger.g0.q;
            boolean z10 = point.x < point.y;
            if (org.telegram.messenger.g0.Q1() || z10) {
                t50Var.k2 = org.telegram.messenger.g0.L(144.0f);
            } else {
                t50Var.k2 = org.telegram.messenger.g0.L(56.0f);
            }
            if (org.telegram.messenger.g0.Q1()) {
                max = Math.min(point.x, point.y) * 0.8f;
            } else {
                if (z10) {
                    i10 = point.x;
                    int L = i10 - org.telegram.messenger.g0.L(26.0f);
                    int L2 = org.telegram.messenger.g0.L(10.0f);
                    int i13 = 0;
                    for (i11 = 0; i11 < childCount; i11++) {
                        View childAt = s50Var.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Components.y10) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
                            if (childAt.getMeasuredWidth() + i13 > L) {
                                L2 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L2);
                                i13 = 0;
                            }
                            i13 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i13);
                        }
                    }
                    int L3 = org.telegram.messenger.g0.L(42.0f) + L2;
                    min = t50Var.e2 == null ? t50Var.Y1 ? Math.min(t50Var.k2, L3) : 0 : k2.p1.d(52.0f, Math.min(t50Var.k2, L3), 0);
                    int i14 = t50Var.m2;
                    int L4 = t50Var.X1.m() > 0 ? org.telegram.messenger.g0.L(56.0f) : 0;
                    t50Var.m2 = L4;
                    if (min == t50Var.g2 || i14 != L4) {
                        t50Var.g2 = min;
                    }
                    cxVar.showDialog(t50Var);
                }
                max = Math.max(point.x * 0.8f, Math.min(org.telegram.messenger.g0.L(480.0f), point.x));
            }
            i10 = (int) max;
            int L5 = i10 - org.telegram.messenger.g0.L(26.0f);
            int L22 = org.telegram.messenger.g0.L(10.0f);
            int i132 = 0;
            while (i11 < childCount) {
            }
            int L32 = org.telegram.messenger.g0.L(42.0f) + L22;
            if (t50Var.e2 == null) {
            }
            int i142 = t50Var.m2;
            if (t50Var.X1.m() > 0) {
            }
            t50Var.m2 = L4;
            if (min == t50Var.g2) {
            }
            t50Var.g2 = min;
            cxVar.showDialog(t50Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.x == 0) {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131742887, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131742878, null));
        }
        this.actionBar.q().e(1, org.telegram.messenger.bd.M0(2131751355, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new o9(this, 29));
        this.a = new zw(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.b = tj0Var;
        tj0Var.setLayoutManager(new u4.b0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((u4.k) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, b8.mf.c(-1.0f, -1));
        u4.y yVar = new u4.y(new ax(this));
        this.c = yVar;
        yVar.h(this.b);
        this.b.setOnItemClickListener(new ei.q4(17, this, context));
        this.b.setOnItemLongClickListener(new mi.h0(this));
        return this.fragmentView;
    }

    public final void d0() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        org.telegram.messenger.g0.i3(new xg(this, 26), 1000L);
    }

    public final void e0() {
        this.w = 2;
        this.h = 1;
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i3 = this.w;
            this.n = i3;
            int size = arrayList.size() + i3;
            this.w = size;
            this.r = size;
        }
        int i10 = this.w;
        this.w = i10 + 1;
        this.s = i10;
        zw zwVar = this.a;
        if (zwVar != null) {
            zwVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F8));
        int i3 = org.telegram.ui.ActionBar.k6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        if (this.E != null) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        d0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        uw.u4(org.telegram.messenger.c.a(this.currentAccount));
        getMediaDataController().M0(true);
        return super.onFragmentCreate();
    }
}
