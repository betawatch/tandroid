package hi;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f extends gh.b {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, e6Var);
        this.s = 2;
    }

    @Override // gh.b, gh.a
    public int U0() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.U0();
        }
    }

    @Override // gh.b, gh.a
    public int W1() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 83886079;
                }
                return TLObject.FLAG_29;
            default:
                return super.W1();
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

    @Override // gh.b, gh.a
    public int t0() {
        switch (this.s) {
            case 2:
                return c() ? 117440511 : 285212672;
            default:
                return super.t0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(org.telegram.ui.ActionBar.e6 e6Var, int i7, float f10, int i10) {
        super(e6Var, i7, f10);
        this.s = i10;
    }
}
