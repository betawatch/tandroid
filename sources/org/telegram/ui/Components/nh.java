package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh implements o1.g {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ nh(vi viVar, float f7, float f10, boolean z10) {
        this.e = viVar;
        this.c = f7;
        this.d = f10;
        this.b = z10;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                vi viVar = (vi) this.e;
                LinearLayout linearLayout = viVar.l1;
                LinearLayout linearLayout2 = viVar.n1;
                float f11 = f7 / 500.0f;
                ji jiVar = viVar.e0;
                ni niVar = viVar.y0;
                Float valueOf = Float.valueOf(f11);
                jiVar.getClass();
                jiVar.a(niVar, valueOf);
                viVar.X0.setAlpha(AndroidUtilities.lerp(this.c, this.d, f11));
                viVar.X1(viVar.y0, 0);
                viVar.X1(viVar.z0, 0);
                if (!(viVar.z0 instanceof qm) || this.b) {
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
                kp0 kp0Var = (kp0) this.e;
                boolean z10 = this.b;
                if (z10) {
                    if (f7 > this.c / 2.0f || !kp0Var.s) {
                    }
                } else if (f7 < this.d / 2.0f || !kp0Var.r) {
                }
                kp0Var.s = !z10;
                kp0Var.r = z10;
                break;
        }
    }

    public /* synthetic */ nh(kp0 kp0Var, boolean z10, float f7, float f10) {
        this.e = kp0Var;
        this.b = z10;
        this.c = f7;
        this.d = f10;
    }
}
