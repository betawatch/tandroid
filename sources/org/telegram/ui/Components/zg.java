package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg implements o1.g {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ zg(gi giVar, float f10, float f11, boolean z10) {
        this.e = giVar;
        this.c = f10;
        this.d = f11;
        this.b = z10;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                gi giVar = (gi) this.e;
                LinearLayout linearLayout = giVar.h1;
                LinearLayout linearLayout2 = giVar.j1;
                float f12 = f10 / 500.0f;
                uh uhVar = giVar.a0;
                yh yhVar = giVar.u0;
                Float valueOf = Float.valueOf(f12);
                uhVar.getClass();
                uhVar.a(yhVar, valueOf);
                giVar.T0.setAlpha(AndroidUtilities.lerp(this.c, this.d, f12));
                giVar.X1(giVar.u0, 0);
                giVar.X1(giVar.v0, 0);
                if (!(giVar.v0 instanceof em) || this.b) {
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
                go0 go0Var = (go0) this.e;
                boolean z10 = this.b;
                if (z10) {
                    if (f10 > this.c / 2.0f || !go0Var.s) {
                    }
                } else if (f10 < this.d / 2.0f || !go0Var.r) {
                }
                go0Var.s = !z10;
                go0Var.r = z10;
                break;
        }
    }

    public /* synthetic */ zg(go0 go0Var, boolean z10, float f10, float f11) {
        this.e = go0Var;
        this.b = z10;
        this.c = f10;
        this.d = f11;
    }
}
