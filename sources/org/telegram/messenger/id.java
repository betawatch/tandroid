package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class id implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nd b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ id(nd ndVar, Integer num, int i10) {
        this.a = i10;
        this.b = ndVar;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 1;
        Integer num = this.c;
        nd ndVar = this.b;
        switch (i10) {
            case 0:
                if (!ndVar.b.isEmpty()) {
                    i0.g3(new id(ndVar, num, i11));
                    break;
                }
                break;
            default:
                ndVar.getNotificationCenter().k(76, num);
                break;
        }
    }
}
