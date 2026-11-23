package org.telegram.messenger;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class uz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d00 b;
    public final /* synthetic */ long c;

    public /* synthetic */ uz(d00 d00Var, long j3, int i7) {
        this.a = i7;
        this.b = d00Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.c;
        d00 d00Var = this.b;
        switch (i7) {
            case 0:
                d00Var.c.put(j3, 0);
                d00Var.getNotificationCenter().k(ks.t5, Long.valueOf(j3), Boolean.FALSE);
                break;
            default:
                d00Var.n(0, j3, false);
                break;
        }
    }
}
