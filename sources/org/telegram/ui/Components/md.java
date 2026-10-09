package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class md implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ od b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ md(od odVar, boolean z10, int i10) {
        this.a = i10;
        this.b = odVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                od odVar = this.b;
                if (!z10) {
                    odVar.Z0.setVisibility(8);
                    break;
                } else {
                    odVar.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                od odVar2 = this.b;
                if (!z11) {
                    odVar2.V0.setVisibility(8);
                    break;
                } else {
                    odVar2.getClass();
                    break;
                }
        }
    }
}
