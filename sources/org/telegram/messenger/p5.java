package org.telegram.messenger;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class p5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationController b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ p5(LocationController locationController, Integer num, int i10) {
        this.a = i10;
        this.b = locationController;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onConnected$2(this.c);
                break;
            default:
                this.b.lambda$onConnected$1(this.c);
                break;
        }
    }
}
