package nh;

import android.content.Context;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.fz;
import org.telegram.ui.d61;
import org.telegram.ui.r41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class k1 extends uh.n {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(Object obj, Context context, int i10) {
        super(context, 2);
        this.q = i10;
        this.r = obj;
    }

    @Override // uh.n, f2.j1
    public void e() {
        switch (this.q) {
            case 0:
                ((n1) this.r).X2 = true;
                break;
            case 1:
                ((fz) this.r).b0 = true;
                break;
            case 4:
                ((d61) this.r).s1 = true;
                break;
        }
    }

    @Override // uh.n
    public final void i() {
        switch (this.q) {
            case 0:
                ((n1) this.r).X2 = false;
                break;
            case 1:
                ((fz) this.r).b0 = false;
                break;
            case 2:
                ((ex) this.r).Q.b0 = false;
                break;
            case 3:
                ((r41) this.r).R.s1 = false;
                break;
            case 4:
                ((d61) this.r).s1 = false;
                break;
            default:
                ((r41) this.r).R.s1 = false;
                break;
        }
    }
}
