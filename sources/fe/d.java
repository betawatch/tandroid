package fe;

import ie.t;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends ke.a {
    public final /* synthetic */ int a;
    public final ie.a b;

    public d(int i9) {
        this.a = i9;
        switch (i9) {
            case 1:
                this.b = new t();
                break;
            default:
                this.b = new ie.f();
                break;
        }
    }

    @Override // ke.a
    public void a(CharSequence charSequence) {
        int i9 = this.a;
    }

    @Override // ke.a
    public boolean b(ie.a aVar) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override // ke.a
    public final ie.a e() {
        switch (this.a) {
            case 0:
                return (ie.f) this.b;
            default:
                return (t) this.b;
        }
    }

    @Override // ke.a
    public boolean f() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override // ke.a
    public final e4.h h(e eVar) {
        switch (this.a) {
            case 0:
                return e4.h.a(eVar.b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
