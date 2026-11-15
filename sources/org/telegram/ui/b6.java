package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.z10 b;
    public final /* synthetic */ long c;

    public /* synthetic */ b6(int i7, long j3, org.telegram.messenger.z10 z10Var) {
        this.a = i7;
        this.b = z10Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(Long.valueOf(this.c));
                break;
            default:
                this.b.a(Long.valueOf(this.c));
                break;
        }
    }
}
