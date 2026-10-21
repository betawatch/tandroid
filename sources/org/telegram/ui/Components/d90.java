package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e90 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ d90(e90 e90Var, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = e90Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d90(this.b, this.c, this.d, 1));
                break;
            default:
                e90 e90Var = this.b;
                e90Var.setJoinRequest(this.c);
                e90Var.setJoinToSend(this.d);
                break;
        }
    }
}
