package org.telegram.messenger;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class ld implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qd b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ ld(qd qdVar, Integer num, int i7) {
        this.a = i7;
        this.b = qdVar;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 1;
        Integer num = this.c;
        qd qdVar = this.b;
        switch (i7) {
            case 0:
                if (!qdVar.b.isEmpty()) {
                    g0.g3(new ld(qdVar, num, i10));
                    break;
                }
                break;
            default:
                qdVar.getNotificationCenter().k(76, num);
                break;
        }
    }
}
