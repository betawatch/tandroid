package ei;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import g.y;
import j$.util.Objects;
import jg.l0;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Cells.a5;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bw0;
import org.telegram.ui.ix0;
import org.telegram.ui.ky0;
import org.telegram.ui.mu;
import org.telegram.ui.sa;
import org.telegram.ui.y6;
import org.telegram.ui.z5;
import rh.h8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ug.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // ug.a
    public final void d(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                in0 in0Var = (in0) this.c;
                yg.d.a(in0Var, canvas, rectF, in0Var, (FrameLayout) this.b);
                break;
            case 1:
                tk0 tk0Var = (tk0) this.c;
                yg.d.a(tk0Var, canvas, rectF, tk0Var, (FrameLayout) this.b);
                break;
            case 2:
                ((y6) this.c).b0.d(canvas, rectF, (z5) this.b);
                break;
            case 3:
                ((j30) this.c).n.K(canvas, rectF, (FrameLayout) this.b);
                break;
            case 4:
                ((n90) this.c).R.K(canvas, rectF, (l0) this.b);
                break;
            case 5:
                mu muVar = (mu) this.c;
                a5 a5Var = (a5) this.b;
                int childCount = muVar.a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = muVar.a.getChildAt(i10);
                    if (childAt instanceof tk0) {
                        tk0 tk0Var2 = (tk0) childAt;
                        yg.d.a(tk0Var2, canvas, rectF, tk0Var2, a5Var);
                    }
                }
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                tg.j jVar = (tg.j) this.b;
                Paint paint = profileActivity.L6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                ix0 ix0Var = profileActivity.N;
                float f7 = (ix0Var == null || ix0Var.getParent() != profileActivity.a) ? 0.0f : profileActivity.P5;
                if (f7 < 1.0f) {
                    ky0 ky0Var = profileActivity.c1;
                    RectF rectF2 = ProfileActivity.R6;
                    if (zg.h.c(ky0Var, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                        yg.d.a(new sa(profileActivity, 4), canvas, rectF, profileActivity.c1, viewGroup);
                    }
                    bw0 bw0Var = profileActivity.a;
                    Objects.requireNonNull(bw0Var);
                    yg.d.a(new sa(bw0Var, 5), canvas, rectF, profileActivity.a, viewGroup);
                    jVar.d(canvas, rectF);
                }
                if (f7 > 0.0f) {
                    float y3 = f7 < 1.0f ? profileActivity.N.getY() + profileActivity.a.getY() : Float.MAX_VALUE;
                    paint.setColor(t6.w0(t6.a7, profileActivity.z0));
                    paint.setAlpha((int) (f7 * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, y3), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.N.K(canvas2, rectF, viewGroup);
                ProfileActivity.M3(profileActivity.t0, canvas2, rectF, viewGroup);
                ProfileActivity.M3(profileActivity.n0, canvas2, rectF, viewGroup);
                ProfileActivity.M3(profileActivity.m0, canvas2, rectF, viewGroup);
                break;
            case 7:
                ((rh.i) this.c).f.d(canvas, rectF, (y1) this.b);
                break;
            case 8:
                ((h8) this.c).U.d(canvas, rectF, (y1) this.b);
                break;
            default:
                ((wh.g) this.c).U.d(canvas, rectF, (y1) this.b);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ug.a
    public final void g(y yVar, RectF rectF) {
        switch (this.a) {
        }
        yVar.b = true;
    }
}
