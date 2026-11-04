package org.telegram.ui.ActionBar;

import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j6 b;

    public /* synthetic */ i6(j6 j6Var, int i3) {
        this.a = i3;
        this.b = j6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        j6 j6Var = this.b;
        switch (i3) {
            case 0:
                j6Var.s();
                break;
            default:
                hs.e().k(hs.t4, j6Var, Boolean.TRUE, null, -1);
                break;
        }
    }
}
