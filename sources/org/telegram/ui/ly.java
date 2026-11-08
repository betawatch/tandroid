package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ly implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;

    public /* synthetic */ ly(gz gzVar, int i7) {
        this.a = i7;
        this.b = gzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gz.a0(this.b);
                break;
            default:
                gz.b0(this.b);
                break;
        }
    }
}
