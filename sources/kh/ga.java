package kh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.pf0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ga implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ga(Object obj, float f10, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = f10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                wb wbVar = (wb) this.c;
                if (!z10) {
                    wbVar.I0.setTranslationY(this.b);
                    wbVar.I0.G = false;
                    wbVar.k2 = null;
                    wbVar.l2 = null;
                    break;
                }
                break;
            case 1:
                mh.f4 f4Var = (mh.f4) this.c;
                f4Var.v = null;
                float f12 = this.b;
                if (!z10) {
                    f4Var.f = f12;
                    f4Var.c();
                    break;
                } else {
                    f4Var.h = f12;
                    break;
                }
            default:
                nf0 nf0Var = (nf0) this.c;
                if (!z10) {
                    pf0 pf0Var = nf0Var.d;
                    pf0Var.I.u.i = (pf0Var.D / 2.0f) + this.b >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r0 - r3) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    break;
                }
                break;
        }
    }
}
