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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class tp extends org.telegram.ui.ActionBar.u2 {
    public final Drawable m1;
    public final ArrayList n1;
    public final qp o1;
    public final sp p1;
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

    public tp(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.e6) null, false);
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        this.s1 = new int[2];
        this.q1 = true;
        this.w0 = false;
        TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(this.a).N0(chat.id);
        int i7 = N0 != null ? N0.ttl_period : 0;
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
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(i10, this.J0), PorterDuff.Mode.MULTIPLY));
        pp ppVar = new pp(this, activity);
        ppVar.setFillViewport(true);
        ppVar.setWillNotDraw(false);
        ppVar.setClipToPadding(false);
        int i11 = this.u0;
        ppVar.setPadding(i11, 0, i11, 0);
        this.b = ppVar;
        qp qpVar = new qp(this, activity);
        this.o1 = qpVar;
        qpVar.setOrientation(1);
        ppVar.addView(qpVar, c8.ja.x(-1, -2, 80));
        this.O = qpVar;
        org.telegram.messenger.m10.i(this.a).e();
        org.telegram.messenger.np.s1(this.a);
        fh0 fh0Var = new fh0(activity);
        fh0Var.setAutoRepeat(false);
        fh0Var.f(R.raw.utyan_private, 120, 120, null);
        fh0Var.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, 0);
        fh0Var.d();
        qpVar.addView(fh0Var, c8.ja.t(org.telegram.messenger.ns.q2, org.telegram.messenger.ns.q2, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.i20.o(textView, 1, 24.0f);
        org.telegram.messenger.i20.q(textView, org.telegram.ui.ActionBar.j6.j5, null, null, 2131753869);
        qpVar.addView(textView, c8.ja.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.r5, null);
        textView2.setGravity(1);
        if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
            textView2.setText(org.telegram.messenger.hd.M0(2131753870, null));
        } else {
            textView2.setText(org.telegram.messenger.hd.M0(2131753871, null));
        }
        qpVar.addView(textView2, c8.ja.t(-2, -2, 49, 30, 22, 30, 20));
        wt0 wt0Var = new wt0(activity, null);
        wt0Var.setCallback(new rp(this, ppVar));
        wt0Var.b(this.t1, null, org.telegram.messenger.hd.M0(2131753849, null), org.telegram.messenger.hd.M0(2131753879, null), org.telegram.messenger.hd.M0(2131753878, null), org.telegram.messenger.hd.M0(2131753880, null));
        qpVar.addView(wt0Var, c8.ja.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        fq fqVar = new fq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, this.J0)), org.telegram.ui.ActionBar.j6.Y0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
        fqVar.x = true;
        frameLayout.setBackgroundDrawable(fqVar);
        arrayList.add(fqVar);
        qpVar.addView(frameLayout, c8.ja.o(-1, -2));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(activity, null);
        y8Var.setText(org.telegram.messenger.hd.M0(2131753852, null));
        frameLayout.addView(y8Var);
        sp spVar = new sp(activity);
        this.p1 = spVar;
        org.telegram.ui.ActionBar.q6.h(i10, spVar, null);
        spVar.setText(org.telegram.messenger.hd.M0(2131753845, null));
        spVar.a.setOnClickListener(new e0(this, 9));
        frameLayout.addView(spVar);
        J0(false);
    }

    public static void I0(tp tpVar) {
        View childAt = tpVar.o1.getChildAt(0);
        int[] iArr = tpVar.s1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - org.telegram.messenger.g0.L(tpVar.q1 ? 6.0f : 19.0f), 0);
        if (tpVar.r1 != max) {
            tpVar.r1 = max;
            tpVar.b.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return false;
    }

    public final void J0(boolean z10) {
        int i7 = this.t1;
        int i10 = this.u1;
        sp spVar = this.p1;
        if (i7 != i10 || this.q1) {
            spVar.setVisibility(0);
            if (z10) {
                spVar.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                spVar.setAlpha(1.0f);
                return;
            }
        }
        if (z10) {
            spVar.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            spVar.setVisibility(4);
            spVar.setAlpha(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        Drawable drawable;
        ArrayList arrayList = this.n1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, this.J0);
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.b7, this.J0);
            if (w02 == this.y1) {
                if (w03 != this.z1) {
                }
                int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, this.J0);
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
                fq fqVar = (fq) arrayList.get(i7);
                org.telegram.ui.ActionBar.j6.B1(fqVar, w02, false);
                if (fqVar.b != null) {
                    org.telegram.ui.ActionBar.j6.B1(fqVar, w03, true);
                }
                fqVar.invalidateSelf();
            }
            int w042 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, this.J0);
            drawable = this.m1;
            if (drawable != null) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
