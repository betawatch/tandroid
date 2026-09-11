package di;

import android.content.Context;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lx;
import org.telegram.ui.j71;
import org.telegram.ui.x51;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
