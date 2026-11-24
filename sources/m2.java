// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class m2 implements Runnable {
    public final t2 a;
    public final t56 b;

    public m2(t2 t2Var, t56 t56Var) {
        this.a = t2Var;
        this.b = t56Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a == this) {
            if (t2.f.b(this.a, this, t2.i(this.b))) {
                t2.f(this.a, false);
            }
        }
    }
}
