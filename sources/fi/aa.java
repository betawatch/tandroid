package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bh0;
import org.telegram.ui.Components.dh0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class aa implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aa(Object obj, float f7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f7;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                sb sbVar = (sb) this.c;
                if (!z10) {
                    sbVar.M0.setTranslationY(this.b);
                    sbVar.M0.K = false;
                    sbVar.o2 = null;
                    sbVar.p2 = null;
                    break;
                }
                break;
            case 1:
                hi.n4 n4Var = (hi.n4) this.c;
                n4Var.v = null;
                float f11 = this.b;
                if (!z10) {
                    n4Var.f = f11;
                    n4Var.c();
                    break;
                } else {
                    n4Var.h = f11;
                    break;
                }
            default:
                bh0 bh0Var = (bh0) this.c;
                if (!z10) {
                    dh0 dh0Var = bh0Var.d;
                    dh0Var.M.u.i = (dh0Var.H / 2.0f) + this.b >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r0 - r3) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    break;
                }
                break;
        }
    }
}
