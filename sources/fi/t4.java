package fi;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class t4 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ w4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t4(w4 w4Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = w4Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.b.d.e), TLObject.FLAG_30));
                break;
            default:
                a5 a5Var = this.b.d;
                int i11 = a5Var.y.J;
                if (i11 >= a5Var.r.getPaddingTop() && !a5Var.S) {
                    i11 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                break;
        }
    }
}
