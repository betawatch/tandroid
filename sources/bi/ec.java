package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.og0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class ec implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ec(Object obj, float f7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f7;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                ce ceVar = (ce) this.c;
                if (!z10) {
                    ceVar.M0.setTranslationY(this.b);
                    ceVar.M0.K = false;
                    ceVar.o2 = null;
                    ceVar.p2 = null;
                    break;
                }
                break;
            case 1:
                di.t4 t4Var = (di.t4) this.c;
                t4Var.v = null;
                float f11 = this.b;
                if (!z10) {
                    t4Var.f = f11;
                    t4Var.c();
                    break;
                } else {
                    t4Var.h = f11;
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
