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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class m40 extends qc {
    public jc A0;
    public float B0;
    public boolean C0;

    public m40(long j3) {
        super(j3);
        this.d = true;
    }

    public static void l1(m40 m40Var, int i7, org.telegram.messenger.g3 g3Var) {
        if (g3Var == null || m40Var.getParentActivity() == null) {
            m40Var.C0 = false;
            return;
        }
        l40 l40Var = new l40(m40Var, m40Var, m40Var.getParentActivity(), i7, m40Var.currentAccount, m40Var.resourceProvider);
        l40Var.B1(g3Var);
        l40Var.A1(m40Var.c, true);
        l40Var.C1(m40Var.a);
        l40Var.show();
    }

    @Override // org.telegram.ui.qc
    public final void C0() {
        B0();
        org.telegram.ui.Components.ek0 ek0Var = this.N;
        if (ek0Var != null) {
            ek0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.m6.a7));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout == null || !(frameLayout.getBackground() instanceof org.telegram.ui.Components.oq)) {
            return;
        }
        Drawable drawable = ((org.telegram.ui.Components.oq) this.P.getBackground()).a;
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.resourceProvider));
            this.P.invalidate();
        }
    }

    @Override // org.telegram.ui.qc
    public final void E0() {
        et etVar = new et(this, getParentActivity(), this.resourceProvider, 4);
        this.N = etVar;
        etVar.setOnScrollListener(new g3(this, 13));
        this.N.setSections(true);
    }

    @Override // org.telegram.ui.qc
    public final int G0() {
        return getMessagesController().C5;
    }

    @Override // org.telegram.ui.qc
    public final int H0() {
        return 2131749248;
    }

    @Override // org.telegram.ui.qc
    public final int I0() {
        return 2131749250;
    }

    @Override // org.telegram.ui.qc
    public final int L0() {
        return 2131749246;
    }

    @Override // org.telegram.ui.qc
    public final int M0() {
        return getMessagesController().z5;
    }

    @Override // org.telegram.ui.qc
    public final int N0() {
        return 2131749247;
    }

    @Override // org.telegram.ui.qc
    public final int O0() {
        return getMessagesController().A5;
    }

    @Override // org.telegram.ui.qc
    public final int P0() {
        return 4;
    }

    @Override // org.telegram.ui.qc
    public final int Q0() {
        return getMessagesController().y5;
    }

    @Override // org.telegram.ui.qc
    public final int R0() {
        return 2131749211;
    }

    @Override // org.telegram.ui.qc
    public final int S0() {
        return 2131749205;
    }

    @Override // org.telegram.ui.qc
    public final int T0() {
        return 2131749206;
    }

    @Override // org.telegram.ui.qc
    public final int U0() {
        return 2131749191;
    }

    @Override // org.telegram.ui.qc
    public final int V0() {
        return getMessagesController().B5;
    }

    @Override // org.telegram.ui.qc
    public final int W0() {
        return 2131749192;
    }

    @Override // org.telegram.ui.qc
    public final boolean Y0() {
        return org.telegram.messenger.v3.c0(getMessagesController().O0(Long.valueOf(-this.a)));
    }

    @Override // org.telegram.ui.qc
    public final void a1(int i7) {
        if (this.c == null || this.C0) {
            return;
        }
        this.C0 = true;
        org.telegram.messenger.mp.u1(this.currentAccount).I0().b(this.a, this.c, new ai.a2(this, i7, 7));
    }

    @Override // org.telegram.ui.qc, org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        View createView = super.createView(context);
        g1(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new k40(this, (FrameLayout) createView));
        return createView;
    }

    @Override // org.telegram.ui.qc, org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        super.didReceivedNotification(i7, i10, objArr);
        if (i7 == org.telegram.messenger.ks.T && ((TLRPC.ChatFull) objArr[0]).id == (-this.a)) {
            i1();
        }
    }

    @Override // org.telegram.ui.qc
    public final void e1(boolean z10) {
        super.e1(z10);
        jc jcVar = this.A0;
        if (jcVar != null) {
            TextView textView = jcVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.c;
            textView.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, "BoostingGroupBoostCount", new Object[0])));
        }
    }

    @Override // org.telegram.ui.qc
    public final void g1(boolean z10) {
        super.g1(z10);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(new ColorDrawable(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.resourceProvider)), org.telegram.ui.ActionBar.m6.Y0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.m6.b7), 0, 0);
        oqVar.x = true;
        this.P.setBackground(oqVar);
        this.N.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.m6.a7));
        jc jcVar = this.A0;
        if (jcVar == null || z10) {
            return;
        }
        jcVar.a.b(this.currentAccount, this.s, false);
        this.A0.b.b(this.s, false);
        this.A0.updateColors();
    }

    @Override // org.telegram.ui.qc
    public final void j1() {
        dc dcVar;
        dc dcVar2;
        this.a0 = 0;
        int i7 = 1 + 1;
        this.b0 = 1;
        this.c0 = i7;
        int i10 = i7 + 2;
        this.S = i10;
        this.d0 = i7 + 1;
        if (this.x != 0 || this.s >= 0) {
            boolean z10 = this.f0 >= 0;
            this.S = i7 + 3;
            this.f0 = i10;
            if (!z10 && (dcVar = this.O) != null) {
                dcVar.i(i10);
                this.O.g(this.d0);
                this.N.v0(0);
            }
        } else {
            int i11 = this.f0;
            this.f0 = -1;
            if (i11 >= 0 && (dcVar2 = this.O) != null) {
                dcVar2.s(i11);
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
        TLRPC.ChatFull P0 = getMessagesController().P0(-this.a);
        if (P0 == null || !P0.can_set_stickers) {
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

    @Override // org.telegram.ui.ActionBar.g2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        jc jcVar = this.A0;
        if (jcVar != null) {
            jcVar.a();
        }
    }

    @Override // org.telegram.ui.qc, org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.T);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.qc, org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.T);
    }
}
