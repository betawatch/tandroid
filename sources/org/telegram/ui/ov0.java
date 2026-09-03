package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ov0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ov0(Object obj, long j10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yv0 yv0Var = (yv0) this.c;
                long j10 = this.b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                yv0Var.getClass();
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                p2Var.presentFragment(new ProfileActivity(bundle, null));
                yv0Var.c(false);
                return;
            case 1:
                ph.y7 y7Var = (ph.y7) this.c;
                long j11 = this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.d;
                y7Var.getClass();
                y7Var.d(j11, chatFull.participants);
                return;
            case 2:
                rf.f fVar = (rf.f) this.c;
                rf.e eVar = (rf.e) this.d;
                long j12 = this.b;
                if (((rf.e) fVar.c) != eVar) {
                    return;
                }
                rf.c cVar = (rf.c) fVar.e;
                if (cVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    fVar.e = null;
                }
                synchronized (rf.j.t) {
                    try {
                        rf.j jVar = rf.j.v;
                        if (jVar != null) {
                            jVar.m();
                            rf.j.v = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                fVar.c = null;
                eVar.c.run(j12);
                fVar.D();
                return;
            default:
                long[] jArr = (long[]) this.c;
                long j13 = this.b;
                dg.f3 f3Var = (dg.f3) this.d;
                jArr[0] = j13;
                f3Var.run();
                return;
        }
    }

    public /* synthetic */ ov0(rf.f fVar, rf.e eVar, long j10) {
        this.a = 2;
        this.c = fVar;
        this.d = eVar;
        this.b = j10;
    }
}
