package ci;

import android.content.Context;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.kz;
import org.telegram.ui.i71;
import org.telegram.ui.w51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class m1 extends ji.o {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(Object obj, Context context, int i10) {
        super(context, 2);
        this.q = i10;
        this.r = obj;
    }

    @Override // ji.o, s4.y0
    public void e() {
        switch (this.q) {
            case 0:
                ((p1) this.r).b3 = true;
                break;
            case 1:
                ((kz) this.r).f0 = true;
                break;
            case 4:
                ((i71) this.r).w1 = true;
                break;
        }
    }

    @Override // ji.o
    public final void i() {
        switch (this.q) {
            case 0:
                ((p1) this.r).b3 = false;
                break;
            case 1:
                ((kz) this.r).f0 = false;
                break;
            case 2:
                ((jx) this.r).Q.f0 = false;
                break;
            case 3:
                ((w51) this.r).R.w1 = false;
                break;
            case 4:
                ((i71) this.r).w1 = false;
                break;
            default:
                ((w51) this.r).R.w1 = false;
                break;
        }
    }
}
