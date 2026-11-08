package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;
    public final /* synthetic */ String c;

    public /* synthetic */ c1(t tVar, String str, int i7) {
        this.a = i7;
        this.b = tVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
