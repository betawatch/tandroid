// default package

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class k5f {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wr6 b;

    public /* synthetic */ k5f(wr6 wr6Var, byte b) {
        this.a = b;
        this.b = wr6Var;
    }

    public final void a(ua9 ua9Var) {
        byte b = this.a;
        wr6 wr6Var = this.b;
        vcd vcdVar = (vcd) ua9Var;
        switch (b) {
            case 0:
                Status a = vcdVar.a();
                int i = a.a;
                if (i != 0) {
                    dc6 dc6Var = wr6Var.a;
                    Log.w(dc6Var.a, dc6Var.d(mue.d("Error fetching queue item ids, statusCode=", i, ", statusMessage=", a.b), new Object[0]));
                }
                wr6Var.l = null;
                if (!wr6Var.h.isEmpty()) {
                    o59 o59Var = wr6Var.i;
                    aw3 aw3Var = wr6Var.j;
                    o59Var.removeCallbacks(aw3Var);
                    o59Var.postDelayed(aw3Var, 500L);
                    break;
                }
                break;
            default:
                Status a2 = vcdVar.a();
                int i2 = a2.a;
                if (i2 != 0) {
                    dc6 dc6Var2 = wr6Var.a;
                    Log.w(dc6Var2.a, dc6Var2.d(mue.d("Error fetching queue items, statusCode=", i2, ", statusMessage=", a2.b), new Object[0]));
                }
                wr6Var.k = null;
                if (!wr6Var.h.isEmpty()) {
                    o59 o59Var2 = wr6Var.i;
                    aw3 aw3Var2 = wr6Var.j;
                    o59Var2.removeCallbacks(aw3Var2);
                    o59Var2.postDelayed(aw3Var2, 500L);
                    break;
                }
                break;
        }
    }
}
