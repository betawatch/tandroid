package di;

import ah.n;
import ai.w5;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a7;
import org.telegram.ui.d6;
import org.telegram.ui.zu;
import yh.x7;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
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
                k kVar = (k) this.b;
                kVar.S.c0(canvas, rectF, (e) this.c);
                break;
            case 1:
                zl0 zl0Var = (zl0) this.b;
                gh.d.a(zl0Var, canvas, rectF, zl0Var, (FrameLayout) this.c);
                break;
            case 2:
                a7 a7Var = (a7) this.b;
                a7Var.b0.c0(canvas, rectF, (d6) this.c);
                break;
            case 3:
                zu zuVar = (zu) this.b;
                w5 w5Var = (w5) this.c;
                int childCount = zuVar.a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = zuVar.a.getChildAt(i10);
                    if (childAt instanceof zl0) {
                        zl0 zl0Var2 = (zl0) childAt;
                        gh.d.a(zl0Var2, canvas, rectF, zl0Var2, w5Var);
                    }
                }
                break;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ((n) this.c).f(canvas, rectF);
                mh mhVar = profileActivity.O.c2;
                if (mhVar != null) {
                    mhVar.f(canvas, rectF);
                    break;
                }
                break;
            default:
                x7 x7Var = (x7) this.b;
                x7Var.S.c0(canvas, rectF, (e) this.c);
                break;
        }
    }
}
