package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class h6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7 b;
    public final /* synthetic */ p6 c;
    public final /* synthetic */ q6 d;

    public /* synthetic */ h6(c7 c7Var, p6 p6Var, q6 q6Var, int i10) {
        this.a = i10;
        this.b = c7Var;
        this.c = p6Var;
        this.d = q6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.globalQueue.postRunnable(new h6(this.b, this.c, this.d, 1));
                break;
            default:
                c7.W(this.b, this.c, this.d);
                break;
        }
    }
}
