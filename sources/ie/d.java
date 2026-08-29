package ie;

import le.t;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d extends ne.a {
    public final /* synthetic */ int a;
    public final le.a b;

    public d(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new t();
                break;
            default:
                this.b = new le.f();
                break;
        }
    }

    @Override // ne.a
    public void a(CharSequence charSequence) {
        int i10 = this.a;
    }

    @Override // ne.a
    public boolean b(le.a aVar) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override // ne.a
    public final le.a e() {
        switch (this.a) {
            case 0:
                return (le.f) this.b;
            default:
                return (t) this.b;
        }
    }

    @Override // ne.a
    public boolean f() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override // ne.a
    public final g4.h h(e eVar) {
        switch (this.a) {
            case 0:
                return g4.h.a(eVar.b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
