// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class c69 extends wm5 {
    public static final c69 n;
    public final transient wn7 e;
    public final transient int f;
    public transient vm5 h;

    static {
        wn7 wn7Var = new wn7();
        wn7Var.d(3);
        n = new c69(wn7Var);
    }

    public c69(wn7 wn7Var) {
        this.e = wn7Var;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = wn7Var.c;
            if (i >= i2) {
                this.f = gle.d(j);
                return;
            } else {
                gre.j(i, i2);
                j += wn7Var.b[i];
                i++;
            }
        }
    }

    @Override // gm5
    public final boolean m() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f;
    }
}
