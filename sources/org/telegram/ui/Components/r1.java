package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.qr b;

    public /* synthetic */ r1(org.telegram.messenger.qr qrVar, int i7) {
        this.a = i7;
        this.b = qrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.qr qrVar = this.b;
                if (qrVar != null) {
                    qrVar.k(false);
                    break;
                }
                break;
            default:
                org.telegram.messenger.qr qrVar2 = this.b;
                if (qrVar2 != null) {
                    qrVar2.k(false);
                    break;
                }
                break;
        }
    }
}
