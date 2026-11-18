package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class py implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kz b;

    public /* synthetic */ py(kz kzVar, int i7) {
        this.a = i7;
        this.b = kzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kz.a0(this.b);
                break;
            default:
                kz.b0(this.b);
                break;
        }
    }
}
