package di;

import android.content.Context;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lx;
import org.telegram.ui.j71;
import org.telegram.ui.x51;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class m1 extends ki.p {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(Object obj, Context context, int i10) {
        super(context, 2);
        this.q = i10;
        this.r = obj;
    }

    @Override // ki.p, s4.y0
    public void e() {
        switch (this.q) {
            case 0:
                ((p1) this.r).b3 = true;
                break;
            case 1:
                ((kz) this.r).f0 = true;
                break;
            case 4:
                ((j71) this.r).w1 = true;
                break;
        }
    }

    @Override // ki.p
    public final void i() {
        switch (this.q) {
            case 0:
                ((p1) this.r).b3 = false;
                break;
            case 1:
                ((kz) this.r).f0 = false;
                break;
            case 2:
                ((lx) this.r).Q.f0 = false;
                break;
            case 3:
                ((x51) this.r).R.w1 = false;
                break;
            case 4:
                ((j71) this.r).w1 = false;
                break;
            default:
                ((x51) this.r).R.w1 = false;
                break;
        }
    }
}
