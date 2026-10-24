package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w31 b;

    public /* synthetic */ e31(w31 w31Var, int i10) {
        this.a = i10;
        this.b = w31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w31 w31Var = this.b;
                l31 l31Var = w31Var.G;
                l31Var.C1(true);
                j31 j31Var = w31Var.s;
                j31Var.C1(true);
                w31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(j31Var);
                AndroidUtilities.updateVisibleRows(l31Var);
                break;
            default:
                w31 w31Var2 = this.b;
                if (w31Var2.l()) {
                    w31Var2.m();
                    break;
                }
                break;
        }
    }
}
