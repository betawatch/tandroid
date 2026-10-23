package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oh0(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ri.m mVar;
        switch (this.a) {
            case 0:
                sn snVar = ((di) this.c).f;
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
                ((org.telegram.ui.ActionBar.m3) this.c).run(Long.valueOf(this.b));
                break;
            case 2:
                org.telegram.ui.web.f0 f0Var = (org.telegram.ui.web.f0) this.c;
                f0Var.getClass();
                f0Var.presentFragment(sn.W9(this.b));
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
                ug.x0 x0Var = (ug.x0) this.c;
                HashSet hashSet = x0Var.e0;
                hashSet.remove(Long.valueOf(this.b));
                x0Var.Y.b(true, hashSet, new ug.r0(x0Var, 5), null);
                x0Var.b0(true, false);
                break;
        }
    }
}
