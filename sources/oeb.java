// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oeb {
    public int a;
    public float b;
    public float c;

    public oeb(float f, float f2, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public final Object clone() {
        return new oeb(this.b, this.c, this.a);
    }
}
