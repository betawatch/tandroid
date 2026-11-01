package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.vs;
import org.telegram.ui.if0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class z implements Runnable, vs {
    public boolean a;
    public final /* synthetic */ at b;
    public final /* synthetic */ if0 c;
    public final /* synthetic */ k0 d;

    public z(at atVar, if0 if0Var, k0 k0Var) {
        this.b = atVar;
        this.c = if0Var;
        this.d = k0Var;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        k0 k0Var = this.d;
        if (k0Var.e == null) {
            return;
        }
        ArrayList arrayList = k0Var.G;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((g0) obj).d) {
                return;
            }
        }
        run();
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.a4) {
            a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            return;
        }
        this.a = true;
        org.telegram.messenger.i0.r(this);
        this.b.n(this, at.a4);
        this.c.run();
    }
}
