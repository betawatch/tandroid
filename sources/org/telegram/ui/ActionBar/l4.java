package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ t4 e;

    public /* synthetic */ l4(t4 t4Var, int i9, int i10, float f10, float f11, int i11) {
        this.a = i11;
        this.e = t4Var;
        this.b = i9;
        this.c = i10;
        this.d = f11;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.a) {
            case 0:
                int i9 = this.b;
                int i10 = this.c;
                int i11 = (int) (f10 * (i9 - i10));
                t4 t4Var = this.e;
                RelativeLayout relativeLayout = t4Var.f;
                t4.l(relativeLayout, relativeLayout.getLayoutParams().width, i10 + i11);
                if (t4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    t4.a(t4Var);
                    break;
                }
                break;
            case 1:
                int i12 = this.b;
                int i13 = this.c;
                t4 t4Var2 = this.e;
                RelativeLayout relativeLayout2 = t4Var2.f;
                t4.l(relativeLayout2, ((int) (f10 * (i12 - i13))) + i13, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                t4Var2.g.setX(relativeLayout2.getWidth() - i13);
                t4Var2.h.setX(relativeLayout2.getWidth() - i12);
                break;
            case 2:
                int i14 = this.b;
                int i15 = this.c;
                int i16 = (int) (f10 * (i14 - i15));
                t4 t4Var3 = this.e;
                RelativeLayout relativeLayout3 = t4Var3.f;
                t4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, i16 + i15);
                if (t4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i15));
                    t4.a(t4Var3);
                    break;
                }
                break;
            default:
                int i17 = this.b;
                int i18 = this.c;
                t4 t4Var4 = this.e;
                RelativeLayout relativeLayout4 = t4Var4.f;
                t4.l(relativeLayout4, ((int) (f10 * (i17 - i18))) + i18, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                t4Var4.g.setX(relativeLayout4.getWidth() - i17);
                t4Var4.h.setX(relativeLayout4.getWidth() - i18);
                break;
        }
    }

    public /* synthetic */ l4(t4 t4Var, int i9, int i10, float f10, int i11) {
        this.a = i11;
        this.e = t4Var;
        this.b = i9;
        this.c = i10;
        this.d = f10;
    }
}
