package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final class k6 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ n6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6(n6 n6Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = n6Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.b.d.e), TLObject.FLAG_30));
                break;
            default:
                s6 s6Var = this.b.d;
                int i12 = s6Var.x.J;
                if (i12 >= s6Var.r.getPaddingTop() && !s6Var.R) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
                break;
        }
    }
}
