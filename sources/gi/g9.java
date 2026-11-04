package gi;

import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.ie0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g9 implements q1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g9(Object obj, float f10, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = f10;
    }

    @Override // q1.c
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                va vaVar = (va) this.c;
                if (!z10) {
                    vaVar.N0.setTranslationY(this.b);
                    vaVar.N0.L = false;
                    vaVar.p2 = null;
                    vaVar.q2 = null;
                    break;
                }
                break;
            case 1:
                ii.c4 c4Var = (ii.c4) this.c;
                c4Var.w = null;
                float f12 = this.b;
                if (!z10) {
                    c4Var.f = f12;
                    c4Var.c();
                    break;
                } else {
                    c4Var.h = f12;
                    break;
                }
            default:
                fe0 fe0Var = (fe0) this.c;
                if (!z10) {
                    ie0 ie0Var = fe0Var.d;
                    ie0Var.N.m.i = (ie0Var.I / 2.0f) + this.b >= ((float) org.telegram.messenger.g0.q.x) / 2.0f ? (r0 - r3) - org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f);
                    break;
                }
                break;
        }
    }
}
