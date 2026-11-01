package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g31 b;

    public /* synthetic */ j11(g31 g31Var, int i10) {
        this.a = i10;
        this.b = g31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g31 g31Var = this.b;
                g31Var.getClass();
                HashSet hashSet = sg.e0.a;
                com.google.android.gms.internal.cast.c0 c0Var = org.telegram.messenger.ic.D().p;
                if (((CountDownLatch) c0Var.c) == null) {
                    c0Var.c = new CountDownLatch(1);
                }
                sg.e0.b = true;
                sg.e0.e = false;
                sg.e0.g = false;
                org.telegram.messenger.i0.h3(new j11(g31Var, 2), 0L);
                break;
            case 1:
                g31 g31Var2 = this.b;
                ArrayList arrayList = g31Var2.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = g31Var2.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = g31Var2.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                g31Var2.q0.E(true);
                break;
            case 2:
                this.b.V1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                g31 g31Var3 = this.b;
                org.telegram.messenger.at e = org.telegram.messenger.at.e();
                j11 j11Var = g31Var3.S1;
                e.e.remove(j11Var);
                org.telegram.messenger.at.e().d(j11Var);
                break;
        }
    }
}
