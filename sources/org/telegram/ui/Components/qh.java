package org.telegram.ui.Components;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qh(wi wiVar, boolean z10, int i10) {
        this.a = i10;
        this.b = wiVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                wi wiVar = this.b;
                if (!z10) {
                    wiVar.c1.setVisibility(8);
                    break;
                } else {
                    wiVar.getClass();
                    break;
                }
            case 1:
                boolean z11 = this.c;
                wi wiVar2 = this.b;
                if (!z11) {
                    wiVar2.w.setVisibility(8);
                    break;
                } else {
                    wiVar2.getClass();
                    break;
                }
            case 2:
                boolean z12 = this.c;
                wi wiVar3 = this.b;
                if (!z12) {
                    wiVar3.y.setVisibility(8);
                    break;
                } else {
                    wiVar3.getClass();
                    break;
                }
            default:
                boolean z13 = this.c;
                wi wiVar4 = this.b;
                if (!z13) {
                    wiVar4.getClass();
                    break;
                } else {
                    wiVar4.x1.setVisibility(4);
                    break;
                }
        }
    }
}
