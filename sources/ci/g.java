package ci;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ht;
import org.telegram.ui.hu0;
import org.telegram.ui.mv0;
import org.telegram.ui.ow0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements fh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // fh.a
    public final void b(eh.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // fh.a
    public final void d(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                ((v) this.b).f.d(canvas, rectF, (f) this.c);
                break;
            case 1:
                ((wb) this.b).V.d(canvas, rectF, (f) this.c);
                break;
            case 2:
                ((hi.g) this.b).V.d(canvas, rectF, (f) this.c);
                break;
            case 3:
                ((org.telegram.ui.z6) this.b).c0.d(canvas, rectF, (org.telegram.ui.b6) this.c);
                break;
            case 4:
                ((n20) this.b).n.L(canvas, rectF, (FrameLayout) this.c);
                break;
            case 5:
                ((r80) this.b).S.L(canvas, rectF, (ai.o2) this.c);
                break;
            case 6:
                ht htVar = (ht) this.b;
                ai.d2 d2Var = (ai.d2) this.c;
                int childCount = htVar.a.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = htVar.a.getChildAt(i3);
                    if (childAt instanceof tj0) {
                        tj0 tj0Var = (tj0) childAt;
                        jh.d.a(tj0Var, canvas, rectF, tj0Var, d2Var);
                    }
                }
                break;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                eh.k kVar = (eh.k) this.c;
                Paint paint = profileActivity.N6;
                ViewGroup viewGroup = (ViewGroup) profileActivity.fragmentView;
                mv0 mv0Var = profileActivity.O;
                float f10 = (mv0Var == null || mv0Var.getParent() != profileActivity.a) ? 0.0f : profileActivity.R5;
                if (f10 < 1.0f) {
                    ow0 ow0Var = profileActivity.d1;
                    RectF rectF2 = ProfileActivity.T6;
                    if (kh.k.c(ow0Var, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                        jh.d.a(new org.telegram.ui.na(profileActivity, 4), canvas, rectF, profileActivity.d1, viewGroup);
                    }
                    hu0 hu0Var = profileActivity.a;
                    Objects.requireNonNull(hu0Var);
                    jh.d.a(new org.telegram.ui.na(hu0Var, 5), canvas, rectF, profileActivity.a, viewGroup);
                    kVar.d(canvas, rectF);
                }
                if (f10 > 0.0f) {
                    float y9 = f10 < 1.0f ? profileActivity.O.getY() + profileActivity.a.getY() : Float.MAX_VALUE;
                    paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, profileActivity.A0));
                    paint.setAlpha((int) (f10 * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(rectF.left, rectF.top, rectF.right, Math.min(rectF.bottom, y9), paint);
                } else {
                    canvas2 = canvas;
                }
                profileActivity.O.L(canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.u0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.o0, canvas2, rectF, viewGroup);
                ProfileActivity.N3(profileActivity.n0, canvas2, rectF, viewGroup);
                break;
            case 8:
                km0 km0Var = (km0) this.b;
                jh.d.a(km0Var, canvas, rectF, km0Var, (FrameLayout) this.c);
                break;
            default:
                tj0 tj0Var2 = (tj0) this.b;
                jh.d.a(tj0Var2, canvas, rectF, tj0Var2, (FrameLayout) this.c);
                break;
        }
    }
}
