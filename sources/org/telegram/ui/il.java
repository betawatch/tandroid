package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class il implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jl b;

    public /* synthetic */ il(jl jlVar, int i10) {
        this.a = i10;
        this.b = jlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ok okVar = this.b.H.Y;
                if (okVar != null) {
                    okVar.T0 = false;
                    org.telegram.ui.Components.gg ggVar = okVar.U0;
                    if (ggVar != null) {
                        ggVar.v(false);
                        break;
                    }
                }
                break;
            default:
                ok okVar2 = this.b.H.Y;
                if (okVar2 != null) {
                    okVar2.F0();
                    break;
                }
                break;
        }
    }
}
