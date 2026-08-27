package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ij implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kj b;

    public /* synthetic */ ij(kj kjVar, int i10) {
        this.a = i10;
        this.b = kjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kj kjVar = this.b;
                if (kjVar.f != null) {
                    kjVar.v = org.telegram.messenger.y1.k(new StringBuilder("+"), kjVar.f.phone, oe.b.c());
                    kjVar.s = kjVar.f;
                    AndroidUtilities.runOnUIThread(new ij(kjVar, 1));
                    break;
                }
                break;
            default:
                kj kjVar2 = this.b;
                kjVar2.c.l(kjVar2.v, false);
                break;
        }
    }
}
