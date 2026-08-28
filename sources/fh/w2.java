package fh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ w2(y3 y3Var, int i9, int i10) {
        this.a = i10;
        this.b = y3Var;
        this.c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                s3 s3Var = this.b.f;
                if (s3Var != null) {
                    s3Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
