// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
