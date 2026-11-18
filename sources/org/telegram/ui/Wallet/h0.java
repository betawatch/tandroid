package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.ui.n60;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class h0 implements Runnable, fs {
    public boolean a;
    public final /* synthetic */ ks b;
    public final /* synthetic */ n60 c;
    public final /* synthetic */ u0 d;

    public h0(ks ksVar, n60 n60Var, u0 u0Var) {
        this.b = ksVar;
        this.c = n60Var;
        this.d = u0Var;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        u0 u0Var = this.d;
        if (u0Var.e == null) {
            return;
        }
        ArrayList arrayList = u0Var.J;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((q0) obj).d) {
                return;
            }
        }
        run();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.c4) {
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
        this.b.n(this, ks.c4);
        this.c.run();
    }
}
