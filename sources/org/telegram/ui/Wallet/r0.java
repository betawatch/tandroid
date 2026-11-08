package org.telegram.ui.Wallet;

import c8.va;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ r0(String str, int i7) {
        this.a = i7;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0 v0Var = va.b;
                if (v0Var != null) {
                    if (this.b.equals(v0Var.d)) {
                        va.b.c("STORAGE_CANCELED");
                        va.b.e();
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
