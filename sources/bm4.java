// default package

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class bm4 extends Animation {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ jm4 e;

    public /* synthetic */ bm4(jm4 jm4Var, int i, int i2, float f, byte b) {
        this.a = b;
        this.e = jm4Var;
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        byte b = this.a;
        float f2 = this.d;
        jm4 jm4Var = this.e;
        int i = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                int i3 = (int) (f * (i2 - i));
                RelativeLayout relativeLayout = jm4Var.f;
                jm4.l(relativeLayout, relativeLayout.getLayoutParams().width, i + i3);
                if (jm4Var.M) {
                    jm4Var.f.setY(f2 - r4.getHeight());
                    jm4Var.g();
                    break;
                }
                break;
            case 1:
                RelativeLayout relativeLayout2 = jm4Var.f;
                jm4.l(relativeLayout2, ((int) (f * (i2 - i))) + i, relativeLayout2.getLayoutParams().height);
                jm4Var.f.setX(f2 - r5.getWidth());
                jm4Var.g.setX(r5.getWidth() - i);
                jm4Var.h.setX(r5.getWidth() - i2);
                break;
            case 2:
                int i4 = (int) (f * (i2 - i));
                RelativeLayout relativeLayout3 = jm4Var.f;
                jm4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, i4 + i);
                if (jm4Var.M) {
                    jm4Var.f.setY(f2 - (r4.getHeight() - i));
                    jm4Var.g();
                    break;
                }
                break;
            default:
                RelativeLayout relativeLayout4 = jm4Var.f;
                jm4.l(relativeLayout4, ((int) (f * (i2 - i))) + i, relativeLayout4.getLayoutParams().height);
                jm4Var.f.setX(f2 - r5.getWidth());
                jm4Var.g.setX(r5.getWidth() - i2);
                jm4Var.h.setX(r5.getWidth() - i);
                break;
        }
    }

    public /* synthetic */ bm4(jm4 jm4Var, int i, int i2, float f, float f2, byte b) {
        this.a = b;
        this.e = jm4Var;
        this.b = i;
        this.c = i2;
        this.d = f2;
    }
}
