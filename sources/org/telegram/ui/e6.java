package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x6 b;
    public final /* synthetic */ l6 c;
    public final /* synthetic */ m6 d;

    public /* synthetic */ e6(x6 x6Var, l6 l6Var, m6 m6Var, int i10) {
        this.a = i10;
        this.b = x6Var;
        this.c = l6Var;
        this.d = m6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.globalQueue.postRunnable(new e6(this.b, this.c, this.d, 1));
                break;
            default:
                x6.W(this.b, this.c, this.d);
                break;
        }
    }
}
