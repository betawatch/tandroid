package oi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ g2(s3 s3Var, int i7, int i10) {
        this.a = i10;
        this.b = s3Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g4(this.c);
                break;
            case 1:
                this.b.i4(this.c);
                break;
            case 2:
                this.b.scrollBy(0, this.c);
                break;
            default:
                this.b.h4(this.c);
                break;
        }
    }
}
