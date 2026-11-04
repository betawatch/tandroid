package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ys implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bt b;

    public /* synthetic */ ys(bt btVar, int i3) {
        this.a = i3;
        this.b = btVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bt btVar = this.b;
                btVar.post(new ys(btVar, 1));
                break;
            default:
                bt btVar2 = this.b;
                btVar2.h();
                btVar2.d();
                break;
        }
    }
}
