package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class e80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l80 b;

    public /* synthetic */ e80(l80 l80Var, int i10) {
        this.a = i10;
        this.b = l80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l80 l80Var = this.b;
                l80Var.h.postOnAnimation(new e80(l80Var, 1));
                break;
            default:
                this.b.Y();
                break;
        }
    }
}
