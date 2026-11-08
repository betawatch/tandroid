package org.telegram.ui.ActionBar;

import org.telegram.messenger.qs;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j6 b;

    public /* synthetic */ i6(j6 j6Var, int i7) {
        this.a = i7;
        this.b = j6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        j6 j6Var = this.b;
        switch (i7) {
            case 0:
                j6Var.s();
                break;
            default:
                qs.e().k(qs.t4, j6Var, Boolean.TRUE, null, -1);
                break;
        }
    }
}
