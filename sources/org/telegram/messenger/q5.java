package org.telegram.messenger;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class q5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationController b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ q5(LocationController locationController, Integer num, int i10) {
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
