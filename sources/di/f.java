package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.nt;
import org.telegram.ui.ou0;
import org.telegram.ui.uv0;
import org.telegram.ui.vw0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements eh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // eh.a
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // eh.a
    public final void d(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                ((t) this.b).f.d(canvas, rectF, (e) this.c);
                break;
            case 1:
                ((lb) this.b).V.d(canvas, rectF, (e) this.c);
                break;
            case 2:
                ((ii.f) this.b).V.d(canvas, rectF, (e) this.c);
                break;
            case 3:
                ((org.telegram.ui.y6) this.b).c0.d(canvas, rectF, (org.telegram.ui.a6) this.c);
                break;
            case 4:
                ((u20) this.b).n.L(canvas, rectF, (FrameLayout) this.c);
                break;
            case 5:
                ((y80) this.b).S.L(canvas, rectF, (bi.g2) this.c);
                break;
            case 6:
                nt ntVar = (nt) this.b;
                bi.v1 v1Var = (bi.v1) this.c;
                int childCount = ntVar.a.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = ntVar.a.getChildAt(i7);
                    if (childAt instanceof uj0) {
                        uj0 uj0Var = (uj0) childAt;
                        ih.d.a(uj0Var, canvas, rectF, uj0Var, v1Var);
                    }
                }
                break;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                dh.k kVar = (dh.k) this.c;
                Paint paint = profileActivity.R6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                uv0 uv0Var = profileActivity.O;
                float f10 = (uv0Var == null || uv0Var.getParent() != profileActivity.a) ? 0.0f : profileActivity.U5;
                if (f10 < 1.0f) {
                    vw0 vw0Var = profileActivity.d1;
                    RectF rectF2 = ProfileActivity.X6;
                    if (jh.k.c(vw0Var, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                        ih.d.a(new org.telegram.ui.oa(profileActivity, 4), canvas, rectF, profileActivity.d1, viewGroup);
                    }
                    ou0 ou0Var = profileActivity.a;
                    Objects.requireNonNull(ou0Var);
                    ih.d.a(new org.telegram.ui.oa(ou0Var, 5), canvas, rectF, profileActivity.a, viewGroup);
                    kVar.d(canvas, rectF);
                }
                if (f10 > 0.0f) {
                    float y10 = f10 < 1.0f ? profileActivity.O.getY() + profileActivity.a.getY() : Float.MAX_VALUE;
                    paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, profileActivity.A0));
                    paint.setAlpha((int) (f10 * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, y10), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.O.L(canvas2, rectF, viewGroup);
                ProfileActivity.M3(profileActivity.u0, canvas2, rectF, viewGroup);
                ProfileActivity.M3(profileActivity.o0, canvas2, rectF, viewGroup);
                ProfileActivity.M3(profileActivity.n0, canvas2, rectF, viewGroup);
                break;
            case 8:
                lm0 lm0Var = (lm0) this.b;
                ih.d.a(lm0Var, canvas, rectF, lm0Var, (FrameLayout) this.c);
                break;
            default:
                uj0 uj0Var2 = (uj0) this.b;
                ih.d.a(uj0Var2, canvas, rectF, uj0Var2, (FrameLayout) this.c);
                break;
        }
    }
}
