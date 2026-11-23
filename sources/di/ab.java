package di;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.su0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.rj;
import org.telegram.ui.t80;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ab extends org.telegram.ui.Components.ra implements fs {
    public final za T1;
    public final FrameLayout U1;
    public final TLRPC.User V1;
    public final Runnable W1;
    public b51 X1;
    public boolean Y1;

    public ab(Context context, org.telegram.ui.ActionBar.i6 i6Var, TLRPC.User user, Runnable runnable) {
        super(context, null, false, false, i6Var);
        this.V1 = user;
        this.W1 = runnable;
        this.v1 = 0.2f;
        ks.f(this.a).c(this, ks.y3);
        ks.f(this.a).c(this, ks.A3);
        O();
        ek0 ek0Var = this.o1;
        int i7 = this.u0;
        final int i10 = 0;
        ek0Var.setPadding(i7, 0, i7, 0);
        this.o1.setOnItemClickListener(new bi.n8(this, 3));
        v4.l lVar = new v4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(kr.h);
        lVar.n(350L);
        this.o1.setItemAnimator(lVar);
        w0(org.telegram.ui.ActionBar.n6.i5);
        za zaVar = new za(0, context, i6Var);
        this.T1 = zaVar;
        ((TextView) zaVar.c).setText(gd.N0(2131749431, null));
        j80 j80Var = (j80) zaVar.d;
        final int i11 = 1;
        j80Var.setText(TextUtils.concat(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749433, n10.l(user))), " ", org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(gd.N0(2131749432, null).replace(' ', (char) 160), new Runnable(this) { // from class: di.ya
            public final /* synthetic */ ab b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.g2 g2Var;
                int i12 = i10;
                ab abVar = this.b;
                switch (i12) {
                    case 0:
                        su0 su0Var = new su0(abVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(abVar.j1) && (g2Var = abVar.j1) != null) {
                            su0Var.a0(g2Var);
                        }
                        su0Var.show();
                        break;
                    default:
                        vf.c.t(abVar.getContext(), gd.N0(2131744725, null));
                        break;
                }
            }
        }), true)));
        j80Var.setMaxWidth(hi.u3.a(j80Var.getText(), j80Var.getPaint()) + 1);
        this.p1.setTitle(P0());
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        a9Var.r(user);
        ((org.telegram.ui.Components.p9) zaVar.b).f(user, a9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U1 = frameLayout;
        j80 j80Var2 = new j80(context, i6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        j80Var2.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.u6.U(j80Var2, org.telegram.ui.ActionBar.n6.B6, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var2, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        j80Var2.setText(org.telegram.messenger.g0.T2(gd.N0(2131744726, null), new Runnable(this) { // from class: di.ya
            public final /* synthetic */ ab b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.g2 g2Var;
                int i12 = i11;
                ab abVar = this.b;
                switch (i12) {
                    case 0:
                        su0 su0Var = new su0(abVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(abVar.j1) && (g2Var = abVar.j1) != null) {
                            su0Var.a0(g2Var);
                        }
                        su0Var.show();
                        break;
                    default:
                        vf.c.t(abVar.getContext(), gd.N0(2131744725, null));
                        break;
                }
            }
        }));
        j80Var2.setGravity(17);
        j80Var2.setMaxWidth(hi.u3.a(j80Var2.getText(), j80Var2.getPaint()));
        frameLayout.addView(j80Var2, c8.na.e(-2, -1, 17));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, frameLayout, i6Var);
        this.b.addView(new tz(getContext()), c8.na.c(-1.0f, -1));
        b51 b51Var = this.X1;
        if (b51Var != null) {
            b51Var.O(false);
        }
    }

    public static void e1(ab abVar, n41 n41Var, long j3, Boolean bool, String str) {
        Runnable runnable;
        if (abVar.getContext() == null) {
            return;
        }
        if ((bool.booleanValue() || str != null) && (runnable = abVar.W1) != null) {
            runnable.run();
        }
        super.dismiss();
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        t80 t80Var = LaunchActivity.H1.w0;
        if (T == null) {
            return;
        }
        int i7 = 1;
        if (!bool.booleanValue()) {
            if (str != null) {
                org.telegram.ui.Components.kc.b0(T).Q(R.raw.error, 36, gd.a0(null, null, 2131743631, str)).j();
            }
        } else {
            org.telegram.ui.Components.fc L = org.telegram.ui.Components.kc.b0(T).L(R.raw.stars_send, gd.N0(2131744859, null), org.telegram.messenger.g0.W2(gd.G((int) n41Var.C, "StarsGiftSentPopupInfo", n10.l(abVar.V1))), gd.N0(2131743302, null), new g3(j3, i7));
            L.j = 5000;
            L.k(true);
            if (t80Var != null) {
                t80Var.c(true);
            }
            y8.y(abVar.a, false).R(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void L() {
        super.L();
        ks.f(this.a).n(this, ks.y3);
        ks.f(this.a).n(this, ks.A3);
    }

    @Override // org.telegram.ui.Components.ra
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(this.o1, getContext(), this.a, 0, true, new bi.b(this, 19), this.J0);
        this.X1 = b51Var;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.ra
    public final CharSequence P0() {
        za zaVar = this.T1;
        if (zaVar == null) {
            return null;
        }
        return ((TextView) zaVar.c).getText();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        b51 b51Var;
        if ((i7 == ks.y3 || i7 == ks.A3) && (b51Var = this.X1) != null) {
            b51Var.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        rj rjVar;
        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
        if (Q instanceof bn) {
            bn bnVar = (bn) Q;
            if (bnVar.V9() && (rjVar = bnVar.a0) != null) {
                rjVar.U();
            }
        }
        super.show();
    }
}
