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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class aq extends org.telegram.ui.ActionBar.x2 {
    public final Drawable m1;
    public final ArrayList n1;
    public final xp o1;
    public final zp p1;
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

    public aq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.i6) null, false);
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
        int i10 = org.telegram.ui.ActionBar.n6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i10, this.J0), PorterDuff.Mode.MULTIPLY));
        wp wpVar = new wp(this, activity);
        wpVar.setFillViewport(true);
        wpVar.setWillNotDraw(false);
        wpVar.setClipToPadding(false);
        int i11 = this.u0;
        wpVar.setPadding(i11, 0, i11, 0);
        this.b = wpVar;
        xp xpVar = new xp(this, activity);
        this.o1 = xpVar;
        xpVar.setOrientation(1);
        wpVar.addView(xpVar, c8.ma.x(-1, -2, 80));
        this.O = xpVar;
        org.telegram.messenger.j10.i(this.a).e();
        org.telegram.messenger.mp.u1(this.a);
        ph0 ph0Var = new ph0(activity);
        ph0Var.setAutoRepeat(false);
        ph0Var.f(R.raw.utyan_private, 120, 120, null);
        ph0Var.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, 0);
        ph0Var.d();
        xpVar.addView(ph0Var, c8.ma.t(org.telegram.messenger.ks.q2, org.telegram.messenger.ks.q2, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.n10.p(textView, 1, 24.0f);
        org.telegram.messenger.n10.r(textView, org.telegram.ui.ActionBar.n6.j5, null, null, 2131753867);
        xpVar.addView(textView, c8.ma.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.r5, null);
        textView2.setGravity(1);
        if (!org.telegram.messenger.v3.T(chat) || chat.megagroup) {
            textView2.setText(org.telegram.messenger.gd.M0(2131753868, null));
        } else {
            textView2.setText(org.telegram.messenger.gd.M0(2131753869, null));
        }
        xpVar.addView(textView2, c8.ma.t(-2, -2, 49, 30, 22, 30, 20));
        eu0 eu0Var = new eu0(activity, null);
        eu0Var.setCallback(new yp(this, wpVar));
        eu0Var.b(this.t1, null, org.telegram.messenger.gd.M0(2131753847, null), org.telegram.messenger.gd.M0(2131753877, null), org.telegram.messenger.gd.M0(2131753876, null), org.telegram.messenger.gd.M0(2131753878, null));
        xpVar.addView(eu0Var, c8.ma.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        mq mqVar = new mq(new ColorDrawable(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, this.J0)), org.telegram.ui.ActionBar.n6.Y0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.n6.b7));
        mqVar.x = true;
        frameLayout.setBackgroundDrawable(mqVar);
        arrayList.add(mqVar);
        xpVar.addView(frameLayout, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(activity, null);
        z8Var.setText(org.telegram.messenger.gd.M0(2131753850, null));
        frameLayout.addView(z8Var);
        zp zpVar = new zp(activity);
        this.p1 = zpVar;
        org.telegram.ui.ActionBar.u6.h(i10, zpVar, null);
        zpVar.setText(org.telegram.messenger.gd.M0(2131753843, null));
        zpVar.a.setOnClickListener(new n0(this, 9));
        frameLayout.addView(zpVar);
        K0(false);
    }

    public static void J0(aq aqVar) {
        View childAt = aqVar.o1.getChildAt(0);
        int[] iArr = aqVar.s1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - org.telegram.messenger.g0.L(aqVar.q1 ? 6.0f : 19.0f), 0);
        if (aqVar.r1 != max) {
            aqVar.r1 = max;
            aqVar.b.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean G() {
        return false;
    }

    public final void K0(boolean z10) {
        int i7 = this.t1;
        int i10 = this.u1;
        zp zpVar = this.p1;
        if (i7 != i10 || this.q1) {
            zpVar.setVisibility(0);
            if (z10) {
                zpVar.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                zpVar.setAlpha(1.0f);
                return;
            }
        }
        if (z10) {
            zpVar.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            zpVar.setVisibility(4);
            zpVar.setAlpha(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void s0() {
        Drawable drawable;
        ArrayList arrayList = this.n1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, this.J0);
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.b7, this.J0);
            if (w02 == this.y1) {
                if (w03 != this.z1) {
                }
                int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, this.J0);
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
                mq mqVar = (mq) arrayList.get(i7);
                org.telegram.ui.ActionBar.n6.B1(mqVar, w02, false);
                if (mqVar.b != null) {
                    org.telegram.ui.ActionBar.n6.B1(mqVar, w03, true);
                }
                mqVar.invalidateSelf();
            }
            int w042 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, this.J0);
            drawable = this.m1;
            if (drawable != null) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
