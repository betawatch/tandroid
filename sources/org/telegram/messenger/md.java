package org.telegram.messenger;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class md implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sd b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ md(sd sdVar, Integer num, int i7) {
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
                    g0.h3(new md(sdVar, num, i10));
                    break;
                }
                break;
            default:
                sdVar.getNotificationCenter().k(76, num);
                break;
        }
    }
}
