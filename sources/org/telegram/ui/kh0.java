package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashSet;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
        ri.m mVar;
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
                ri.o oVar = (ri.o) ((cc.e) this.c).c;
                if (this.b == oVar.p && (mVar = oVar.n) != ri.m.r && mVar != ri.m.s && mVar != ri.m.n) {
                    SystemClock.elapsedRealtime();
                    oVar.x = false;
                    oVar.r(ri.m.c);
                    oVar.i.removeCallbacks(oVar.E);
                    oVar.h.b("recording started: retainedDurationMs=" + ri.o.q(oVar.q));
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
