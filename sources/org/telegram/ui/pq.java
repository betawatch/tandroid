package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qq b;

    public /* synthetic */ pq(qq qqVar, int i7) {
        this.a = i7;
        this.b = qqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fi.w3 w3Var = this.b.a;
                if (w3Var != null) {
                    w3Var.f3.O(true);
                    break;
                }
                break;
            default:
                fi.w3 w3Var2 = this.b.a;
                if (w3Var2 != null) {
                    w3Var2.f3.O(true);
                    break;
                }
                break;
        }
    }
}
