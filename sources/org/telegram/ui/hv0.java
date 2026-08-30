package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hv0(Object obj, long j10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rv0 rv0Var = (rv0) this.c;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                rv0Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                p2Var.presentFragment(new ProfileActivity(bundle, null));
                rv0Var.c(false);
                break;
            case 1:
                ph.z7 z7Var = (ph.z7) this.c;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.d;
                z7Var.getClass();
                z7Var.d(this.b, chatFull.participants);
                break;
            default:
                long[] jArr = (long[]) this.c;
                dg.f3 f3Var = (dg.f3) this.d;
                jArr[0] = this.b;
                f3Var.run();
                break;
        }
    }
}
