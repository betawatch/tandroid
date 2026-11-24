// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ky1 implements it3 {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ dka c;

    public ky1(float f, dka dkaVar) {
        this.b = f;
        this.c = dkaVar;
    }

    @Override // it3
    public final void a(zna znaVar, float f, float f2) {
        if (this.a || f < this.b) {
            return;
        }
        this.a = true;
        try {
            this.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
