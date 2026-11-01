package oh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.zz;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class i extends zz {
    public final /* synthetic */ int U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, Context context, p6 p6Var) {
        super(context, p6Var);
        this.U = i10;
    }

    @Override // org.telegram.ui.Components.zz
    public int getColumnsCount() {
        switch (this.U) {
            case 1:
                return 3;
            case 2:
                return 3;
            default:
                return super.getColumnsCount();
        }
    }

    @Override // org.telegram.ui.Components.zz
    public int getViewType() {
        switch (this.U) {
            case 1:
                return 2;
            default:
                return super.getViewType();
        }
    }

    @Override // org.telegram.ui.Components.zz, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.U) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), i0.L(104.0f));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }
}
