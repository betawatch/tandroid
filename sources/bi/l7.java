package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.p10;
import org.telegram.messenger.u10;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class l7 extends g51 {
    public final /* synthetic */ int n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l7(Context context, int i7, int i10, boolean z10, p10 p10Var, u10 u10Var, v10 v10Var, org.telegram.ui.ActionBar.i6 i6Var, int i11) {
        super(context, i7, i10, z10, p10Var, u10Var, v10Var, i6Var);
        this.n3 = i11;
    }

    @Override // org.telegram.ui.Components.ek0
    public Integer V0(int i7) {
        switch (this.n3) {
            case 0:
                break;
            case 7:
                n41 G = this.g3.G(i7);
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
                if (view instanceof org.telegram.ui.Wallet.g4) {
                    org.telegram.ui.Wallet.g4 g4Var = (org.telegram.ui.Wallet.g4) view;
                    if (g4Var.G > 0.0f || g4Var.J.d()) {
                        return false;
                    }
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l7(Context context, int i7, int i10, boolean z10, p10 p10Var, u10 u10Var, v10 v10Var, org.telegram.ui.ActionBar.i6 i6Var, int i11, int i12) {
        super(context, i7, i10, z10, p10Var, u10Var, v10Var, i6Var, i11, i12);
        this.n3 = 8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l7(org.telegram.ui.ActionBar.g2 g2Var, p10 p10Var, u10 u10Var, v10 v10Var, int i7) {
        super(g2Var, p10Var, u10Var, v10Var);
        this.n3 = i7;
    }
}
