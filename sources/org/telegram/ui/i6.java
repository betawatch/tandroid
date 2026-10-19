package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
