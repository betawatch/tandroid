package c5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class d {
    public final int a;
    public final int b;
    public float c;

    public d(float f10, int i10, int i11) {
        this.c = f10;
        this.a = i10;
        this.b = i11;
    }

    public float a(int i10) {
        int i11 = this.a;
        int i12 = this.b;
        if (i12 == i10 && i11 == i10) {
            return 1.0f;
        }
        if (i12 == i10) {
            return this.c;
        }
        if (i11 == i10) {
            return 1.0f - this.c;
        }
        return 0.0f;
    }

    public boolean b(int i10) {
        return this.a == i10 || this.b == i10;
    }

    public boolean c(int i10) {
        return this.b == i10;
    }

    public boolean d(int i10) {
        return this.b == i10;
    }

    public d(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }
}
