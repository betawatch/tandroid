package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ r0(String str, int i10) {
        this.a = i10;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w0 w0Var = w7.h6.b;
                if (w0Var != null) {
                    if (this.b.equals(w0Var.d)) {
                        w7.h6.b.c("STORAGE_CANCELED");
                        w7.h6.b.e();
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
