package kh;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class f extends lg.b {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(i9, b6Var);
        this.n = 2;
    }

    @Override // lg.b
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

    @Override // lg.b, lg.a
    public int e() {
        switch (this.n) {
            case 2:
                return a() ? 117440511 : 285212672;
            default:
                return super.e();
        }
    }

    @Override // lg.b, lg.a
    public int g() {
        switch (this.n) {
            case 2:
                if (a()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.g();
        }
    }

    @Override // lg.b, lg.a
    public int j() {
        switch (this.n) {
            case 2:
                if (a()) {
                    return 83886079;
                }
                return TLObject.FLAG_29;
            default:
                return super.j();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(org.telegram.ui.ActionBar.b6 b6Var, int i9, float f10, int i10) {
        super(b6Var, i9, f10);
        this.n = i10;
    }
}
