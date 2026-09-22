package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb b;

    public /* synthetic */ pc(wb wbVar, int i10) {
        this.a = i10;
        this.b = wbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.performHapticFeedback(3, 2);
                break;
            default:
                this.b.performHapticFeedback(3, 2);
                break;
        }
    }
}
