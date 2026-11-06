package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6 b;
    public final /* synthetic */ n6 c;
    public final /* synthetic */ o6 d;

    public /* synthetic */ e6(y6 y6Var, n6 n6Var, o6 o6Var, int i7) {
        this.a = i7;
        this.b = y6Var;
        this.c = n6Var;
        this.d = o6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.e.c(new e6(this.b, this.c, this.d, 1));
                break;
            default:
                y6.b0(this.b, this.c, this.d);
                break;
        }
    }
}
