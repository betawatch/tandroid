package org.telegram.ui.Components;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ws implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ at b;

    public /* synthetic */ ws(at atVar, int i10) {
        this.a = i10;
        this.b = atVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.W(false);
                break;
            default:
                this.b.N(true);
                break;
        }
    }
}
