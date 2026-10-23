package ei;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class f extends eh.b {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, g6Var);
        this.r = 2;
    }

    @Override // eh.b, eh.a
    public int H() {
        switch (this.r) {
            case 2:
                if (b()) {
                    return 83886079;
                }
                return TLObject.FLAG_29;
            default:
                return super.H();
        }
    }

    @Override // eh.b
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

    @Override // eh.b, eh.a
    public int h() {
        switch (this.r) {
            case 2:
                return b() ? 117440511 : 285212672;
            default:
                return super.h();
        }
    }

    @Override // eh.b, eh.a
    public int u() {
        switch (this.r) {
            case 2:
                if (b()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.u();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(org.telegram.ui.ActionBar.g6 g6Var, int i10, float f7, int i11) {
        super(g6Var, i10, f7);
        this.r = i11;
    }
}
