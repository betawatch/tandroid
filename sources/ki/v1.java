package ki;

import org.telegram.messenger.fs;
import org.telegram.ui.Components.zt0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
