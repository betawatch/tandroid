package di;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v8 b;
    public final /* synthetic */ long c;

    public /* synthetic */ u8(v8 v8Var, long j3, int i7) {
        this.a = i7;
        this.b = v8Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v8 v8Var = this.b;
                v8Var.q.b0(v8Var.b, v8Var.c, this.c, true, true, v8Var.n);
                break;
            default:
                v8 v8Var2 = this.b;
                v8Var2.q.b0(v8Var2.b, v8Var2.c, this.c, true, true, v8Var2.n);
                break;
        }
    }
}
