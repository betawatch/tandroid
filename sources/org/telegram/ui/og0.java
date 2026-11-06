package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class og0 extends fi.d {
    public final /* synthetic */ int k0;
    public final /* synthetic */ org.telegram.ui.Components.na l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og0(org.telegram.ui.Components.na naVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var, true);
        this.k0 = i7;
        this.l0 = naVar;
    }

    @Override // fi.d
    public final float b(float f10, float f11) {
        switch (this.k0) {
            case 0:
                qg0 qg0Var = (qg0) this.l0;
                boolean z9 = qg0Var.f2 == 0.0f;
                qg0Var.f2 = f10;
                if (z9) {
                    qg0Var.g2 = new org.telegram.ui.Components.yo(qg0Var, 2);
                    qg0Var.e1(false);
                    break;
                }
                break;
            default:
                wg.f1 f1Var = (wg.f1) this.l0;
                boolean z10 = f1Var.l2 == 0.0f;
                f1Var.l2 = f10;
                if (z10) {
                    f1Var.m2 = new org.telegram.ui.Components.yo(f1Var, 3);
                    f1Var.n1(false);
                    break;
                }
                break;
        }
        return f10;
    }
}
