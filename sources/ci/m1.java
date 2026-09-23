package ci;

import android.content.Context;
import org.telegram.ui.Components.kx;
import org.telegram.ui.Components.lz;
import org.telegram.ui.n51;
import org.telegram.ui.z61;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                ((lz) this.r).f0 = true;
                break;
            case 4:
                ((z61) this.r).w1 = true;
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
                ((lz) this.r).f0 = false;
                break;
            case 2:
                ((kx) this.r).Q.f0 = false;
                break;
            case 3:
                ((n51) this.r).R.w1 = false;
                break;
            case 4:
                ((z61) this.r).w1 = false;
                break;
            default:
                ((n51) this.r).R.w1 = false;
                break;
        }
    }
}
