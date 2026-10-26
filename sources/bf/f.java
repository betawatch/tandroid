package bf;

import ef.t;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class f extends gf.a {
    public final /* synthetic */ int a;
    public final ef.a b;

    public f(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new t();
                break;
            default:
                this.b = new ef.f();
                break;
        }
    }

    @Override // gf.a
    public void a(CharSequence charSequence) {
        int i10 = this.a;
    }

    @Override // gf.a
    public boolean b(ef.a aVar) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override // gf.a
    public final ef.a e() {
        switch (this.a) {
            case 0:
                return (ef.f) this.b;
            default:
                return (t) this.b;
        }
    }

    @Override // gf.a
    public boolean f() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override // gf.a
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
