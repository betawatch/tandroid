package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ q4 e;

    public /* synthetic */ i4(q4 q4Var, int i10, int i11, float f7, float f10, int i12) {
        this.a = i12;
        this.e = q4Var;
        this.b = i10;
        this.c = i11;
        this.d = f10;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.a) {
            case 0:
                int i10 = this.b;
                int i11 = this.c;
                int i12 = (int) (f7 * (i10 - i11));
                q4 q4Var = this.e;
                RelativeLayout relativeLayout = q4Var.f;
                q4.l(relativeLayout, relativeLayout.getLayoutParams().width, i11 + i12);
                if (q4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    q4.a(q4Var);
                    break;
                }
                break;
            case 1:
                int i13 = this.b;
                int i14 = this.c;
                q4 q4Var2 = this.e;
                RelativeLayout relativeLayout2 = q4Var2.f;
                q4.l(relativeLayout2, ((int) (f7 * (i13 - i14))) + i14, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                q4Var2.g.setX(relativeLayout2.getWidth() - i14);
                q4Var2.h.setX(relativeLayout2.getWidth() - i13);
                break;
            case 2:
                int i15 = this.b;
                int i16 = this.c;
                int i17 = (int) (f7 * (i15 - i16));
                q4 q4Var3 = this.e;
                RelativeLayout relativeLayout3 = q4Var3.f;
                q4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, i17 + i16);
                if (q4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i16));
                    q4.a(q4Var3);
                    break;
                }
                break;
            default:
                int i18 = this.b;
                int i19 = this.c;
                q4 q4Var4 = this.e;
                RelativeLayout relativeLayout4 = q4Var4.f;
                q4.l(relativeLayout4, ((int) (f7 * (i18 - i19))) + i19, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                q4Var4.g.setX(relativeLayout4.getWidth() - i18);
                q4Var4.h.setX(relativeLayout4.getWidth() - i19);
                break;
        }
    }

    public /* synthetic */ i4(q4 q4Var, int i10, int i11, float f7, int i12) {
        this.a = i12;
        this.e = q4Var;
        this.b = i10;
        this.c = i11;
        this.d = f7;
    }
}
