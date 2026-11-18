package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;

    public /* synthetic */ gr(qr qrVar, int i7) {
        this.a = i7;
        this.b = qrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qr.d0(this.b);
                break;
            case 1:
                qr qrVar = this.b;
                if (qrVar.K) {
                    qrVar.d.d.requestFocus();
                    org.telegram.messenger.g0.I3(qrVar.d.d);
                    break;
                }
                break;
            default:
                qr qrVar2 = this.b;
                qrVar2.presentFragment(bn.ua(qrVar2.I), true);
                break;
        }
    }
}
