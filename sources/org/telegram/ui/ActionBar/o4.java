package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class o4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ w4 e;

    public /* synthetic */ o4(w4 w4Var, int i10, int i11, float f10, float f11, int i12) {
        this.a = i12;
        this.e = w4Var;
        this.b = i10;
        this.c = i11;
        this.d = f11;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.a) {
            case 0:
                int i10 = this.b;
                int i11 = this.c;
                int i12 = (int) (f10 * (i10 - i11));
                w4 w4Var = this.e;
                RelativeLayout relativeLayout = w4Var.f;
                w4.l(relativeLayout, relativeLayout.getLayoutParams().width, i11 + i12);
                if (w4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    w4.a(w4Var);
                    break;
                }
                break;
            case 1:
                int i13 = this.b;
                int i14 = this.c;
                w4 w4Var2 = this.e;
                RelativeLayout relativeLayout2 = w4Var2.f;
                w4.l(relativeLayout2, ((int) (f10 * (i13 - i14))) + i14, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                w4Var2.g.setX(relativeLayout2.getWidth() - i14);
                w4Var2.h.setX(relativeLayout2.getWidth() - i13);
                break;
            case 2:
                int i15 = this.b;
                int i16 = this.c;
                int i17 = (int) (f10 * (i15 - i16));
                w4 w4Var3 = this.e;
                RelativeLayout relativeLayout3 = w4Var3.f;
                w4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, i17 + i16);
                if (w4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i16));
                    w4.a(w4Var3);
                    break;
                }
                break;
            default:
                int i18 = this.b;
                int i19 = this.c;
                w4 w4Var4 = this.e;
                RelativeLayout relativeLayout4 = w4Var4.f;
                w4.l(relativeLayout4, ((int) (f10 * (i18 - i19))) + i19, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                w4Var4.g.setX(relativeLayout4.getWidth() - i18);
                w4Var4.h.setX(relativeLayout4.getWidth() - i19);
                break;
        }
    }

    public /* synthetic */ o4(w4 w4Var, int i10, int i11, float f10, int i12) {
        this.a = i12;
        this.e = w4Var;
        this.b = i10;
        this.c = i11;
        this.d = f10;
    }
}
