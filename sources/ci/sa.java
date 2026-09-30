package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.qg0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final /* synthetic */ class sa implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sa(Object obj, float f7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f7;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                lc lcVar = (lc) this.c;
                if (!z10) {
                    lcVar.M0.setTranslationY(this.b);
                    lcVar.M0.K = false;
                    lcVar.o2 = null;
                    lcVar.p2 = null;
                    break;
                }
                break;
            case 1:
                ei.p4 p4Var = (ei.p4) this.c;
                p4Var.v = null;
                float f11 = this.b;
                if (!z10) {
                    p4Var.f = f11;
                    p4Var.c();
                    break;
                } else {
                    p4Var.h = f11;
                    break;
                }
            default:
                og0 og0Var = (og0) this.c;
                if (!z10) {
                    qg0 qg0Var = og0Var.d;
                    qg0Var.M.u.i = (qg0Var.H / 2.0f) + this.b >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r0 - r3) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    break;
                }
                break;
        }
    }
}
