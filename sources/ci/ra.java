package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.rg0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ra implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ra(Object obj, float f7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f7;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                kc kcVar = (kc) this.c;
                if (!z10) {
                    kcVar.M0.setTranslationY(this.b);
                    kcVar.M0.K = false;
                    kcVar.o2 = null;
                    kcVar.p2 = null;
                    break;
                }
                break;
            case 1:
                ei.q4 q4Var = (ei.q4) this.c;
                q4Var.v = null;
                float f11 = this.b;
                if (!z10) {
                    q4Var.f = f11;
                    q4Var.c();
                    break;
                } else {
                    q4Var.h = f11;
                    break;
                }
            default:
                pg0 pg0Var = (pg0) this.c;
                if (!z10) {
                    rg0 rg0Var = pg0Var.d;
                    rg0Var.M.u.i = (rg0Var.H / 2.0f) + this.b >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r0 - r3) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    break;
                }
                break;
        }
    }
}
