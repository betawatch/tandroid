package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zg0 b;

    public /* synthetic */ yg0(zg0 zg0Var, int i7) {
        this.a = i7;
        this.b = zg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zg0 zg0Var = this.b;
                zg0Var.getClass();
                try {
                    bg.i iVar = zg0Var.B0;
                    if (iVar != null) {
                        iVar.b();
                    }
                } catch (Throwable unused) {
                }
                org.telegram.messenger.g0.h3(zg0Var.z0);
                break;
            case 1:
                zg0 zg0Var2 = this.b;
                zg0Var2.P = null;
                zg0Var2.p();
                break;
            case 2:
                zg0.h(this.b);
                break;
            case 3:
                zg0.e(this.b);
                break;
            case 4:
                zg0.d(this.b);
                break;
            case 5:
                zg0.f(this.b);
                break;
            default:
                this.b.m();
                break;
        }
    }
}
