package org.telegram.ui.ActionBar;

import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
