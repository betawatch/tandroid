package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x80 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ w80(x80 x80Var, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = x80Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w80(this.b, this.c, this.d, 1));
                break;
            default:
                x80 x80Var = this.b;
                x80Var.setJoinRequest(this.c);
                x80Var.setJoinToSend(this.d);
                break;
        }
    }
}
