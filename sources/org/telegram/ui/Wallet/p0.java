package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ p0(String str, int i10) {
        this.a = i10;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = w7.i6.b;
                if (u0Var != null) {
                    if (this.b.equals(u0Var.d)) {
                        w7.i6.b.c("STORAGE_CANCELED");
                        w7.i6.b.e();
                        break;
                    }
                }
                break;
            default:
                AndroidUtilities.addToClipboard(this.b);
                break;
        }
    }
}
