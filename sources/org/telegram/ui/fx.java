package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class fx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ cy c;

    public /* synthetic */ fx(cy cyVar, float f7, int i10) {
        this.a = i10;
        this.c = cyVar;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                cy cyVar = this.c;
                cyVar.v3 = null;
                int i10 = 0;
                cyVar.O = false;
                cyVar.Q = true;
                cyVar.R = true;
                cyVar.fragmentView.invalidate();
                cyVar.y3 = -(AndroidUtilities.dp((cyVar.K ? 81 : 0) + 48) - this.b);
                cyVar.e0[0].setTranslationY(0.0f);
                while (true) {
                    ay[] ayVarArr = cyVar.e0;
                    if (i10 >= ayVarArr.length) {
                        cyVar.fragmentView.requestLayout();
                        rx rxVar = cyVar.X;
                        if (rxVar != null && cyVar.b.f) {
                            rxVar.r.requestFocus();
                            AndroidUtilities.showKeyboard(cyVar.X.r);
                            break;
                        }
                    } else {
                        ay ayVar = ayVarArr[i10];
                        if (ayVar != null) {
                            ayVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                cy cyVar2 = this.c;
                cyVar2.v3 = null;
                cyVar2.P = 0;
                cyVar2.O = true;
                cyVar2.y3 = AndroidUtilities.dp((cyVar2.K ? 81 : 0) + 48) - this.b;
                cyVar2.e0[0].setTranslationY(0.0f);
                int i11 = 0;
                while (true) {
                    ay[] ayVarArr2 = cyVar2.e0;
                    if (i11 >= ayVarArr2.length) {
                        cyVar2.E0.l(1.0f, false);
                        cyVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        ay ayVar2 = ayVarArr2[i11];
                        if (ayVar2 != null) {
                            ayVar2.a.requestLayout();
                        }
                        i11++;
                    }
                }
        }
    }
}
