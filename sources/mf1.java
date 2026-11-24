// default package

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mf1 extends qf1 {
    public final /* synthetic */ byte K = 0;
    public final /* synthetic */ q59 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf1(nf1 nf1Var, Activity activity, ylb ylbVar) {
        super(activity, ylbVar);
        this.L = nf1Var;
        this.a = true;
    }

    @Override // qf1
    public final String getUsernameEditable() {
        byte b = this.K;
        q59 q59Var = this.L;
        switch (b) {
            case 0:
                return ((nf1) q59Var).c.r;
            default:
                l7 l7Var = ((oa2) q59Var).c.i3.b;
                if (l7Var == null) {
                    return null;
                }
                return l7Var.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf1(oa2 oa2Var, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.L = oa2Var;
    }
}
