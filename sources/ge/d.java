package ge;

import je.t;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d extends le.a {
    public final /* synthetic */ int a;
    public final je.a b;

    public d(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new t();
                break;
            default:
                this.b = new je.f();
                break;
        }
    }

    @Override // le.a
    public void a(CharSequence charSequence) {
        int i10 = this.a;
    }

    @Override // le.a
    public boolean b(je.a aVar) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override // le.a
    public final je.a e() {
        switch (this.a) {
            case 0:
                return (je.f) this.b;
            default:
                return (t) this.b;
        }
    }

    @Override // le.a
    public boolean f() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override // le.a
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
