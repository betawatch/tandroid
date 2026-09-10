package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class t80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u80 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ t80(u80 u80Var, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = u80Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t80(this.b, this.c, this.d, 1));
                break;
            default:
                u80 u80Var = this.b;
                u80Var.setJoinRequest(this.c);
                u80Var.setJoinToSend(this.d);
                break;
        }
    }
}
