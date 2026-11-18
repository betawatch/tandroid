package ii;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.h8;
import c8.ma;
import di.x8;
import di.za;
import hi.e7;
import hi.m3;
import org.telegram.messenger.a8;
import org.telegram.messenger.fs;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.s2;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.m7;
import org.telegram.ui.bn;
import org.telegram.ui.rj;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class s extends sa implements fs {
    public final cg.a T1;
    public final za U1;
    public final FrameLayout V1;
    public Runnable W1;
    public int X1;
    public z41 Y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(Context context, i6 i6Var, cg.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, i6Var);
        z41 z41Var;
        final int i7 = 0;
        this.v1 = 0.2f;
        this.W1 = runnable;
        O();
        ck0 ck0Var = this.o1;
        int i10 = this.u0;
        ck0Var.setPadding(i10, 0, i10, 0);
        this.o1.setOnItemClickListener(new h8(this, 13));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(lr.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        v0(n6.w0(n6.h5, i6Var));
        this.T1 = aVar;
        za zaVar = new za(2, context, i6Var);
        this.U1 = zaVar;
        final int i11 = 1;
        ((TextView) zaVar.c).setText(gd.a0(null, null, 2131743810, cg.a.j(aVar.b - x8.y(this.a, true).s().b, cg.b.b).d()));
        TextView textView = (TextView) zaVar.d;
        textView.setText(g0.W2(gd.M0(2131750504, null)));
        textView.setMaxWidth(m3.a(textView.getText(), textView.getPaint()));
        this.p1.setTitle(P0());
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        hi.d dVar = new hi.d(getContext(), this.J0, true);
        frameLayout.addView(dVar, ma.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z10) {
            t0.u();
            if (!s2.a()) {
                t0.r();
                dVar.i(gd.M0(2131752030, null), false, true);
                dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ii.r
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
                                vf.c.v(sVar.getContext(), gd.M0(2131743793, null), false);
                                break;
                            default:
                                sVar.dismiss();
                                break;
                        }
                    }
                });
                z41Var = this.Y1;
                if (z41Var == null) {
                    z41Var.O(false);
                    return;
                }
                return;
            }
        }
        dVar.i(gd.M0(2131743795, null), false, true);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ii.r
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
                        vf.c.v(sVar.getContext(), gd.M0(2131743793, null), false);
                        break;
                    default:
                        sVar.dismiss();
                        break;
                }
            }
        });
        z41Var = this.Y1;
        if (z41Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void L() {
        super.L();
        ks.f(this.a).n(this, ks.x3);
        ks.f(this.a).n(this, ks.A3);
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(this.o1, getContext(), this.a, 0, true, new e7(this, 5), this.J0);
        this.Y1 = z41Var;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        za zaVar = this.U1;
        if (zaVar == null) {
            return null;
        }
        return ((TextView) zaVar.c).getText();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Runnable runnable;
        if (i7 == ks.x3 || i7 == ks.A3) {
            z41 z41Var = this.Y1;
            if (z41Var != null) {
                z41Var.O(true);
            }
            cg.a s5 = x8.y(this.a, true).s();
            TextView textView = (TextView) this.U1.c;
            cg.a aVar = this.T1;
            textView.setText(gd.a0(null, null, 2131743810, cg.a.j(aVar.b - s5.b, cg.b.b).d()));
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

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        super.dismiss();
        za zaVar = this.U1;
        if (zaVar != null) {
            ((m7) zaVar.b).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void s0() {
        super.s0();
        try {
            int w02 = n6.w0(n6.h5, this.J0);
            if (w02 != this.X1) {
                this.X1 = w02;
                v0(w02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void show() {
        rj rjVar;
        if (x8.y(this.a, true).s().b >= this.T1.b) {
            Runnable runnable = this.W1;
            if (runnable != null) {
                runnable.run();
                this.W1 = null;
                return;
            }
            return;
        }
        h2 Q = LaunchActivity.Q();
        if (Q instanceof bn) {
            bn bnVar = (bn) Q;
            if (bnVar.V9() && (rjVar = bnVar.a0) != null) {
                rjVar.U();
            }
        }
        super.show();
        ks.f(this.a).c(this, ks.x3);
        ks.f(this.a).c(this, ks.A3);
    }
}
