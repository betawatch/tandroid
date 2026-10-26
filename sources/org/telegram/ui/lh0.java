package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashSet;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lh0(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ui.m mVar;
        switch (this.a) {
            case 0:
                un unVar = ((ei) this.c).f;
                unVar.H7(true);
                Bundle bundle = new Bundle();
                long j10 = this.b;
                bundle.putLong("user_id", j10);
                if (j10 == unVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                unVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 1:
                ((li.s2) this.c).run(Long.valueOf(this.b));
                break;
            case 2:
                org.telegram.ui.web.e0 e0Var = (org.telegram.ui.web.e0) this.c;
                e0Var.getClass();
                e0Var.presentFragment(un.ba(this.b));
                break;
            case 3:
                ui.o oVar = (ui.o) ((dc.e) this.c).c;
                if (this.b == oVar.p && (mVar = oVar.n) != ui.m.r && mVar != ui.m.s && mVar != ui.m.n) {
                    SystemClock.elapsedRealtime();
                    oVar.x = false;
                    oVar.r(ui.m.c);
                    oVar.i.removeCallbacks(oVar.E);
                    oVar.h.b("recording started: retainedDurationMs=" + ui.o.q(oVar.q));
                    break;
                }
                break;
            default:
                vg.z0 z0Var = (vg.z0) this.c;
                HashSet hashSet = z0Var.e0;
                hashSet.remove(Long.valueOf(this.b));
                z0Var.Y.b(true, hashSet, new vg.t0(z0Var, 5), null);
                z0Var.b0(true, false);
                break;
        }
    }
}
