package di;

import android.content.Context;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.wz;
import org.telegram.ui.f61;
import org.telegram.ui.r71;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class l1 extends ki.o {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(Object obj, Context context, int i10) {
        super(context, 2);
        this.q = i10;
        this.r = obj;
    }

    @Override // ki.o, s4.x0
    public void e() {
        switch (this.q) {
            case 0:
                ((o1) this.r).Z2 = true;
                break;
            case 1:
                ((wz) this.r).f0 = true;
                break;
            case 4:
                ((r71) this.r).w1 = true;
                break;
        }
    }

    @Override // ki.o
    public final void i() {
        switch (this.q) {
            case 0:
                ((o1) this.r).Z2 = false;
                break;
            case 1:
                ((wz) this.r).f0 = false;
                break;
            case 2:
                ((vx) this.r).Q.f0 = false;
                break;
            case 3:
                ((f61) this.r).R.w1 = false;
                break;
            case 4:
                ((r71) this.r).w1 = false;
                break;
            default:
                ((f61) this.r).R.w1 = false;
                break;
        }
    }
}
