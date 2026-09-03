package kh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;

    public /* synthetic */ i(v vVar, int i10) {
        this.a = i10;
        this.b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e();
                break;
            case 1:
                v.k(this.b.q, true, true);
                break;
            default:
                this.b.e();
                break;
        }
    }
}
