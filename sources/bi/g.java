package bi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.v80;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.mt;
import org.telegram.ui.su0;
import org.telegram.ui.xv0;
import org.telegram.ui.zw0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements eh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i7, Object obj, Object obj2) {
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
                ((z) this.b).f.d(canvas, rectF, (f) this.c);
                break;
            case 1:
                ((dd) this.b).U.d(canvas, rectF, (f) this.c);
                break;
            case 2:
                ((gi.f) this.b).U.d(canvas, rectF, (f) this.c);
                break;
            case 3:
                im0 im0Var = (im0) this.b;
                ih.d.a(im0Var, canvas, rectF, im0Var, (FrameLayout) this.c);
                break;
            case 4:
                qj0 qj0Var = (qj0) this.b;
                ih.d.a(qj0Var, canvas, rectF, qj0Var, (FrameLayout) this.c);
                break;
            case 5:
                ((org.telegram.ui.y6) this.b).b0.d(canvas, rectF, (org.telegram.ui.z5) this.c);
                break;
            case 6:
                ((s20) this.b).n.L(canvas, rectF, (FrameLayout) this.c);
                break;
            case 7:
                ((v80) this.b).R.L(canvas, rectF, (e5) this.c);
                break;
            case 8:
                mt mtVar = (mt) this.b;
                di.b4 b4Var = (di.b4) this.c;
                int childCount = mtVar.a.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = mtVar.a.getChildAt(i7);
                    if (childAt instanceof qj0) {
                        qj0 qj0Var2 = (qj0) childAt;
                        ih.d.a(qj0Var2, canvas, rectF, qj0Var2, b4Var);
                    }
                }
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                dh.k kVar = (dh.k) this.c;
                Paint paint = profileActivity.P6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                xv0 xv0Var = profileActivity.N;
                float f10 = (xv0Var == null || xv0Var.getParent() != profileActivity.a) ? 0.0f : profileActivity.S5;
                if (f10 < 1.0f) {
                    zw0 zw0Var = profileActivity.c1;
                    RectF rectF2 = ProfileActivity.V6;
                    if (jh.k.c(zw0Var, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                        ih.d.a(new org.telegram.ui.oa(profileActivity, 4), canvas, rectF, profileActivity.c1, viewGroup);
                    }
                    su0 su0Var = profileActivity.a;
                    Objects.requireNonNull(su0Var);
                    ih.d.a(new org.telegram.ui.oa(su0Var, 5), canvas, rectF, profileActivity.a, viewGroup);
                    kVar.d(canvas, rectF);
                }
                if (f10 > 0.0f) {
                    float y10 = f10 < 1.0f ? profileActivity.N.getY() + profileActivity.a.getY() : Float.MAX_VALUE;
                    paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.a7, profileActivity.z0));
                    paint.setAlpha((int) (f10 * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, y10), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.N.L(canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.t0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.n0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.m0, canvas2, rectF, viewGroup);
                break;
        }
    }
}
