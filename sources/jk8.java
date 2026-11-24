// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jk8 implements eec {
    public int a = 0;
    public byte b;
    public final /* synthetic */ mk8 c;

    public jk8(mk8 mk8Var) {
        this.c = mk8Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    @Override // eec
    public final void a(int i) {
        int i2 = this.a;
        mk8 mk8Var = this.c;
        ?? r2 = mk8Var.E;
        if (i2 == 0) {
            if (i <= r2) {
                mk8Var.n = (byte) 1;
            } else {
                mk8Var.n = (byte) 2;
            }
            mk8Var.b();
            return;
        }
        if (i <= r2) {
            this.b = (byte) 1;
        } else {
            this.b = (byte) 2;
        }
    }

    @Override // eec
    public final void b(float f, int i, int i2) {
        mk8 mk8Var = this.c;
        mk8Var.y = i;
        mk8Var.x = f;
        mk8Var.d();
    }

    @Override // eec
    public final void c(int i) {
        this.a = i;
        if (i == 0) {
            byte b = this.b;
            mk8 mk8Var = this.c;
            mk8Var.n = b;
            mk8Var.b();
        }
    }
}
