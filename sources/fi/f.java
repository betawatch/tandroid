package fi;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f extends fh.b {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(i10, u6Var);
        this.r = 2;
    }

    @Override // fh.b, fh.a
    public int A() {
        switch (this.r) {
            case 2:
                if (b()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.A();
        }
    }

    @Override // fh.b
    public boolean b() {
        switch (this.r) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.b();
        }
    }

    @Override // fh.b, fh.a
    public int f0() {
        switch (this.r) {
            case 2:
                if (b()) {
                    return 83886079;
                }
                return TLObject.FLAG_29;
            default:
                return super.f0();
        }
    }

    @Override // fh.b, fh.a
    public int t() {
        switch (this.r) {
            case 2:
                return b() ? 117440511 : 285212672;
            default:
                return super.t();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(org.telegram.ui.ActionBar.u6 u6Var, int i10, float f7, int i11) {
        super(u6Var, i10, f7);
        this.r = i11;
    }
}
