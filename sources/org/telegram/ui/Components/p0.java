package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 d;

    public /* synthetic */ p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.a = i10;
        this.b = editTextBoldCursor;
        this.c = d2Var;
        this.d = p2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.b, this.c, this.d, 1));
                break;
            default:
                z4.e0(this.b, this.c, this.d);
                break;
        }
    }
}
