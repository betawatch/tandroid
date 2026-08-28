package eh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.e00;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o extends e00 {
    public final /* synthetic */ int Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Context context, int i9, b6 b6Var) {
        super(context, b6Var);
        this.Q = i9;
    }

    @Override // org.telegram.ui.Components.e00
    public int getColumnsCount() {
        switch (this.Q) {
            case 1:
                return 3;
            default:
                return super.getColumnsCount();
        }
    }

    @Override // org.telegram.ui.Components.e00
    public int getViewType() {
        switch (this.Q) {
            case 1:
                return 2;
            default:
                return super.getViewType();
        }
    }

    @Override // org.telegram.ui.Components.e00, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.Q) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(104.0f));
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }
}
