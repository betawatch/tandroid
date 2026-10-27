package fi;

import android.content.Context;
import org.telegram.ui.Components.qx;
import org.telegram.ui.Components.sz;
import org.telegram.ui.f61;
import org.telegram.ui.t41;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class k1 extends mi.n {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(Object obj, Context context, int i10) {
        super(context, 2);
        this.q = i10;
        this.r = obj;
    }

    @Override // mi.n, s4.a1
    public void e() {
        switch (this.q) {
            case 0:
                ((n1) this.r).j3 = true;
                break;
            case 1:
                ((sz) this.r).f0 = true;
                break;
            case 4:
                ((f61) this.r).x1 = true;
                break;
        }
    }

    @Override // mi.n
    public final void i() {
        switch (this.q) {
            case 0:
                ((n1) this.r).j3 = false;
                break;
            case 1:
                ((sz) this.r).f0 = false;
                break;
            case 2:
                ((qx) this.r).Q.f0 = false;
                break;
            case 3:
                ((t41) this.r).R.x1 = false;
                break;
            case 4:
                ((f61) this.r).x1 = false;
                break;
            default:
                ((t41) this.r).R.x1 = false;
                break;
        }
    }
}
