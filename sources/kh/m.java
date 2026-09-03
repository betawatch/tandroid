package kh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.u00;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m extends u00 {
    public final /* synthetic */ int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Context context, int i10, g6 g6Var) {
        super(context, g6Var);
        this.R = i10;
    }

    @Override // org.telegram.ui.Components.u00
    public int getColumnsCount() {
        switch (this.R) {
            case 1:
                return 3;
            default:
                return super.getColumnsCount();
        }
    }

    @Override // org.telegram.ui.Components.u00
    public int getViewType() {
        switch (this.R) {
            case 1:
                return 2;
            default:
                return super.getViewType();
        }
    }

    @Override // org.telegram.ui.Components.u00, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.R) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(104.0f));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }
}
