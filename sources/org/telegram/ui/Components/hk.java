package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ig1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class hk extends jx0 {
    public final /* synthetic */ int K = 2;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(tk tkVar, Context context, a10 a10Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, a10Var, 1, f6Var);
        this.L = tkVar;
    }

    @Override // org.telegram.ui.Components.jx0
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 1:
                ig1 ig1Var = (ig1) this.L;
                super.e(z10, z11);
                if (!z11) {
                    ig1Var.n.a.animate().cancel();
                    ig1Var.n.a.setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    ig1Var.n.a.animate().alpha(z10 ? 0.0f : 1.0f).start();
                    break;
                }
            default:
                super.e(z10, z11);
                break;
        }
    }

    @Override // android.view.View
    public float getTranslationY() {
        switch (this.K) {
            case 0:
                return super.getTranslationY() - ((tk) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.K) {
            case 2:
                zh.z3 z3Var = ((zh.v3) this.L).d;
                super.onMeasure(i10, org.telegram.messenger.em.d(z3Var.e, z3Var.n - z3Var.r.getPaddingTop(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.K) {
            case 0:
                super.setTranslationY(f7 + ((tk) this.L).M);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(int i10, Context context, zh.b bVar, zh.v3 v3Var) {
        super(context, null, i10, bVar);
        this.L = v3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(ig1 ig1Var, Context context, a10 a10Var) {
        super(context, a10Var, 0, null);
        this.L = ig1Var;
    }
}
