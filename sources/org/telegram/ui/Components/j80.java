package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k80 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ j80(k80 k80Var, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = k80Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j80(this.b, this.c, this.d, 1));
                break;
            default:
                k80 k80Var = this.b;
                k80Var.setJoinRequest(this.c);
                k80Var.setJoinToSend(this.d);
                break;
        }
    }
}
