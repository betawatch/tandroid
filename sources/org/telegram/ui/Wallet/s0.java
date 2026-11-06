package org.telegram.ui.Wallet;

import c8.ua;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ s0(String str, int i7) {
        this.a = i7;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w0 w0Var = ua.b;
                if (w0Var != null) {
                    if (this.b.equals(w0Var.d)) {
                        ua.b.c("STORAGE_CANCELED");
                        ua.b.e();
                        break;
                    }
                }
                break;
            default:
                org.telegram.messenger.g0.g(this.b);
                break;
        }
    }
}
