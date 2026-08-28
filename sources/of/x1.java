package of;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Cells.d8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x1 extends d8 {
    public final /* synthetic */ int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(int i9, Context context, b6 b6Var, boolean z10) {
        super(context, b6Var, z10);
        this.K = i9;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        switch (this.K) {
            case 0:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82.0f), TLObject.FLAG_30));
                break;
            case 1:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82.0f), TLObject.FLAG_30));
                break;
            case 2:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82.0f), TLObject.FLAG_30));
                break;
        }
    }
}
