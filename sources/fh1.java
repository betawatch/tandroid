// default package

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
