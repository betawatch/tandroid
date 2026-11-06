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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class lp extends org.telegram.ui.ActionBar.v2 {
    public final Drawable i1;
    public final ArrayList j1;
    public final ip k1;
    public final kp l1;
    public final boolean m1;
    public int n1;
    public final int[] o1;
    public final int p1;
    public int q1;
    public boolean r1;
    public org.telegram.ui.wa s1;
    public int t1;
    public int u1;
    public int v1;

    public lp(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.f6) null, false);
        ArrayList arrayList = new ArrayList();
        this.j1 = arrayList;
        this.o1 = new int[2];
        this.m1 = true;
        this.v0 = false;
        TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(this.a).N0(chat.id);
        int i7 = N0 != null ? N0.ttl_period : 0;
        if (i7 == 0) {
            this.p1 = 0;
            this.q1 = 0;
        } else if (i7 == 86400) {
            this.p1 = 1;
            this.q1 = 1;
        } else if (i7 == 604800) {
            this.p1 = 2;
            this.q1 = 2;
        } else {
            this.p1 = 3;
            this.q1 = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.i1 = mutate;
        int i10 = org.telegram.ui.ActionBar.k6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i10, this.I0), PorterDuff.Mode.MULTIPLY));
        hp hpVar = new hp(this, activity);
        hpVar.setFillViewport(true);
        hpVar.setWillNotDraw(false);
        hpVar.setClipToPadding(false);
        int i11 = this.t0;
        hpVar.setPadding(i11, 0, i11, 0);
        this.b = hpVar;
        ip ipVar = new ip(this, activity);
        this.k1 = ipVar;
        ipVar.setOrientation(1);
        hpVar.addView(ipVar, c8.ha.x(-1, -2, 80));
        this.N = ipVar;
        org.telegram.messenger.p10.i(this.a).e();
        org.telegram.messenger.qp.s1(this.a);
        ch0 ch0Var = new ch0(activity);
        ch0Var.setAutoRepeat(false);
        ch0Var.f(R.raw.utyan_private, 120, 120, null);
        ch0Var.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, 0);
        ch0Var.d();
        ipVar.addView(ch0Var, c8.ha.t(org.telegram.messenger.qs.q2, org.telegram.messenger.qs.q2, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.camera.q.m(textView, 1, 24.0f);
        org.telegram.messenger.camera.q.o(textView, org.telegram.ui.ActionBar.k6.j5, null, null, 2131753869);
        ipVar.addView(textView, c8.ha.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.r5, null);
        textView2.setGravity(1);
        if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
            textView2.setText(org.telegram.messenger.hd.M0(2131753870, null));
        } else {
            textView2.setText(org.telegram.messenger.hd.M0(2131753871, null));
        }
        ipVar.addView(textView2, c8.ha.t(-2, -2, 49, 30, 22, 30, 20));
        vt0 vt0Var = new vt0(activity, null);
        vt0Var.setCallback(new jp(this, hpVar));
        vt0Var.b(this.p1, null, org.telegram.messenger.hd.M0(2131753849, null), org.telegram.messenger.hd.M0(2131753879, null), org.telegram.messenger.hd.M0(2131753878, null), org.telegram.messenger.hd.M0(2131753880, null));
        ipVar.addView(vt0Var, c8.ha.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        xp xpVar = new xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.I0)), org.telegram.ui.ActionBar.k6.Y0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
        xpVar.x = true;
        frameLayout.setBackgroundDrawable(xpVar);
        arrayList.add(xpVar);
        ipVar.addView(frameLayout, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(activity, null);
        z8Var.setText(org.telegram.messenger.hd.M0(2131753852, null));
        frameLayout.addView(z8Var);
        kp kpVar = new kp(activity);
        this.l1 = kpVar;
        org.telegram.ui.ActionBar.r6.i(i10, kpVar, null);
        kpVar.setText(org.telegram.messenger.hd.M0(2131753845, null));
        kpVar.a.setOnClickListener(new h0(this, 8));
        frameLayout.addView(kpVar);
        J0(false);
    }

    public static void I0(lp lpVar) {
        View childAt = lpVar.k1.getChildAt(0);
        int[] iArr = lpVar.o1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - org.telegram.messenger.g0.L(lpVar.m1 ? 6.0f : 19.0f), 0);
        if (lpVar.n1 != max) {
            lpVar.n1 = max;
            lpVar.b.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        return false;
    }

    public final void J0(boolean z9) {
        int i7 = this.p1;
        int i10 = this.q1;
        kp kpVar = this.l1;
        if (i7 != i10 || this.m1) {
            kpVar.setVisibility(0);
            if (z9) {
                kpVar.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                kpVar.setAlpha(1.0f);
                return;
            }
        }
        if (z9) {
            kpVar.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            kpVar.setVisibility(4);
            kpVar.setAlpha(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        Drawable drawable;
        ArrayList arrayList = this.j1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.I0);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.b7, this.I0);
            if (w02 == this.u1) {
                if (w03 != this.v1) {
                }
                int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.I0);
                drawable = this.i1;
                if (drawable != null || w04 == this.t1) {
                }
                this.t1 = w04;
                drawable.setColorFilter(new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY));
                return;
            }
            this.u1 = w02;
            this.v1 = w03;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                xp xpVar = (xp) arrayList.get(i7);
                org.telegram.ui.ActionBar.k6.B1(xpVar, w02, false);
                if (xpVar.b != null) {
                    org.telegram.ui.ActionBar.k6.B1(xpVar, w03, true);
                }
                xpVar.invalidateSelf();
            }
            int w042 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.I0);
            drawable = this.i1;
            if (drawable != null) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
