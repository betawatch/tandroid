package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o51(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((q51) this.b).g = false;
                break;
            case 1:
                ((f71) ((w30) ((org.telegram.ui.ActionBar.h1) this.b).b).b).w.b();
                break;
            default:
                ((b71) this.b).d(false, true);
                break;
        }
    }
}
