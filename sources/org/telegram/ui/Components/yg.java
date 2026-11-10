package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ yg(ci ciVar, boolean z9, int i7) {
        this.a = i7;
        this.b = ciVar;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z9 = this.c;
                ci ciVar = this.b;
                if (!z9) {
                    ciVar.Z2.setVisibility(8);
                    break;
                } else {
                    ciVar.getClass();
                    break;
                }
            case 1:
                boolean z10 = this.c;
                ci ciVar2 = this.b;
                if (!z10) {
                    ciVar2.v1.setVisibility(8);
                    break;
                } else {
                    ciVar2.getClass();
                    break;
                }
            case 2:
                boolean z11 = this.c;
                ci ciVar3 = this.b;
                if (!z11) {
                    ciVar3.x1.setVisibility(8);
                    break;
                } else {
                    ciVar3.getClass();
                    break;
                }
            default:
                boolean z12 = this.c;
                ci ciVar4 = this.b;
                if (!z12) {
                    ciVar4.getClass();
                    break;
                } else {
                    ciVar4.u3.setVisibility(4);
                    break;
                }
        }
    }
}
