package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements o1.g {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ dh(ki kiVar, float f10, float f11, boolean z10) {
        this.e = kiVar;
        this.c = f10;
        this.d = f11;
        this.b = z10;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ki kiVar = (ki) this.e;
                LinearLayout linearLayout = kiVar.h1;
                LinearLayout linearLayout2 = kiVar.j1;
                float f12 = f10 / 500.0f;
                kiVar.a0.set(kiVar.u0, Float.valueOf(f12));
                kiVar.T0.setAlpha(AndroidUtilities.lerp(this.c, this.d, f12));
                kiVar.X1(kiVar.u0, 0);
                kiVar.X1(kiVar.v0, 0);
                if (!(kiVar.v0 instanceof hm) || this.b) {
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
                fo0 fo0Var = (fo0) this.e;
                boolean z10 = this.b;
                if (z10) {
                    if (f10 > this.c / 2.0f || !fo0Var.s) {
                    }
                } else if (f10 < this.d / 2.0f || !fo0Var.r) {
                }
                fo0Var.s = !z10;
                fo0Var.r = z10;
                break;
        }
    }

    public /* synthetic */ dh(fo0 fo0Var, boolean z10, float f10, float f11) {
        this.e = fo0Var;
        this.b = z10;
        this.c = f10;
        this.d = f11;
    }
}
