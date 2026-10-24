package ei;

import android.content.Context;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.tz;
import org.telegram.ui.b61;
import org.telegram.ui.p41;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                ((o1) this.r).c3 = true;
                break;
            case 1:
                ((tz) this.r).f0 = true;
                break;
            case 4:
                ((b61) this.r).x1 = true;
                break;
        }
    }

    @Override // li.n
    public final void i() {
        switch (this.q) {
            case 0:
                ((o1) this.r).c3 = false;
                break;
            case 1:
                ((tz) this.r).f0 = false;
                break;
            case 2:
                ((rx) this.r).Q.f0 = false;
                break;
            case 3:
                ((p41) this.r).R.x1 = false;
                break;
            case 4:
                ((b61) this.r).x1 = false;
                break;
            default:
                ((p41) this.r).R.x1 = false;
                break;
        }
    }
}
