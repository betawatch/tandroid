package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sc b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ rc(sc scVar, boolean z10, int i3) {
        this.a = i3;
        this.b = scVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                sc scVar = this.b;
                if (!z10) {
                    scVar.Z0.setVisibility(8);
                    break;
                } else {
                    scVar.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                sc scVar2 = this.b;
                if (!z11) {
                    scVar2.V0.setVisibility(8);
                    break;
                } else {
                    scVar2.getClass();
                    break;
                }
        }
    }
}
