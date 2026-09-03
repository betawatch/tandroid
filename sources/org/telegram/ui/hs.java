package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ps b;

    public /* synthetic */ hs(ps psVar, int i10) {
        this.a = i10;
        this.b = psVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ps psVar = this.b;
                if (psVar.G) {
                    psVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(psVar.d.b);
                    break;
                }
                break;
            case 1:
                ps.Z(this.b);
                break;
            default:
                ps psVar2 = this.b;
                psVar2.presentFragment(zn.R9(psVar2.E), true);
                break;
        }
    }
}
