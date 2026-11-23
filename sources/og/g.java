package og;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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

    public final void e(boolean z10, float f10, float f11, float f12, int i7, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z11) {
        this.a = z10;
        this.b = f10;
        this.c = f11;
        this.f = f13;
        this.g = f12;
        this.i = i7;
        while (true) {
            int i10 = this.i;
            if (i10 >= 0) {
                break;
            } else {
                this.i = i10 + 360;
            }
        }
        while (true) {
            int i11 = this.i;
            if (i11 < 360) {
                this.j = f16;
                this.k = f17;
                this.d = f18;
                this.e = f19;
                this.l = f14;
                this.m = f15;
                this.h = z11;
                return;
            }
            this.i = i11 - 360;
        }
    }
}
