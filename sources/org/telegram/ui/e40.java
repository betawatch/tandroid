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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e40 extends pc {
    public ic A0;
    public float B0;
    public boolean C0;

    public e40(long j10) {
        super(j10);
        this.d = true;
    }

    public static void l1(e40 e40Var, int i3, org.telegram.messenger.e3 e3Var) {
        if (e3Var == null || e40Var.getParentActivity() == null) {
            e40Var.C0 = false;
            return;
        }
        d40 d40Var = new d40(e40Var, e40Var, e40Var.getParentActivity(), i3, e40Var.currentAccount, e40Var.resourceProvider);
        d40Var.A1(e3Var);
        d40Var.z1(e40Var.c, true);
        d40Var.B1(e40Var.a);
        d40Var.show();
    }

    @Override // org.telegram.ui.pc
    public final void C0() {
        B0();
        org.telegram.ui.Components.tj0 tj0Var = this.N;
        if (tj0Var != null) {
            tj0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout == null || !(frameLayout.getBackground() instanceof org.telegram.ui.Components.xp)) {
            return;
        }
        Drawable drawable = ((org.telegram.ui.Components.xp) this.P.getBackground()).a;
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.resourceProvider));
            this.P.invalidate();
        }
    }

    @Override // org.telegram.ui.pc
    public final void E0() {
        xs xsVar = new xs(this, getParentActivity(), this.resourceProvider, 4);
        this.N = xsVar;
        xsVar.setOnScrollListener(new h3(this, 13));
        this.N.setSections(true);
    }

    @Override // org.telegram.ui.pc
    public final int G0() {
        return getMessagesController().z5;
    }

    @Override // org.telegram.ui.pc
    public final int H0() {
        return 2131749449;
    }

    @Override // org.telegram.ui.pc
    public final int I0() {
        return 2131749451;
    }

    @Override // org.telegram.ui.pc
    public final int L0() {
        return 2131749447;
    }

    @Override // org.telegram.ui.pc
    public final int M0() {
        return getMessagesController().w5;
    }

    @Override // org.telegram.ui.pc
    public final int N0() {
        return 2131749448;
    }

    @Override // org.telegram.ui.pc
    public final int O0() {
        return getMessagesController().x5;
    }

    @Override // org.telegram.ui.pc
    public final int P0() {
        return 4;
    }

    @Override // org.telegram.ui.pc
    public final int Q0() {
        return getMessagesController().v5;
    }

    @Override // org.telegram.ui.pc
    public final int R0() {
        return 2131749412;
    }

    @Override // org.telegram.ui.pc
    public final int S0() {
        return 2131749406;
    }

    @Override // org.telegram.ui.pc
    public final int T0() {
        return 2131749407;
    }

    @Override // org.telegram.ui.pc
    public final int U0() {
        return 2131749392;
    }

    @Override // org.telegram.ui.pc
    public final int V0() {
        return getMessagesController().y5;
    }

    @Override // org.telegram.ui.pc
    public final int W0() {
        return 2131749393;
    }

    @Override // org.telegram.ui.pc
    public final boolean Y0() {
        return org.telegram.messenger.t3.c0(getMessagesController().M0(Long.valueOf(-this.a)));
    }

    @Override // org.telegram.ui.pc
    public final void a1(int i3) {
        if (this.c == null || this.C0) {
            return;
        }
        this.C0 = true;
        org.telegram.messenger.hp.s1(this.currentAccount).G0().b(this.a, this.c, new gi.s3(this, i3, 5));
    }

    @Override // org.telegram.ui.pc, org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        View createView = super.createView(context);
        g1(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new c40(this, (FrameLayout) createView));
        return createView;
    }

    @Override // org.telegram.ui.pc, org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        super.didReceivedNotification(i3, i10, objArr);
        if (i3 == org.telegram.messenger.hs.T && ((TLRPC.ChatFull) objArr[0]).id == (-this.a)) {
            i1();
        }
    }

    @Override // org.telegram.ui.pc
    public final void e1(boolean z10) {
        super.e1(z10);
        ic icVar = this.A0;
        if (icVar != null) {
            TextView textView = icVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.c;
            textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, "BoostingGroupBoostCount", new Object[0])));
        }
    }

    @Override // org.telegram.ui.pc
    public final void g1(boolean z10) {
        super.g1(z10);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.resourceProvider)), org.telegram.ui.ActionBar.k6.Y0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7), 0, 0);
        xpVar.x = true;
        this.P.setBackground(xpVar);
        this.N.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        ic icVar = this.A0;
        if (icVar == null || z10) {
            return;
        }
        icVar.a.b(this.currentAccount, this.s, false);
        this.A0.b.b(this.s, false);
        this.A0.updateColors();
    }

    @Override // org.telegram.ui.pc
    public final void j1() {
        cc ccVar;
        cc ccVar2;
        this.a0 = 0;
        int i3 = 1 + 1;
        this.b0 = 1;
        this.c0 = i3;
        int i10 = i3 + 2;
        this.S = i10;
        this.d0 = i3 + 1;
        if (this.x != 0 || this.s >= 0) {
            boolean z10 = this.f0 >= 0;
            this.S = i3 + 3;
            this.f0 = i10;
            if (!z10 && (ccVar = this.O) != null) {
                ccVar.i(i10);
                this.O.g(this.d0);
                this.N.v0(0);
            }
        } else {
            int i11 = this.f0;
            this.f0 = -1;
            if (i11 >= 0 && (ccVar2 = this.O) != null) {
                ccVar2.s(i11);
                this.O.g(this.d0);
            }
        }
        int i12 = this.S;
        this.e0 = i12;
        this.i0 = i12 + 1;
        this.j0 = i12 + 2;
        this.g0 = i12 + 3;
        this.S = i12 + 5;
        this.h0 = i12 + 4;
        TLRPC.ChatFull N0 = getMessagesController().N0(-this.a);
        if (N0 == null || !N0.can_set_stickers) {
            this.k0 = -1;
            this.l0 = -1;
        } else {
            int i13 = this.S;
            this.k0 = i13;
            this.S = i13 + 2;
            this.l0 = i13 + 1;
        }
        int i14 = this.S;
        this.T = i14;
        this.X = i14 + 1;
        this.Y = i14 + 2;
        this.S = i14 + 4;
        this.Z = i14 + 3;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ic icVar = this.A0;
        if (icVar != null) {
            icVar.a();
        }
    }

    @Override // org.telegram.ui.pc, org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.T);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.pc, org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.T);
    }
}
