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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hx extends org.telegram.ui.ActionBar.f2 {
    public dx D;
    public ex a;
    public org.telegram.ui.Components.pj0 b;
    public v4.y c;
    public ImageView d;
    public final ArrayList e;
    public gx f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public final int x;
    public final int y;

    public hx(int i7, int i10) {
        super(null);
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.x = i7;
        this.y = i10;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        getMessagesStorage().q0(i10, i7, arrayList, arrayList2, arrayList3, true);
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
    public static void Z(hx hxVar, Context context, int i7) {
        org.telegram.ui.Components.w50 w50Var;
        float max;
        int i10;
        int i11;
        int min;
        if (i7 == hxVar.h) {
            org.telegram.ui.Components.x50 x50Var = new org.telegram.ui.Components.x50(context, hxVar.currentAccount, null, 0L, hxVar, null);
            x50Var.g2 = new zr(hxVar, 8);
            org.telegram.messenger.qs.f(x50Var.a).c(x50Var, org.telegram.messenger.qs.s);
            x50Var.h2 = new ArrayList(org.telegram.messenger.qp.s1(x50Var.a).E);
            x50Var.T0();
            ArrayList arrayList = hxVar.e;
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                w50Var = x50Var.O1;
                if (i12 >= size) {
                    break;
                }
                Long l10 = (Long) arrayList.get(i12);
                long longValue = l10.longValue();
                org.telegram.ui.Components.c20 c20Var = new org.telegram.ui.Components.c20(w50Var.getContext(), org.telegram.messenger.m5.z(longValue) ? org.telegram.messenger.qp.s1(x50Var.a).M0(Long.valueOf(-longValue)) : org.telegram.messenger.qp.s1(x50Var.a).a2(l10));
                w50Var.a(c20Var, false);
                c20Var.setOnClickListener(x50Var.l2);
                i12++;
            }
            x50Var.S0(false);
            int childCount = w50Var.getChildCount();
            Point point = org.telegram.messenger.g0.q;
            boolean z9 = point.x < point.y;
            if (org.telegram.messenger.g0.Q1() || z9) {
                x50Var.m2 = org.telegram.messenger.g0.L(144.0f);
            } else {
                x50Var.m2 = org.telegram.messenger.g0.L(56.0f);
            }
            if (org.telegram.messenger.g0.Q1()) {
                max = Math.min(point.x, point.y) * 0.8f;
            } else {
                if (z9) {
                    i10 = point.x;
                    int L = i10 - org.telegram.messenger.g0.L(26.0f);
                    int L2 = org.telegram.messenger.g0.L(10.0f);
                    int i13 = 0;
                    for (i11 = 0; i11 < childCount; i11++) {
                        View childAt = w50Var.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Components.c20) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
                            if (childAt.getMeasuredWidth() + i13 > L) {
                                L2 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L2);
                                i13 = 0;
                            }
                            i13 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i13);
                        }
                    }
                    int L3 = org.telegram.messenger.g0.L(42.0f) + L2;
                    min = x50Var.g2 == null ? x50Var.a2 ? Math.min(x50Var.m2, L3) : 0 : jg.g.e(52.0f, Math.min(x50Var.m2, L3), 0);
                    int i14 = x50Var.o2;
                    int L4 = x50Var.Z1.m() > 0 ? org.telegram.messenger.g0.L(56.0f) : 0;
                    x50Var.o2 = L4;
                    if (min == x50Var.i2 || i14 != L4) {
                        x50Var.i2 = min;
                    }
                    hxVar.showDialog(x50Var);
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
            if (x50Var.g2 == null) {
            }
            int i142 = x50Var.o2;
            if (x50Var.Z1.m() > 0) {
            }
            x50Var.o2 = L4;
            if (min == x50Var.i2) {
            }
            x50Var.i2 = min;
            hxVar.showDialog(x50Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.x == 0) {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131742877, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131742868, null));
        }
        this.actionBar.s().e(1, org.telegram.messenger.id.M0(2131751354, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new w9(this, 28));
        this.a = new ex(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.b = pj0Var;
        pj0Var.setLayoutManager(new v4.b0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((v4.k) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, c8.ha.c(-1.0f, -1));
        v4.y yVar = new v4.y(new fx(this));
        this.c = yVar;
        yVar.h(this.b);
        this.b.setOnItemClickListener(new di.q4(17, this, context));
        this.b.setOnItemLongClickListener(new j2.n(this));
        return this.fragmentView;
    }

    public final void d0() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        org.telegram.messenger.g0.i3(new dh(this, 26), 1000L);
    }

    public final void e0() {
        this.w = 2;
        this.h = 1;
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i7 = this.w;
            this.n = i7;
            int size = arrayList.size() + i7;
            this.w = size;
            this.r = size;
        }
        int i10 = this.w;
        this.w = i10 + 1;
        this.s = i10;
        ex exVar = this.a;
        if (exVar != null) {
            exVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.F8));
        int i7 = org.telegram.ui.ActionBar.m6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (this.D != null) {
            return super.onBackPressed(z9);
        }
        if (!z9) {
            return false;
        }
        d0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        zw.u4(org.telegram.messenger.c.a(this.currentAccount));
        getMediaDataController().M0(true);
        return super.onFragmentCreate();
    }
}
