package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class y10 extends qg.b {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y10(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, f6Var);
        this.n = 0;
    }

    @Override // qg.b, qg.a
    public int W1() {
        switch (this.n) {
            case 0:
                if (a()) {
                    return 83886079;
                }
                return TLObject.FLAG_29;
            default:
                return super.W1();
        }
    }

    @Override // qg.b, qg.a
    public int X0() {
        switch (this.n) {
            case 0:
                if (a()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.X0();
        }
    }

    @Override // qg.b
    public boolean a() {
        switch (this.n) {
            case 1:
                return true;
            case 2:
                return true;
            default:
                return super.a();
        }
    }

    @Override // qg.b, qg.a
    public int x0() {
        switch (this.n) {
            case 0:
                return a() ? 117440511 : 285212672;
            default:
                return super.x0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y10(org.telegram.ui.ActionBar.f6 f6Var, int i10, float f10, int i11) {
        super(f6Var, i10, f10);
        this.n = i11;
    }
}
