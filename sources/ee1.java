// default package

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ee1 extends ie1 {
    public final /* synthetic */ byte K = 1;
    public final /* synthetic */ n39 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee1(fe1 fe1Var, Activity activity, wjb wjbVar) {
        super(activity, wjbVar);
        this.L = fe1Var;
        this.a = true;
    }

    @Override // ie1
    public final String getUsernameEditable() {
        byte b = this.K;
        n39 n39Var = this.L;
        switch (b) {
            case 0:
                return ((fe1) n39Var).c.r;
            default:
                l7 l7Var = ((d92) n39Var).c.i3.b;
                if (l7Var == null) {
                    return null;
                }
                return l7Var.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee1(d92 d92Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.L = d92Var;
    }
}
