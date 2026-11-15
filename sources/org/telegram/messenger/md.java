package org.telegram.messenger;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class md implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rd b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ md(rd rdVar, Integer num, int i7) {
        this.a = i7;
        this.b = rdVar;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 1;
        Integer num = this.c;
        rd rdVar = this.b;
        switch (i7) {
            case 0:
                if (!rdVar.b.isEmpty()) {
                    g0.h3(new md(rdVar, num, i10));
                    break;
                }
                break;
            default:
                rdVar.getNotificationCenter().k(76, num);
                break;
        }
    }
}
