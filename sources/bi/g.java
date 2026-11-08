package bi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.u80;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.kt;
import org.telegram.ui.qu0;
import org.telegram.ui.vv0;
import org.telegram.ui.ww0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                hm0 hm0Var = (hm0) this.b;
                ih.d.a(hm0Var, canvas, rectF, hm0Var, (FrameLayout) this.c);
                break;
            case 4:
                pj0 pj0Var = (pj0) this.b;
                ih.d.a(pj0Var, canvas, rectF, pj0Var, (FrameLayout) this.c);
                break;
            case 5:
                ((org.telegram.ui.y6) this.b).b0.d(canvas, rectF, (org.telegram.ui.z5) this.c);
                break;
            case 6:
                ((r20) this.b).n.L(canvas, rectF, (FrameLayout) this.c);
                break;
            case 7:
                ((u80) this.b).R.L(canvas, rectF, (e5) this.c);
                break;
            case 8:
                kt ktVar = (kt) this.b;
                di.a4 a4Var = (di.a4) this.c;
                int childCount = ktVar.a.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = ktVar.a.getChildAt(i7);
                    if (childAt instanceof pj0) {
                        pj0 pj0Var2 = (pj0) childAt;
                        ih.d.a(pj0Var2, canvas, rectF, pj0Var2, a4Var);
                    }
                }
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                dh.k kVar = (dh.k) this.c;
                Paint paint = profileActivity.M6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                vv0 vv0Var = profileActivity.N;
                float f10 = (vv0Var == null || vv0Var.getParent() != profileActivity.a) ? 0.0f : profileActivity.Q5;
                if (f10 < 1.0f) {
                    ww0 ww0Var = profileActivity.c1;
                    RectF rectF2 = ProfileActivity.S6;
                    if (jh.k.c(ww0Var, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                        ih.d.a(new org.telegram.ui.oa(profileActivity, 4), canvas, rectF, profileActivity.c1, viewGroup);
                    }
                    qu0 qu0Var = profileActivity.a;
                    Objects.requireNonNull(qu0Var);
                    ih.d.a(new org.telegram.ui.oa(qu0Var, 5), canvas, rectF, profileActivity.a, viewGroup);
                    kVar.d(canvas, rectF);
                }
                if (f10 > 0.0f) {
                    float y10 = f10 < 1.0f ? profileActivity.N.getY() + profileActivity.a.getY() : Float.MAX_VALUE;
                    paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, profileActivity.z0));
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
