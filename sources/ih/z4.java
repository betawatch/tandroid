package ih;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class z4 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ c5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z4(c5 c5Var, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = c5Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.b.d.e), TLObject.FLAG_30));
                break;
            default:
                g5 g5Var = this.b.d;
                int i11 = g5Var.x.J;
                if (i11 >= g5Var.r.getPaddingTop() && !g5Var.N) {
                    i11 = 0;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                break;
        }
    }
}
