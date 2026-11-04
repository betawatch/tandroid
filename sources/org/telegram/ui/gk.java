package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hk b;

    public /* synthetic */ gk(hk hkVar, int i3) {
        this.a = i3;
        this.b = hkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mj mjVar = this.b.I.a0;
                if (mjVar != null) {
                    mjVar.G0();
                    break;
                }
                break;
            default:
                mj mjVar2 = this.b.I.a0;
                if (mjVar2 != null) {
                    mjVar2.U0 = false;
                    org.telegram.ui.Components.kf kfVar = mjVar2.V0;
                    if (kfVar != null) {
                        kfVar.u(false);
                        break;
                    }
                }
                break;
        }
    }
}
