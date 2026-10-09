package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                LinearLayout linearLayout = yiVar.o1;
                LinearLayout linearLayout2 = yiVar.q1;
                float f11 = f7 / 500.0f;
                mi miVar = yiVar.e0;
                qi qiVar = yiVar.B0;
                Float valueOf = Float.valueOf(f11);
                miVar.getClass();
                miVar.a(qiVar, valueOf);
                yiVar.a1.setAlpha(AndroidUtilities.lerp(this.c, this.d, f11));
                yiVar.b2(yiVar.B0, 0);
                yiVar.b2(yiVar.C0, 0);
                if (!(yiVar.C0 instanceof hn) || this.b) {
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
                bq0 bq0Var = (bq0) this.e;
                boolean z10 = this.b;
                if (z10) {
                    if (f7 > this.c / 2.0f || !bq0Var.s) {
                    }
                } else if (f7 < this.d / 2.0f || !bq0Var.r) {
                }
                bq0Var.s = !z10;
                bq0Var.r = z10;
                break;
        }
    }

    public /* synthetic */ qh(bq0 bq0Var, boolean z10, float f7, float f10) {
        this.e = bq0Var;
        this.b = z10;
        this.c = f7;
        this.d = f10;
    }
}
