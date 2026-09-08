package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class g00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f10 b;

    public /* synthetic */ g00(f10 f10Var, int i10) {
        this.a = i10;
        this.b = f10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f10.V(this.b);
                break;
            default:
                f10.W(this.b);
                break;
        }
    }
}
