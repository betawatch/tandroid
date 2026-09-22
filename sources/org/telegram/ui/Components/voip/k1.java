package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aj0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o1 b;
    public final /* synthetic */ aj0 c;

    public /* synthetic */ k1(o1 o1Var, aj0 aj0Var, int i10) {
        this.a = i10;
        this.b = o1Var;
        this.c = aj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k1(this.b, this.c, 1));
                break;
            default:
                this.b.removeView(this.c);
                break;
        }
    }
}
