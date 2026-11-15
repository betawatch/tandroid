package org.telegram.messenger;

import java.util.Collections;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r1 b;

    public /* synthetic */ k1(r1 r1Var, int i7) {
        this.a = i7;
        this.b = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r1 r1Var = this.b;
                try {
                    r1Var.o(Collections.singletonList(r1.k), new p1(r1Var));
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
