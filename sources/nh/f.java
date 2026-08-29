package nh;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class f extends og.b {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, c6Var);
        this.n = 2;
    }

    @Override // og.b
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

    @Override // og.b, og.a
    public int h() {
        switch (this.n) {
            case 2:
                return a() ? 117440511 : 285212672;
            default:
                return super.h();
        }
    }

    @Override // og.b, og.a
    public int m() {
        switch (this.n) {
            case 2:
                if (a()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.m();
        }
    }

    @Override // og.b, og.a
    public int v() {
        switch (this.n) {
            case 2:
                if (a()) {
                    return 83886079;
                }
                return TLObject.FLAG_29;
            default:
                return super.v();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(org.telegram.ui.ActionBar.c6 c6Var, int i10, float f9, int i11) {
        super(c6Var, i10, f9);
        this.n = i11;
    }
}
