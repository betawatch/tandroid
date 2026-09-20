package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.og0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
