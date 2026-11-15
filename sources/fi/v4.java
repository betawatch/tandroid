package fi;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v4 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ y4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4(y4 y4Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = y4Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.b.d.e), TLObject.FLAG_30));
                break;
            default:
                c5 c5Var = this.b.d;
                int i11 = c5Var.y.J;
                if (i11 >= c5Var.r.getPaddingTop() && !c5Var.S) {
                    i11 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                break;
        }
    }
}
