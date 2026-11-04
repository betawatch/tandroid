package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.ui.tb0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z implements Runnable, cs {
    public boolean a;
    public final /* synthetic */ hs b;
    public final /* synthetic */ tb0 c;
    public final /* synthetic */ k0 d;

    public z(hs hsVar, tb0 tb0Var, k0 k0Var) {
        this.b = hsVar;
        this.c = tb0Var;
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (((g0) obj).d) {
                return;
            }
        }
        run();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.a4) {
            a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            return;
        }
        this.a = true;
        org.telegram.messenger.g0.r(this);
        this.b.n(this, hs.a4);
        this.c.run();
    }
}
