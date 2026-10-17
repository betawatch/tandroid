package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7 b;
    public final /* synthetic */ p6 c;
    public final /* synthetic */ q6 d;

    public /* synthetic */ i6(c7 c7Var, p6 p6Var, q6 q6Var, int i10) {
        this.a = i10;
        this.b = c7Var;
        this.c = p6Var;
        this.d = q6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.globalQueue.postRunnable(new i6(this.b, this.c, this.d, 1));
                break;
            default:
                c7.W(this.b, this.c, this.d);
                break;
        }
    }
}
