package kg;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g {
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
    public final g clone() {
        g gVar = new g();
        gVar.a = this.a;
        gVar.b = this.b;
        gVar.c = this.c;
        gVar.d = this.d;
        gVar.e = this.e;
        gVar.f = this.f;
        gVar.g = this.g;
        gVar.h = this.h;
        gVar.i = this.i;
        gVar.j = this.j;
        gVar.k = this.k;
        gVar.l = this.l;
        gVar.m = this.m;
        return gVar;
    }

    public final int b() {
        return this.i;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.a = z10;
        this.b = f7;
        this.c = f10;
        this.f = f12;
        this.g = f11;
        this.i = i10;
        while (true) {
            int i11 = this.i;
            if (i11 >= 0) {
                break;
            } else {
                this.i = i11 + 360;
            }
        }
        while (true) {
            int i12 = this.i;
            if (i12 < 360) {
                this.j = f15;
                this.k = f16;
                this.d = f17;
                this.e = f18;
                this.l = f13;
                this.m = f14;
                this.h = z11;
                return;
            }
            this.i = i12 - 360;
        }
    }
}
