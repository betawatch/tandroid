package hi;

import ai.j6;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import ci.e9;
import ci.gb;
import gi.l3;
import gi.q4;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.u6;
import org.telegram.ui.mj;
import org.telegram.ui.wm;
import u4.k;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f extends ma implements cs {
    public final dg.a Q1;
    public final gb R1;
    public final FrameLayout S1;
    public Runnable T1;
    public int U1;
    public f41 V1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(Context context, e6 e6Var, dg.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, e6Var);
        f41 f41Var;
        final int i3 = 0;
        this.s1 = 0.2f;
        this.T1 = runnable;
        N();
        tj0 tj0Var = this.l1;
        int i10 = this.u0;
        tj0Var.setPadding(i10, 0, i10, 0);
        this.l1.setOnItemClickListener(new j6(this, 13));
        k kVar = new k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.l1.setItemAnimator(kVar);
        v0(k6.w0(k6.h5, e6Var));
        this.Q1 = aVar;
        gb gbVar = new gb(2, context, e6Var);
        this.R1 = gbVar;
        final int i11 = 1;
        ((TextView) gbVar.c).setText(bd.a0(null, null, 2131744055, dg.a.i(aVar.b - e9.y(this.a, true).s().b, dg.b.b).d()));
        TextView textView = (TextView) gbVar.d;
        textView.setText(g0.X2(bd.M0(2131750528, null)));
        textView.setMaxWidth(l3.a(textView.getText(), textView.getPaint()));
        this.m1.setTitle(O0());
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        gi.d dVar = new gi.d(getContext(), this.J0, true);
        frameLayout.addView(dVar, mf.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z10) {
            t0.u();
            if (!r2.a()) {
                t0.r();
                dVar.i(bd.M0(2131752041, null), false, true);
                dVar.setOnClickListener(new View.OnClickListener(this) { // from class: hi.e
                    public final /* synthetic */ f b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i12 = i11;
                        f fVar = this.b;
                        switch (i12) {
                            case 0:
                                sf.c.v(fVar.getContext(), bd.M0(2131744038, null), false);
                                break;
                            default:
                                fVar.dismiss();
                                break;
                        }
                    }
                });
                f41Var = this.V1;
                if (f41Var == null) {
                    f41Var.O(false);
                    return;
                }
                return;
            }
        }
        dVar.i(bd.M0(2131744040, null), false, true);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: hi.e
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i3;
                f fVar = this.b;
                switch (i12) {
                    case 0:
                        sf.c.v(fVar.getContext(), bd.M0(2131744038, null), false);
                        break;
                    default:
                        fVar.dismiss();
                        break;
                }
            }
        });
        f41Var = this.V1;
        if (f41Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void K() {
        super.K();
        hs.f(this.a).n(this, hs.v3);
        hs.f(this.a).n(this, hs.y3);
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.l1, getContext(), this.a, 0, true, new q4(this, 5), this.J0);
        this.V1 = f41Var;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        gb gbVar = this.R1;
        if (gbVar == null) {
            return null;
        }
        return ((TextView) gbVar.c).getText();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        Runnable runnable;
        if (i3 == hs.v3 || i3 == hs.y3) {
            f41 f41Var = this.V1;
            if (f41Var != null) {
                f41Var.O(true);
            }
            dg.a s6 = e9.y(this.a, true).s();
            TextView textView = (TextView) this.R1.c;
            dg.a aVar = this.Q1;
            textView.setText(bd.a0(null, null, 2131744055, dg.a.i(aVar.b - s6.b, dg.b.b).d()));
            ia iaVar = this.m1;
            if (iaVar != null) {
                iaVar.setTitle(O0());
            }
            if (s6.b < aVar.b || (runnable = this.T1) == null) {
                return;
            }
            runnable.run();
            this.T1 = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        gb gbVar = this.R1;
        if (gbVar != null) {
            ((u6) gbVar.b).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        super.s0();
        try {
            int w02 = k6.w0(k6.h5, this.J0);
            if (w02 != this.U1) {
                this.U1 = w02;
                v0(w02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        mj mjVar;
        if (e9.y(this.a, true).s().b >= this.Q1.b) {
            Runnable runnable = this.T1;
            if (runnable != null) {
                runnable.run();
                this.T1 = null;
                return;
            }
            return;
        }
        d2 Q = LaunchActivity.Q();
        if (Q instanceof wm) {
            wm wmVar = (wm) Q;
            if (wmVar.T9() && (mjVar = wmVar.a0) != null) {
                mjVar.L();
            }
        }
        super.show();
        hs.f(this.a).c(this, hs.v3);
        hs.f(this.a).c(this, hs.y3);
    }
}
