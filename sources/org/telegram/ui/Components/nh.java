package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ si b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ nh(si siVar, boolean z10, int i7) {
        this.a = i7;
        this.b = siVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                si siVar = this.b;
                if (!z10) {
                    siVar.a3.setVisibility(8);
                    break;
                } else {
                    siVar.getClass();
                    break;
                }
            case 1:
                boolean z11 = this.c;
                si siVar2 = this.b;
                if (!z11) {
                    siVar2.w1.setVisibility(8);
                    break;
                } else {
                    siVar2.getClass();
                    break;
                }
            case 2:
                boolean z12 = this.c;
                si siVar3 = this.b;
                if (!z12) {
                    siVar3.y1.setVisibility(8);
                    break;
                } else {
                    siVar3.getClass();
                    break;
                }
            default:
                boolean z13 = this.c;
                si siVar4 = this.b;
                if (!z13) {
                    siVar4.getClass();
                    break;
                } else {
                    siVar4.v3.setVisibility(4);
                    break;
                }
        }
    }
}
