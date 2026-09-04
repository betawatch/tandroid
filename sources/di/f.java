package di;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class f extends eh.b {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, f6Var);
        this.n = 2;
    }

    @Override // eh.b, eh.a
    public int G() {
        switch (this.n) {
            case 2:
                if (a()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.G();
        }
    }

    @Override // eh.b, eh.a
    public int J() {
        switch (this.n) {
            case 2:
                if (a()) {
                    return 83886079;
                }
                return TLObject.FLAG_29;
            default:
                return super.J();
        }
    }

    @Override // eh.b
    public boolean a() {
        switch (this.n) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.a();
        }
    }

    @Override // eh.b, eh.a
    public int p() {
        switch (this.n) {
            case 2:
                return a() ? 117440511 : 285212672;
            default:
                return super.p();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(org.telegram.ui.ActionBar.f6 f6Var, int i10, float f7, int i11) {
        super(f6Var, i10, f7);
        this.n = i11;
    }
}
