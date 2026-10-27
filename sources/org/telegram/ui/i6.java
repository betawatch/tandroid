package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7 b;
    public final /* synthetic */ q6 c;
    public final /* synthetic */ r6 d;

    public /* synthetic */ i6(c7 c7Var, q6 q6Var, r6 r6Var, int i10) {
        this.a = i10;
        this.b = c7Var;
        this.c = q6Var;
        this.d = r6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.globalQueue.postRunnable(new i6(this.b, this.c, this.d, 1));
                break;
            default:
                c7.X(this.b, this.c, this.d);
                break;
        }
    }
}
