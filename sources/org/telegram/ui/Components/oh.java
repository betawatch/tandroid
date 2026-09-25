package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh implements o1.g {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ oh(wi wiVar, float f7, float f10, boolean z10) {
        this.e = wiVar;
        this.c = f7;
        this.d = f10;
        this.b = z10;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                wi wiVar = (wi) this.e;
                LinearLayout linearLayout = wiVar.l1;
                LinearLayout linearLayout2 = wiVar.n1;
                float f11 = f7 / 500.0f;
                wiVar.e0.set(wiVar.y0, Float.valueOf(f11));
                wiVar.X0.setAlpha(AndroidUtilities.lerp(this.c, this.d, f11));
                wiVar.X1(wiVar.y0, 0);
                wiVar.X1(wiVar.z0, 0);
                if (!(wiVar.z0 instanceof rm) || this.b) {
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
                jp0 jp0Var = (jp0) this.e;
                boolean z10 = this.b;
                if (z10) {
                    if (f7 > this.c / 2.0f || !jp0Var.s) {
                    }
                } else if (f7 < this.d / 2.0f || !jp0Var.r) {
                }
                jp0Var.s = !z10;
                jp0Var.r = z10;
                break;
        }
    }

    public /* synthetic */ oh(jp0 jp0Var, boolean z10, float f7, float f10) {
        this.e = jp0Var;
        this.b = z10;
        this.c = f7;
        this.d = f10;
    }
}
