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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sp extends org.telegram.ui.ActionBar.z2 {
    public final Drawable i1;
    public final ArrayList j1;
    public final pp k1;
    public final rp l1;
    public final boolean m1;
    public int n1;
    public final int[] o1;
    public final int p1;
    public int q1;
    public boolean r1;
    public org.telegram.ui.bb s1;
    public int t1;
    public int u1;
    public int v1;

    public sp(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.p6) null, false);
        ArrayList arrayList = new ArrayList();
        this.j1 = arrayList;
        this.o1 = new int[2];
        this.m1 = true;
        this.v0 = false;
        TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(this.a).M0(chat.id);
        int i10 = M0 != null ? M0.ttl_period : 0;
        if (i10 == 0) {
            this.p1 = 0;
            this.q1 = 0;
        } else if (i10 == 86400) {
            this.p1 = 1;
            this.q1 = 1;
        } else if (i10 == 604800) {
            this.p1 = 2;
            this.q1 = 2;
        } else {
            this.p1 = 3;
            this.q1 = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.i1 = mutate;
        int i11 = org.telegram.ui.ActionBar.t6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i11, this.I0), PorterDuff.Mode.MULTIPLY));
        op opVar = new op(this, activity);
        opVar.setFillViewport(true);
        opVar.setWillNotDraw(false);
        opVar.setClipToPadding(false);
        int i12 = this.t0;
        opVar.setPadding(i12, 0, i12, 0);
        this.b = opVar;
        pp ppVar = new pp(this, activity);
        this.k1 = ppVar;
        ppVar.setOrientation(1);
        opVar.addView(ppVar, w7.b6.x(-1, -2, 80));
        this.N = ppVar;
        org.telegram.messenger.d20.i(this.a).e();
        org.telegram.messenger.vp.r1(this.a);
        ei0 ei0Var = new ei0(activity);
        ei0Var.setAutoRepeat(false);
        ei0Var.f(R.raw.utyan_private, 120, 120, null);
        ei0Var.setPadding(0, org.telegram.messenger.i0.L(20.0f), 0, 0);
        ei0Var.d();
        ppVar.addView(ei0Var, w7.b6.t(org.telegram.messenger.zs.q2, org.telegram.messenger.zs.q2, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.z20.n(textView, 1, 24.0f);
        org.telegram.messenger.z20.p(textView, org.telegram.ui.ActionBar.t6.j5, null, null, 2131753869);
        ppVar.addView(textView, w7.b6.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.r5, null);
        textView2.setGravity(1);
        if (!org.telegram.messenger.w3.T(chat) || chat.megagroup) {
            textView2.setText(org.telegram.messenger.cd.L0(2131753870, null));
        } else {
            textView2.setText(org.telegram.messenger.cd.L0(2131753871, null));
        }
        ppVar.addView(textView2, w7.b6.t(-2, -2, 49, 30, 22, 30, 20));
        yu0 yu0Var = new yu0(activity, null);
        yu0Var.setCallback(new qp(this, opVar));
        yu0Var.b(this.p1, null, org.telegram.messenger.cd.L0(2131753849, null), org.telegram.messenger.cd.L0(2131753879, null), org.telegram.messenger.cd.L0(2131753878, null), org.telegram.messenger.cd.L0(2131753880, null));
        ppVar.addView(yu0Var, w7.b6.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        eq eqVar = new eq(new ColorDrawable(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, this.I0)), org.telegram.ui.ActionBar.t6.Y0(activity, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7));
        eqVar.x = true;
        frameLayout.setBackgroundDrawable(eqVar);
        arrayList.add(eqVar);
        ppVar.addView(frameLayout, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(activity, null);
        b9Var.setText(org.telegram.messenger.cd.L0(2131753852, null));
        frameLayout.addView(b9Var);
        rp rpVar = new rp(activity);
        this.l1 = rpVar;
        org.telegram.ui.ActionBar.a7.i(i11, rpVar, null);
        rpVar.setText(org.telegram.messenger.cd.L0(2131753845, null));
        rpVar.a.setOnClickListener(new h0(this, 7));
        frameLayout.addView(rpVar);
        J0(false);
    }

    public static void I0(sp spVar) {
        View childAt = spVar.k1.getChildAt(0);
        int[] iArr = spVar.o1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - org.telegram.messenger.i0.L(spVar.m1 ? 6.0f : 19.0f), 0);
        if (spVar.n1 != max) {
            spVar.n1 = max;
            spVar.b.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return false;
    }

    public final void J0(boolean z10) {
        int i10 = this.p1;
        int i11 = this.q1;
        rp rpVar = this.l1;
        if (i10 != i11 || this.m1) {
            rpVar.setVisibility(0);
            if (z10) {
                rpVar.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                rpVar.setAlpha(1.0f);
                return;
            }
        }
        if (z10) {
            rpVar.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            rpVar.setVisibility(4);
            rpVar.setAlpha(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        Drawable drawable;
        ArrayList arrayList = this.j1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, this.I0);
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.b7, this.I0);
            if (w02 == this.u1) {
                if (w03 != this.v1) {
                }
                int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.I0);
                drawable = this.i1;
                if (drawable != null || w04 == this.t1) {
                }
                this.t1 = w04;
                drawable.setColorFilter(new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY));
                return;
            }
            this.u1 = w02;
            this.v1 = w03;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                eq eqVar = (eq) arrayList.get(i10);
                org.telegram.ui.ActionBar.t6.B1(eqVar, w02, false);
                if (eqVar.b != null) {
                    org.telegram.ui.ActionBar.t6.B1(eqVar, w03, true);
                }
                eqVar.invalidateSelf();
            }
            int w042 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.I0);
            drawable = this.i1;
            if (drawable != null) {
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
