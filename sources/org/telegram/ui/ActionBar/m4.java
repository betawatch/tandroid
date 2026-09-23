package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class m4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ u4 e;

    public /* synthetic */ m4(u4 u4Var, int i10, int i11, float f7, float f10, int i12) {
        this.a = i12;
        this.e = u4Var;
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
                u4 u4Var = this.e;
                RelativeLayout relativeLayout = u4Var.f;
                u4.l(relativeLayout, relativeLayout.getLayoutParams().width, i11 + i12);
                if (u4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    u4.a(u4Var);
                    break;
                }
                break;
            case 1:
                int i13 = this.b;
                int i14 = this.c;
                u4 u4Var2 = this.e;
                RelativeLayout relativeLayout2 = u4Var2.f;
                u4.l(relativeLayout2, ((int) (f7 * (i13 - i14))) + i14, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                u4Var2.g.setX(relativeLayout2.getWidth() - i14);
                u4Var2.h.setX(relativeLayout2.getWidth() - i13);
                break;
            case 2:
                int i15 = this.b;
                int i16 = this.c;
                int i17 = (int) (f7 * (i15 - i16));
                u4 u4Var3 = this.e;
                RelativeLayout relativeLayout3 = u4Var3.f;
                u4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, i17 + i16);
                if (u4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i16));
                    u4.a(u4Var3);
                    break;
                }
                break;
            default:
                int i18 = this.b;
                int i19 = this.c;
                u4 u4Var4 = this.e;
                RelativeLayout relativeLayout4 = u4Var4.f;
                u4.l(relativeLayout4, ((int) (f7 * (i18 - i19))) + i19, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                u4Var4.g.setX(relativeLayout4.getWidth() - i18);
                u4Var4.h.setX(relativeLayout4.getWidth() - i19);
                break;
        }
    }

    public /* synthetic */ m4(u4 u4Var, int i10, int i11, float f7, int i12) {
        this.a = i12;
        this.e = u4Var;
        this.b = i10;
        this.c = i11;
        this.d = f7;
    }
}
