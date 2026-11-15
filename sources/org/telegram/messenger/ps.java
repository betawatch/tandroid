package org.telegram.messenger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class ps implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ at b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ps(at atVar, long j3, long j10, int i7) {
        this.a = i7;
        this.b = atVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                at atVar = this.b;
                atVar.G = this.c;
                atVar.H = this.d;
                break;
            default:
                this.b.o(this.c, this.d);
                break;
        }
    }
}
