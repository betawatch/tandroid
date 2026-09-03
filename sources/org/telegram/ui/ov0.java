package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                qh.w7 w7Var = (qh.w7) this.c;
                long j11 = this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.d;
                w7Var.getClass();
                w7Var.d(j11, chatFull.participants);
                return;
            case 2:
                sf.f fVar = (sf.f) this.c;
                sf.e eVar = (sf.e) this.d;
                long j12 = this.b;
                if (((sf.e) fVar.c) != eVar) {
                    return;
                }
                sf.c cVar = (sf.c) fVar.e;
                if (cVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    fVar.e = null;
                }
                synchronized (sf.k.t) {
                    try {
                        sf.k kVar = sf.k.v;
                        if (kVar != null) {
                            kVar.m();
                            sf.k.v = null;
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
                eg.d3 d3Var = (eg.d3) this.d;
                jArr[0] = j13;
                d3Var.run();
                return;
        }
    }

    public /* synthetic */ ov0(sf.f fVar, sf.e eVar, long j10) {
        this.a = 2;
        this.c = fVar;
        this.d = eVar;
        this.b = j10;
    }
}
