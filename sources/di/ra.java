package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.fh0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                fi.p4 p4Var = (fi.p4) this.c;
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
                dh0 dh0Var = (dh0) this.c;
                if (!z10) {
                    fh0 fh0Var = dh0Var.d;
                    fh0Var.M.u.i = (fh0Var.H / 2.0f) + this.b >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r0 - r3) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    break;
                }
                break;
        }
    }
}
