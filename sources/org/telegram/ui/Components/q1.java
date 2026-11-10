package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.qr b;

    public /* synthetic */ q1(org.telegram.messenger.qr qrVar, int i7) {
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
