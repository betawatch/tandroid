package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.sf0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class da implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ da(Object obj, float f10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                sb sbVar = (sb) this.c;
                if (!z10) {
                    sbVar.I0.setTranslationY(this.b);
                    sbVar.I0.G = false;
                    sbVar.k2 = null;
                    sbVar.l2 = null;
                    break;
                }
                break;
            case 1:
                nh.d4 d4Var = (nh.d4) this.c;
                d4Var.v = null;
                float f12 = this.b;
                if (!z10) {
                    d4Var.f = f12;
                    d4Var.c();
                    break;
                } else {
                    d4Var.h = f12;
                    break;
                }
            default:
                qf0 qf0Var = (qf0) this.c;
                if (!z10) {
                    sf0 sf0Var = qf0Var.d;
                    sf0Var.I.u.i = (sf0Var.D / 2.0f) + this.b >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r0 - r3) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    break;
                }
                break;
        }
    }
}
