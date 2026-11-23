package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x6 b;
    public final /* synthetic */ m6 c;
    public final /* synthetic */ n6 d;

    public /* synthetic */ e6(x6 x6Var, m6 m6Var, n6 n6Var, int i7) {
        this.a = i7;
        this.b = x6Var;
        this.c = m6Var;
        this.d = n6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.e.c(new e6(this.b, this.c, this.d, 1));
                break;
            default:
                x6.b0(this.b, this.c, this.d);
                break;
        }
    }
}
