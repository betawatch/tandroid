// default package

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fh1 extends y08 {
    public final /* synthetic */ gh1 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh1(gh1 gh1Var, Context context, int i, long j, wjb wjbVar) {
        super(i, j, wjbVar, context);
        this.H = gh1Var;
    }

    @Override // y08
    public final void b(int i, boolean z) {
        super.b(i, z);
        gh1 gh1Var = this.H;
        TextView textView = gh1Var.d;
        if (textView != null) {
            textView.setTextColor(gh1Var.b.h.getTextColor());
        }
    }
}
