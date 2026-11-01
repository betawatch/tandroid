package org.telegram.messenger;

import java.util.Collections;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u1 b;

    public /* synthetic */ m1(u1 u1Var, int i10) {
        this.a = i10;
        this.b = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u1 u1Var = this.b;
                try {
                    u1Var.o(Collections.singletonList(u1.k), new p1(u1Var));
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            default:
                this.b.q();
                break;
        }
    }
}
