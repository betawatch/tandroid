package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qf0 b;

    public /* synthetic */ mf0(qf0 qf0Var, int i10) {
        this.a = i10;
        this.b = qf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e();
                break;
            default:
                this.b.g();
                break;
        }
    }
}
