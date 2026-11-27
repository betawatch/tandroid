// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class g99 {
    public s99 a;
    public s99 b;
    public a86 c;
    public a94[] d;
    public boolean e;
    public short f;

    public final um4 a() {
        boolean z = false;
        xve.a("Must set register function", this.a != null);
        xve.a("Must set unregister function", this.b != null);
        xve.a("Must set holder", this.c != null);
        y76 y76Var = this.c.b;
        xve.i(y76Var, "Key must not be null");
        return new um4((Object) new y6d(this, this.c, this.d, this.e, this.f), (Object) new k7b(this, y76Var, z, (byte) 10), (byte) 23);
    }
}
