package di;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.uj;
import org.telegram.ui.z91;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g5 extends bv0 {
    public final /* synthetic */ int K = 0;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(uj ujVar, Context context, lz lzVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, lzVar, 1, h6Var);
        this.L = ujVar;
    }

    @Override // org.telegram.ui.Components.bv0
    public void e(boolean z9, boolean z10) {
        switch (this.K) {
            case 2:
                z91 z91Var = (z91) this.L;
                super.e(z9, z10);
                if (!z10) {
                    ((TextView) z91Var.n.d).animate().cancel();
                    ((TextView) z91Var.n.d).setAlpha(z9 ? 0.0f : 1.0f);
                    break;
                } else {
                    ((TextView) z91Var.n.d).animate().alpha(z9 ? 0.0f : 1.0f).start();
                    break;
                }
            default:
                super.e(z9, z10);
                break;
        }
    }

    @Override // android.view.View
    public float getTranslationY() {
        switch (this.K) {
            case 1:
                return super.getTranslationY() - ((uj) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.K) {
            case 0:
                l5 l5Var = ((h5) this.L).d;
                super.onMeasure(i7, org.telegram.messenger.camera.q.c(l5Var.e, l5Var.n - l5Var.r.getPaddingTop(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.K) {
            case 1:
                super.setTranslationY(f10 + ((uj) this.L).M);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(int i7, Context context, b bVar, h5 h5Var) {
        super(context, null, i7, bVar);
        this.L = h5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(z91 z91Var, Context context, lz lzVar) {
        super(context, lzVar, 0, null);
        this.L = z91Var;
    }
}
