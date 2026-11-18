package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class d4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ k4 e;

    public /* synthetic */ d4(k4 k4Var, int i7, int i10, float f10, float f11, int i11) {
        this.a = i11;
        this.e = k4Var;
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
                k4 k4Var = this.e;
                RelativeLayout relativeLayout = k4Var.f;
                k4.l(relativeLayout, relativeLayout.getLayoutParams().width, i10 + i11);
                if (k4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    k4.a(k4Var);
                    break;
                }
                break;
            case 1:
                int i12 = this.b;
                int i13 = this.c;
                k4 k4Var2 = this.e;
                RelativeLayout relativeLayout2 = k4Var2.f;
                k4.l(relativeLayout2, ((int) (f10 * (i12 - i13))) + i13, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                k4Var2.g.setX(relativeLayout2.getWidth() - i13);
                k4Var2.h.setX(relativeLayout2.getWidth() - i12);
                break;
            case 2:
                int i14 = this.b;
                int i15 = this.c;
                int i16 = (int) (f10 * (i14 - i15));
                k4 k4Var3 = this.e;
                RelativeLayout relativeLayout3 = k4Var3.f;
                k4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, i16 + i15);
                if (k4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i15));
                    k4.a(k4Var3);
                    break;
                }
                break;
            default:
                int i17 = this.b;
                int i18 = this.c;
                k4 k4Var4 = this.e;
                RelativeLayout relativeLayout4 = k4Var4.f;
                k4.l(relativeLayout4, ((int) (f10 * (i17 - i18))) + i18, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                k4Var4.g.setX(relativeLayout4.getWidth() - i17);
                k4Var4.h.setX(relativeLayout4.getWidth() - i18);
                break;
        }
    }

    public /* synthetic */ d4(k4 k4Var, int i7, int i10, float f10, int i11) {
        this.a = i11;
        this.e = k4Var;
        this.b = i7;
        this.c = i10;
        this.d = f10;
    }
}
