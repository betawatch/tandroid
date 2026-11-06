package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.zc0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class c0 implements Runnable, ls {
    public boolean a;
    public final /* synthetic */ qs b;
    public final /* synthetic */ zc0 c;
    public final /* synthetic */ n0 d;

    public c0(qs qsVar, zc0 zc0Var, n0 n0Var) {
        this.b = qsVar;
        this.c = zc0Var;
        this.d = n0Var;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        n0 n0Var = this.d;
        if (n0Var.e == null) {
            return;
        }
        ArrayList arrayList = n0Var.G;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((j0) obj).d) {
                return;
            }
        }
        run();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.a4) {
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
        this.b.n(this, qs.a4);
        this.c.run();
    }
}
