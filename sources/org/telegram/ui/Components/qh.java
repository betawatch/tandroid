package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh implements o1.g {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ qh(yi yiVar, float f7, float f10, boolean z10) {
        this.e = yiVar;
        this.c = f7;
        this.d = f10;
        this.b = z10;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                yi yiVar = (yi) this.e;
                LinearLayout linearLayout = yiVar.l1;
                LinearLayout linearLayout2 = yiVar.n1;
                float f11 = f7 / 500.0f;
                yiVar.e0.set(yiVar.y0, Float.valueOf(f11));
                yiVar.X0.setAlpha(AndroidUtilities.lerp(this.c, this.d, f11));
                yiVar.X1(yiVar.y0, 0);
                yiVar.X1(yiVar.z0, 0);
                if (!(yiVar.z0 instanceof xm) || this.b) {
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
                hp0 hp0Var = (hp0) this.e;
                boolean z10 = this.b;
                if (z10) {
                    if (f7 > this.c / 2.0f || !hp0Var.s) {
                    }
                } else if (f7 < this.d / 2.0f || !hp0Var.r) {
                }
                hp0Var.s = !z10;
                hp0Var.r = z10;
                break;
        }
    }

    public /* synthetic */ qh(hp0 hp0Var, boolean z10, float f7, float f10) {
        this.e = hp0Var;
        this.b = z10;
        this.c = f7;
        this.d = f10;
    }
}
