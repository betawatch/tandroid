package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh implements o1.g {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ nh(ti tiVar, float f7, float f10, boolean z10) {
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
                hi hiVar = tiVar.e0;
                li liVar = tiVar.B0;
                Float valueOf = Float.valueOf(f11);
                hiVar.getClass();
                hiVar.a(liVar, valueOf);
                tiVar.a1.setAlpha(AndroidUtilities.lerp(this.c, this.d, f11));
                tiVar.b2(tiVar.B0, 0);
                tiVar.b2(tiVar.C0, 0);
                if (!(tiVar.C0 instanceof bn) || this.b) {
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
                sp0 sp0Var = (sp0) this.e;
                boolean z10 = this.b;
                if (z10) {
                    if (f7 > this.c / 2.0f || !sp0Var.s) {
                    }
                } else if (f7 < this.d / 2.0f || !sp0Var.r) {
                }
                sp0Var.s = !z10;
                sp0Var.r = z10;
                break;
        }
    }

    public /* synthetic */ nh(sp0 sp0Var, boolean z10, float f7, float f10) {
        this.e = sp0Var;
        this.b = z10;
        this.c = f7;
        this.d = f10;
    }
}
