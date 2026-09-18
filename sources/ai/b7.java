package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class b7 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ e7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7(e7 e7Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = e7Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.b.d.e), TLObject.FLAG_30));
                break;
            default:
                j7 j7Var = this.b.d;
                int i12 = j7Var.x.J;
                if (i12 >= j7Var.r.getPaddingTop() && !j7Var.R) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
                break;
        }
    }
}
