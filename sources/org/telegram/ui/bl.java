package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
