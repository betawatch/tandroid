package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yi b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ sh(yi yiVar, boolean z10, int i10) {
        this.a = i10;
        this.b = yiVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                yi yiVar = this.b;
                if (!z10) {
                    yiVar.c1.setVisibility(8);
                    break;
                } else {
                    yiVar.getClass();
                    break;
                }
            case 1:
                boolean z11 = this.c;
                yi yiVar2 = this.b;
                if (!z11) {
                    yiVar2.w.setVisibility(8);
                    break;
                } else {
                    yiVar2.getClass();
                    break;
                }
            case 2:
                boolean z12 = this.c;
                yi yiVar3 = this.b;
                if (!z12) {
                    yiVar3.y.setVisibility(8);
                    break;
                } else {
                    yiVar3.getClass();
                    break;
                }
            default:
                boolean z13 = this.c;
                yi yiVar4 = this.b;
                if (!z13) {
                    yiVar4.getClass();
                    break;
                } else {
                    yiVar4.x1.setVisibility(4);
                    break;
                }
        }
    }
}
