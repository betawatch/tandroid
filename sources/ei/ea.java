package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class ea implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ea(Object obj, float f7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f7;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                vb vbVar = (vb) this.c;
                if (!z10) {
                    vbVar.M0.setTranslationY(this.b);
                    vbVar.M0.K = false;
                    vbVar.o2 = null;
                    vbVar.p2 = null;
                    break;
                }
                break;
            case 1:
                gi.e4 e4Var = (gi.e4) this.c;
                e4Var.v = null;
                float f11 = this.b;
                if (!z10) {
                    e4Var.f = f11;
                    e4Var.c();
                    break;
                } else {
                    e4Var.h = f11;
                    break;
                }
            default:
                xg0 xg0Var = (xg0) this.c;
                if (!z10) {
                    zg0 zg0Var = xg0Var.d;
                    zg0Var.M.u.i = (zg0Var.H / 2.0f) + this.b >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r0 - r3) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    break;
                }
                break;
        }
    }
}
