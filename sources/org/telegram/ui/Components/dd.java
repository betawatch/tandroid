package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ed b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ dd(ed edVar, boolean z10, int i10) {
        this.a = i10;
        this.b = edVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                ed edVar = this.b;
                if (!z10) {
                    edVar.V0.setVisibility(8);
                    break;
                } else {
                    edVar.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                ed edVar2 = this.b;
                if (!z11) {
                    edVar2.R0.setVisibility(8);
                    break;
                } else {
                    edVar2.getClass();
                    break;
                }
        }
    }
}
