package oh;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.sf1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class z4 extends zw0 {
    public final /* synthetic */ int H = 0;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(jk jkVar, Context context, u00 u00Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, u00Var, 1, g6Var);
        this.I = jkVar;
    }

    @Override // org.telegram.ui.Components.zw0
    public void e(boolean z4, boolean z10) {
        switch (this.H) {
            case 2:
                sf1 sf1Var = (sf1) this.I;
                super.e(z4, z10);
                if (!z10) {
                    sf1Var.n.a.animate().cancel();
                    sf1Var.n.a.setAlpha(z4 ? 0.0f : 1.0f);
                    break;
                } else {
                    sf1Var.n.a.animate().alpha(z4 ? 0.0f : 1.0f).start();
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
                return super.getTranslationY() - ((jk) this.I).J;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.H) {
            case 0:
                e5 e5Var = ((a5) this.I).d;
                super.onMeasure(i10, org.telegram.ui.b.d(e5Var.e, e5Var.n - e5Var.r.getPaddingTop(), TLObject.FLAG_30));
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
                super.setTranslationY(f10 + ((jk) this.I).J);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(int i10, Context context, b bVar, a5 a5Var) {
        super(context, null, i10, bVar);
        this.I = a5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(sf1 sf1Var, Context context, u00 u00Var) {
        super(context, u00Var, 0, null);
        this.I = sf1Var;
    }
}
