package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ sc(tc tcVar, boolean z9, int i7) {
        this.a = i7;
        this.b = tcVar;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z9 = this.c;
                tc tcVar = this.b;
                if (!z9) {
                    tcVar.Y0.setVisibility(8);
                    break;
                } else {
                    tcVar.getClass();
                    break;
                }
            default:
                boolean z10 = this.c;
                tc tcVar2 = this.b;
                if (!z10) {
                    tcVar2.U0.setVisibility(8);
                    break;
                } else {
                    tcVar2.getClass();
                    break;
                }
        }
    }
}
