package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nl b;

    public /* synthetic */ ml(nl nlVar, int i10) {
        this.a = i10;
        this.b = nlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sk skVar = this.b.H.Y;
                if (skVar != null) {
                    skVar.T0 = false;
                    org.telegram.ui.Components.fg fgVar = skVar.U0;
                    if (fgVar != null) {
                        fgVar.v(false);
                        break;
                    }
                }
                break;
            default:
                sk skVar2 = this.b.H.Y;
                if (skVar2 != null) {
                    skVar2.F0();
                    break;
                }
                break;
        }
    }
}
