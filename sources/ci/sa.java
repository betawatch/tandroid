package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.gh0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                ei.o4 o4Var = (ei.o4) this.c;
                o4Var.v = null;
                float f11 = this.b;
                if (!z10) {
                    o4Var.f = f11;
                    o4Var.c();
                    break;
                } else {
                    o4Var.h = f11;
                    break;
                }
            default:
                eh0 eh0Var = (eh0) this.c;
                if (!z10) {
                    gh0 gh0Var = eh0Var.d;
                    gh0Var.M.u.i = (gh0Var.H / 2.0f) + this.b >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r0 - r3) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    break;
                }
                break;
        }
    }
}
