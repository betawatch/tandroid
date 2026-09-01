package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ad implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ad(bd bdVar, boolean z4, int i10) {
        this.a = i10;
        this.b = bdVar;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z4 = this.c;
                bd bdVar = this.b;
                if (!z4) {
                    bdVar.W0.setVisibility(8);
                    break;
                } else {
                    bdVar.getClass();
                    break;
                }
            default:
                boolean z10 = this.c;
                bd bdVar2 = this.b;
                if (!z10) {
                    bdVar2.S0.setVisibility(8);
                    break;
                } else {
                    bdVar2.getClass();
                    break;
                }
        }
    }
}
