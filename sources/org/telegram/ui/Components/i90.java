package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class i90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l90 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ i90(l90 l90Var, boolean z10, int i10) {
        this.a = i10;
        this.b = l90Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i90(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
