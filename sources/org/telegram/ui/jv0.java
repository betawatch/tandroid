package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jv0(Object obj, long j10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tv0 tv0Var = (tv0) this.c;
                long j10 = this.b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                tv0Var.getClass();
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                p2Var.presentFragment(new ProfileActivity(bundle, null));
                tv0Var.c(false);
                return;
            case 1:
                qh.x7 x7Var = (qh.x7) this.c;
                long j11 = this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.d;
                x7Var.getClass();
                x7Var.d(j11, chatFull.participants);
                return;
            case 2:
                sf.e eVar = (sf.e) this.c;
                sf.d dVar = (sf.d) this.d;
                long j12 = this.b;
                if (((sf.d) eVar.c) != dVar) {
                    return;
                }
                sf.b bVar = (sf.b) eVar.e;
                if (bVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    eVar.e = null;
                }
                synchronized (sf.j.t) {
                    try {
                        sf.j jVar = sf.j.v;
                        if (jVar != null) {
                            jVar.m();
                            sf.j.v = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                eVar.c = null;
                dVar.c.run(j12);
                eVar.D();
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

    public /* synthetic */ jv0(sf.e eVar, sf.d dVar, long j10) {
        this.a = 2;
        this.c = eVar;
        this.d = dVar;
        this.b = j10;
    }
}
