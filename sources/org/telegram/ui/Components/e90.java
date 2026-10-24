package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f90 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ e90(f90 f90Var, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = f90Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e90(this.b, this.c, this.d, 1));
                break;
            default:
                f90 f90Var = this.b;
                f90Var.setJoinRequest(this.c);
                f90Var.setJoinToSend(this.d);
                break;
        }
    }
}
