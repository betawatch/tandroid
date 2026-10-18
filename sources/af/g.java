package af;

import df.t;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
