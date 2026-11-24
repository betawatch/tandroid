// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class n43 {
    public boolean a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n43 clone() {
        n43 n43Var = new n43();
        n43Var.a = this.a;
        n43Var.b = this.b;
        n43Var.c = this.c;
        n43Var.d = this.d;
        n43Var.e = this.e;
        n43Var.f = this.f;
        n43Var.g = this.g;
        n43Var.h = this.h;
        n43Var.i = this.i;
        n43Var.j = this.j;
        n43Var.k = this.k;
        n43Var.l = this.l;
        n43Var.m = this.m;
        return n43Var;
    }

    public final void b(boolean z, float f, float f2, float f3, int i, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean z2) {
        this.a = z;
        this.b = f;
        this.c = f2;
        this.f = f4;
        this.g = f3;
        this.i = i;
        while (true) {
            int i2 = this.i;
            if (i2 >= 0) {
                break;
            } else {
                this.i = i2 + 360;
            }
        }
        while (true) {
            int i3 = this.i;
            if (i3 < 360) {
                this.j = f7;
                this.k = f8;
                this.d = f9;
                this.e = f10;
                this.l = f5;
                this.m = f6;
                this.h = z2;
                return;
            }
            this.i = i3 - 360;
        }
    }
}
