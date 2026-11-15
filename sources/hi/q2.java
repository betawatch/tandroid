package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.pz;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q2 extends pz {
    public final /* synthetic */ int V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.V = i7;
    }

    @Override // org.telegram.ui.Components.pz
    public int getColumnsCount() {
        switch (this.V) {
            case 0:
                return 3;
            case 1:
                return 3;
            default:
                return super.getColumnsCount();
        }
    }

    @Override // org.telegram.ui.Components.pz
    public int getViewType() {
        switch (this.V) {
            case 1:
                return 2;
            default:
                return super.getViewType();
        }
    }

    @Override // org.telegram.ui.Components.pz, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.V) {
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(104.0f));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }
}
