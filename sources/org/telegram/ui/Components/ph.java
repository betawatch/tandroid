package org.telegram.ui.Components;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ph(ti tiVar, boolean z10, int i10) {
        this.a = i10;
        this.b = tiVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                ti tiVar = this.b;
                if (!z10) {
                    tiVar.f1.setVisibility(8);
                    break;
                } else {
                    tiVar.getClass();
                    break;
                }
            case 1:
                boolean z11 = this.c;
                ti tiVar2 = this.b;
                if (!z11) {
                    tiVar2.w.setVisibility(8);
                    break;
                } else {
                    tiVar2.getClass();
                    break;
                }
            case 2:
                boolean z12 = this.c;
                ti tiVar3 = this.b;
                if (!z12) {
                    tiVar3.y.setVisibility(8);
                    break;
                } else {
                    tiVar3.getClass();
                    break;
                }
            default:
                boolean z13 = this.c;
                ti tiVar4 = this.b;
                if (!z13) {
                    tiVar4.getClass();
                    break;
                } else {
                    tiVar4.A1.setVisibility(4);
                    break;
                }
        }
    }
}
