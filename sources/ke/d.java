package ke;

import ne.t;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class d extends pe.a {
    public final /* synthetic */ int a;
    public final ne.a b;

    public d(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new t();
                break;
            default:
                this.b = new ne.f();
                break;
        }
    }

    @Override // pe.a
    public void a(CharSequence charSequence) {
        int i10 = this.a;
    }

    @Override // pe.a
    public boolean b(ne.a aVar) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override // pe.a
    public final ne.a e() {
        switch (this.a) {
            case 0:
                return (ne.f) this.b;
            default:
                return (t) this.b;
        }
    }

    @Override // pe.a
    public boolean f() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override // pe.a
    public final j4.h h(e eVar) {
        switch (this.a) {
            case 0:
                return j4.h.a(eVar.b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
