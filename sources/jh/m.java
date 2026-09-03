package jh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.u00;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class m extends u00 {
    public final /* synthetic */ int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Context context, int i10, f6 f6Var) {
        super(context, f6Var);
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
