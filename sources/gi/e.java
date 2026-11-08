package gi;

import ai.k;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.ea;
import bi.nc;
import c8.ha;
import fi.m3;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.v6;
import org.telegram.ui.an;
import org.telegram.ui.qj;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class e extends na implements ls {
    public final cg.a P1;
    public final nc Q1;
    public final FrameLayout R1;
    public Runnable S1;
    public int T1;
    public l41 U1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(Context context, f6 f6Var, cg.a aVar, boolean z9, Runnable runnable) {
        super(context, null, false, false, f6Var);
        l41 l41Var;
        final int i7 = 0;
        this.r1 = 0.2f;
        this.S1 = runnable;
        N();
        pj0 pj0Var = this.k1;
        int i10 = this.t0;
        pj0Var.setPadding(i10, 0, i10, 0);
        this.k1.setOnItemClickListener(new k(this, 12));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.k1.setItemAnimator(kVar);
        v0(k6.w0(k6.h5, f6Var));
        this.P1 = aVar;
        nc ncVar = new nc(2, context, f6Var);
        this.Q1 = ncVar;
        final int i11 = 1;
        ((TextView) ncVar.c).setText(id.a0(null, null, 2131744048, cg.a.i(aVar.b - ea.y(this.a, true).s().b, cg.b.b).d()));
        TextView textView = (TextView) ncVar.d;
        textView.setText(g0.X2(id.M0(2131750521, null)));
        textView.setMaxWidth(m3.a(textView.getText(), textView.getPaint()));
        this.l1.setTitle(O0());
        FrameLayout frameLayout = new FrameLayout(context);
        this.R1 = frameLayout;
        fi.d dVar = new fi.d(getContext(), this.I0, true);
        frameLayout.addView(dVar, ha.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z9) {
            t0.u();
            if (!r2.a()) {
                t0.r();
                dVar.i(id.M0(2131752041, null), false, true);
                dVar.setOnClickListener(new View.OnClickListener(this) { // from class: gi.d
                    public final /* synthetic */ e b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i12 = i11;
                        e eVar = this.b;
                        switch (i12) {
                            case 0:
                                vf.c.v(eVar.getContext(), id.M0(2131744031, null), false);
                                break;
                            default:
                                eVar.dismiss();
                                break;
                        }
                    }
                });
                l41Var = this.U1;
                if (l41Var == null) {
                    l41Var.O(false);
                    return;
                }
                return;
            }
        }
        dVar.i(id.M0(2131744033, null), false, true);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: gi.d
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i7;
                e eVar = this.b;
                switch (i12) {
                    case 0:
                        vf.c.v(eVar.getContext(), id.M0(2131744031, null), false);
                        break;
                    default:
                        eVar.dismiss();
                        break;
                }
            }
        });
        l41Var = this.U1;
        if (l41Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void K() {
        super.K();
        qs.f(this.a).n(this, qs.v3);
        qs.f(this.a).n(this, qs.y3);
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(this.k1, getContext(), this.a, 0, true, new ai.e(this, 25), this.I0);
        this.U1 = l41Var;
        return l41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        nc ncVar = this.Q1;
        if (ncVar == null) {
            return null;
        }
        return ((TextView) ncVar.c).getText();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Runnable runnable;
        if (i7 == qs.v3 || i7 == qs.y3) {
            l41 l41Var = this.U1;
            if (l41Var != null) {
                l41Var.O(true);
            }
            cg.a s5 = ea.y(this.a, true).s();
            TextView textView = (TextView) this.Q1.c;
            cg.a aVar = this.P1;
            textView.setText(id.a0(null, null, 2131744048, cg.a.i(aVar.b - s5.b, cg.b.b).d()));
            ja jaVar = this.l1;
            if (jaVar != null) {
                jaVar.setTitle(O0());
            }
            if (s5.b < aVar.b || (runnable = this.S1) == null) {
                return;
            }
            runnable.run();
            this.S1 = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        nc ncVar = this.Q1;
        if (ncVar != null) {
            ((v6) ncVar.b).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        super.s0();
        try {
            int w02 = k6.w0(k6.h5, this.I0);
            if (w02 != this.T1) {
                this.T1 = w02;
                v0(w02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        qj qjVar;
        if (ea.y(this.a, true).s().b >= this.P1.b) {
            Runnable runnable = this.S1;
            if (runnable != null) {
                runnable.run();
                this.S1 = null;
                return;
            }
            return;
        }
        f2 Q = LaunchActivity.Q();
        if (Q instanceof an) {
            an anVar = (an) Q;
            if (anVar.T9() && (qjVar = anVar.Z) != null) {
                qjVar.L();
            }
        }
        super.show();
        qs.f(this.a).c(this, qs.v3);
        qs.f(this.a).c(this, qs.y3);
    }
}
