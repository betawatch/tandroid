package lh;

import ag.e0;
import android.app.Activity;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.e61;
import org.telegram.ui.s61;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class h extends ha {
    public q51 P1;
    public final e61 Q1;
    public boolean R1;
    public int S1;

    public h(Activity activity, p6 p6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, p6Var);
        v0(t6.w0(t6.a7, p6Var));
        this.x = true;
        this.n = false;
        this.C1 = false;
        this.B1 = i0.L(12.0f);
        this.Q1 = s61.i0(tL_statsPollStats.votes_graph, dd.L0(2131747134, null), 2, false);
        uk0 uk0Var = this.k1;
        int i10 = this.t0;
        uk0Var.setPadding(i10, 0, i10, i0.n);
        this.k1.setClipToPadding(false);
        this.k1.setSections(true);
        y p5 = this.l1.p();
        p5.a(-1, R.drawable.ic_close_white);
        p5.setTranslationX(-i0.L(5.0f));
        this.P1.O(false);
    }

    public static int d1(int i10, long j10, int i11, e0 e0Var) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = wp.r1(i10).i1(j10);
        tL_statsGetPollStats.msg_id = i11;
        return ConnectionsManager.getInstance(i10).sendRequestTyped(tL_statsGetPollStats, new a3.b(1), new ag.a(e0Var, 18));
    }

    @Override // org.telegram.ui.Components.ha
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(uk0Var, getContext(), this.a, 0, true, new ag.a(this, 17), this.I0);
        this.P1 = q51Var;
        q51Var.r = false;
        return q51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return dd.L0(2131747135, null);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        super.s0();
        try {
            int w02 = t6.w0(t6.a7, this.I0);
            if (this.R1 && w02 == this.S1) {
                return;
            }
            this.R1 = true;
            this.S1 = w02;
            v0(w02);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
