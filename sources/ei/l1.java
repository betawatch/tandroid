package ei;

import android.content.Context;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.tz;
import org.telegram.ui.l41;
import org.telegram.ui.x51;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                ((x51) this.r).w1 = true;
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
                ((l41) this.r).R.w1 = false;
                break;
            case 4:
                ((x51) this.r).w1 = false;
                break;
            default:
                ((l41) this.r).R.w1 = false;
                break;
        }
    }
}
