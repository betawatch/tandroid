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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dc5 extends wh1 {
    public ph1 A0;
    public float B0;
    public boolean C0;

    public dc5(long j) {
        super(j);
        this.d = true;
    }

    @Override // wh1
    public final void B0() {
        gu guVar = new gu(this, getParentActivity(), this.resourceProvider, (byte) 23);
        this.N = guVar;
        guVar.setOnScrollListener(new to2(this, (byte) 16));
        this.N.setSections(true);
    }

    @Override // wh1
    public final int D0() {
        return getMessagesController().l4.g2.f();
    }

    @Override // wh1
    public final int E0() {
        return 2131749195;
    }

    @Override // wh1
    public final int F0() {
        return 2131749197;
    }

    @Override // wh1
    public final int I0() {
        return 2131749193;
    }

    @Override // wh1
    public final int J0() {
        return getMessagesController().l4.k2.f();
    }

    @Override // wh1
    public final int K0() {
        return 2131749194;
    }

    @Override // wh1
    public final int L0() {
        return getMessagesController().l4.l2.f();
    }

    @Override // wh1
    public final int M0() {
        return 4;
    }

    @Override // wh1
    public final int N0() {
        return getMessagesController().l4.m2.f();
    }

    @Override // wh1
    public final int O0() {
        return 2131749158;
    }

    @Override // wh1
    public final int P0() {
        return 2131749152;
    }

    @Override // wh1
    public final int Q0() {
        return 2131749153;
    }

    @Override // wh1
    public final int R0() {
        return 2131749138;
    }

    @Override // wh1
    public final int S0() {
        return getMessagesController().l4.j2.f();
    }

    @Override // wh1
    public final int T0() {
        return 2131749139;
    }

    @Override // wh1
    public final boolean V0() {
        return xc2.c0(getMessagesController().M0(Long.valueOf(-this.a)));
    }

    @Override // wh1
    public final void a1(final int i) {
        if (this.c == null || this.C0) {
            return;
        }
        this.C0 = true;
        uc7.s1(this.currentAccount).G0().b(this.a, this.c, new pcc() { // from class: ac5
            @Override // pcc
            public final void a(Object obj) {
                dc5.this.o1(i, (wg1) obj);
            }
        });
    }

    @Override // wh1, org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        View createView = super.createView(context);
        g1(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new bc5(this, (FrameLayout) createView));
        return createView;
    }

    @Override // wh1, fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        super.didReceivedNotification(i, i2, objArr);
        if (i == jn7.T && ((TLRPC.ChatFull) objArr[0]).id == (-this.a)) {
            i1();
        }
    }

    @Override // wh1
    public final void e1(boolean z) {
        super.e1(z);
        ph1 ph1Var = this.A0;
        if (ph1Var != null) {
            TextView textView = ph1Var.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.c;
            textView.setText(hl.S2(ob6.G(tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, "BoostingGroupBoostCount", new Object[0])));
        }
    }

    @Override // wh1
    public final void g1(boolean z) {
        super.g1(z);
        this.actionBar.setBackgroundColor(0);
        zm2 zm2Var = new zm2(new ColorDrawable(aob.v0(aob.d6, this.resourceProvider)), aob.W0(getParentActivity(), R.drawable.greydivider_bottom, aob.b7), 0, 0);
        zm2Var.x = true;
        this.P.setBackground(zm2Var);
        this.N.setBackgroundColor(getThemedColor(aob.a7));
        ph1 ph1Var = this.A0;
        if (ph1Var == null || z) {
            return;
        }
        ph1Var.a.b(this.currentAccount, this.s, false);
        this.A0.b.b(this.s, false);
        this.A0.updateColors();
    }

    @Override // wh1
    public final void j1() {
        jh1 jh1Var;
        jh1 jh1Var2;
        this.a0 = 0;
        this.b0 = true;
        this.c0 = 2;
        this.S = 4;
        this.d0 = 3;
        if (this.x != 0 || this.s >= 0) {
            boolean z = this.f0 >= 0;
            this.S = 5;
            this.f0 = 4;
            if (!z && (jh1Var = this.O) != null) {
                jh1Var.i(4);
                this.O.g(this.d0);
                this.N.x0(0);
            }
        } else {
            int i = this.f0;
            this.f0 = -1;
            if (i >= 0 && (jh1Var2 = this.O) != null) {
                jh1Var2.s(i);
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
        TLRPC.ChatFull N0 = getMessagesController().N0(-this.a);
        if (N0 == null || !N0.can_set_stickers) {
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

    public final void o1(int i, wg1 wg1Var) {
        if (wg1Var == null || getParentActivity() == null) {
            this.C0 = false;
            return;
        }
        cc5 cc5Var = new cc5(this, this, getParentActivity(), i, this.currentAccount, this.resourceProvider);
        cc5Var.s1(wg1Var);
        cc5Var.r1(this.c, true);
        cc5Var.t1(this.a);
        cc5Var.show();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ph1 ph1Var = this.A0;
        if (ph1Var != null) {
            ph1Var.a();
        }
    }

    @Override // wh1, org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        jn7.f(this.currentAccount).b(this, jn7.T);
        return super.onFragmentCreate();
    }

    @Override // wh1, org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, jn7.T);
    }

    @Override // wh1
    public final void z0() {
        y0();
        d79 d79Var = this.N;
        if (d79Var != null) {
            d79Var.setBackgroundColor(getThemedColor(aob.a7));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout == null || !(frameLayout.getBackground() instanceof zm2)) {
            return;
        }
        Drawable drawable = ((zm2) this.P.getBackground()).a;
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(aob.v0(aob.d6, this.resourceProvider));
            this.P.invalidate();
        }
    }
}
