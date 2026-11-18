package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
