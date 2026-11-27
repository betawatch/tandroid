// default package

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ne1 extends re1 {
    public final /* synthetic */ byte K = 0;
    public final /* synthetic */ c79 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne1(oe1 oe1Var, Activity activity, vnb vnbVar) {
        super(activity, vnbVar);
        this.L = oe1Var;
        this.a = true;
    }

    @Override // re1
    public final String getUsernameEditable() {
        byte b = this.K;
        c79 c79Var = this.L;
        switch (b) {
            case 0:
                return ((oe1) c79Var).c.r;
            default:
                m7 m7Var = ((t92) c79Var).c.i3.b;
                if (m7Var == null) {
                    return null;
                }
                return m7Var.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne1(t92 t92Var, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.L = t92Var;
    }
}
