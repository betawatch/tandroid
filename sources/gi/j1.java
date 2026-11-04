package gi;

import android.content.Context;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.fw;
import org.telegram.ui.g11;
import org.telegram.ui.vz0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j1 extends ni.m {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(int i3, Context context, Object obj) {
        super(context, 2);
        this.q = i3;
        this.r = obj;
    }

    @Override // ni.m, u4.z0
    public void e() {
        switch (this.q) {
            case 0:
                ((m1) this.r).j3 = true;
                break;
            case 1:
                ((ey) this.r).g0 = true;
                break;
            case 4:
                ((g11) this.r).y1 = true;
                break;
        }
    }

    @Override // ni.m
    public final void i() {
        switch (this.q) {
            case 0:
                ((m1) this.r).j3 = false;
                break;
            case 1:
                ((ey) this.r).g0 = false;
                break;
            case 2:
                ((fw) this.r).Q.g0 = false;
                break;
            case 3:
                ((vz0) this.r).R.y1 = false;
                break;
            case 4:
                ((g11) this.r).y1 = false;
                break;
            default:
                ((vz0) this.r).R.y1 = false;
                break;
        }
    }
}
