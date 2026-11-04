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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lp extends org.telegram.ui.ActionBar.t2 {
    public final Drawable j1;
    public final ArrayList k1;
    public final ip l1;
    public final kp m1;
    public final boolean n1;
    public int o1;
    public final int[] p1;
    public final int q1;
    public int r1;
    public boolean s1;
    public org.telegram.ui.ua t1;
    public int u1;
    public int v1;
    public int w1;

    public lp(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.e6) null, false);
        ArrayList arrayList = new ArrayList();
        this.k1 = arrayList;
        this.p1 = new int[2];
        this.n1 = true;
        this.w0 = false;
        TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(this.a).N0(chat.id);
        int i3 = N0 != null ? N0.ttl_period : 0;
        if (i3 == 0) {
            this.q1 = 0;
            this.r1 = 0;
        } else if (i3 == 86400) {
            this.q1 = 1;
            this.r1 = 1;
        } else if (i3 == 604800) {
            this.q1 = 2;
            this.r1 = 2;
        } else {
            this.q1 = 3;
            this.r1 = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.j1 = mutate;
        int i10 = org.telegram.ui.ActionBar.k6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i10, this.J0), PorterDuff.Mode.MULTIPLY));
        hp hpVar = new hp(this, activity);
        hpVar.setFillViewport(true);
        hpVar.setWillNotDraw(false);
        hpVar.setClipToPadding(false);
        int i11 = this.u0;
        hpVar.setPadding(i11, 0, i11, 0);
        this.b = hpVar;
        ip ipVar = new ip(this, activity);
        this.l1 = ipVar;
        ipVar.setOrientation(1);
        hpVar.addView(ipVar, b8.mf.x(-1, -2, 80));
        this.O = ipVar;
        org.telegram.messenger.h10.i(this.a).e();
        org.telegram.messenger.hp.s1(this.a);
        fh0 fh0Var = new fh0(activity);
        fh0Var.setAutoRepeat(false);
        fh0Var.f(R.raw.utyan_private, 120, 120, null);
        fh0Var.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, 0);
        fh0Var.d();
        ipVar.addView(fh0Var, b8.mf.t(org.telegram.messenger.hs.q2, org.telegram.messenger.hs.q2, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.camera.q.m(textView, 1, 24.0f);
        org.telegram.messenger.camera.q.o(textView, org.telegram.ui.ActionBar.k6.j5, null, null, 2131753869);
        ipVar.addView(textView, b8.mf.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.r5, null);
        textView2.setGravity(1);
        if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
            textView2.setText(org.telegram.messenger.bd.M0(2131753870, null));
        } else {
            textView2.setText(org.telegram.messenger.bd.M0(2131753871, null));
        }
        ipVar.addView(textView2, b8.mf.t(-2, -2, 49, 30, 22, 30, 20));
        ut0 ut0Var = new ut0(activity, null);
        ut0Var.setCallback(new jp(this, hpVar));
        ut0Var.b(this.q1, null, org.telegram.messenger.bd.M0(2131753849, null), org.telegram.messenger.bd.M0(2131753879, null), org.telegram.messenger.bd.M0(2131753878, null), org.telegram.messenger.bd.M0(2131753880, null));
        ipVar.addView(ut0Var, b8.mf.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        xp xpVar = new xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.J0)), org.telegram.ui.ActionBar.k6.Y0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
        xpVar.x = true;
        frameLayout.setBackgroundDrawable(xpVar);
        arrayList.add(xpVar);
        ipVar.addView(frameLayout, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(activity, null);
        y8Var.setText(org.telegram.messenger.bd.M0(2131753852, null));
        frameLayout.addView(y8Var);
        kp kpVar = new kp(activity);
        this.m1 = kpVar;
        org.telegram.ui.ActionBar.r6.i(i10, kpVar, null);
        kpVar.setText(org.telegram.messenger.bd.M0(2131753845, null));
        kpVar.a.setOnClickListener(new f0(this, 8));
        frameLayout.addView(kpVar);
        J0(false);
    }

    public static void I0(lp lpVar) {
        View childAt = lpVar.l1.getChildAt(0);
        int[] iArr = lpVar.p1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - org.telegram.messenger.g0.L(lpVar.n1 ? 6.0f : 19.0f), 0);
        if (lpVar.o1 != max) {
            lpVar.o1 = max;
            lpVar.b.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return false;
    }

    public final void J0(boolean z10) {
        int i3 = this.q1;
        int i10 = this.r1;
        kp kpVar = this.m1;
        if (i3 != i10 || this.n1) {
            kpVar.setVisibility(0);
            if (z10) {
                kpVar.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                kpVar.setAlpha(1.0f);
                return;
            }
        }
        if (z10) {
            kpVar.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            kpVar.setVisibility(4);
            kpVar.setAlpha(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        Drawable drawable;
        ArrayList arrayList = this.k1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.J0);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.b7, this.J0);
            if (w02 == this.v1) {
                if (w03 != this.w1) {
                }
                int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.J0);
                drawable = this.j1;
                if (drawable != null || w04 == this.u1) {
                }
                this.u1 = w04;
                drawable.setColorFilter(new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY));
                return;
            }
            this.v1 = w02;
            this.w1 = w03;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                xp xpVar = (xp) arrayList.get(i3);
                org.telegram.ui.ActionBar.k6.B1(xpVar, w02, false);
                if (xpVar.b != null) {
                    org.telegram.ui.ActionBar.k6.B1(xpVar, w03, true);
                }
                xpVar.invalidateSelf();
            }
            int w042 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.J0);
            drawable = this.j1;
            if (drawable != null) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
