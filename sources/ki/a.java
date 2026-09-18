package ki;

import ah.o;
import ai.w0;
import ai.x5;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a7;
import org.telegram.ui.bv;
import org.telegram.ui.i6;
import org.telegram.ui.x6;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // bh.a
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // bh.a
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                ml0 ml0Var = (ml0) this.b;
                gh.d.a(ml0Var, canvas, rectF, ml0Var, (FrameLayout) this.c);
                break;
            case 1:
                a7 a7Var = (a7) this.b;
                i6 i6Var = (i6) this.c;
                w0 w0Var = a7Var.b;
                gh.d.a(w0Var, canvas, rectF, w0Var, i6Var);
                x6 x6Var = a7Var.M;
                if (x6Var != null) {
                    int childCount = x6Var.h.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = a7Var.M.h.getChildAt(i10);
                        if (childAt instanceof ml0) {
                            ml0 ml0Var2 = (ml0) childAt;
                            gh.d.a(ml0Var2, canvas, rectF, ml0Var2, i6Var);
                        }
                    }
                    break;
                }
                break;
            case 2:
                bv bvVar = (bv) this.b;
                x5 x5Var = (x5) this.c;
                int childCount2 = bvVar.a.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    View childAt2 = bvVar.a.getChildAt(i11);
                    if (childAt2 instanceof ml0) {
                        ml0 ml0Var3 = (ml0) childAt2;
                        gh.d.a(ml0Var3, canvas, rectF, ml0Var3, x5Var);
                    }
                }
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ((o) this.c).f(canvas, rectF);
                jh jhVar = profileActivity.O.c2;
                if (jhVar != null) {
                    jhVar.f(canvas, rectF);
                    break;
                }
                break;
        }
    }
}
