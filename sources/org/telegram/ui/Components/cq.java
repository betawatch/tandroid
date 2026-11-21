package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class cq extends org.telegram.ui.ActionBar.w2 {
    public final Drawable m1;
    public final ArrayList n1;
    public final zp o1;
    public final bq p1;
    public final boolean q1;
    public int r1;
    public final int[] s1;
    public final int t1;
    public int u1;
    public boolean v1;
    public org.telegram.ui.va w1;
    public int x1;
    public int y1;
    public int z1;

    public cq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.h6) null, false);
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        this.s1 = new int[2];
        this.q1 = true;
        this.w0 = false;
        TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(this.a).P0(chat.id);
        int i7 = P0 != null ? P0.ttl_period : 0;
        if (i7 == 0) {
            this.t1 = 0;
            this.u1 = 0;
        } else if (i7 == 86400) {
            this.t1 = 1;
            this.u1 = 1;
        } else if (i7 == 604800) {
            this.t1 = 2;
            this.u1 = 2;
        } else {
            this.t1 = 3;
            this.u1 = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.m1 = mutate;
        int i10 = org.telegram.ui.ActionBar.m6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i10, this.J0), PorterDuff.Mode.MULTIPLY));
        yp ypVar = new yp(this, activity);
        ypVar.setFillViewport(true);
        ypVar.setWillNotDraw(false);
        ypVar.setClipToPadding(false);
        int i11 = this.u0;
        ypVar.setPadding(i11, 0, i11, 0);
        this.b = ypVar;
        zp zpVar = new zp(this, activity);
        this.o1 = zpVar;
        zpVar.setOrientation(1);
        ypVar.addView(zpVar, c8.ma.x(-1, -2, 80));
        this.O = zpVar;
        org.telegram.messenger.j10.i(this.a).e();
        org.telegram.messenger.mp.u1(this.a);
        rh0 rh0Var = new rh0(activity);
        rh0Var.setAutoRepeat(false);
        rh0Var.f(R.raw.utyan_private, 120, 120, null);
        rh0Var.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, 0);
        rh0Var.d();
        zpVar.addView(rh0Var, c8.ma.t(org.telegram.messenger.ks.q2, org.telegram.messenger.ks.q2, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.n10.p(textView, 1, 24.0f);
        org.telegram.messenger.n10.r(textView, org.telegram.ui.ActionBar.m6.j5, null, null, 2131753866);
        zpVar.addView(textView, c8.ma.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.r5, null);
        textView2.setGravity(1);
        if (!org.telegram.messenger.v3.T(chat) || chat.megagroup) {
            textView2.setText(org.telegram.messenger.gd.N0(2131753867, null));
        } else {
            textView2.setText(org.telegram.messenger.gd.N0(2131753868, null));
        }
        zpVar.addView(textView2, c8.ma.t(-2, -2, 49, 30, 22, 30, 20));
        hu0 hu0Var = new hu0(activity, null);
        hu0Var.setCallback(new aq(this, ypVar));
        hu0Var.b(this.t1, null, org.telegram.messenger.gd.N0(2131753846, null), org.telegram.messenger.gd.N0(2131753876, null), org.telegram.messenger.gd.N0(2131753875, null), org.telegram.messenger.gd.N0(2131753877, null));
        zpVar.addView(hu0Var, c8.ma.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        oq oqVar = new oq(new ColorDrawable(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, this.J0)), org.telegram.ui.ActionBar.m6.Y0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.m6.b7));
        oqVar.x = true;
        frameLayout.setBackgroundDrawable(oqVar);
        arrayList.add(oqVar);
        zpVar.addView(frameLayout, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(activity, null);
        a9Var.setText(org.telegram.messenger.gd.N0(2131753849, null));
        frameLayout.addView(a9Var);
        bq bqVar = new bq(activity);
        this.p1 = bqVar;
        org.telegram.ui.ActionBar.t6.h(i10, bqVar, null);
        bqVar.setText(org.telegram.messenger.gd.N0(2131753842, null));
        bqVar.a.setOnClickListener(new o0(this, 9));
        frameLayout.addView(bqVar);
        K0(false);
    }

    public static void J0(cq cqVar) {
        View childAt = cqVar.o1.getChildAt(0);
        int[] iArr = cqVar.s1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - org.telegram.messenger.g0.L(cqVar.q1 ? 6.0f : 19.0f), 0);
        if (cqVar.r1 != max) {
            cqVar.r1 = max;
            cqVar.b.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    public final void K0(boolean z10) {
        int i7 = this.t1;
        int i10 = this.u1;
        bq bqVar = this.p1;
        if (i7 != i10 || this.q1) {
            bqVar.setVisibility(0);
            if (z10) {
                bqVar.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                bqVar.setAlpha(1.0f);
                return;
            }
        }
        if (z10) {
            bqVar.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            bqVar.setVisibility(4);
            bqVar.setAlpha(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        Drawable drawable;
        ArrayList arrayList = this.n1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, this.J0);
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.b7, this.J0);
            if (w02 == this.y1) {
                if (w03 != this.z1) {
                }
                int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.J0);
                drawable = this.m1;
                if (drawable != null || w04 == this.x1) {
                }
                this.x1 = w04;
                drawable.setColorFilter(new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY));
                return;
            }
            this.y1 = w02;
            this.z1 = w03;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                oq oqVar = (oq) arrayList.get(i7);
                org.telegram.ui.ActionBar.m6.B1(oqVar, w02, false);
                if (oqVar.b != null) {
                    org.telegram.ui.ActionBar.m6.B1(oqVar, w03, true);
                }
                oqVar.invalidateSelf();
            }
            int w042 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.J0);
            drawable = this.m1;
            if (drawable != null) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
