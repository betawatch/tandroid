package ih;

import android.content.Context;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class b5 extends gw0 {
    public final /* synthetic */ int G = 0;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(fk fkVar, Context context, e00 e00Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, e00Var, 1, b6Var);
        this.H = fkVar;
    }

    @Override // org.telegram.ui.Components.gw0
    public void e(boolean z10, boolean z11) {
        switch (this.G) {
            case 2:
                we1 we1Var = (we1) this.H;
                super.e(z10, z11);
                if (!z11) {
                    we1Var.n.a.animate().cancel();
                    we1Var.n.a.setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    we1Var.n.a.animate().alpha(z10 ? 0.0f : 1.0f).start();
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
                return super.getTranslationY() - ((fk) this.H).I;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.G) {
            case 0:
                g5 g5Var = ((c5) this.H).d;
                super.onMeasure(i9, ll.d(g5Var.e, g5Var.n - g5Var.r.getPaddingTop(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.G) {
            case 1:
                super.setTranslationY(f10 + ((fk) this.H).I);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(int i9, Context context, b bVar, c5 c5Var) {
        super(context, null, i9, bVar);
        this.H = c5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(we1 we1Var, Context context, e00 e00Var) {
        super(context, e00Var, 0, null);
        this.H = we1Var;
    }
}
