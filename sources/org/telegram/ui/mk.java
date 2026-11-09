package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                    org.telegram.ui.Components.mf mfVar = sjVar2.U0;
                    if (mfVar != null) {
                        mfVar.u(false);
                        break;
                    }
                }
                break;
        }
    }
}
