// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ji0 implements fv9 {
    public final li0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public ji0(li0 li0Var, long j, long j2, long j3, long j4, long j5) {
        this.a = li0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // fv9
    public final boolean c() {
        return true;
    }

    @Override // fv9
    public final boolean d() {
        return false;
    }

    @Override // fv9
    public final ev9 f(long j) {
        hv9 hv9Var = new hv9(j, ki0.a(this.a.c(j), 0L, this.c, this.d, this.e, this.f));
        return new ev9(hv9Var, hv9Var);
    }

    @Override // fv9
    public final long h() {
        return this.b;
    }
}
