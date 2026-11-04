package ii;

import org.telegram.messenger.cs;
import org.telegram.ui.Components.pt0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements pt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cs b;

    public /* synthetic */ z1(cs csVar, int i3) {
        this.a = i3;
        this.b = csVar;
    }

    @Override // org.telegram.ui.Components.pt0
    public final void K(int i3, boolean z10) {
        switch (this.a) {
            case 0:
                r2 r2Var = ((a3) this.b).x;
                if (i3 > org.telegram.messenger.g0.L(20.0f)) {
                    r2Var.e(r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY()));
                    break;
                }
                break;
            default:
                ((mi.c2) this.b).getClass();
                break;
        }
    }
}
