package fi;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class f extends gh.b {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, f6Var);
        this.s = 2;
    }

    @Override // gh.b, gh.a
    public int A() {
        switch (this.s) {
            case 2:
                return c() ? 117440511 : 285212672;
            default:
                return super.A();
        }
    }

    @Override // gh.b, gh.a
    public int O() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.O();
        }
    }

    @Override // gh.b, gh.a
    public int R0() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 83886079;
                }
                return TLObject.FLAG_29;
            default:
                return super.R0();
        }
    }

    @Override // gh.b
    public boolean c() {
        switch (this.s) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(org.telegram.ui.ActionBar.f6 f6Var, int i7, float f10, int i10) {
        super(f6Var, i7, f10);
        this.s = i10;
    }
}
