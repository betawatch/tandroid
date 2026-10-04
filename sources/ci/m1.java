package ci;

import android.content.Context;
import org.telegram.ui.Components.nx;
import org.telegram.ui.Components.nz;
import org.telegram.ui.c71;
import org.telegram.ui.q51;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                ((p1) this.r).i3 = true;
                break;
            case 1:
                ((nz) this.r).f0 = true;
                break;
            case 4:
                ((c71) this.r).w1 = true;
                break;
        }
    }

    @Override // ji.o
    public final void i() {
        switch (this.q) {
            case 0:
                ((p1) this.r).i3 = false;
                break;
            case 1:
                ((nz) this.r).f0 = false;
                break;
            case 2:
                ((nx) this.r).Q.f0 = false;
                break;
            case 3:
                ((q51) this.r).R.w1 = false;
                break;
            case 4:
                ((c71) this.r).w1 = false;
                break;
            default:
                ((q51) this.r).R.w1 = false;
                break;
        }
    }
}
