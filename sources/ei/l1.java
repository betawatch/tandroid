package ei;

import android.content.Context;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.tz;
import org.telegram.ui.n41;
import org.telegram.ui.z51;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class l1 extends li.n {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(Object obj, Context context, int i10) {
        super(context, 2);
        this.q = i10;
        this.r = obj;
    }

    @Override // li.n, s4.x0
    public void e() {
        switch (this.q) {
            case 0:
                ((o1) this.r).Z2 = true;
                break;
            case 1:
                ((tz) this.r).f0 = true;
                break;
            case 4:
                ((z51) this.r).w1 = true;
                break;
        }
    }

    @Override // li.n
    public final void i() {
        switch (this.q) {
            case 0:
                ((o1) this.r).Z2 = false;
                break;
            case 1:
                ((tz) this.r).f0 = false;
                break;
            case 2:
                ((rx) this.r).Q.f0 = false;
                break;
            case 3:
                ((n41) this.r).R.w1 = false;
                break;
            case 4:
                ((z51) this.r).w1 = false;
                break;
            default:
                ((n41) this.r).R.w1 = false;
                break;
        }
    }
}
