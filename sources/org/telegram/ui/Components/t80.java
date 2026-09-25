package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v80 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ t80(v80 v80Var, boolean z10, int i10) {
        this.a = i10;
        this.b = v80Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t80(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
