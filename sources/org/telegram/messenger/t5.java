package org.telegram.messenger;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class t5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationController b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ t5(LocationController locationController, Integer num, int i10) {
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
