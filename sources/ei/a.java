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
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.aw0;
import org.telegram.ui.hx0;
import org.telegram.ui.jy0;
import org.telegram.ui.lu;
import org.telegram.ui.sa;
import org.telegram.ui.y6;
import org.telegram.ui.z5;
import rh.h8;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                jn0 jn0Var = (jn0) this.c;
                yg.d.a(jn0Var, canvas, rectF, jn0Var, (FrameLayout) this.b);
                break;
            case 1:
                uk0 uk0Var = (uk0) this.c;
                yg.d.a(uk0Var, canvas, rectF, uk0Var, (FrameLayout) this.b);
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
                lu luVar = (lu) this.c;
                a5 a5Var = (a5) this.b;
                int childCount = luVar.a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = luVar.a.getChildAt(i10);
                    if (childAt instanceof uk0) {
                        uk0 uk0Var2 = (uk0) childAt;
                        yg.d.a(uk0Var2, canvas, rectF, uk0Var2, a5Var);
                    }
                }
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                tg.j jVar = (tg.j) this.b;
                Paint paint = profileActivity.M6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                hx0 hx0Var = profileActivity.N;
                float f7 = (hx0Var == null || hx0Var.getParent() != profileActivity.a) ? 0.0f : profileActivity.Q5;
                if (f7 < 1.0f) {
                    jy0 jy0Var = profileActivity.c1;
                    RectF rectF2 = ProfileActivity.S6;
                    if (zg.h.c(jy0Var, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                        yg.d.a(new sa(profileActivity, 4), canvas, rectF, profileActivity.c1, viewGroup);
                    }
                    aw0 aw0Var = profileActivity.a;
                    Objects.requireNonNull(aw0Var);
                    yg.d.a(new sa(aw0Var, 5), canvas, rectF, profileActivity.a, viewGroup);
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
                ProfileActivity.N3(profileActivity.t0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.n0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.m0, canvas2, rectF, viewGroup);
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
