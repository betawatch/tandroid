// default package

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class oh1 extends f48 {
    public final /* synthetic */ ph1 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh1(ph1 ph1Var, Context context, int i, long j, vnb vnbVar) {
        super(i, j, vnbVar, context);
        this.H = ph1Var;
    }

    @Override // f48
    public final void b(int i, boolean z) {
        super.b(i, z);
        ph1 ph1Var = this.H;
        TextView textView = ph1Var.d;
        if (textView != null) {
            textView.setTextColor(ph1Var.b.h.getTextColor());
        }
    }
}
