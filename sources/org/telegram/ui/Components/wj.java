package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yj b;

    public /* synthetic */ wj(yj yjVar, int i10) {
        this.a = i10;
        this.b = yjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yj yjVar = this.b;
                if (yjVar.f != null) {
                    yjVar.v = org.telegram.messenger.ok.h(new StringBuilder("+"), yjVar.f.phone, gf.b.c());
                    yjVar.s = yjVar.f;
                    AndroidUtilities.runOnUIThread(new wj(yjVar, 1));
                    break;
                }
                break;
            default:
                yj yjVar2 = this.b;
                yjVar2.c.l(yjVar2.v, false);
                break;
        }
    }
}
