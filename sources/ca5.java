// default package

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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ca5 extends nh1 {
    public gh1 A0;
    public float B0;
    public boolean C0;

    public ca5(long j) {
        super(j);
        this.d = true;
    }

    @Override // nh1
    public final void A0() {
        fu fuVar = new fu(this, getParentActivity(), this.resourceProvider, (byte) 23);
        this.N = fuVar;
        fuVar.setOnScrollListener(new ao2(this, (byte) 16));
        this.N.setSections(true);
    }

    @Override // nh1
    public final int C0() {
        return getMessagesController().k4.Y1.f();
    }

    @Override // nh1
    public final int D0() {
        return 2131749249;
    }

    @Override // nh1
    public final int E0() {
        return 2131749251;
    }

    @Override // nh1
    public final int H0() {
        return 2131749247;
    }

    @Override // nh1
    public final int I0() {
        return getMessagesController().k4.c2.f();
    }

    @Override // nh1
    public final int J0() {
        return 2131749248;
    }

    @Override // nh1
    public final int K0() {
        return getMessagesController().k4.d2.f();
    }

    @Override // nh1
    public final int L0() {
        return 4;
    }

    @Override // nh1
    public final int M0() {
        return getMessagesController().k4.e2.f();
    }

    @Override // nh1
    public final int N0() {
        return 2131749212;
    }

    @Override // nh1
    public final int O0() {
        return 2131749206;
    }

    @Override // nh1
    public final int P0() {
        return 2131749207;
    }

    @Override // nh1
    public final int Q0() {
        return 2131749192;
    }

    @Override // nh1
    public final int R0() {
        return getMessagesController().k4.b2.f();
    }

    @Override // nh1
    public final int S0() {
        return 2131749193;
    }

    @Override // nh1
    public final boolean U0() {
        return hc2.c0(getMessagesController().K0(Long.valueOf(-this.a)));
    }

    @Override // nh1
    public final void Z0(final int i) {
        if (this.c == null || this.C0) {
            return;
        }
        this.C0 = true;
        na7.q1(this.currentAccount).E0().b(this.a, this.c, new p8c() { // from class: z95
            @Override // p8c
            public final void a(Object obj) {
                ca5.this.n1(i, (ng1) obj);
            }
        });
    }

    @Override // nh1, org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        View createView = super.createView(context);
        f1(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new aa5(this, (FrameLayout) createView));
        return createView;
    }

    @Override // nh1
    public final void d1(boolean z) {
        super.d1(z);
        gh1 gh1Var = this.A0;
        if (gh1Var != null) {
            TextView textView = gh1Var.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.c;
            textView.setText(gl.T2(k96.G(tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, "BoostingGroupBoostCount", new Object[0])));
        }
    }

    @Override // nh1, gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        super.didReceivedNotification(i, i2, objArr);
        if (i == kk7.S && ((TLRPC.ChatFull) objArr[0]).id == (-this.a)) {
            h1();
        }
    }

    @Override // nh1
    public final void f1(boolean z) {
        super.f1(z);
        this.actionBar.setBackgroundColor(0);
        fm2 fm2Var = new fm2(new ColorDrawable(bkb.v0(bkb.c6, this.resourceProvider)), bkb.W0(getParentActivity(), R.drawable.greydivider_bottom, bkb.a7), 0, 0);
        fm2Var.x = true;
        this.P.setBackground(fm2Var);
        this.N.setBackgroundColor(getThemedColor(bkb.Z6));
        gh1 gh1Var = this.A0;
        if (gh1Var == null || z) {
            return;
        }
        gh1Var.a.b(this.currentAccount, this.s, false);
        this.A0.b.b(this.s, false);
        this.A0.updateColors();
    }

    @Override // nh1
    public final void i1() {
        ah1 ah1Var;
        ah1 ah1Var2;
        this.a0 = 0;
        this.b0 = true;
        this.c0 = 2;
        this.S = 4;
        this.d0 = 3;
        if (this.x != 0 || this.s >= 0) {
            boolean z = this.f0 >= 0;
            this.S = 5;
            this.f0 = 4;
            if (!z && (ah1Var = this.O) != null) {
                ah1Var.i(4);
                this.O.g(this.d0);
                this.N.w0(0);
            }
        } else {
            int i = this.f0;
            this.f0 = -1;
            if (i >= 0 && (ah1Var2 = this.O) != null) {
                ah1Var2.r(i);
                this.O.g(this.d0);
            }
        }
        int i2 = this.S;
        this.e0 = i2;
        this.i0 = i2 + 1;
        this.j0 = i2 + 2;
        this.g0 = i2 + 3;
        this.S = i2 + 5;
        this.h0 = i2 + 4;
        TLRPC.ChatFull L0 = getMessagesController().L0(-this.a);
        if (L0 == null || !L0.can_set_stickers) {
            this.k0 = -1;
            this.l0 = -1;
        } else {
            int i3 = this.S;
            this.k0 = i3;
            this.S = i3 + 2;
            this.l0 = i3 + 1;
        }
        int i4 = this.S;
        this.T = i4;
        this.X = i4 + 1;
        this.Y = i4 + 2;
        this.S = i4 + 4;
        this.Z = i4 + 3;
    }

    public final void n1(int i, ng1 ng1Var) {
        if (ng1Var == null || getParentActivity() == null) {
            this.C0 = false;
            return;
        }
        ba5 ba5Var = new ba5(this, this, getParentActivity(), i, this.currentAccount, this.resourceProvider);
        ba5Var.r1(ng1Var);
        ba5Var.q1(this.c, true);
        ba5Var.s1(this.a);
        ba5Var.show();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        gh1 gh1Var = this.A0;
        if (gh1Var != null) {
            gh1Var.a();
        }
    }

    @Override // nh1, org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.S);
        return super.onFragmentCreate();
    }

    @Override // nh1, org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, kk7.S);
    }

    @Override // nh1
    public final void y0() {
        x0();
        o39 o39Var = this.N;
        if (o39Var != null) {
            o39Var.setBackgroundColor(getThemedColor(bkb.Z6));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout == null || !(frameLayout.getBackground() instanceof fm2)) {
            return;
        }
        Drawable drawable = ((fm2) this.P.getBackground()).a;
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(bkb.v0(bkb.c6, this.resourceProvider));
            this.P.invalidate();
        }
    }
}
