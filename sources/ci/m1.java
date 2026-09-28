package ci;

import android.content.Context;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.mz;
import org.telegram.ui.a71;
import org.telegram.ui.o51;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
                ((mz) this.r).f0 = true;
                break;
            case 4:
                ((a71) this.r).w1 = true;
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
                ((mz) this.r).f0 = false;
                break;
            case 2:
                ((mx) this.r).Q.f0 = false;
                break;
            case 3:
                ((o51) this.r).R.w1 = false;
                break;
            case 4:
                ((a71) this.r).w1 = false;
                break;
            default:
                ((o51) this.r).R.w1 = false;
                break;
        }
    }
}
