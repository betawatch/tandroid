package hi;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class t {
    public final u a;
    public final int b;
    public final int c;

    public t(u uVar, int i7, int i10) {
        this.a = uVar;
        this.b = i7;
        this.c = i10;
    }

    public final float a(float f10) {
        return (f10 / this.a.d[this.c]) * this.b;
    }

    public final float b(float f10) {
        return (f10 / this.a.d[this.c]) * (this.b + 1);
    }
}
