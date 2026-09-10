package bi;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class f extends ch.b {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, f6Var);
        this.n = 2;
    }

    @Override // ch.b
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

    @Override // ch.b, ch.a
    public int h() {
        switch (this.n) {
            case 2:
                return a() ? 117440511 : 285212672;
            default:
                return super.h();
        }
    }

    @Override // ch.b, ch.a
    public int p() {
        switch (this.n) {
            case 2:
                if (a()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.p();
        }
    }

    @Override // ch.b, ch.a
    public int w() {
        switch (this.n) {
            case 2:
                if (a()) {
                    return 83886079;
                }
                return TLObject.FLAG_29;
            default:
                return super.w();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(org.telegram.ui.ActionBar.f6 f6Var, int i10, float f7, int i11) {
        super(f6Var, i10, f7);
        this.n = i11;
    }
}
