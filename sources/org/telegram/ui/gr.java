package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
