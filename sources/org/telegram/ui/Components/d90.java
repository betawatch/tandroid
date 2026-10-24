package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f90 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ d90(f90 f90Var, boolean z10, int i10) {
        this.a = i10;
        this.b = f90Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d90(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
