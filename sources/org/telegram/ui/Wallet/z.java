package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.f70;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z implements Runnable, us {
    public boolean a;
    public final /* synthetic */ zs b;
    public final /* synthetic */ f70 c;
    public final /* synthetic */ k0 d;

    public z(zs zsVar, f70 f70Var, k0 k0Var) {
        this.b = zsVar;
        this.c = f70Var;
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

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.a4) {
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
        this.b.n(this, zs.a4);
        this.c.run();
    }
}
