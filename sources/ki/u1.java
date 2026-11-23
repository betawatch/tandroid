package ki;

import org.telegram.messenger.fs;
import org.telegram.ui.Components.bu0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements bu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fs b;

    public /* synthetic */ u1(fs fsVar, int i7) {
        this.a = i7;
        this.b = fsVar;
    }

    @Override // org.telegram.ui.Components.bu0
    public final void L(int i7, boolean z10) {
        switch (this.a) {
            case 0:
                j2 j2Var = ((t2) this.b).x;
                if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                    j2Var.e(j2Var.getTopActionBarOffsetY() + (-j2Var.getOffsetY()));
                    break;
                }
                break;
            default:
                ((oi.b2) this.b).getClass();
                break;
        }
    }
}
