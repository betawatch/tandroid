package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lk b;

    public /* synthetic */ kk(lk lkVar, int i7) {
        this.a = i7;
        this.b = lkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qj qjVar = this.b.H.Z;
                if (qjVar != null) {
                    qjVar.H0();
                    break;
                }
                break;
            default:
                qj qjVar2 = this.b.H.Z;
                if (qjVar2 != null) {
                    qjVar2.T0 = false;
                    org.telegram.ui.Components.mf mfVar = qjVar2.U0;
                    if (mfVar != null) {
                        mfVar.u(false);
                        break;
                    }
                }
                break;
        }
    }
}
