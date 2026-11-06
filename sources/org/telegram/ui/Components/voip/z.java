package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ z(a0 a0Var, int i7) {
        this.a = i7;
        this.b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a0.a(this.b);
                break;
            default:
                a0 a0Var = this.b;
                if (a0Var.y) {
                    a0Var.h();
                    a0Var.post(new z(a0Var, 0));
                    break;
                }
                break;
        }
    }
}
