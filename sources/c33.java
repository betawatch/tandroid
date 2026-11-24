// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class c33 {
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
    public final c33 clone() {
        c33 c33Var = new c33();
        c33Var.a = this.a;
        c33Var.b = this.b;
        c33Var.c = this.c;
        c33Var.d = this.d;
        c33Var.e = this.e;
        c33Var.f = this.f;
        c33Var.g = this.g;
        c33Var.h = this.h;
        c33Var.i = this.i;
        c33Var.j = this.j;
        c33Var.k = this.k;
        c33Var.l = this.l;
        c33Var.m = this.m;
        return c33Var;
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
