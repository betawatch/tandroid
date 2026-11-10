package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nk b;

    public /* synthetic */ mk(nk nkVar, int i7) {
        this.a = i7;
        this.b = nkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sj sjVar = this.b.H.Z;
                if (sjVar != null) {
                    sjVar.H0();
                    break;
                }
                break;
            default:
                sj sjVar2 = this.b.H.Z;
                if (sjVar2 != null) {
                    sjVar2.T0 = false;
                    org.telegram.ui.Components.lf lfVar = sjVar2.U0;
                    if (lfVar != null) {
                        lfVar.u(false);
                        break;
                    }
                }
                break;
        }
    }
}
