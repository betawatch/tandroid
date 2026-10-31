package ai;

import ag.i;
import ag.j0;
import ag.y0;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.i0;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.l6;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import s4.o0;
import vh.d;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a extends ha {
    public p51 P1;
    public boolean Q1;
    public final FrameLayout R1;
    public final boolean S1;
    public final boolean T1;
    public int U1;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Context context, TLRPC.Chat chat, long j10, q20 q20Var) {
        super(context, (p6) null, false);
        k6 k6Var;
        int i10;
        int i11;
        k6 k6Var2;
        TLRPC.User Z1 = vp.r1(this.a).Z1(Long.valueOf(j10));
        TLRPC.Chat L0 = vp.r1(this.a).L0(Long.valueOf(-j10));
        this.T1 = h20.t(Z1);
        this.S1 = w3.V(L0);
        this.C1 = false;
        this.B1 = i0.L(12.0f);
        this.l1.setTitle(O0());
        w0(t6.a7);
        FrameLayout frameLayout = new FrameLayout(context);
        this.R1 = frameLayout;
        frameLayout.setPadding(0, i0.L(3.0f), 0, i0.L(3.0f));
        frameLayout.setLayoutParams(new o0(-1, -2));
        k6 k6Var3 = new k6(context, null);
        if (L0 != null) {
            k6Var = k6Var3;
            i10 = -1;
            k6Var.z(L0, null, L0.title, cd.H(' ', "Members", L0.participants_count), false, false);
        } else {
            k6Var = k6Var3;
            i10 = -1;
            if (Z1 != null) {
                i11 = -1;
                k6Var2 = k6Var;
                k6Var2.z(Z1, null, o5.m(Z1), cd.L0(2131753156, null), false, false);
                frameLayout.addView(k6Var2, b6.c(-2.0f, i11));
                tk0 tk0Var = this.k1;
                int i12 = this.t0;
                tk0Var.setPadding(i12, 0, i12, i0.L(64.0f) + i0.n);
                this.k1.r1();
                this.k1.setClipToPadding(false);
                int i13 = 2;
                this.k1.setOnItemClickListener(new y0(this, i13));
                d dVar = new d(context, this.I0, true);
                if (chat == null) {
                    dVar.setText(cd.L0(w3.w(27, chat) ? 2131751974 : 2131751971, null));
                } else {
                    dVar.setText(cd.L0(2131751939, null));
                }
                dVar.f();
                dVar.setOnClickListener(new i(this, q20Var, chat, i13));
                this.b.addView(dVar, b6.f(48.0f, -1, 80, i0.L(12.0f) + this.t0, 0, i0.L(12.0f) + this.t0, i0.L(12.0f) + i0.n));
                this.P1.O(false);
            }
        }
        i11 = i10;
        k6Var2 = k6Var;
        frameLayout.addView(k6Var2, b6.c(-2.0f, i11));
        tk0 tk0Var2 = this.k1;
        int i122 = this.t0;
        tk0Var2.setPadding(i122, 0, i122, i0.L(64.0f) + i0.n);
        this.k1.r1();
        this.k1.setClipToPadding(false);
        int i132 = 2;
        this.k1.setOnItemClickListener(new y0(this, i132));
        d dVar2 = new d(context, this.I0, true);
        if (chat == null) {
        }
        dVar2.f();
        dVar2.setOnClickListener(new i(this, q20Var, chat, i132));
        this.b.addView(dVar2, b6.f(48.0f, -1, 80, i0.L(12.0f) + this.t0, 0, i0.L(12.0f) + this.t0, i0.L(12.0f) + i0.n));
        this.P1.O(false);
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(this.k1, getContext(), this.a, 0, false, new ag.a(this, 9), this.I0);
        this.P1 = p51Var;
        p51Var.r = false;
        return p51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return cd.L0(this.T1 ? 2131751982 : 2131751977, null);
    }

    public final void d1(q20 q20Var, boolean z10, boolean z11) {
        if (z11 && !z10 && !this.T1) {
            s4.O(getContext(), this.I0, cd.L0(2131751970, null), cd.L0(this.S1 ? 2131751973 : 2131751972, null), cd.L0(2131754486, null), new j0(this, q20Var, z10, 1)).show();
        } else {
            q20Var.a(Boolean.valueOf(z10));
            dismiss();
        }
    }

    public final void e1(boolean z10) {
        boolean z11;
        if (this.Q1 == z10) {
            return;
        }
        this.Q1 = z10;
        int i10 = this.U1 + 1;
        tk0 tk0Var = this.k1;
        View T0 = tk0Var.T0(i10);
        if (T0 instanceof l6) {
            ((l6) T0).a(!z10);
            z11 = false;
        } else {
            z11 = true;
        }
        View T02 = tk0Var.T0(this.U1 + 2);
        if (T02 instanceof l6) {
            ((l6) T02).a(z10);
        } else {
            z11 = true;
        }
        if (z11) {
            this.P1.O(true);
        }
    }
}
