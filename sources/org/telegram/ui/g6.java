package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z6 b;
    public final /* synthetic */ o6 c;
    public final /* synthetic */ p6 d;

    public /* synthetic */ g6(z6 z6Var, o6 o6Var, p6 p6Var, int i3) {
        this.a = i3;
        this.b = z6Var;
        this.c = o6Var;
        this.d = p6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.e.c(new g6(this.b, this.c, this.d, 1));
                break;
            default:
                z6.b0(this.b, this.c, this.d);
                break;
        }
    }
}
