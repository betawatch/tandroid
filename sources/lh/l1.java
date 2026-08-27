package lh;

import android.content.Context;
import org.telegram.ui.Components.xw;
import org.telegram.ui.Components.yy;
import org.telegram.ui.a61;
import org.telegram.ui.o41;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class l1 extends sh.n {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(Object obj, Context context, int i10) {
        super(context, 2);
        this.q = i10;
        this.r = obj;
    }

    @Override // sh.n, f2.k1
    public void e() {
        switch (this.q) {
            case 0:
                ((o1) this.r).X2 = true;
                break;
            case 1:
                ((yy) this.r).b0 = true;
                break;
            case 4:
                ((a61) this.r).s1 = true;
                break;
        }
    }

    @Override // sh.n
    public final void i() {
        switch (this.q) {
            case 0:
                ((o1) this.r).X2 = false;
                break;
            case 1:
                ((yy) this.r).b0 = false;
                break;
            case 2:
                ((xw) this.r).Q.b0 = false;
                break;
            case 3:
                ((o41) this.r).R.s1 = false;
                break;
            case 4:
                ((a61) this.r).s1 = false;
                break;
            default:
                ((o41) this.r).R.s1 = false;
                break;
        }
    }
}
