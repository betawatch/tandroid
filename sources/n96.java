// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class n96 {
    public final fq7 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ kj7 d;

    public n96(kj7 kj7Var, fq7 fq7Var) {
        this.d = kj7Var;
        this.a = fq7Var;
    }

    public final void a(boolean z) {
        if (z != this.b) {
            this.b = z;
            int i = z ? 1 : -1;
            kj7 kj7Var = this.d;
            int i2 = kj7Var.c;
            kj7Var.c = i + i2;
            if (!kj7Var.d) {
                kj7Var.d = true;
                while (true) {
                    try {
                        int i3 = kj7Var.c;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            kj7Var.e();
                        } else if (z3) {
                            kj7Var.f();
                        }
                        i2 = i3;
                    } finally {
                        kj7Var.d = false;
                    }
                }
            }
            if (this.b) {
                kj7Var.c(this);
            }
        }
    }

    public boolean d(e36 e36Var) {
        return false;
    }

    public boolean e() {
        return true;
    }

    public void c() {
    }
}
