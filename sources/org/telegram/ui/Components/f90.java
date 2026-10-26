package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g90 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ f90(g90 g90Var, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = g90Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f90(this.b, this.c, this.d, 1));
                break;
            default:
                g90 g90Var = this.b;
                g90Var.setJoinRequest(this.c);
                g90Var.setJoinToSend(this.d);
                break;
        }
    }
}
