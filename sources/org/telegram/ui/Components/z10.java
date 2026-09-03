package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class z10 extends rg.b {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z10(int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, g6Var);
        this.n = 0;
    }

    @Override // rg.b, rg.a
    public int I() {
        switch (this.n) {
            case 0:
                if (a()) {
                    return 83886079;
                }
                return TLObject.FLAG_29;
            default:
                return super.I();
        }
    }

    @Override // rg.b
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

    @Override // rg.b, rg.a
    public int k() {
        switch (this.n) {
            case 0:
                return a() ? 117440511 : 285212672;
            default:
                return super.k();
        }
    }

    @Override // rg.b, rg.a
    public int x() {
        switch (this.n) {
            case 0:
                if (a()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.x();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z10(org.telegram.ui.ActionBar.g6 g6Var, int i10, float f10, int i11) {
        super(g6Var, i10, f10);
        this.n = i11;
    }
}
