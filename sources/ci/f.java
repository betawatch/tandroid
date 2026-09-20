package ci;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class f extends dh.b {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, f6Var);
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
    public int d() {
        switch (this.n) {
            case 2:
                if (b()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.d();
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
    public /* synthetic */ f(org.telegram.ui.ActionBar.f6 f6Var, int i10, float f7, int i11) {
        super(f6Var, i10, f7);
        this.n = i11;
    }
}
