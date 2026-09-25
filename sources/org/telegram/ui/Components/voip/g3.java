package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ g3(l3 l3Var, int i10, int i11) {
        this.a = i11;
        this.b = l3Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.b, this.c, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.b, this.c, 3));
                break;
            case 2:
                this.b.c(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
