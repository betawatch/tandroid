package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;

    public /* synthetic */ g5(i5 i5Var, int i10) {
        this.a = i10;
        this.b = i5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g5(this.b, 1));
                break;
            default:
                this.b.a();
                break;
        }
    }
}
