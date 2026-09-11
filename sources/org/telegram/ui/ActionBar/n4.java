package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class n4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ v4 e;

    public /* synthetic */ n4(v4 v4Var, int i10, int i11, float f7, float f10, int i12) {
        this.a = i12;
        this.e = v4Var;
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
                v4 v4Var = this.e;
                RelativeLayout relativeLayout = v4Var.f;
                v4.l(relativeLayout, relativeLayout.getLayoutParams().width, i11 + i12);
                if (v4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    v4.a(v4Var);
                    break;
                }
                break;
            case 1:
                int i13 = this.b;
                int i14 = this.c;
                v4 v4Var2 = this.e;
                RelativeLayout relativeLayout2 = v4Var2.f;
                v4.l(relativeLayout2, ((int) (f7 * (i13 - i14))) + i14, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                v4Var2.g.setX(relativeLayout2.getWidth() - i14);
                v4Var2.h.setX(relativeLayout2.getWidth() - i13);
                break;
            case 2:
                int i15 = this.b;
                int i16 = this.c;
                int i17 = (int) (f7 * (i15 - i16));
                v4 v4Var3 = this.e;
                RelativeLayout relativeLayout3 = v4Var3.f;
                v4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, i17 + i16);
                if (v4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i16));
                    v4.a(v4Var3);
                    break;
                }
                break;
            default:
                int i18 = this.b;
                int i19 = this.c;
                v4 v4Var4 = this.e;
                RelativeLayout relativeLayout4 = v4Var4.f;
                v4.l(relativeLayout4, ((int) (f7 * (i18 - i19))) + i19, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                v4Var4.g.setX(relativeLayout4.getWidth() - i18);
                v4Var4.h.setX(relativeLayout4.getWidth() - i19);
                break;
        }
    }

    public /* synthetic */ n4(v4 v4Var, int i10, int i11, float f7, int i12) {
        this.a = i12;
        this.e = v4Var;
        this.b = i10;
        this.c = i11;
        this.d = f7;
    }
}
