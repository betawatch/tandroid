package org.telegram.ui.Components;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kd b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ jd(kd kdVar, boolean z10, int i10) {
        this.a = i10;
        this.b = kdVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                kd kdVar = this.b;
                if (!z10) {
                    kdVar.Z0.setVisibility(8);
                    break;
                } else {
                    kdVar.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                kd kdVar2 = this.b;
                if (!z11) {
                    kdVar2.V0.setVisibility(8);
                    break;
                } else {
                    kdVar2.getClass();
                    break;
                }
        }
    }
}
