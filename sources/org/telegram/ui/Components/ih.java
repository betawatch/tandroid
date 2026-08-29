package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ni b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ih(ni niVar, boolean z10, int i10) {
        this.a = i10;
        this.b = niVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                ni niVar = this.b;
                if (!z10) {
                    niVar.Y0.setVisibility(8);
                    break;
                } else {
                    niVar.getClass();
                    break;
                }
            case 1:
                boolean z11 = this.c;
                ni niVar2 = this.b;
                if (!z11) {
                    niVar2.w.setVisibility(8);
                    break;
                } else {
                    niVar2.getClass();
                    break;
                }
            case 2:
                boolean z12 = this.c;
                ni niVar3 = this.b;
                if (!z12) {
                    niVar3.y.setVisibility(8);
                    break;
                } else {
                    niVar3.getClass();
                    break;
                }
            default:
                boolean z13 = this.c;
                ni niVar4 = this.b;
                if (!z13) {
                    niVar4.getClass();
                    break;
                } else {
                    niVar4.t1.setVisibility(4);
                    break;
                }
        }
    }
}
