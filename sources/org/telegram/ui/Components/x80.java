package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y80 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ x80(y80 y80Var, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = y80Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x80(this.b, this.c, this.d, 1));
                break;
            default:
                y80 y80Var = this.b;
                y80Var.setJoinRequest(this.c);
                y80Var.setJoinToSend(this.d);
                break;
        }
    }
}
