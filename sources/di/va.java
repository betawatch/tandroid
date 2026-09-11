package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.eg0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                pc pcVar = (pc) this.c;
                if (!z10) {
                    pcVar.M0.setTranslationY(this.b);
                    pcVar.M0.K = false;
                    pcVar.o2 = null;
                    pcVar.p2 = null;
                    break;
                }
                break;
            case 1:
                fi.q4 q4Var = (fi.q4) this.c;
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
                cg0 cg0Var = (cg0) this.c;
                if (!z10) {
                    eg0 eg0Var = cg0Var.d;
                    eg0Var.M.u.i = (eg0Var.H / 2.0f) + this.b >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r0 - r3) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    break;
                }
                break;
        }
    }
}
