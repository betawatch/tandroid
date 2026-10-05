package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nj0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p1 b;
    public final /* synthetic */ nj0 c;

    public /* synthetic */ l1(p1 p1Var, nj0 nj0Var, int i10) {
        this.a = i10;
        this.b = p1Var;
        this.c = nj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.b, this.c, 1));
                break;
            default:
                this.b.removeView(this.c);
                break;
        }
    }
}
