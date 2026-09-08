package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class r01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u01 b;
    public final /* synthetic */ t01 c;

    public /* synthetic */ r01(u01 u01Var, t01 t01Var, int i10) {
        this.a = i10;
        this.b = u01Var;
        this.c = t01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c);
                break;
            case 1:
                this.b.b(this.c);
                break;
            default:
                this.b.b(this.c);
                break;
        }
    }
}
