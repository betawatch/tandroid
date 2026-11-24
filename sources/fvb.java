// default package

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fvb extends i49 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qvb b;

    public /* synthetic */ fvb(qvb qvbVar, byte b) {
        this.a = b;
        this.b = qvbVar;
    }

    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        cq3 cq3Var;
        byte b = this.a;
        qvb qvbVar = this.b;
        switch (b) {
            case 0:
                qvbVar.y0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (cq3Var = qvbVar.i1) != null) {
                    cq3Var.f(i, i2);
                    qvbVar.x0();
                    break;
                }
                break;
        }
    }
}
