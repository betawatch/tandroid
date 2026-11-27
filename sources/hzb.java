// default package

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class hzb extends v79 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tzb b;

    public /* synthetic */ hzb(tzb tzbVar, byte b) {
        this.a = b;
        this.b = tzbVar;
    }

    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        tq3 tq3Var;
        byte b = this.a;
        tzb tzbVar = this.b;
        switch (b) {
            case 0:
                tzbVar.z0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (tq3Var = tzbVar.i1) != null) {
                    tq3Var.f(i, i2);
                    tzbVar.y0();
                    break;
                }
                break;
        }
    }
}
