package ii;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.b6;
import di.v8;
import di.wa;
import hi.l3;
import hi.q4;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.w6;
import org.telegram.ui.an;
import org.telegram.ui.qj;
import v4.k;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class e extends ja implements is {
    public final cg.a T1;
    public final wa U1;
    public final FrameLayout V1;
    public Runnable W1;
    public int X1;
    public p41 Y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(Context context, e6 e6Var, cg.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, e6Var);
        p41 p41Var;
        final int i7 = 0;
        this.v1 = 0.2f;
        this.W1 = runnable;
        O();
        uj0 uj0Var = this.o1;
        int i10 = this.u0;
        uj0Var.setPadding(i10, 0, i10, 0);
        this.o1.setOnItemClickListener(new b6(this, 13));
        k kVar = new k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(er.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        v0(j6.w0(j6.h5, e6Var));
        this.T1 = aVar;
        wa waVar = new wa(2, context, e6Var);
        this.U1 = waVar;
        final int i11 = 1;
        ((TextView) waVar.c).setText(hd.a0(null, null, 2131744045, cg.a.i(aVar.b - v8.y(this.a, true).s().b, cg.b.b).d()));
        TextView textView = (TextView) waVar.d;
        textView.setText(g0.X2(hd.M0(2131750520, null)));
        textView.setMaxWidth(l3.a(textView.getText(), textView.getPaint()));
        this.p1.setTitle(O0());
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        hi.d dVar = new hi.d(getContext(), this.J0, true);
        frameLayout.addView(dVar, c8.ja.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z10) {
            t0.u();
            if (!r2.a()) {
                t0.r();
                dVar.i(hd.M0(2131752041, null), false, true);
                dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ii.d
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
                                vf.c.v(eVar.getContext(), hd.M0(2131744028, null), false);
                                break;
                            default:
                                eVar.dismiss();
                                break;
                        }
                    }
                });
                p41Var = this.Y1;
                if (p41Var == null) {
                    p41Var.O(false);
                    return;
                }
                return;
            }
        }
        dVar.i(hd.M0(2131744030, null), false, true);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ii.d
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
                        vf.c.v(eVar.getContext(), hd.M0(2131744028, null), false);
                        break;
                    default:
                        eVar.dismiss();
                        break;
                }
            }
        });
        p41Var = this.Y1;
        if (p41Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void L() {
        super.L();
        ns.f(this.a).n(this, ns.v3);
        ns.f(this.a).n(this, ns.y3);
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.o1, getContext(), this.a, 0, true, new q4(this, 5), this.J0);
        this.Y1 = p41Var;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        wa waVar = this.U1;
        if (waVar == null) {
            return null;
        }
        return ((TextView) waVar.c).getText();
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Runnable runnable;
        if (i7 == ns.v3 || i7 == ns.y3) {
            p41 p41Var = this.Y1;
            if (p41Var != null) {
                p41Var.O(true);
            }
            cg.a s5 = v8.y(this.a, true).s();
            TextView textView = (TextView) this.U1.c;
            cg.a aVar = this.T1;
            textView.setText(hd.a0(null, null, 2131744045, cg.a.i(aVar.b - s5.b, cg.b.b).d()));
            fa faVar = this.p1;
            if (faVar != null) {
                faVar.setTitle(O0());
            }
            if (s5.b < aVar.b || (runnable = this.W1) == null) {
                return;
            }
            runnable.run();
            this.W1 = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        wa waVar = this.U1;
        if (waVar != null) {
            ((w6) waVar.b).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        super.s0();
        try {
            int w02 = j6.w0(j6.h5, this.J0);
            if (w02 != this.X1) {
                this.X1 = w02;
                v0(w02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        qj qjVar;
        if (v8.y(this.a, true).s().b >= this.T1.b) {
            Runnable runnable = this.W1;
            if (runnable != null) {
                runnable.run();
                this.W1 = null;
                return;
            }
            return;
        }
        e2 Q = LaunchActivity.Q();
        if (Q instanceof an) {
            an anVar = (an) Q;
            if (anVar.V9() && (qjVar = anVar.a0) != null) {
                qjVar.S();
            }
        }
        super.show();
        ns.f(this.a).c(this, ns.v3);
        ns.f(this.a).c(this, ns.y3);
    }
}
