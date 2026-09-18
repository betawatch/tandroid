package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k11 b;
    public final /* synthetic */ j11 c;

    public /* synthetic */ h11(k11 k11Var, j11 j11Var, int i10) {
        this.a = i10;
        this.b = k11Var;
        this.c = j11Var;
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
