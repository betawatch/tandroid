package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a7 b;
    public final /* synthetic */ n6 c;
    public final /* synthetic */ o6 d;

    public /* synthetic */ g6(a7 a7Var, n6 n6Var, o6 o6Var, int i10) {
        this.a = i10;
        this.b = a7Var;
        this.c = n6Var;
        this.d = o6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.globalQueue.postRunnable(new g6(this.b, this.c, this.d, 1));
                break;
            default:
                a7.X(this.b, this.c, this.d);
                break;
        }
    }
}
