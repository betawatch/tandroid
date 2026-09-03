package org.telegram.ui.Cells;

import org.telegram.ui.Components.hj0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hj0 b;

    public /* synthetic */ q0(hj0 hj0Var, int i10) {
        this.a = i10;
        this.b = hj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.F(false);
                break;
            default:
                this.b.start();
                break;
        }
    }
}
