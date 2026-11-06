package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ae0 b;

    public /* synthetic */ wd0(ae0 ae0Var, int i7) {
        this.a = i7;
        this.b = ae0Var;
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
