package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uj0 b;

    public /* synthetic */ nj0(uj0 uj0Var, int i10) {
        this.a = i10;
        this.b = uj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.b.b);
                break;
            default:
                AndroidUtilities.showKeyboard(this.b.d.getEditText());
                break;
        }
    }
}
