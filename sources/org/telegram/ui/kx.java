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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class kx extends org.telegram.ui.ActionBar.h2 {
    public gx E;
    public hx a;
    public org.telegram.ui.Components.ck0 b;
    public v4.z c;
    public ImageView d;
    public final ArrayList e;
    public jx f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public final int x;
    public final int y;

    public kx(int i7, int i10) {
        super(null);
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.x = i7;
        this.y = i10;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        getMessagesStorage().q0(i10, i7, arrayList, arrayList2, arrayList3, true);
        getMessagesController().f4(arrayList2, true);
        getMessagesController().Z3(arrayList3, true);
        e0();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(kx kxVar, Context context, int i7) {
        org.telegram.ui.Components.i60 i60Var;
        float max;
        int i10;
        int i11;
        int min;
        if (i7 == kxVar.h) {
            org.telegram.ui.Components.j60 j60Var = new org.telegram.ui.Components.j60(context, kxVar.currentAccount, null, 0L, kxVar, null);
            j60Var.h2 = new zr(kxVar, 8);
            org.telegram.messenger.ks.f(j60Var.a).c(j60Var, org.telegram.messenger.ks.s);
            j60Var.i2 = new ArrayList(org.telegram.messenger.mp.u1(j60Var.a).F);
            j60Var.U0();
            ArrayList arrayList = kxVar.e;
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                i60Var = j60Var.P1;
                if (i12 >= size) {
                    break;
                }
                Long l10 = (Long) arrayList.get(i12);
                long longValue = l10.longValue();
                org.telegram.ui.Components.m20 m20Var = new org.telegram.ui.Components.m20(i60Var.getContext(), org.telegram.messenger.n5.z(longValue) ? org.telegram.messenger.mp.u1(j60Var.a).O0(Long.valueOf(-longValue)) : org.telegram.messenger.mp.u1(j60Var.a).c2(l10));
                i60Var.a(m20Var, false);
                m20Var.setOnClickListener(j60Var.m2);
                i12++;
            }
            j60Var.T0(false);
            int childCount = i60Var.getChildCount();
            Point point = org.telegram.messenger.g0.q;
            boolean z10 = point.x < point.y;
            if (org.telegram.messenger.g0.Q1() || z10) {
                j60Var.n2 = org.telegram.messenger.g0.L(144.0f);
            } else {
                j60Var.n2 = org.telegram.messenger.g0.L(56.0f);
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
                        View childAt = i60Var.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Components.m20) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
                            if (childAt.getMeasuredWidth() + i13 > L) {
                                L2 = org.telegram.messenger.f3.C(8.0f, childAt.getMeasuredHeight(), L2);
                                i13 = 0;
                            }
                            i13 = org.telegram.messenger.f3.C(9.0f, childAt.getMeasuredWidth(), i13);
                        }
                    }
                    int L3 = org.telegram.messenger.g0.L(42.0f) + L2;
                    min = j60Var.h2 == null ? j60Var.b2 ? Math.min(j60Var.n2, L3) : 0 : i5.c.d(52.0f, Math.min(j60Var.n2, L3), 0);
                    int i14 = j60Var.p2;
                    int L4 = j60Var.a2.m() > 0 ? org.telegram.messenger.g0.L(56.0f) : 0;
                    j60Var.p2 = L4;
                    if (min == j60Var.j2 || i14 != L4) {
                        j60Var.j2 = min;
                    }
                    kxVar.showDialog(j60Var);
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
            if (j60Var.h2 == null) {
            }
            int i142 = j60Var.p2;
            if (j60Var.a2.m() > 0) {
            }
            j60Var.p2 = L4;
            if (min == j60Var.j2) {
            }
            j60Var.j2 = min;
            kxVar.showDialog(j60Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d6));
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        if (s4Var != null && ((ActionBarLayout) s4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.x == 0) {
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131742619, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131742610, null));
        }
        this.actionBar.t().e(1, org.telegram.messenger.gd.M0(2131751343, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new dv(this, 1));
        this.a = new hx(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.b = ck0Var;
        ck0Var.setLayoutManager(new v4.c0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((v4.k) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, c8.ma.c(-1.0f, -1));
        v4.z zVar = new v4.z(new ix(this));
        this.c = zVar;
        zVar.h(this.b);
        this.b.setOnItemClickListener(new fi.g4(17, this, context));
        this.b.setOnItemLongClickListener(new ji.j(this));
        return this.fragmentView;
    }

    public final void d0() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        org.telegram.messenger.g0.h3(new bh(this, 26), 1000L);
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
        hx hxVar = this.a;
        if (hxVar != null) {
            hxVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.F8));
        int i7 = org.telegram.ui.ActionBar.n6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h2
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

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        cx.z4(org.telegram.messenger.c.a(this.currentAccount));
        getMediaDataController().P0(true);
        return super.onFragmentCreate();
    }
}
