package di;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class b5 {
    public float a;
    public final int b;
    public final int c;

    public b5(float f10, int i7, int i10) {
        this.a = f10;
        this.b = i7;
        this.c = i10;
    }

    public float a(int i7) {
        int i10 = this.b;
        int i11 = this.c;
        if (i11 == i7 && i10 == i7) {
            return 1.0f;
        }
        if (i11 == i7) {
            return this.a;
        }
        if (i10 == i7) {
            return 1.0f - this.a;
        }
        return 0.0f;
    }

    public boolean b(int i7) {
        return this.b == i7 || this.c == i7;
    }

    public boolean c(int i7) {
        return this.c == i7;
    }

    public boolean d(int i7) {
        return this.c == i7;
    }

    public b5(int i7, int i10) {
        this.b = i7;
        this.c = i10;
    }
}
