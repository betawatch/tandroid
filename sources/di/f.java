package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ot;
import org.telegram.ui.pu0;
import org.telegram.ui.uv0;
import org.telegram.ui.xw0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                ((pb) this.b).V.d(canvas, rectF, (e) this.c);
                break;
            case 2:
                ((ii.t) this.b).V.d(canvas, rectF, (e) this.c);
                break;
            case 3:
                ((org.telegram.ui.y6) this.b).c0.d(canvas, rectF, (org.telegram.ui.a6) this.c);
                break;
            case 4:
                ((c30) this.b).n.L(canvas, rectF, (FrameLayout) this.c);
                break;
            case 5:
                ((h90) this.b).S.L(canvas, rectF, (bi.g3) this.c);
                break;
            case 6:
                ot otVar = (ot) this.b;
                bi.v2 v2Var = (bi.v2) this.c;
                int childCount = otVar.a.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = otVar.a.getChildAt(i7);
                    if (childAt instanceof ek0) {
                        ek0 ek0Var = (ek0) childAt;
                        ih.d.a(ek0Var, canvas, rectF, ek0Var, v2Var);
                    }
                }
                break;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                dh.k kVar = (dh.k) this.c;
                Paint paint = profileActivity.T6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                uv0 uv0Var = profileActivity.O;
                float f10 = (uv0Var == null || uv0Var.getParent() != profileActivity.a) ? 0.0f : profileActivity.W5;
                if (f10 < 1.0f) {
                    xw0 xw0Var = profileActivity.d1;
                    RectF rectF2 = ProfileActivity.Z6;
                    if (jh.k.c(xw0Var, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                        ih.d.a(new org.telegram.ui.oa(profileActivity, 4), canvas, rectF, profileActivity.d1, viewGroup);
                    }
                    pu0 pu0Var = profileActivity.a;
                    Objects.requireNonNull(pu0Var);
                    ih.d.a(new org.telegram.ui.oa(pu0Var, 5), canvas, rectF, profileActivity.a, viewGroup);
                    kVar.d(canvas, rectF);
                }
                if (f10 > 0.0f) {
                    float y10 = f10 < 1.0f ? profileActivity.O.getY() + profileActivity.a.getY() : Float.MAX_VALUE;
                    paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, profileActivity.A0));
                    paint.setAlpha((int) (f10 * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, y10), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.O.L(canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.u0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.o0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.n0, canvas2, rectF, viewGroup);
                break;
            case 8:
                vm0 vm0Var = (vm0) this.b;
                ih.d.a(vm0Var, canvas, rectF, vm0Var, (FrameLayout) this.c);
                break;
            default:
                ek0 ek0Var2 = (ek0) this.b;
                ih.d.a(ek0Var2, canvas, rectF, ek0Var2, (FrameLayout) this.c);
                break;
        }
    }
}
