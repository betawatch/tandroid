package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class jd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ od b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ jd(od odVar, Integer num, int i10) {
        this.a = i10;
        this.b = odVar;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 1;
        Integer num = this.c;
        od odVar = this.b;
        switch (i10) {
            case 0:
                if (!odVar.b.isEmpty()) {
                    i0.g3(new jd(odVar, num, i11));
                    break;
                }
                break;
            default:
                odVar.getNotificationCenter().k(76, num);
                break;
        }
    }
}
