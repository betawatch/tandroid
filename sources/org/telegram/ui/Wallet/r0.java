package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
