package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh implements o1.g {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ qh(xi xiVar, float f7, float f10, boolean z10) {
        this.e = xiVar;
        this.c = f7;
        this.d = f10;
        this.b = z10;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                xi xiVar = (xi) this.e;
                LinearLayout linearLayout = xiVar.l1;
                LinearLayout linearLayout2 = xiVar.n1;
                float f11 = f7 / 500.0f;
                ii iiVar = xiVar.e0;
                pi piVar = xiVar.y0;
                Float valueOf = Float.valueOf(f11);
                iiVar.getClass();
                iiVar.a(piVar, valueOf);
                xiVar.X0.setAlpha(AndroidUtilities.lerp(this.c, this.d, f11));
                xiVar.W1(xiVar.y0, 0);
                xiVar.W1(xiVar.z0, 0);
                if (!(xiVar.z0 instanceof tm) || this.b) {
                    f11 = 1.0f - f11;
                }
                float clamp = Utilities.clamp(f11, 1.0f, 0.0f);
                linearLayout2.setAlpha(clamp);
                float f12 = 1.0f - clamp;
                linearLayout.setAlpha(f12);
                linearLayout.setTranslationX(clamp * (-AndroidUtilities.dp(16.0f)));
                linearLayout2.setTranslationX(f12 * AndroidUtilities.dp(16.0f));
                break;
            default:
                qp0 qp0Var = (qp0) this.e;
                boolean z10 = this.b;
                if (z10) {
                    if (f7 > this.c / 2.0f || !qp0Var.s) {
                    }
                } else if (f7 < this.d / 2.0f || !qp0Var.r) {
                }
                qp0Var.s = !z10;
                qp0Var.r = z10;
                break;
        }
    }

    public /* synthetic */ qh(qp0 qp0Var, boolean z10, float f7, float f10) {
        this.e = qp0Var;
        this.b = z10;
        this.c = f7;
        this.d = f10;
    }
}
