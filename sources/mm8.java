// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mm8 implements egc {
    public int a = 0;
    public byte b;
    public final /* synthetic */ om8 c;

    public mm8(om8 om8Var) {
        this.c = om8Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    @Override // egc
    public final void a(int i) {
        int i2 = this.a;
        om8 om8Var = this.c;
        ?? r2 = om8Var.E;
        if (i2 == 0) {
            if (i <= r2) {
                om8Var.n = (byte) 1;
            } else {
                om8Var.n = (byte) 2;
            }
            om8Var.b();
            return;
        }
        if (i <= r2) {
            this.b = (byte) 1;
        } else {
            this.b = (byte) 2;
        }
    }

    @Override // egc
    public final void b(float f, int i, int i2) {
        om8 om8Var = this.c;
        om8Var.y = i;
        om8Var.x = f;
        om8Var.d();
    }

    @Override // egc
    public final void c(int i) {
        this.a = i;
        if (i == 0) {
            byte b = this.b;
            om8 om8Var = this.c;
            om8Var.n = b;
            om8Var.b();
        }
    }
}
