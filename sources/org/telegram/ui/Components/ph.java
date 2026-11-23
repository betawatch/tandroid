package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ph(ui uiVar, boolean z10, int i7) {
        this.a = i7;
        this.b = uiVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                ui uiVar = this.b;
                if (!z10) {
                    uiVar.a3.setVisibility(8);
                    break;
                } else {
                    uiVar.getClass();
                    break;
                }
            case 1:
                boolean z11 = this.c;
                ui uiVar2 = this.b;
                if (!z11) {
                    uiVar2.w1.setVisibility(8);
                    break;
                } else {
                    uiVar2.getClass();
                    break;
                }
            case 2:
                boolean z12 = this.c;
                ui uiVar3 = this.b;
                if (!z12) {
                    uiVar3.y1.setVisibility(8);
                    break;
                } else {
                    uiVar3.getClass();
                    break;
                }
            default:
                boolean z13 = this.c;
                ui uiVar4 = this.b;
                if (!z13) {
                    uiVar4.getClass();
                    break;
                } else {
                    uiVar4.v3.setVisibility(4);
                    break;
                }
        }
    }
}
