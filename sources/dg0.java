// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class dg0 implements yi5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dg0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // yi5
    public final void a(qeb qebVar, RectF rectF) {
        byte b = this.a;
        qebVar.b = true;
    }

    @Override // yi5
    public final void g(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ny9 ny9Var = (ny9) obj2;
                uk0.a(ny9Var, canvas, rectF, ny9Var, (FrameLayout) obj);
                break;
            case 1:
                d79 d79Var = (d79) obj2;
                uk0.a(d79Var, canvas, rectF, d79Var, (FrameLayout) obj);
                break;
            case 2:
                ((at0) obj2).f.d(canvas, rectF, (kd) obj);
                break;
            case 3:
                ((z61) obj2).c0.d(canvas, rectF, (tg0) obj);
                break;
            case 4:
                a93 a93Var = (a93) obj2;
                b6 b6Var = (b6) obj;
                int childCount = a93Var.a.getChildCount();
                while (i < childCount) {
                    View childAt = a93Var.a.getChildAt(i);
                    if (childAt instanceof d79) {
                        d79 d79Var2 = (d79) childAt;
                        uk0.a(d79Var2, canvas, rectF, d79Var2, b6Var);
                    }
                    i++;
                }
                break;
            case 5:
                ((ue5) obj2).n.u(canvas, rectF, (FrameLayout) obj);
                break;
            case 6:
                ((em6) obj2).S.u(canvas, rectF, (d26) obj);
                break;
            case 7:
                d26 d26Var = (d26) obj;
                jm7[] jm7VarArr = ((lm7) obj2).b;
                int length = jm7VarArr.length;
                while (i < length) {
                    im7 im7Var = jm7VarArr[i].f;
                    if (im7Var != null && im7Var.H && im7Var.getVisibility() == 0 && im7Var.getAlpha() > 0.0f) {
                        uk0.a(im7Var, canvas, rectF, im7Var, d26Var);
                    }
                    i++;
                }
                break;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                lhc lhcVar = (lhc) obj;
                RectF rectF2 = ProfileActivity.Z6;
                Paint paint = profileActivity.T6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                gr8 gr8Var = profileActivity.O;
                float f = (gr8Var == null || gr8Var.getParent() != profileActivity.a) ? 0.0f : profileActivity.W5;
                if (f < 1.0f) {
                    is8 is8Var = profileActivity.d1;
                    RectF rectF3 = ProfileActivity.Z6;
                    if (yic.c(is8Var, viewGroup, rectF3) && RectF.intersects(rectF3, rectF)) {
                        uk0.a(new mr0(profileActivity, (byte) 8), canvas, rectF, profileActivity.d1, viewGroup);
                    }
                    zp8 zp8Var = profileActivity.a;
                    Objects.requireNonNull(zp8Var);
                    uk0.a(new mr0(zp8Var, (byte) 9), canvas, rectF, profileActivity.a, viewGroup);
                    lhcVar.g(canvas, rectF);
                }
                if (f > 0.0f) {
                    float y = f < 1.0f ? profileActivity.O.getY() + profileActivity.a.getY() : Float.MAX_VALUE;
                    paint.setColor(aob.v0(aob.a7, profileActivity.A0));
                    paint.setAlpha((int) (f * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, y), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.O.u(canvas2, rectF, viewGroup);
                ProfileActivity.F1(profileActivity.u0, canvas2, rectF, viewGroup);
                ProfileActivity.F1(profileActivity.o0, canvas2, rectF, viewGroup);
                ProfileActivity.F1(profileActivity.n0, canvas2, rectF, viewGroup);
                break;
            case 9:
                ((nza) obj2).V.d(canvas, rectF, (kya) obj);
                break;
            default:
                ((thb) obj2).V.d(canvas, rectF, (kya) obj);
                break;
        }
    }
}
