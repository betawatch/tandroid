package bi;

import android.content.Context;
import org.telegram.ui.Components.qx;
import org.telegram.ui.Components.rz;
import org.telegram.ui.l71;
import org.telegram.ui.z51;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class t1 extends ii.o {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(Object obj, Context context, int i10) {
        super(context, 2);
        this.q = i10;
        this.r = obj;
    }

    @Override // ii.o, s4.y0
    public void e() {
        switch (this.q) {
            case 0:
                ((w1) this.r).b3 = true;
                break;
            case 1:
                ((rz) this.r).f0 = true;
                break;
            case 4:
                ((l71) this.r).w1 = true;
                break;
        }
    }

    @Override // ii.o
    public final void i() {
        switch (this.q) {
            case 0:
                ((w1) this.r).b3 = false;
                break;
            case 1:
                ((rz) this.r).f0 = false;
                break;
            case 2:
                ((qx) this.r).Q.f0 = false;
                break;
            case 3:
                ((z51) this.r).R.w1 = false;
                break;
            case 4:
                ((l71) this.r).w1 = false;
                break;
            default:
                ((z51) this.r).R.w1 = false;
                break;
        }
    }
}
