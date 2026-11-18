package hi;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class f extends gh.b {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, i6Var);
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
    public /* synthetic */ f(org.telegram.ui.ActionBar.i6 i6Var, int i7, float f10, int i10) {
        super(i6Var, i7, f10);
        this.s = i10;
    }
}
