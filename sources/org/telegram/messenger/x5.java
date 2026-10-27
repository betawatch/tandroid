package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class x5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationController b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ x5(LocationController locationController, Integer num, int i10) {
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
