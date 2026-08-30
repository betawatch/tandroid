package nh;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.kf1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class y4 extends zw0 {
    public final /* synthetic */ int H = 0;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(hk hkVar, Context context, t00 t00Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, t00Var, 1, f6Var);
        this.I = hkVar;
    }

    @Override // org.telegram.ui.Components.zw0
    public void e(boolean z4, boolean z10) {
        switch (this.H) {
            case 2:
                kf1 kf1Var = (kf1) this.I;
                super.e(z4, z10);
                if (!z10) {
                    kf1Var.n.a.animate().cancel();
                    kf1Var.n.a.setAlpha(z4 ? 0.0f : 1.0f);
                    break;
                } else {
                    kf1Var.n.a.animate().alpha(z4 ? 0.0f : 1.0f).start();
                    break;
                }
            default:
                super.e(z4, z10);
                break;
        }
    }

    @Override // android.view.View
    public float getTranslationY() {
        switch (this.H) {
            case 1:
                return super.getTranslationY() - ((hk) this.I).J;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.H) {
            case 0:
                d5 d5Var = ((z4) this.I).d;
                super.onMeasure(i10, org.telegram.ui.b.d(d5Var.e, d5Var.n - d5Var.r.getPaddingTop(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.H) {
            case 1:
                super.setTranslationY(f10 + ((hk) this.I).J);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(int i10, Context context, b bVar, z4 z4Var) {
        super(context, null, i10, bVar);
        this.I = z4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(kf1 kf1Var, Context context, t00 t00Var) {
        super(context, t00Var, 0, null);
        this.I = kf1Var;
    }
}
