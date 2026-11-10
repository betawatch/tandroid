package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ j4 e;

    public /* synthetic */ c4(j4 j4Var, int i7, int i10, float f10, float f11, int i11) {
        this.a = i11;
        this.e = j4Var;
        this.b = i7;
        this.c = i10;
        this.d = f11;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.a) {
            case 0:
                int i7 = this.b;
                int i10 = this.c;
                int i11 = (int) (f10 * (i7 - i10));
                j4 j4Var = this.e;
                RelativeLayout relativeLayout = j4Var.f;
                j4.l(relativeLayout, relativeLayout.getLayoutParams().width, i10 + i11);
                if (j4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    j4.a(j4Var);
                    break;
                }
                break;
            case 1:
                int i12 = this.b;
                int i13 = this.c;
                j4 j4Var2 = this.e;
                RelativeLayout relativeLayout2 = j4Var2.f;
                j4.l(relativeLayout2, ((int) (f10 * (i12 - i13))) + i13, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                j4Var2.g.setX(relativeLayout2.getWidth() - i13);
                j4Var2.h.setX(relativeLayout2.getWidth() - i12);
                break;
            case 2:
                int i14 = this.b;
                int i15 = this.c;
                int i16 = (int) (f10 * (i14 - i15));
                j4 j4Var3 = this.e;
                RelativeLayout relativeLayout3 = j4Var3.f;
                j4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, i16 + i15);
                if (j4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i15));
                    j4.a(j4Var3);
                    break;
                }
                break;
            default:
                int i17 = this.b;
                int i18 = this.c;
                j4 j4Var4 = this.e;
                RelativeLayout relativeLayout4 = j4Var4.f;
                j4.l(relativeLayout4, ((int) (f10 * (i17 - i18))) + i18, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                j4Var4.g.setX(relativeLayout4.getWidth() - i17);
                j4Var4.h.setX(relativeLayout4.getWidth() - i18);
                break;
        }
    }

    public /* synthetic */ c4(j4 j4Var, int i7, int i10, float f10, int i11) {
        this.a = i11;
        this.e = j4Var;
        this.b = i7;
        this.c = i10;
        this.d = f10;
    }
}
