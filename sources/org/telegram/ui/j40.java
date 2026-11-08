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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class j40 extends rc {
    public float A0;
    public boolean B0;
    public kc z0;

    public j40(long j3) {
        super(j3);
        this.d = true;
    }

    public static void l1(j40 j40Var, int i7, org.telegram.messenger.e3 e3Var) {
        if (e3Var == null || j40Var.getParentActivity() == null) {
            j40Var.B0 = false;
            return;
        }
        i40 i40Var = new i40(j40Var, j40Var, j40Var.getParentActivity(), i7, j40Var.currentAccount, j40Var.resourceProvider);
        i40Var.A1(e3Var);
        i40Var.z1(j40Var.c, true);
        i40Var.B1(j40Var.a);
        i40Var.show();
    }

    @Override // org.telegram.ui.rc
    public final void C0() {
        B0();
        org.telegram.ui.Components.pj0 pj0Var = this.M;
        if (pj0Var != null) {
            pj0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        }
        FrameLayout frameLayout = this.O;
        if (frameLayout == null || !(frameLayout.getBackground() instanceof org.telegram.ui.Components.xp)) {
            return;
        }
        Drawable drawable = ((org.telegram.ui.Components.xp) this.O.getBackground()).a;
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.resourceProvider));
            this.O.invalidate();
        }
    }

    @Override // org.telegram.ui.rc
    public final void E0() {
        zs zsVar = new zs(this, getParentActivity(), this.resourceProvider, 4);
        this.M = zsVar;
        zsVar.setOnScrollListener(new g3(this, 13));
        this.M.setSections(true);
    }

    @Override // org.telegram.ui.rc
    public final int G0() {
        return getMessagesController().z5;
    }

    @Override // org.telegram.ui.rc
    public final int H0() {
        return 2131749442;
    }

    @Override // org.telegram.ui.rc
    public final int I0() {
        return 2131749444;
    }

    @Override // org.telegram.ui.rc
    public final int L0() {
        return 2131749440;
    }

    @Override // org.telegram.ui.rc
    public final int M0() {
        return getMessagesController().w5;
    }

    @Override // org.telegram.ui.rc
    public final int N0() {
        return 2131749441;
    }

    @Override // org.telegram.ui.rc
    public final int O0() {
        return getMessagesController().x5;
    }

    @Override // org.telegram.ui.rc
    public final int P0() {
        return 4;
    }

    @Override // org.telegram.ui.rc
    public final int Q0() {
        return getMessagesController().v5;
    }

    @Override // org.telegram.ui.rc
    public final int R0() {
        return 2131749405;
    }

    @Override // org.telegram.ui.rc
    public final int S0() {
        return 2131749399;
    }

    @Override // org.telegram.ui.rc
    public final int T0() {
        return 2131749400;
    }

    @Override // org.telegram.ui.rc
    public final int U0() {
        return 2131749385;
    }

    @Override // org.telegram.ui.rc
    public final int V0() {
        return getMessagesController().y5;
    }

    @Override // org.telegram.ui.rc
    public final int W0() {
        return 2131749386;
    }

    @Override // org.telegram.ui.rc
    public final boolean Y0() {
        return org.telegram.messenger.t3.c0(getMessagesController().M0(Long.valueOf(-this.a)));
    }

    @Override // org.telegram.ui.rc
    public final void a1(int i7) {
        if (this.c == null || this.B0) {
            return;
        }
        this.B0 = true;
        org.telegram.messenger.qp.s1(this.currentAccount).G0().b(this.a, this.c, new fi.t3(this, i7, 5));
    }

    @Override // org.telegram.ui.rc, org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        View createView = super.createView(context);
        g1(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new h40(this, (FrameLayout) createView));
        return createView;
    }

    @Override // org.telegram.ui.rc, org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        super.didReceivedNotification(i7, i10, objArr);
        if (i7 == org.telegram.messenger.qs.T && ((TLRPC.ChatFull) objArr[0]).id == (-this.a)) {
            i1();
        }
    }

    @Override // org.telegram.ui.rc
    public final void e1(boolean z9) {
        super.e1(z9);
        kc kcVar = this.z0;
        if (kcVar != null) {
            TextView textView = kcVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.c;
            textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, "BoostingGroupBoostCount", new Object[0])));
        }
    }

    @Override // org.telegram.ui.rc
    public final void g1(boolean z9) {
        super.g1(z9);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.resourceProvider)), org.telegram.ui.ActionBar.k6.Y0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7), 0, 0);
        xpVar.x = true;
        this.O.setBackground(xpVar);
        this.M.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        kc kcVar = this.z0;
        if (kcVar == null || z9) {
            return;
        }
        kcVar.a.b(this.currentAccount, this.s, false);
        this.z0.b.b(this.s, false);
        this.z0.updateColors();
    }

    @Override // org.telegram.ui.rc
    public final void j1() {
        ec ecVar;
        ec ecVar2;
        this.Z = 0;
        int i7 = 1 + 1;
        this.a0 = 1;
        this.b0 = i7;
        int i10 = i7 + 2;
        this.R = i10;
        this.c0 = i7 + 1;
        if (this.x != 0 || this.s >= 0) {
            boolean z9 = this.e0 >= 0;
            this.R = i7 + 3;
            this.e0 = i10;
            if (!z9 && (ecVar = this.N) != null) {
                ecVar.i(i10);
                this.N.g(this.c0);
                this.M.v0(0);
            }
        } else {
            int i11 = this.e0;
            this.e0 = -1;
            if (i11 >= 0 && (ecVar2 = this.N) != null) {
                ecVar2.s(i11);
                this.N.g(this.c0);
            }
        }
        int i12 = this.R;
        this.d0 = i12;
        this.h0 = i12 + 1;
        this.i0 = i12 + 2;
        this.f0 = i12 + 3;
        this.R = i12 + 5;
        this.g0 = i12 + 4;
        TLRPC.ChatFull N0 = getMessagesController().N0(-this.a);
        if (N0 == null || !N0.can_set_stickers) {
            this.j0 = -1;
            this.k0 = -1;
        } else {
            int i13 = this.R;
            this.j0 = i13;
            this.R = i13 + 2;
            this.k0 = i13 + 1;
        }
        int i14 = this.R;
        this.S = i14;
        this.W = i14 + 1;
        this.X = i14 + 2;
        this.R = i14 + 4;
        this.Y = i14 + 3;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        kc kcVar = this.z0;
        if (kcVar != null) {
            kcVar.a();
        }
    }

    @Override // org.telegram.ui.rc, org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.T);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.rc, org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.T);
    }
}
