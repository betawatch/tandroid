package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ zc(ad adVar, boolean z10, int i9) {
        this.a = i9;
        this.b = adVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                ad adVar = this.b;
                if (!z10) {
                    adVar.V0.setVisibility(8);
                    break;
                } else {
                    adVar.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                ad adVar2 = this.b;
                if (!z11) {
                    adVar2.R0.setVisibility(8);
                    break;
                } else {
                    adVar2.getClass();
                    break;
                }
        }
    }
}
