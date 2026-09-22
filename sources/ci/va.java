package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.rg0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class va implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ va(Object obj, float f7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f7;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                oc ocVar = (oc) this.c;
                if (!z10) {
                    ocVar.M0.setTranslationY(this.b);
                    ocVar.M0.K = false;
                    ocVar.o2 = null;
                    ocVar.p2 = null;
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
