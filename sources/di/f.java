package di;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class f extends eh.b {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, c6Var);
        this.n = 2;
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
    public int k() {
        switch (this.n) {
            case 2:
                return a() ? 117440511 : 285212672;
            default:
                return super.k();
        }
    }

    @Override // eh.b, eh.a
    public int w() {
        switch (this.n) {
            case 2:
                if (a()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.w();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(org.telegram.ui.ActionBar.c6 c6Var, int i10, float f7, int i11) {
        super(c6Var, i10, f7);
        this.n = i11;
    }
}
