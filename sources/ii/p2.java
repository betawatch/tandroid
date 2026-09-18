package ii;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ p2(w3 w3Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = w3Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Z1(this.c, this.d);
                break;
            default:
                this.b.h4(this.c, this.d);
                break;
        }
    }
}
