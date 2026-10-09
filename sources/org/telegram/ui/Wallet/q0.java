package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ q0(String str, int i10) {
        this.a = i10;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0 v0Var = w7.f6.b;
                if (v0Var != null) {
                    if (this.b.equals(v0Var.d)) {
                        w7.f6.b.c("STORAGE_CANCELED");
                        w7.f6.b.e();
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
