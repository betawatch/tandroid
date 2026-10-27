package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ys implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ct b;

    public /* synthetic */ ys(ct ctVar, int i10) {
        this.a = i10;
        this.b = ctVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.X(false);
                break;
            default:
                this.b.O(true);
                break;
        }
    }
}
