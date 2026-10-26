package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh implements o1.g {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ oh(ti tiVar, float f7, float f10, boolean z10) {
        this.e = tiVar;
        this.c = f7;
        this.d = f10;
        this.b = z10;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                ti tiVar = (ti) this.e;
                LinearLayout linearLayout = tiVar.o1;
                LinearLayout linearLayout2 = tiVar.q1;
                float f11 = f7 / 500.0f;
                ei eiVar = tiVar.e0;
                li liVar = tiVar.B0;
                Float valueOf = Float.valueOf(f11);
                eiVar.getClass();
                eiVar.a(liVar, valueOf);
                tiVar.a1.setAlpha(AndroidUtilities.lerp(this.c, this.d, f11));
                tiVar.e2(tiVar.B0, 0);
                tiVar.e2(tiVar.C0, 0);
                if (!(tiVar.C0 instanceof cn) || this.b) {
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
                cq0 cq0Var = (cq0) this.e;
                boolean z10 = this.b;
                if (z10) {
                    if (f7 > this.c / 2.0f || !cq0Var.s) {
                    }
                } else if (f7 < this.d / 2.0f || !cq0Var.r) {
                }
                cq0Var.s = !z10;
                cq0Var.r = z10;
                break;
        }
    }

    public /* synthetic */ oh(cq0 cq0Var, boolean z10, float f7, float f10) {
        this.e = cq0Var;
        this.b = z10;
        this.c = f7;
        this.d = f10;
    }
}
