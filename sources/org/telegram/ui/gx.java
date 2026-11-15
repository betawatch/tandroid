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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class gx extends org.telegram.ui.ActionBar.e2 {
    public cx E;
    public dx a;
    public org.telegram.ui.Components.uj0 b;
    public v4.y c;
    public ImageView d;
    public final ArrayList e;
    public fx f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public final int x;
    public final int y;

    public gx(int i7, int i10) {
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
    public static void Z(gx gxVar, Context context, int i7) {
        org.telegram.ui.Components.z50 z50Var;
        float max;
        int i10;
        int i11;
        int min;
        if (i7 == gxVar.h) {
            org.telegram.ui.Components.a60 a60Var = new org.telegram.ui.Components.a60(context, gxVar.currentAccount, null, 0L, gxVar, null);
            a60Var.h2 = new zr(gxVar, 8);
            org.telegram.messenger.ns.f(a60Var.a).c(a60Var, org.telegram.messenger.ns.s);
            a60Var.i2 = new ArrayList(org.telegram.messenger.np.s1(a60Var.a).F);
            a60Var.T0();
            ArrayList arrayList = gxVar.e;
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                z50Var = a60Var.P1;
                if (i12 >= size) {
                    break;
                }
                Long l10 = (Long) arrayList.get(i12);
                long longValue = l10.longValue();
                org.telegram.ui.Components.f20 f20Var = new org.telegram.ui.Components.f20(z50Var.getContext(), org.telegram.messenger.m5.z(longValue) ? org.telegram.messenger.np.s1(a60Var.a).M0(Long.valueOf(-longValue)) : org.telegram.messenger.np.s1(a60Var.a).a2(l10));
                z50Var.a(f20Var, false);
                f20Var.setOnClickListener(a60Var.m2);
                i12++;
            }
            a60Var.S0(false);
            int childCount = z50Var.getChildCount();
            Point point = org.telegram.messenger.g0.q;
            boolean z10 = point.x < point.y;
            if (org.telegram.messenger.g0.Q1() || z10) {
                a60Var.n2 = org.telegram.messenger.g0.L(144.0f);
            } else {
                a60Var.n2 = org.telegram.messenger.g0.L(56.0f);
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
                        View childAt = z50Var.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Components.f20) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
                            if (childAt.getMeasuredWidth() + i13 > L) {
                                L2 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L2);
                                i13 = 0;
                            }
                            i13 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i13);
                        }
                    }
                    int L3 = org.telegram.messenger.g0.L(42.0f) + L2;
                    min = a60Var.h2 == null ? a60Var.b2 ? Math.min(a60Var.n2, L3) : 0 : i5.c.d(52.0f, Math.min(a60Var.n2, L3), 0);
                    int i14 = a60Var.p2;
                    int L4 = a60Var.a2.m() > 0 ? org.telegram.messenger.g0.L(56.0f) : 0;
                    a60Var.p2 = L4;
                    if (min == a60Var.j2 || i14 != L4) {
                        a60Var.j2 = min;
                    }
                    gxVar.showDialog(a60Var);
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
            if (a60Var.h2 == null) {
            }
            int i142 = a60Var.p2;
            if (a60Var.a2.m() > 0) {
            }
            a60Var.p2 = L4;
            if (min == a60Var.j2) {
            }
            a60Var.j2 = min;
            gxVar.showDialog(a60Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d6));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.x == 0) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131742877, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131742868, null));
        }
        this.actionBar.s().e(1, org.telegram.messenger.hd.M0(2131751354, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new p9(this, 29));
        this.a = new dx(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.b = uj0Var;
        uj0Var.setLayoutManager(new v4.b0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((v4.k) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, c8.ja.c(-1.0f, -1));
        v4.y yVar = new v4.y(new ex(this));
        this.c = yVar;
        yVar.h(this.b);
        this.b.setOnItemClickListener(new fi.i4(17, this, context));
        this.b.setOnItemLongClickListener(new ji.j(this));
        return this.fragmentView;
    }

    public final void d0() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        org.telegram.messenger.g0.i3(new bh(this, 26), 1000L);
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
        dx dxVar = this.a;
        if (dxVar != null) {
            dxVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.F8));
        int i7 = org.telegram.ui.ActionBar.j6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
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

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        yw.u4(org.telegram.messenger.c.a(this.currentAccount));
        getMediaDataController().M0(true);
        return super.onFragmentCreate();
    }
}
