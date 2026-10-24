package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.c6 b;

    public /* synthetic */ o51(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.a = i10;
        this.b = c6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.showKeyboard(((s41) this.b.d).h);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}
