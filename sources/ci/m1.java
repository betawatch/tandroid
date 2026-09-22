package ci;

import android.content.Context;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.kz;
import org.telegram.ui.h71;
import org.telegram.ui.v51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                ((h71) this.r).w1 = true;
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
                ((v51) this.r).R.w1 = false;
                break;
            case 4:
                ((h71) this.r).w1 = false;
                break;
            default:
                ((v51) this.r).R.w1 = false;
                break;
        }
    }
}
