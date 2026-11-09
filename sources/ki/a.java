package ki;

import ah.g;
import ai.k;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.u7;
import c8.ha;
import fi.d;
import hi.u1;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.v4;
import v4.o0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class a extends na {
    public m41 P1;
    public boolean Q1;
    public final FrameLayout R1;
    public final boolean S1;
    public final boolean T1;
    public int U1;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Context context, TLRPC.Chat chat, long j3, c20 c20Var) {
        super(context, (g6) null, false);
        org.telegram.ui.Cells.g6 g6Var;
        int i7;
        int i10;
        org.telegram.ui.Cells.g6 g6Var2;
        TLRPC.User a22 = qp.s1(this.a).a2(Long.valueOf(j3));
        TLRPC.Chat M0 = qp.s1(this.a).M0(Long.valueOf(-j3));
        this.T1 = t10.t(a22);
        this.S1 = t3.V(M0);
        this.C1 = false;
        this.B1 = g0.L(12.0f);
        this.l1.setTitle(O0());
        w0(l6.a7);
        FrameLayout frameLayout = new FrameLayout(context);
        this.R1 = frameLayout;
        frameLayout.setPadding(0, g0.L(3.0f), 0, g0.L(3.0f));
        frameLayout.setLayoutParams(new o0(-1, -2));
        org.telegram.ui.Cells.g6 g6Var3 = new org.telegram.ui.Cells.g6(context, null);
        if (M0 != null) {
            g6Var = g6Var3;
            i7 = -1;
            g6Var.x(M0, null, M0.title, id.H(' ', "Members", M0.participants_count), false, false);
        } else {
            g6Var = g6Var3;
            i7 = -1;
            if (a22 != null) {
                i10 = -1;
                g6Var2 = g6Var;
                g6Var2.x(a22, null, m5.m(a22), id.M0(2131753156, null), false, false);
                frameLayout.addView(g6Var2, ha.c(-2.0f, i10));
                qj0 qj0Var = this.k1;
                int i11 = this.t0;
                qj0Var.setPadding(i11, 0, i11, g0.L(64.0f) + g0.n);
                this.k1.r1();
                this.k1.setClipToPadding(false);
                this.k1.setOnItemClickListener(new k(this, 17));
                d dVar = new d(context, this.I0, true);
                if (chat == null) {
                    dVar.setText(id.M0(t3.w(27, chat) ? 2131751974 : 2131751971, null));
                } else {
                    dVar.setText(id.M0(2131751939, null));
                }
                dVar.f();
                dVar.setOnClickListener(new g(this, c20Var, chat, 13));
                this.b.addView(dVar, ha.f(48.0f, -1, 80, g0.L(12.0f) + this.t0, 0, g0.L(12.0f) + this.t0, g0.L(12.0f) + g0.n));
                this.P1.O(false);
            }
        }
        i10 = i7;
        g6Var2 = g6Var;
        frameLayout.addView(g6Var2, ha.c(-2.0f, i10));
        qj0 qj0Var2 = this.k1;
        int i112 = this.t0;
        qj0Var2.setPadding(i112, 0, i112, g0.L(64.0f) + g0.n);
        this.k1.r1();
        this.k1.setClipToPadding(false);
        this.k1.setOnItemClickListener(new k(this, 17));
        d dVar2 = new d(context, this.I0, true);
        if (chat == null) {
        }
        dVar2.f();
        dVar2.setOnClickListener(new g(this, c20Var, chat, 13));
        this.b.addView(dVar2, ha.f(48.0f, -1, 80, g0.L(12.0f) + this.t0, 0, g0.L(12.0f) + this.t0, g0.L(12.0f) + g0.n));
        this.P1.O(false);
    }

    @Override // org.telegram.ui.Components.na
    public final pj0 L0(qj0 qj0Var) {
        m41 m41Var = new m41(this.k1, getContext(), this.a, 0, false, new u1(this, 14), this.I0);
        this.P1 = m41Var;
        m41Var.r = false;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return id.M0(this.T1 ? 2131751982 : 2131751977, null);
    }

    public final void d1(c20 c20Var, boolean z9, boolean z10) {
        if (z10 && !z9 && !this.T1) {
            v4.M(getContext(), this.I0, id.M0(2131751970, null), id.M0(this.S1 ? 2131751973 : 2131751972, null), id.M0(2131754486, null), new u7(this, c20Var, z9, 6)).show();
        } else {
            c20Var.a(Boolean.valueOf(z9));
            dismiss();
        }
    }

    public final void e1(boolean z9) {
        boolean z10;
        if (this.Q1 == z9) {
            return;
        }
        this.Q1 = z9;
        int i7 = this.U1 + 1;
        qj0 qj0Var = this.k1;
        View T0 = qj0Var.T0(i7);
        if (T0 instanceof h6) {
            ((h6) T0).a(!z9);
            z10 = false;
        } else {
            z10 = true;
        }
        View T02 = qj0Var.T0(this.U1 + 2);
        if (T02 instanceof h6) {
            ((h6) T02).a(z9);
        } else {
            z10 = true;
        }
        if (z10) {
            this.P1.O(true);
        }
    }
}
