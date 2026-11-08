package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.zc0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class b0 implements Runnable, ls {
    public boolean a;
    public final /* synthetic */ qs b;
    public final /* synthetic */ zc0 c;
    public final /* synthetic */ m0 d;

    public b0(qs qsVar, zc0 zc0Var, m0 m0Var) {
        this.b = qsVar;
        this.c = zc0Var;
        this.d = m0Var;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        m0 m0Var = this.d;
        if (m0Var.e == null) {
            return;
        }
        ArrayList arrayList = m0Var.G;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((i0) obj).d) {
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
