package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pt;
import org.telegram.ui.qu0;
import org.telegram.ui.vv0;
import org.telegram.ui.zw0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                ((org.telegram.ui.x6) this.b).c0.d(canvas, rectF, (org.telegram.ui.z5) this.c);
                break;
            case 4:
                ((c30) this.b).n.L(canvas, rectF, (FrameLayout) this.c);
                break;
            case 5:
                ((i90) this.b).S.L(canvas, rectF, (bi.a3) this.c);
                break;
            case 6:
                pt ptVar = (pt) this.b;
                bi.p2 p2Var = (bi.p2) this.c;
                int childCount = ptVar.a.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = ptVar.a.getChildAt(i7);
                    if (childAt instanceof ck0) {
                        ck0 ck0Var = (ck0) childAt;
                        ih.d.a(ck0Var, canvas, rectF, ck0Var, p2Var);
                    }
                }
                break;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                dh.k kVar = (dh.k) this.c;
                Paint paint = profileActivity.T6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                vv0 vv0Var = profileActivity.O;
                float f10 = (vv0Var == null || vv0Var.getParent() != profileActivity.a) ? 0.0f : profileActivity.W5;
                if (f10 < 1.0f) {
                    zw0 zw0Var = profileActivity.d1;
                    RectF rectF2 = ProfileActivity.Z6;
                    if (jh.k.c(zw0Var, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                        ih.d.a(new org.telegram.ui.oa(profileActivity, 4), canvas, rectF, profileActivity.d1, viewGroup);
                    }
                    qu0 qu0Var = profileActivity.a;
                    Objects.requireNonNull(qu0Var);
                    ih.d.a(new org.telegram.ui.oa(qu0Var, 5), canvas, rectF, profileActivity.a, viewGroup);
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
                tm0 tm0Var = (tm0) this.b;
                ih.d.a(tm0Var, canvas, rectF, tm0Var, (FrameLayout) this.c);
                break;
            default:
                ck0 ck0Var2 = (ck0) this.b;
                ih.d.a(ck0Var2, canvas, rectF, ck0Var2, (FrameLayout) this.c);
                break;
        }
    }
}
