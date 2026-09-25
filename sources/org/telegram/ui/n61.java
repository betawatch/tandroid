package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.c6 b;

    public /* synthetic */ n61(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.a = i10;
        this.b = c6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.showKeyboard(((r51) this.b.d).h);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}
