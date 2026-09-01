package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements o1.g {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ dh(mi miVar, float f10, float f11, boolean z4) {
        this.e = miVar;
        this.c = f10;
        this.d = f11;
        this.b = z4;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                mi miVar = (mi) this.e;
                LinearLayout linearLayout = miVar.i1;
                LinearLayout linearLayout2 = miVar.k1;
                float f12 = f10 / 500.0f;
                miVar.b0.set(miVar.v0, Float.valueOf(f12));
                miVar.U0.setAlpha(AndroidUtilities.lerp(this.c, this.d, f12));
                miVar.X1(miVar.v0, 0);
                miVar.X1(miVar.w0, 0);
                if (!(miVar.w0 instanceof qm) || this.b) {
                    f12 = 1.0f - f12;
                }
                float clamp = Utilities.clamp(f12, 1.0f, 0.0f);
                linearLayout2.setAlpha(clamp);
                float f13 = 1.0f - clamp;
                linearLayout.setAlpha(f13);
                linearLayout.setTranslationX(clamp * (-AndroidUtilities.dp(16.0f)));
                linearLayout2.setTranslationX(f13 * AndroidUtilities.dp(16.0f));
                break;
            default:
                bp0 bp0Var = (bp0) this.e;
                boolean z4 = this.b;
                if (z4) {
                    if (f10 > this.c / 2.0f || !bp0Var.s) {
                    }
                } else if (f10 < this.d / 2.0f || !bp0Var.r) {
                }
                bp0Var.s = !z4;
                bp0Var.r = z4;
                break;
        }
    }

    public /* synthetic */ dh(bp0 bp0Var, boolean z4, float f10, float f11) {
        this.e = bp0Var;
        this.b = z4;
        this.c = f10;
        this.d = f11;
    }
}
