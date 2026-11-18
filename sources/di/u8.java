package di;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
