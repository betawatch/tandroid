package org.telegram.ui.Components;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;
    public final /* synthetic */ int c;

    public /* synthetic */ dn(fo foVar, int i10, int i11) {
        this.a = i11;
        this.b = foVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h0(this.c, null);
                break;
            case 1:
                this.b.e0(this.c);
                break;
            default:
                this.b.h0(this.c, null);
                break;
        }
    }
}
