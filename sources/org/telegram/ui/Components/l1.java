package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e5 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 d;

    public /* synthetic */ l1(e5 e5Var, org.telegram.ui.ActionBar.c2 c2Var, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.a = i10;
        this.b = e5Var;
        this.c = c2Var;
        this.d = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.b, this.c, this.d, 1));
                break;
            default:
                f5.e0(this.b, this.c, this.d);
                break;
        }
    }
}
