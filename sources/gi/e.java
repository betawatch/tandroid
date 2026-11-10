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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.x6;
import org.telegram.ui.cn;
import org.telegram.ui.sj;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e extends ma implements ls {
    public final cg.a S1;
    public final nc T1;
    public final FrameLayout U1;
    public Runnable V1;
    public int W1;
    public m41 X1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(Context context, h6 h6Var, cg.a aVar, boolean z9, Runnable runnable) {
        super(context, null, false, false, h6Var);
        m41 m41Var;
        final int i7 = 0;
        this.u1 = 0.2f;
        this.V1 = runnable;
        N();
        pj0 pj0Var = this.n1;
        int i10 = this.t0;
        pj0Var.setPadding(i10, 0, i10, 0);
        this.n1.setOnItemClickListener(new k(this, 12));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(wq.h);
        kVar.n(350L);
        this.n1.setItemAnimator(kVar);
        v0(m6.w0(m6.h5, h6Var));
        this.S1 = aVar;
        nc ncVar = new nc(2, context, h6Var);
        this.T1 = ncVar;
        final int i11 = 1;
        ((TextView) ncVar.c).setText(id.a0(null, null, 2131744045, cg.a.i(aVar.b - ea.y(this.a, true).s().b, cg.b.b).d()));
        TextView textView = (TextView) ncVar.d;
        textView.setText(g0.X2(id.M0(2131750520, null)));
        textView.setMaxWidth(m3.a(textView.getText(), textView.getPaint()));
        this.o1.setTitle(O0());
        FrameLayout frameLayout = new FrameLayout(context);
        this.U1 = frameLayout;
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
                                vf.c.v(eVar.getContext(), id.M0(2131744028, null), false);
                                break;
                            default:
                                eVar.dismiss();
                                break;
                        }
                    }
                });
                m41Var = this.X1;
                if (m41Var == null) {
                    m41Var.O(false);
                    return;
                }
                return;
            }
        }
        dVar.i(id.M0(2131744030, null), false, true);
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
                        vf.c.v(eVar.getContext(), id.M0(2131744028, null), false);
                        break;
                    default:
                        eVar.dismiss();
                        break;
                }
            }
        });
        m41Var = this.X1;
        if (m41Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void K() {
        super.K();
        qs.f(this.a).n(this, qs.v3);
        qs.f(this.a).n(this, qs.y3);
    }

    @Override // org.telegram.ui.Components.ma
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(this.n1, getContext(), this.a, 0, true, new ai.e(this, 25), this.I0);
        this.X1 = m41Var;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        nc ncVar = this.T1;
        if (ncVar == null) {
            return null;
        }
        return ((TextView) ncVar.c).getText();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Runnable runnable;
        if (i7 == qs.v3 || i7 == qs.y3) {
            m41 m41Var = this.X1;
            if (m41Var != null) {
                m41Var.O(true);
            }
            cg.a s5 = ea.y(this.a, true).s();
            TextView textView = (TextView) this.T1.c;
            cg.a aVar = this.S1;
            textView.setText(id.a0(null, null, 2131744045, cg.a.i(aVar.b - s5.b, cg.b.b).d()));
            ia iaVar = this.o1;
            if (iaVar != null) {
                iaVar.setTitle(O0());
            }
            if (s5.b < aVar.b || (runnable = this.V1) == null) {
                return;
            }
            runnable.run();
            this.V1 = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        nc ncVar = this.T1;
        if (ncVar != null) {
            ((x6) ncVar.b).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            int w02 = m6.w0(m6.h5, this.I0);
            if (w02 != this.W1) {
                this.W1 = w02;
                v0(w02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        sj sjVar;
        if (ea.y(this.a, true).s().b >= this.S1.b) {
            Runnable runnable = this.V1;
            if (runnable != null) {
                runnable.run();
                this.V1 = null;
                return;
            }
            return;
        }
        f2 Q = LaunchActivity.Q();
        if (Q instanceof cn) {
            cn cnVar = (cn) Q;
            if (cnVar.U9() && (sjVar = cnVar.Z) != null) {
                sjVar.L();
            }
        }
        super.show();
        qs.f(this.a).c(this, qs.v3);
        qs.f(this.a).c(this, qs.y3);
    }
}
