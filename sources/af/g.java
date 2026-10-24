package af;

import df.t;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class g extends ff.a {
    public final /* synthetic */ int a;
    public final df.a b;

    public g(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new t();
                break;
            default:
                this.b = new df.f();
                break;
        }
    }

    @Override // ff.a
    public void a(CharSequence charSequence) {
        int i10 = this.a;
    }

    @Override // ff.a
    public boolean b(df.a aVar) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override // ff.a
    public final df.a e() {
        switch (this.a) {
            case 0:
                return (df.f) this.b;
            default:
                return (t) this.b;
        }
    }

    @Override // ff.a
    public boolean f() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override // ff.a
    public final a h(h hVar) {
        switch (this.a) {
            case 0:
                return a.a(hVar.b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
