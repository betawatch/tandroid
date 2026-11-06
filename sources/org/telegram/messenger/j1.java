package org.telegram.messenger;

import java.util.Collections;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r1 b;

    public /* synthetic */ j1(r1 r1Var, int i7) {
        this.a = i7;
        this.b = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r1 r1Var = this.b;
                try {
                    r1Var.o(Collections.singletonList(r1.k), new m1(r1Var));
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.b.q();
                break;
        }
    }
}
