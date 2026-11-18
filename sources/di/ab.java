package di;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.rj;
import org.telegram.ui.u80;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ab extends org.telegram.ui.Components.sa implements fs {
    public final za T1;
    public final FrameLayout U1;
    public final TLRPC.User V1;
    public final Runnable W1;
    public z41 X1;
    public boolean Y1;

    public ab(Context context, org.telegram.ui.ActionBar.i6 i6Var, TLRPC.User user, Runnable runnable) {
        super(context, null, false, false, i6Var);
        this.V1 = user;
        this.W1 = runnable;
        this.v1 = 0.2f;
        ks.f(this.a).c(this, ks.y3);
        ks.f(this.a).c(this, ks.A3);
        O();
        ck0 ck0Var = this.o1;
        int i7 = this.u0;
        final int i10 = 0;
        ck0Var.setPadding(i7, 0, i7, 0);
        this.o1.setOnItemClickListener(new bi.h8(this, 3));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(lr.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        w0(org.telegram.ui.ActionBar.n6.i5);
        za zaVar = new za(0, context, i6Var);
        this.T1 = zaVar;
        ((TextView) zaVar.c).setText(gd.M0(2131749432, null));
        k80 k80Var = (k80) zaVar.d;
        final int i11 = 1;
        k80Var.setText(TextUtils.concat(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749434, o10.l(user))), " ", org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(gd.M0(2131749433, null).replace(' ', (char) 160), new Runnable(this) { // from class: di.ya
            public final /* synthetic */ ab b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.h2 h2Var;
                int i12 = i10;
                ab abVar = this.b;
                switch (i12) {
                    case 0:
                        qu0 qu0Var = new qu0(abVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(abVar.j1) && (h2Var = abVar.j1) != null) {
                            qu0Var.a0(h2Var);
                        }
                        qu0Var.show();
                        break;
                    default:
                        vf.c.t(abVar.getContext(), gd.M0(2131744731, null));
                        break;
                }
            }
        }), true)));
        k80Var.setMaxWidth(hi.m3.a(k80Var.getText(), k80Var.getPaint()) + 1);
        this.p1.setTitle(P0());
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        b9Var.r(user);
        ((org.telegram.ui.Components.q9) zaVar.b).f(user, b9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U1 = frameLayout;
        k80 k80Var2 = new k80(context, i6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        k80Var2.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.u6.U(k80Var2, org.telegram.ui.ActionBar.n6.B6, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var2, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        k80Var2.setText(org.telegram.messenger.g0.T2(gd.M0(2131744732, null), new Runnable(this) { // from class: di.ya
            public final /* synthetic */ ab b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.h2 h2Var;
                int i12 = i11;
                ab abVar = this.b;
                switch (i12) {
                    case 0:
                        qu0 qu0Var = new qu0(abVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(abVar.j1) && (h2Var = abVar.j1) != null) {
                            qu0Var.a0(h2Var);
                        }
                        qu0Var.show();
                        break;
                    default:
                        vf.c.t(abVar.getContext(), gd.M0(2131744731, null));
                        break;
                }
            }
        }));
        k80Var2.setGravity(17);
        k80Var2.setMaxWidth(hi.m3.a(k80Var2.getText(), k80Var2.getPaint()));
        frameLayout.addView(k80Var2, c8.ma.e(-2, -1, 17));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, frameLayout, i6Var);
        this.b.addView(new uz(getContext()), c8.ma.c(-1.0f, -1));
        z41 z41Var = this.X1;
        if (z41Var != null) {
            z41Var.O(false);
        }
    }

    public static void e1(ab abVar, l41 l41Var, long j3, Boolean bool, String str) {
        Runnable runnable;
        if (abVar.getContext() == null) {
            return;
        }
        if ((bool.booleanValue() || str != null) && (runnable = abVar.W1) != null) {
            runnable.run();
        }
        super.dismiss();
        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
        u80 u80Var = LaunchActivity.H1.w0;
        if (T == null) {
            return;
        }
        int i7 = 1;
        if (!bool.booleanValue()) {
            if (str != null) {
                org.telegram.ui.Components.lc.b0(T).Q(R.raw.error, 36, gd.a0(null, null, 2131743641, str)).j();
            }
        } else {
            org.telegram.ui.Components.gc L = org.telegram.ui.Components.lc.b0(T).L(R.raw.stars_send, gd.M0(2131744865, null), org.telegram.messenger.g0.W2(gd.G((int) l41Var.C, "StarsGiftSentPopupInfo", o10.l(abVar.V1))), gd.M0(2131743315, null), new g3(j3, i7));
            L.j = 5000;
            L.k(true);
            if (u80Var != null) {
                u80Var.c(true);
            }
            x8.y(abVar.a, false).R(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void L() {
        super.L();
        ks.f(this.a).n(this, ks.y3);
        ks.f(this.a).n(this, ks.A3);
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(this.o1, getContext(), this.a, 0, true, new bi.b(this, 19), this.J0);
        this.X1 = z41Var;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        za zaVar = this.T1;
        if (zaVar == null) {
            return null;
        }
        return ((TextView) zaVar.c).getText();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        z41 z41Var;
        if ((i7 == ks.y3 || i7 == ks.A3) && (z41Var = this.X1) != null) {
            z41Var.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void show() {
        rj rjVar;
        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
        if (Q instanceof bn) {
            bn bnVar = (bn) Q;
            if (bnVar.V9() && (rjVar = bnVar.a0) != null) {
                rjVar.U();
            }
        }
        super.show();
    }
}
