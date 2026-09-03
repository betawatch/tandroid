package oh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class x4 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4(a5 a5Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = a5Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.b.d.e), TLObject.FLAG_30));
                break;
            default:
                e5 e5Var = this.b.d;
                int i12 = e5Var.x.J;
                if (i12 >= e5Var.r.getPaddingTop() && !e5Var.O) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
                break;
        }
    }
}
