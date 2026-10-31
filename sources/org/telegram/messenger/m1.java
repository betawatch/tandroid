package org.telegram.messenger;

import java.util.Collections;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
