package lh;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.ze1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class x4 extends qw0 {
    public final /* synthetic */ int G = 0;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(jk jkVar, Context context, p00 p00Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, p00Var, 1, c6Var);
        this.H = jkVar;
    }

    @Override // org.telegram.ui.Components.qw0
    public void e(boolean z10, boolean z11) {
        switch (this.G) {
            case 2:
                ze1 ze1Var = (ze1) this.H;
                super.e(z10, z11);
                if (!z11) {
                    ze1Var.n.a.animate().cancel();
                    ze1Var.n.a.setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    ze1Var.n.a.animate().alpha(z10 ? 0.0f : 1.0f).start();
                    break;
                }
            default:
                super.e(z10, z11);
                break;
        }
    }

    @Override // android.view.View
    public float getTranslationY() {
        switch (this.G) {
            case 1:
                return super.getTranslationY() - ((jk) this.H).I;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.G) {
            case 0:
                c5 c5Var = ((y4) this.H).d;
                super.onMeasure(i10, org.telegram.ui.b.d(c5Var.e, c5Var.n - c5Var.r.getPaddingTop(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        switch (this.G) {
            case 1:
                super.setTranslationY(f9 + ((jk) this.H).I);
                break;
            default:
                super.setTranslationY(f9);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(int i10, Context context, b bVar, y4 y4Var) {
        super(context, null, i10, bVar);
        this.H = y4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(ze1 ze1Var, Context context, p00 p00Var) {
        super(context, p00Var, 0, null);
        this.H = ze1Var;
    }
}
