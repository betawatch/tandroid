// default package

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class m7f {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xt6 b;

    public /* synthetic */ m7f(xt6 xt6Var, byte b) {
        this.a = b;
        this.b = xt6Var;
    }

    public final void a(uc9 uc9Var) {
        byte b = this.a;
        xt6 xt6Var = this.b;
        xed xedVar = (xed) uc9Var;
        switch (b) {
            case 0:
                Status a = xedVar.a();
                int i = a.a;
                if (i != 0) {
                    ce6 ce6Var = xt6Var.a;
                    Log.w(ce6Var.a, ce6Var.d(mle.d("Error fetching queue item ids, statusCode=", i, ", statusMessage=", a.b), new Object[0]));
                }
                xt6Var.l = null;
                if (!xt6Var.h.isEmpty()) {
                    q79 q79Var = xt6Var.i;
                    lx3 lx3Var = xt6Var.j;
                    q79Var.removeCallbacks(lx3Var);
                    q79Var.postDelayed(lx3Var, 500L);
                    break;
                }
                break;
            default:
                Status a2 = xedVar.a();
                int i2 = a2.a;
                if (i2 != 0) {
                    ce6 ce6Var2 = xt6Var.a;
                    Log.w(ce6Var2.a, ce6Var2.d(mle.d("Error fetching queue items, statusCode=", i2, ", statusMessage=", a2.b), new Object[0]));
                }
                xt6Var.k = null;
                if (!xt6Var.h.isEmpty()) {
                    q79 q79Var2 = xt6Var.i;
                    lx3 lx3Var2 = xt6Var.j;
                    q79Var2.removeCallbacks(lx3Var2);
                    q79Var2.postDelayed(lx3Var2, 500L);
                    break;
                }
                break;
        }
    }
}
