package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.q10;
import org.telegram.messenger.v10;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class j7 extends h51 {
    public final /* synthetic */ int n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j7(Context context, int i7, int i10, boolean z10, q10 q10Var, v10 v10Var, w10 w10Var, org.telegram.ui.ActionBar.h6 h6Var, int i11) {
        super(context, i7, i10, z10, q10Var, v10Var, w10Var, h6Var);
        this.n3 = i11;
    }

    @Override // org.telegram.ui.Components.ek0
    public Integer V0(int i7) {
        switch (this.n3) {
            case 0:
                break;
            case 7:
                o41 G = this.g3.G(i7);
                if (G != null && G.d == 2) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return super.V0(i7);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.n3) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                break;
            case 2:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                break;
            case 3:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                break;
            case 4:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                break;
            case 5:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                break;
            case 6:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public boolean u1(View view) {
        switch (this.n3) {
            case 8:
                if (view instanceof org.telegram.ui.Wallet.f4) {
                    org.telegram.ui.Wallet.f4 f4Var = (org.telegram.ui.Wallet.f4) view;
                    if (f4Var.G > 0.0f || f4Var.J.d()) {
                        return false;
                    }
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j7(Context context, int i7, int i10, boolean z10, q10 q10Var, v10 v10Var, w10 w10Var, org.telegram.ui.ActionBar.h6 h6Var, int i11, int i12) {
        super(context, i7, i10, z10, q10Var, v10Var, w10Var, h6Var, i11, i12);
        this.n3 = 8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j7(org.telegram.ui.ActionBar.g2 g2Var, q10 q10Var, v10 v10Var, w10 w10Var, int i7) {
        super(g2Var, q10Var, v10Var, w10Var);
        this.n3 = i7;
    }
}
