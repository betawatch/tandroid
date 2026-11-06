package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ct b;

    public /* synthetic */ zs(ct ctVar, int i7) {
        this.a = i7;
        this.b = ctVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ct ctVar = this.b;
                ctVar.post(new zs(ctVar, 1));
                break;
            default:
                ct ctVar2 = this.b;
                ctVar2.h();
                ctVar2.d();
                break;
        }
    }
}
