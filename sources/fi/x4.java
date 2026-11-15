package fi;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.pz;
import org.telegram.ui.u91;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x4 extends cv0 {
    public final /* synthetic */ int L = 0;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(dk dkVar, Context context, pz pzVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, pzVar, 1, e6Var);
        this.M = dkVar;
    }

    @Override // org.telegram.ui.Components.cv0
    public void e(boolean z10, boolean z11) {
        switch (this.L) {
            case 2:
                u91 u91Var = (u91) this.M;
                super.e(z10, z11);
                if (!z11) {
                    ((TextView) u91Var.n.d).animate().cancel();
                    ((TextView) u91Var.n.d).setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    ((TextView) u91Var.n.d).animate().alpha(z10 ? 0.0f : 1.0f).start();
                    break;
                }
            default:
                super.e(z10, z11);
                break;
        }
    }

    @Override // android.view.View
    public float getTranslationY() {
        switch (this.L) {
            case 1:
                return super.getTranslationY() - ((dk) this.M).N;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.L) {
            case 0:
                c5 c5Var = ((y4) this.M).d;
                super.onMeasure(i7, i20.c(c5Var.e, c5Var.n - c5Var.r.getPaddingTop(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.L) {
            case 1:
                super.setTranslationY(f10 + ((dk) this.M).N);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(int i7, Context context, b bVar, y4 y4Var) {
        super(context, null, i7, bVar);
        this.M = y4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(u91 u91Var, Context context, pz pzVar) {
        super(context, pzVar, 0, null);
        this.M = u91Var;
    }
}
