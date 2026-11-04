package df;

import gf.t;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends jf.a {
    public final /* synthetic */ int a;
    public final gf.a b;

    public f(int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = new t();
                break;
            default:
                this.b = new gf.f();
                break;
        }
    }

    @Override // jf.a
    public void a(CharSequence charSequence) {
        int i3 = this.a;
    }

    @Override // jf.a
    public boolean b(gf.a aVar) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override // jf.a
    public final gf.a e() {
        switch (this.a) {
            case 0:
                return (gf.f) this.b;
            default:
                return (t) this.b;
        }
    }

    @Override // jf.a
    public boolean f() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override // jf.a
    public final a h(g gVar) {
        switch (this.a) {
            case 0:
                return a.a(gVar.b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
