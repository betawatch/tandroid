package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k80 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ i80(k80 k80Var, boolean z10, int i10) {
        this.a = i10;
        this.b = k80Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i80(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
