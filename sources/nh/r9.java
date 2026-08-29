package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.zf0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r9 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r9(Object obj, float f9, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f9;
    }

    @Override // o1.g
    public final void a(o1.i iVar, boolean z10, float f9, float f10) {
        switch (this.a) {
            case 0:
                gb gbVar = (gb) this.c;
                if (!z10) {
                    gbVar.I0.setTranslationY(this.b);
                    gbVar.I0.G = false;
                    gbVar.k2 = null;
                    gbVar.l2 = null;
                    break;
                }
                break;
            case 1:
                zf0 zf0Var = (zf0) this.c;
                if (!z10) {
                    bg0 bg0Var = zf0Var.d;
                    bg0Var.I.u.i = (bg0Var.D / 2.0f) + this.b >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r0 - r3) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    break;
                }
                break;
            default:
                ph.m3 m3Var = (ph.m3) this.c;
                m3Var.v = null;
                float f11 = this.b;
                if (!z10) {
                    m3Var.f = f11;
                    m3Var.c();
                    break;
                } else {
                    m3Var.h = f11;
                    break;
                }
        }
    }
}
