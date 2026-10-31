package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i50 extends zc {
    public float A0;
    public boolean B0;
    public sc z0;

    public i50(long j10) {
        super(j10);
        this.d = true;
    }

    public static void k1(i50 i50Var, int i10, org.telegram.messenger.h3 h3Var) {
        if (h3Var == null || i50Var.getParentActivity() == null) {
            i50Var.B0 = false;
            return;
        }
        h50 h50Var = new h50(i50Var, i50Var, i50Var.getParentActivity(), i10, i50Var.currentAccount, i50Var.resourceProvider);
        h50Var.A1(h3Var);
        h50Var.z1(i50Var.c, true);
        h50Var.B1(i50Var.a);
        h50Var.show();
    }

    @Override // org.telegram.ui.zc
    public final void B0() {
        A0();
        org.telegram.ui.Components.tk0 tk0Var = this.M;
        if (tk0Var != null) {
            tk0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.a7));
        }
        FrameLayout frameLayout = this.O;
        if (frameLayout == null || !(frameLayout.getBackground() instanceof org.telegram.ui.Components.eq)) {
            return;
        }
        Drawable drawable = ((org.telegram.ui.Components.eq) this.O.getBackground()).a;
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.resourceProvider));
            this.O.invalidate();
        }
    }

    @Override // org.telegram.ui.zc
    public final void D0() {
        ag.b1 b1Var = new ag.b1(this, getParentActivity(), this.resourceProvider, 29);
        this.M = b1Var;
        b1Var.setOnScrollListener(new h3(this, 13));
        this.M.setSections(true);
    }

    @Override // org.telegram.ui.zc
    public final int F0() {
        return getMessagesController().A5;
    }

    @Override // org.telegram.ui.zc
    public final int G0() {
        return 2131749450;
    }

    @Override // org.telegram.ui.zc
    public final int H0() {
        return 2131749452;
    }

    @Override // org.telegram.ui.zc
    public final int K0() {
        return 2131749448;
    }

    @Override // org.telegram.ui.zc
    public final int L0() {
        return getMessagesController().x5;
    }

    @Override // org.telegram.ui.zc
    public final int M0() {
        return 2131749449;
    }

    @Override // org.telegram.ui.zc
    public final int N0() {
        return getMessagesController().y5;
    }

    @Override // org.telegram.ui.zc
    public final int O0() {
        return 4;
    }

    @Override // org.telegram.ui.zc
    public final int P0() {
        return getMessagesController().w5;
    }

    @Override // org.telegram.ui.zc
    public final int Q0() {
        return 2131749413;
    }

    @Override // org.telegram.ui.zc
    public final int R0() {
        return 2131749407;
    }

    @Override // org.telegram.ui.zc
    public final int S0() {
        return 2131749408;
    }

    @Override // org.telegram.ui.zc
    public final int T0() {
        return 2131749393;
    }

    @Override // org.telegram.ui.zc
    public final int U0() {
        return getMessagesController().z5;
    }

    @Override // org.telegram.ui.zc
    public final int V0() {
        return 2131749394;
    }

    @Override // org.telegram.ui.zc
    public final boolean X0() {
        return org.telegram.messenger.w3.c0(getMessagesController().L0(Long.valueOf(-this.a)));
    }

    @Override // org.telegram.ui.zc
    public final void Z0(int i10) {
        if (this.c == null || this.B0) {
            return;
        }
        this.B0 = true;
        org.telegram.messenger.vp.r1(this.currentAccount).G0().b(this.a, this.c, new ag.s2(this, i10, 3));
    }

    @Override // org.telegram.ui.zc, org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        View createView = super.createView(context);
        f1(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new g50(this, (FrameLayout) createView));
        return createView;
    }

    @Override // org.telegram.ui.zc
    public final void d1(boolean z10) {
        super.d1(z10);
        sc scVar = this.z0;
        if (scVar != null) {
            TextView textView = scVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.c;
            textView.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, "BoostingGroupBoostCount", new Object[0])));
        }
    }

    @Override // org.telegram.ui.zc, org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == org.telegram.messenger.zs.T && ((TLRPC.ChatFull) objArr[0]).id == (-this.a)) {
            h1();
        }
    }

    @Override // org.telegram.ui.zc
    public final void f1(boolean z10) {
        super.f1(z10);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(new ColorDrawable(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.resourceProvider)), org.telegram.ui.ActionBar.t6.Y0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7), 0, 0);
        eqVar.x = true;
        this.O.setBackground(eqVar);
        this.M.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.a7));
        sc scVar = this.z0;
        if (scVar == null || z10) {
            return;
        }
        scVar.a.b(this.currentAccount, this.s, false);
        this.z0.b.b(this.s, false);
        this.z0.updateColors();
    }

    @Override // org.telegram.ui.zc
    public final void i1() {
        lc lcVar;
        lc lcVar2;
        this.Z = 0;
        int i10 = 1 + 1;
        this.a0 = 1;
        this.b0 = i10;
        int i11 = i10 + 2;
        this.R = i11;
        this.c0 = i10 + 1;
        if (this.x != 0 || this.s >= 0) {
            boolean z10 = this.e0 >= 0;
            this.R = i10 + 3;
            this.e0 = i11;
            if (!z10 && (lcVar = this.N) != null) {
                lcVar.i(i11);
                this.N.g(this.c0);
                this.M.v0(0);
            }
        } else {
            int i12 = this.e0;
            this.e0 = -1;
            if (i12 >= 0 && (lcVar2 = this.N) != null) {
                lcVar2.s(i12);
                this.N.g(this.c0);
            }
        }
        int i13 = this.R;
        this.d0 = i13;
        this.h0 = i13 + 1;
        this.i0 = i13 + 2;
        this.f0 = i13 + 3;
        this.R = i13 + 5;
        this.g0 = i13 + 4;
        TLRPC.ChatFull M0 = getMessagesController().M0(-this.a);
        if (M0 == null || !M0.can_set_stickers) {
            this.j0 = -1;
            this.k0 = -1;
        } else {
            int i14 = this.R;
            this.j0 = i14;
            this.R = i14 + 2;
            this.k0 = i14 + 1;
        }
        int i15 = this.R;
        this.S = i15;
        this.W = i15 + 1;
        this.X = i15 + 2;
        this.R = i15 + 4;
        this.Y = i15 + 3;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        sc scVar = this.z0;
        if (scVar != null) {
            scVar.a();
        }
    }

    @Override // org.telegram.ui.zc, org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.T);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.zc, org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.T);
    }
}
