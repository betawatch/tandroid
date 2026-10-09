package ci;

import android.content.Context;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.zx;
import org.telegram.ui.k71;
import org.telegram.ui.y51;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class l1 extends ji.o {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(Object obj, Context context, int i10) {
        super(context, 2);
        this.q = i10;
        this.r = obj;
    }

    @Override // ji.o, s4.z0
    public void e() {
        switch (this.q) {
            case 0:
                ((o1) this.r).Z2 = true;
                break;
            case 1:
                ((a00) this.r).f0 = true;
                break;
            case 4:
                ((k71) this.r).w1 = true;
                break;
        }
    }

    @Override // ji.o
    public final void i() {
        switch (this.q) {
            case 0:
                ((o1) this.r).Z2 = false;
                break;
            case 1:
                ((a00) this.r).f0 = false;
                break;
            case 2:
                ((zx) this.r).Q.f0 = false;
                break;
            case 3:
                ((y51) this.r).R.w1 = false;
                break;
            case 4:
                ((k71) this.r).w1 = false;
                break;
            default:
                ((y51) this.r).R.w1 = false;
                break;
        }
    }
}
