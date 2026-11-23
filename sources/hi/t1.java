package hi;

import android.content.Context;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.rw;
import org.telegram.ui.f01;
import org.telegram.ui.q11;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class t1 extends pi.l {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(int i7, Context context, Object obj) {
        super(context, 2);
        this.q = i7;
        this.r = obj;
    }

    @Override // pi.l, v4.b1
    public void e() {
        switch (this.q) {
            case 0:
                ((w1) this.r).j3 = true;
                break;
            case 1:
                ((qy) this.r).g0 = true;
                break;
            case 4:
                ((q11) this.r).y1 = true;
                break;
        }
    }

    @Override // pi.l
    public final void i() {
        switch (this.q) {
            case 0:
                ((w1) this.r).j3 = false;
                break;
            case 1:
                ((qy) this.r).g0 = false;
                break;
            case 2:
                ((rw) this.r).Q.g0 = false;
                break;
            case 3:
                ((f01) this.r).R.y1 = false;
                break;
            case 4:
                ((q11) this.r).y1 = false;
                break;
            default:
                ((f01) this.r).R.y1 = false;
                break;
        }
    }
}
