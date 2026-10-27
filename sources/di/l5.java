package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class l5 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5(o5 o5Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = o5Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.b.d.e), TLObject.FLAG_30));
                break;
            default:
                t5 t5Var = this.b.d;
                int i12 = t5Var.x.J;
                if (i12 >= t5Var.r.getPaddingTop() && !t5Var.R) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
                break;
        }
    }
}
