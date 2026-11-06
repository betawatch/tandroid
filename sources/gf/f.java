package gf;

import kf.t;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f extends mf.a {
    public final /* synthetic */ int a;
    public final kf.a b;

    public f(int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.b = new t();
                break;
            default:
                this.b = new kf.f();
                break;
        }
    }

    @Override // mf.a
    public void a(CharSequence charSequence) {
        int i7 = this.a;
    }

    @Override // mf.a
    public boolean b(kf.a aVar) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override // mf.a
    public final kf.a e() {
        switch (this.a) {
            case 0:
                return (kf.f) this.b;
            default:
                return (t) this.b;
        }
    }

    @Override // mf.a
    public boolean f() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override // mf.a
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
