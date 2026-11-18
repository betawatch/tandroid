package hi;

import android.content.Context;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.sw;
import org.telegram.ui.g01;
import org.telegram.ui.r11;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                ((ry) this.r).g0 = true;
                break;
            case 4:
                ((r11) this.r).y1 = true;
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
                ((ry) this.r).g0 = false;
                break;
            case 2:
                ((sw) this.r).Q.g0 = false;
                break;
            case 3:
                ((g01) this.r).R.y1 = false;
                break;
            case 4:
                ((r11) this.r).y1 = false;
                break;
            default:
                ((g01) this.r).R.y1 = false;
                break;
        }
    }
}
