package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e10 extends wg.b {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e10(int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, p6Var);
        this.s = 0;
    }

    @Override // wg.b, wg.a
    public int E() {
        switch (this.s) {
            case 0:
                if (c()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.E();
        }
    }

    @Override // wg.b
    public boolean c() {
        switch (this.s) {
            case 1:
                return true;
            case 2:
                return true;
            default:
                return super.c();
        }
    }

    @Override // wg.b, wg.a
    public int j0() {
        switch (this.s) {
            case 0:
                if (c()) {
                    return 83886079;
                }
                return TLObject.FLAG_29;
            default:
                return super.j0();
        }
    }

    @Override // wg.b, wg.a
    public int u() {
        switch (this.s) {
            case 0:
                return c() ? 117440511 : 285212672;
            default:
                return super.u();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e10(org.telegram.ui.ActionBar.p6 p6Var, int i10, float f7, int i11) {
        super(p6Var, i10, f7);
        this.s = i11;
    }
}
