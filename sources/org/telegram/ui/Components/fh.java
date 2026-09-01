package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ fh(mi miVar, boolean z4, int i10) {
        this.a = i10;
        this.b = miVar;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z4 = this.c;
                mi miVar = this.b;
                if (!z4) {
                    miVar.Z0.setVisibility(8);
                    break;
                } else {
                    miVar.getClass();
                    break;
                }
            case 1:
                boolean z10 = this.c;
                mi miVar2 = this.b;
                if (!z10) {
                    miVar2.w.setVisibility(8);
                    break;
                } else {
                    miVar2.getClass();
                    break;
                }
            case 2:
                boolean z11 = this.c;
                mi miVar3 = this.b;
                if (!z11) {
                    miVar3.y.setVisibility(8);
                    break;
                } else {
                    miVar3.getClass();
                    break;
                }
            default:
                boolean z12 = this.c;
                mi miVar4 = this.b;
                if (!z12) {
                    miVar4.getClass();
                    break;
                } else {
                    miVar4.u1.setVisibility(4);
                    break;
                }
        }
    }
}
