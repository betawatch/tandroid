package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cl b;

    public /* synthetic */ bl(cl clVar, int i10) {
        this.a = i10;
        this.b = clVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hk hkVar = this.b.H.Y;
                if (hkVar != null) {
                    hkVar.T0 = false;
                    org.telegram.ui.Components.dg dgVar = hkVar.U0;
                    if (dgVar != null) {
                        dgVar.v(false);
                        break;
                    }
                }
                break;
            default:
                hk hkVar2 = this.b.H.Y;
                if (hkVar2 != null) {
                    hkVar2.F0();
                    break;
                }
                break;
        }
    }
}
