package ci;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class f extends dh.b {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i10, e6Var);
        this.n = 2;
    }

    @Override // dh.b, dh.a
    public int a() {
        switch (this.n) {
            case 2:
                return b() ? 117440511 : 285212672;
            default:
                return super.a();
        }
    }

    @Override // dh.b
    public boolean b() {
        switch (this.n) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.b();
        }
    }

    @Override // dh.b, dh.a
    public int c() {
        switch (this.n) {
            case 2:
                if (b()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.c();
        }
    }

    @Override // dh.b, dh.a
    public int m() {
        switch (this.n) {
            case 2:
                if (b()) {
                    return 83886079;
                }
                return TLObject.FLAG_29;
            default:
                return super.m();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(org.telegram.ui.ActionBar.e6 e6Var, int i10, float f7, int i11) {
        super(e6Var, i10, f7);
        this.n = i11;
    }
}
