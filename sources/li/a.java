package li;

import ai.h;
import ai.j6;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import ci.v6;
import gi.d;
import gi.q4;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.tj0;
import u4.p0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a extends ma {
    public f41 Q1;
    public boolean R1;
    public final FrameLayout S1;
    public final boolean T1;
    public final boolean U1;
    public int V1;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Context context, TLRPC.Chat chat, long j10, u10 u10Var) {
        super(context, (e6) null, false);
        f6 f6Var;
        int i3;
        int i10;
        f6 f6Var2;
        TLRPC.User a22 = hp.s1(this.a).a2(Long.valueOf(j10));
        TLRPC.Chat M0 = hp.s1(this.a).M0(Long.valueOf(-j10));
        this.U1 = l10.t(a22);
        this.T1 = t3.V(M0);
        this.D1 = false;
        this.C1 = g0.L(12.0f);
        this.m1.setTitle(O0());
        w0(k6.a7);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        frameLayout.setPadding(0, g0.L(3.0f), 0, g0.L(3.0f));
        frameLayout.setLayoutParams(new p0(-1, -2));
        f6 f6Var3 = new f6(context, null);
        if (M0 != null) {
            f6Var = f6Var3;
            i3 = -1;
            f6Var.x(M0, null, M0.title, bd.H(' ', "Members", M0.participants_count), false, false);
        } else {
            f6Var = f6Var3;
            i3 = -1;
            if (a22 != null) {
                i10 = -1;
                f6Var2 = f6Var;
                f6Var2.x(a22, null, m5.m(a22), bd.M0(2131753156, null), false, false);
                frameLayout.addView(f6Var2, mf.c(-2.0f, i10));
                tj0 tj0Var = this.l1;
                int i11 = this.u0;
                tj0Var.setPadding(i11, 0, i11, g0.L(64.0f) + g0.n);
                this.l1.r1();
                this.l1.setClipToPadding(false);
                int i12 = 18;
                this.l1.setOnItemClickListener(new j6(this, i12));
                d dVar = new d(context, this.J0, true);
                if (chat == null) {
                    dVar.setText(bd.M0(t3.w(27, chat) ? 2131751974 : 2131751971, null));
                } else {
                    dVar.setText(bd.M0(2131751939, null));
                }
                dVar.f();
                dVar.setOnClickListener(new h(this, u10Var, chat, i12));
                this.b.addView(dVar, mf.f(48.0f, -1, 80, g0.L(12.0f) + this.u0, 0, g0.L(12.0f) + this.u0, g0.L(12.0f) + g0.n));
                this.Q1.O(false);
            }
        }
        i10 = i3;
        f6Var2 = f6Var;
        frameLayout.addView(f6Var2, mf.c(-2.0f, i10));
        tj0 tj0Var2 = this.l1;
        int i112 = this.u0;
        tj0Var2.setPadding(i112, 0, i112, g0.L(64.0f) + g0.n);
        this.l1.r1();
        this.l1.setClipToPadding(false);
        int i122 = 18;
        this.l1.setOnItemClickListener(new j6(this, i122));
        d dVar2 = new d(context, this.J0, true);
        if (chat == null) {
        }
        dVar2.f();
        dVar2.setOnClickListener(new h(this, u10Var, chat, i122));
        this.b.addView(dVar2, mf.f(48.0f, -1, 80, g0.L(12.0f) + this.u0, 0, g0.L(12.0f) + this.u0, g0.L(12.0f) + g0.n));
        this.Q1.O(false);
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.l1, getContext(), this.a, 0, false, new q4(this, 24), this.J0);
        this.Q1 = f41Var;
        f41Var.r = false;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return bd.M0(this.U1 ? 2131751982 : 2131751977, null);
    }

    public final void d1(u10 u10Var, boolean z10, boolean z11) {
        if (z11 && !z10 && !this.U1) {
            t4.O(getContext(), this.J0, bd.M0(2131751970, null), bd.M0(this.T1 ? 2131751973 : 2131751972, null), bd.M0(2131754486, null), new v6(this, u10Var, z10, 6)).show();
        } else {
            u10Var.a(Boolean.valueOf(z10));
            dismiss();
        }
    }

    public final void e1(boolean z10) {
        boolean z11;
        if (this.R1 == z10) {
            return;
        }
        this.R1 = z10;
        int i3 = this.V1 + 1;
        tj0 tj0Var = this.l1;
        View T0 = tj0Var.T0(i3);
        if (T0 instanceof g6) {
            ((g6) T0).a(!z10);
            z11 = false;
        } else {
            z11 = true;
        }
        View T02 = tj0Var.T0(this.V1 + 2);
        if (T02 instanceof g6) {
            ((g6) T02).a(z10);
        } else {
            z11 = true;
        }
        if (z11) {
            this.Q1.O(true);
        }
    }
}
