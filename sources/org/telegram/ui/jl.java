package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class jl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kl b;

    public /* synthetic */ jl(kl klVar, int i10) {
        this.a = i10;
        this.b = klVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ok okVar = this.b.H.Y;
                if (okVar != null) {
                    okVar.T0 = false;
                    org.telegram.ui.Components.fg fgVar = okVar.U0;
                    if (fgVar != null) {
                        fgVar.u(false);
                        break;
                    }
                }
                break;
            default:
                ok okVar2 = this.b.H.Y;
                if (okVar2 != null) {
                    okVar2.H0();
                    break;
                }
                break;
        }
    }
}
