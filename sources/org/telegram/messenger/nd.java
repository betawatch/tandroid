package org.telegram.messenger;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class nd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sd b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ nd(sd sdVar, Integer num, int i7) {
        this.a = i7;
        this.b = sdVar;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 1;
        Integer num = this.c;
        sd sdVar = this.b;
        switch (i7) {
            case 0:
                if (!sdVar.b.isEmpty()) {
                    g0.h3(new nd(sdVar, num, i10));
                    break;
                }
                break;
            default:
                sdVar.getNotificationCenter().k(76, num);
                break;
        }
    }
}
