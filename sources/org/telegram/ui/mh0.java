package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashSet;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mh0(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ri.n nVar;
        switch (this.a) {
            case 0:
                sn snVar = ((fi) this.c).e;
                snVar.D7(true);
                Bundle bundle = new Bundle();
                long j10 = this.b;
                bundle.putLong("user_id", j10);
                if (j10 == snVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                snVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 1:
                ((org.telegram.ui.ActionBar.j3) this.c).run(Long.valueOf(this.b));
                break;
            case 2:
                org.telegram.ui.web.e0 e0Var = (org.telegram.ui.web.e0) this.c;
                e0Var.getClass();
                e0Var.presentFragment(sn.W9(this.b));
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
