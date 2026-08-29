package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh implements o1.h {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ gh(ni niVar, float f9, float f10, boolean z10) {
        this.e = niVar;
        this.c = f9;
        this.d = f10;
        this.b = z10;
    }

    @Override // o1.h
    public final void a(o1.i iVar, float f9, float f10) {
        switch (this.a) {
            case 0:
                ni niVar = (ni) this.e;
                LinearLayout linearLayout = niVar.h1;
                LinearLayout linearLayout2 = niVar.j1;
                float f11 = f9 / 500.0f;
                niVar.a0.set(niVar.u0, Float.valueOf(f11));
                niVar.T0.setAlpha(AndroidUtilities.lerp(this.c, this.d, f11));
                niVar.X1(niVar.u0, 0);
                niVar.X1(niVar.v0, 0);
                if (!(niVar.v0 instanceof lm) || this.b) {
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
                qo0 qo0Var = (qo0) this.e;
                boolean z10 = this.b;
                if (z10) {
                    if (f9 > this.c / 2.0f || !qo0Var.s) {
                    }
                } else if (f9 < this.d / 2.0f || !qo0Var.r) {
                }
                qo0Var.s = !z10;
                qo0Var.r = z10;
                break;
        }
    }

    public /* synthetic */ gh(qo0 qo0Var, boolean z10, float f9, float f10) {
        this.e = qo0Var;
        this.b = z10;
        this.c = f9;
        this.d = f10;
    }
}
