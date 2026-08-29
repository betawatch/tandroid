package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g80 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ f80(g80 g80Var, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = g80Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f80(this.b, this.c, this.d, 1));
                break;
            default:
                g80 g80Var = this.b;
                g80Var.setJoinRequest(this.c);
                g80Var.setJoinToSend(this.d);
                break;
        }
    }
}
