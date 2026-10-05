package di;

import ah.n;
import ai.w5;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a7;
import org.telegram.ui.d6;
import org.telegram.ui.zu;
import yh.z7;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                kVar.S.d(canvas, rectF, (e) this.c);
                break;
            case 1:
                zl0 zl0Var = (zl0) this.b;
                gh.d.a(zl0Var, canvas, rectF, zl0Var, (FrameLayout) this.c);
                break;
            case 2:
                so0 so0Var = (so0) this.b;
                gh.d.a(so0Var, canvas, rectF, so0Var, (FrameLayout) this.c);
                break;
            case 3:
                a7 a7Var = (a7) this.b;
                a7Var.b0.d(canvas, rectF, (d6) this.c);
                break;
            case 4:
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
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ((n) this.c).f(canvas, rectF);
                mh mhVar = profileActivity.O.c2;
                if (mhVar != null) {
                    mhVar.f(canvas, rectF);
                    break;
                }
                break;
            case 6:
                yh.h hVar = (yh.h) this.b;
                hVar.f.d(canvas, rectF, (e) this.c);
                break;
            default:
                z7 z7Var = (z7) this.b;
                z7Var.S.d(canvas, rectF, (e) this.c);
                break;
        }
    }
}
