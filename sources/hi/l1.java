package hi;

import android.content.Context;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.mw;
import org.telegram.ui.c01;
import org.telegram.ui.n11;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l1 extends pi.l {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(int i7, Context context, Object obj) {
        super(context, 2);
        this.q = i7;
        this.r = obj;
    }

    @Override // pi.l, v4.a1
    public void e() {
        switch (this.q) {
            case 0:
                ((o1) this.r).j3 = true;
                break;
            case 1:
                ((ly) this.r).g0 = true;
                break;
            case 4:
                ((n11) this.r).y1 = true;
                break;
        }
    }

    @Override // pi.l
    public final void i() {
        switch (this.q) {
            case 0:
                ((o1) this.r).j3 = false;
                break;
            case 1:
                ((ly) this.r).g0 = false;
                break;
            case 2:
                ((mw) this.r).Q.g0 = false;
                break;
            case 3:
                ((c01) this.r).R.y1 = false;
                break;
            case 4:
                ((n11) this.r).y1 = false;
                break;
            default:
                ((c01) this.r).R.y1 = false;
                break;
        }
    }
}
