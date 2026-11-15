package oi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class l2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ l2(q3 q3Var, int i7, int i10, int i11) {
        this.a = i11;
        this.b = q3Var;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c2(this.c, this.d);
                break;
            default:
                this.b.j4(this.c, this.d);
                break;
        }
    }
}
