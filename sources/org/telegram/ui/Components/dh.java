package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements o1.g {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ KeyEvent.Callback e;

    public /* synthetic */ dh(li liVar, float f10, float f11, boolean z4) {
        this.e = liVar;
        this.c = f10;
        this.d = f11;
        this.b = z4;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                li liVar = (li) this.e;
                LinearLayout linearLayout = liVar.i1;
                LinearLayout linearLayout2 = liVar.k1;
                float f12 = f10 / 500.0f;
                liVar.b0.set(liVar.v0, Float.valueOf(f12));
                liVar.U0.setAlpha(AndroidUtilities.lerp(this.c, this.d, f12));
                liVar.X1(liVar.v0, 0);
                liVar.X1(liVar.w0, 0);
                if (!(liVar.w0 instanceof nm) || this.b) {
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
                zo0 zo0Var = (zo0) this.e;
                boolean z4 = this.b;
                if (z4) {
                    if (f10 > this.c / 2.0f || !zo0Var.s) {
                    }
                } else if (f10 < this.d / 2.0f || !zo0Var.r) {
                }
                zo0Var.s = !z4;
                zo0Var.r = z4;
                break;
        }
    }

    public /* synthetic */ dh(zo0 zo0Var, boolean z4, float f10, float f11) {
        this.e = zo0Var;
        this.b = z4;
        this.c = f10;
        this.d = f11;
    }
}
