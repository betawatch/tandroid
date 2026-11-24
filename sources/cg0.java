// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class cg0 implements wg5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cg0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // wg5
    public final void a(tab tabVar, RectF rectF) {
        byte b = this.a;
        tabVar.b = true;
    }

    @Override // wg5
    public final void d(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                tu9 tu9Var = (tu9) obj2;
                tk0.a(tu9Var, canvas, rectF, tu9Var, (FrameLayout) obj);
                break;
            case 1:
                o39 o39Var = (o39) obj2;
                tk0.a(o39Var, canvas, rectF, o39Var, (FrameLayout) obj);
                break;
            case 2:
                ((ss0) obj2).f.d(canvas, rectF, (jd) obj);
                break;
            case 3:
                ((r61) obj2).c0.d(canvas, rectF, (sg0) obj);
                break;
            case 4:
                h83 h83Var = (h83) obj2;
                a6 a6Var = (a6) obj;
                int childCount = h83Var.a.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = h83Var.a.getChildAt(i);
                    if (childAt instanceof o39) {
                        o39 o39Var2 = (o39) childAt;
                        tk0.a(o39Var2, canvas, rectF, o39Var2, a6Var);
                    }
                }
                break;
            case 5:
                ((tc5) obj2).n.u(canvas, rectF, (FrameLayout) obj);
                break;
            case 6:
                ((zj6) obj2).S.u(canvas, rectF, (oc6) obj);
                break;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                mdc mdcVar = (mdc) obj;
                RectF rectF2 = ProfileActivity.Z6;
                Paint paint = profileActivity.T6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                vn8 vn8Var = profileActivity.O;
                float f = (vn8Var == null || vn8Var.getParent() != profileActivity.a) ? 0.0f : profileActivity.W5;
                if (f < 1.0f) {
                    wo8 wo8Var = profileActivity.d1;
                    RectF rectF3 = ProfileActivity.Z6;
                    if (zec.c(wo8Var, viewGroup, rectF3) && RectF.intersects(rectF3, rectF)) {
                        tk0.a(new vw0(profileActivity, (byte) 7), canvas, rectF, profileActivity.d1, viewGroup);
                    }
                    om8 om8Var = profileActivity.a;
                    Objects.requireNonNull(om8Var);
                    tk0.a(new vw0(om8Var, (byte) 8), canvas, rectF, profileActivity.a, viewGroup);
                    mdcVar.d(canvas, rectF);
                }
                if (f > 0.0f) {
                    float y = f < 1.0f ? profileActivity.O.getY() + profileActivity.a.getY() : Float.MAX_VALUE;
                    paint.setColor(bkb.v0(bkb.Z6, profileActivity.A0));
                    paint.setAlpha((int) (f * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, y), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.O.u(canvas2, rectF, viewGroup);
                ProfileActivity.E1(profileActivity.u0, canvas2, rectF, viewGroup);
                ProfileActivity.E1(profileActivity.o0, canvas2, rectF, viewGroup);
                ProfileActivity.E1(profileActivity.n0, canvas2, rectF, viewGroup);
                break;
            case 8:
                ((jva) obj2).V.d(canvas, rectF, (gua) obj);
                break;
            default:
                ((ydb) obj2).V.d(canvas, rectF, (gua) obj);
                break;
        }
    }
}
