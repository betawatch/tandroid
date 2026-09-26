package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v80 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ u80(v80 v80Var, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = v80Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u80(this.b, this.c, this.d, 1));
                break;
            default:
                v80 v80Var = this.b;
                v80Var.setJoinRequest(this.c);
                v80Var.setJoinToSend(this.d);
                break;
        }
    }
}
