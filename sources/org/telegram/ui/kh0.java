package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashSet;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class kh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kh0(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ri.n nVar;
        switch (this.a) {
            case 0:
                qn qnVar = ((di) this.c).e;
                qnVar.D7(true);
                Bundle bundle = new Bundle();
                long j10 = this.b;
                bundle.putLong("user_id", j10);
                if (j10 == qnVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 1:
                ((org.telegram.ui.ActionBar.j3) this.c).run(Long.valueOf(this.b));
                break;
            case 2:
                org.telegram.ui.web.e0 e0Var = (org.telegram.ui.web.e0) this.c;
                e0Var.getClass();
                e0Var.presentFragment(qn.W9(this.b));
                break;
            case 3:
                ri.p pVar = (ri.p) ((cc.e) this.c).c;
                if (this.b == pVar.o && (nVar = pVar.m) != ri.n.r && nVar != ri.n.s && nVar != ri.n.n) {
                    SystemClock.elapsedRealtime();
                    pVar.w = false;
                    pVar.r(ri.n.c);
                    pVar.h.removeCallbacks(pVar.D);
                    pVar.g.b("recording started: retainedDurationMs=" + ri.p.q(pVar.p));
                    break;
                }
                break;
            default:
                ug.y0 y0Var = (ug.y0) this.c;
                HashSet hashSet = y0Var.e0;
                hashSet.remove(Long.valueOf(this.b));
                y0Var.Y.b(true, hashSet, new ug.s0(y0Var, 5), null);
                y0Var.c0(true, false);
                break;
        }
    }
}
