package ki;

import org.telegram.messenger.fs;
import org.telegram.ui.Components.zt0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements zt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fs b;

    public /* synthetic */ v1(fs fsVar, int i7) {
        this.a = i7;
        this.b = fsVar;
    }

    @Override // org.telegram.ui.Components.zt0
    public final void L(int i7, boolean z10) {
        switch (this.a) {
            case 0:
                k2 k2Var = ((t2) this.b).x;
                if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                    k2Var.e(k2Var.getTopActionBarOffsetY() + (-k2Var.getOffsetY()));
                    break;
                }
                break;
            default:
                ((oi.z1) this.b).getClass();
                break;
        }
    }
}
