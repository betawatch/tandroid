package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.n10;
import org.telegram.messenger.s10;
import org.telegram.messenger.t10;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i5 extends l41 {
    public final /* synthetic */ int n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i5(Context context, int i3, int i10, boolean z10, n10 n10Var, s10 s10Var, t10 t10Var, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        super(context, i3, i10, z10, n10Var, s10Var, t10Var, e6Var);
        this.n3 = i11;
    }

    @Override // org.telegram.ui.Components.tj0
    public Integer V0(int i3) {
        switch (this.n3) {
            case 0:
                break;
            case 7:
                r31 G = this.g3.G(i3);
                if (G != null && G.d == 2) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return super.V0(i3);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.n3) {
            case 1:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                break;
            case 2:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                break;
            case 3:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                break;
            case 4:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                break;
            case 5:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                break;
            case 6:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean u1(View view) {
        switch (this.n3) {
            case 8:
                if (view instanceof org.telegram.ui.Wallet.u3) {
                    org.telegram.ui.Wallet.u3 u3Var = (org.telegram.ui.Wallet.u3) view;
                    if (u3Var.G > 0.0f || u3Var.J.d()) {
                        return false;
                    }
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i5(Context context, int i3, int i10, boolean z10, n10 n10Var, s10 s10Var, t10 t10Var, org.telegram.ui.ActionBar.e6 e6Var, int i11, int i12) {
        super(context, i3, i10, z10, n10Var, s10Var, t10Var, e6Var, i11, i12);
        this.n3 = 8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i5(org.telegram.ui.ActionBar.d2 d2Var, n10 n10Var, s10 s10Var, t10 t10Var, int i3) {
        super(d2Var, n10Var, s10Var, t10Var);
        this.n3 = i3;
    }
}
