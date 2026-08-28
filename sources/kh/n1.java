package kh;

import android.content.Context;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xw;
import org.telegram.ui.b61;
import org.telegram.ui.p41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class n1 extends rh.n {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(Object obj, Context context, int i9) {
        super(context, 2);
        this.q = i9;
        this.r = obj;
    }

    @Override // rh.n, f2.m1
    public void e() {
        switch (this.q) {
            case 0:
                ((q1) this.r).X2 = true;
                break;
            case 1:
                ((wy) this.r).b0 = true;
                break;
            case 4:
                ((b61) this.r).s1 = true;
                break;
        }
    }

    @Override // rh.n
    public final void i() {
        switch (this.q) {
            case 0:
                ((q1) this.r).X2 = false;
                break;
            case 1:
                ((wy) this.r).b0 = false;
                break;
            case 2:
                ((xw) this.r).Q.b0 = false;
                break;
            case 3:
                ((p41) this.r).R.s1 = false;
                break;
            case 4:
                ((b61) this.r).s1 = false;
                break;
            default:
                ((p41) this.r).R.s1 = false;
                break;
        }
    }
}
