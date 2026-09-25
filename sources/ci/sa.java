package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.og0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                mg0 mg0Var = (mg0) this.c;
                if (!z10) {
                    og0 og0Var = mg0Var.d;
                    og0Var.M.u.i = (og0Var.H / 2.0f) + this.b >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r0 - r3) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    break;
                }
                break;
        }
    }
}
