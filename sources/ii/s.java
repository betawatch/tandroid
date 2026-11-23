package ii;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.k8;
import c8.ma;
import di.y8;
import di.za;
import hi.d7;
import hi.l3;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.s2;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.m7;
import org.telegram.ui.bn;
import org.telegram.ui.rj;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class s extends sa implements gs {
    public final cg.a T1;
    public final za U1;
    public final FrameLayout V1;
    public Runnable W1;
    public int X1;
    public c51 Y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(Context context, h6 h6Var, cg.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, h6Var);
        c51 c51Var;
        final int i7 = 0;
        this.v1 = 0.2f;
        this.W1 = runnable;
        O();
        ek0 ek0Var = this.o1;
        int i10 = this.u0;
        ek0Var.setPadding(i10, 0, i10, 0);
        this.o1.setOnItemClickListener(new k8(this, 13));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(nr.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        v0(m6.w0(m6.h5, h6Var));
        this.T1 = aVar;
        za zaVar = new za(2, context, h6Var);
        this.U1 = zaVar;
        final int i11 = 1;
        ((TextView) zaVar.c).setText(hd.a0(null, null, 2131743802, cg.a.j(aVar.b - y8.y(this.a, true).s().b, cg.b.b).d()));
        TextView textView = (TextView) zaVar.d;
        textView.setText(g0.W2(hd.N0(2131750503, null)));
        textView.setMaxWidth(l3.a(textView.getText(), textView.getPaint()));
        this.p1.setTitle(P0());
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        hi.e eVar = new hi.e(getContext(), this.J0, true);
        frameLayout.addView(eVar, ma.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z10) {
            t0.u();
            if (!s2.a()) {
                t0.r();
                eVar.i(hd.N0(2131752029, null), false, true);
                eVar.setOnClickListener(new View.OnClickListener(this) { // from class: ii.r
                    public final /* synthetic */ s b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i12 = i11;
                        s sVar = this.b;
                        switch (i12) {
                            case 0:
                                vf.c.v(sVar.getContext(), hd.N0(2131743785, null), false);
                                break;
                            default:
                                sVar.dismiss();
                                break;
                        }
                    }
                });
                c51Var = this.Y1;
                if (c51Var == null) {
                    c51Var.O(false);
                    return;
                }
                return;
            }
        }
        eVar.i(hd.N0(2131743787, null), false, true);
        eVar.setOnClickListener(new View.OnClickListener(this) { // from class: ii.r
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i7;
                s sVar = this.b;
                switch (i12) {
                    case 0:
                        vf.c.v(sVar.getContext(), hd.N0(2131743785, null), false);
                        break;
                    default:
                        sVar.dismiss();
                        break;
                }
            }
        });
        c51Var = this.Y1;
        if (c51Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void L() {
        super.L();
        ls.f(this.a).n(this, ls.x3);
        ls.f(this.a).n(this, ls.A3);
    }

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(this.o1, getContext(), this.a, 0, true, new d7(this, 5), this.J0);
        this.Y1 = c51Var;
        return c51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        za zaVar = this.U1;
        if (zaVar == null) {
            return null;
        }
        return ((TextView) zaVar.c).getText();
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Runnable runnable;
        if (i7 == ls.x3 || i7 == ls.A3) {
            c51 c51Var = this.Y1;
            if (c51Var != null) {
                c51Var.O(true);
            }
            cg.a s5 = y8.y(this.a, true).s();
            TextView textView = (TextView) this.U1.c;
            cg.a aVar = this.T1;
            textView.setText(hd.a0(null, null, 2131743802, cg.a.j(aVar.b - s5.b, cg.b.b).d()));
            na naVar = this.p1;
            if (naVar != null) {
                naVar.setTitle(P0());
            }
            if (s5.b < aVar.b || (runnable = this.W1) == null) {
                return;
            }
            runnable.run();
            this.W1 = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        za zaVar = this.U1;
        if (zaVar != null) {
            ((m7) zaVar.b).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            int w02 = m6.w0(m6.h5, this.J0);
            if (w02 != this.X1) {
                this.X1 = w02;
                v0(w02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        rj rjVar;
        if (y8.y(this.a, true).s().b >= this.T1.b) {
            Runnable runnable = this.W1;
            if (runnable != null) {
                runnable.run();
                this.W1 = null;
                return;
            }
            return;
        }
        g2 Q = LaunchActivity.Q();
        if (Q instanceof bn) {
            bn bnVar = (bn) Q;
            if (bnVar.V9() && (rjVar = bnVar.a0) != null) {
                rjVar.U();
            }
        }
        super.show();
        ls.f(this.a).c(this, ls.x3);
        ls.f(this.a).c(this, ls.A3);
    }
}
