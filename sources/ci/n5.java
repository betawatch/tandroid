package ci;

import android.content.Context;
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.ye1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class n5 extends wx0 {
    public final /* synthetic */ int K = 0;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(nk nkVar, Context context, b10 b10Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, b10Var, 1, g6Var);
        this.L = nkVar;
    }

    @Override // org.telegram.ui.Components.wx0
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 2:
                ye1 ye1Var = (ye1) this.L;
                super.e(z10, z11);
                if (!z11) {
                    ye1Var.n.a.animate().cancel();
                    ye1Var.n.a.setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    ye1Var.n.a.animate().alpha(z10 ? 0.0f : 1.0f).start();
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
            case 1:
                return super.getTranslationY() - ((nk) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.K) {
            case 0:
                t5 t5Var = ((o5) this.L).d;
                super.onMeasure(i10, sl.c(t5Var.e, t5Var.n - t5Var.r.getPaddingTop(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.K) {
            case 1:
                super.setTranslationY(f7 + ((nk) this.L).M);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(int i10, Context context, b bVar, o5 o5Var) {
        super(context, null, i10, bVar);
        this.L = o5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(ye1 ye1Var, Context context, b10 b10Var) {
        super(context, b10Var, 0, null);
        this.L = ye1Var;
    }
}
