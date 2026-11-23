package hi;

import android.content.Context;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.uw;
import org.telegram.ui.h01;
import org.telegram.ui.s11;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class l1 extends pi.l {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(int i7, Context context, Object obj) {
        super(context, 2);
        this.q = i7;
        this.r = obj;
    }

    @Override // pi.l, v4.b1
    public void e() {
        switch (this.q) {
            case 0:
                ((o1) this.r).j3 = true;
                break;
            case 1:
                ((ty) this.r).g0 = true;
                break;
            case 4:
                ((s11) this.r).y1 = true;
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
                ((ty) this.r).g0 = false;
                break;
            case 2:
                ((uw) this.r).Q.g0 = false;
                break;
            case 3:
                ((h01) this.r).R.y1 = false;
                break;
            case 4:
                ((s11) this.r).y1 = false;
                break;
            default:
                ((h01) this.r).R.y1 = false;
                break;
        }
    }
}
