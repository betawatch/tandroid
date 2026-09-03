package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class z10 extends qg.b {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z10(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, f6Var);
        this.n = 0;
    }

    @Override // qg.b, qg.a
    public int D() {
        switch (this.n) {
            case 0:
                if (a()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.D();
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
    public int e0() {
        switch (this.n) {
            case 0:
                if (a()) {
                    return 83886079;
                }
                return TLObject.FLAG_29;
            default:
                return super.e0();
        }
    }

    @Override // qg.b, qg.a
    public int x() {
        switch (this.n) {
            case 0:
                return a() ? 117440511 : 285212672;
            default:
                return super.x();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z10(org.telegram.ui.ActionBar.f6 f6Var, int i10, float f10, int i11) {
        super(f6Var, i10, f10);
        this.n = i11;
    }
}
