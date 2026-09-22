package li;

import ah.o;
import ai.w0;
import ai.x5;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.kh;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.av;
import org.telegram.ui.h6;
import org.telegram.ui.w6;
import org.telegram.ui.z6;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                yl0 yl0Var = (yl0) this.b;
                gh.d.a(yl0Var, canvas, rectF, yl0Var, (FrameLayout) this.c);
                break;
            case 1:
                z6 z6Var = (z6) this.b;
                h6 h6Var = (h6) this.c;
                w0 w0Var = z6Var.b;
                gh.d.a(w0Var, canvas, rectF, w0Var, h6Var);
                w6 w6Var = z6Var.M;
                if (w6Var != null) {
                    int childCount = w6Var.h.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = z6Var.M.h.getChildAt(i10);
                        if (childAt instanceof yl0) {
                            yl0 yl0Var2 = (yl0) childAt;
                            gh.d.a(yl0Var2, canvas, rectF, yl0Var2, h6Var);
                        }
                    }
                    break;
                }
                break;
            case 2:
                av avVar = (av) this.b;
                x5 x5Var = (x5) this.c;
                int childCount2 = avVar.a.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    View childAt2 = avVar.a.getChildAt(i11);
                    if (childAt2 instanceof yl0) {
                        yl0 yl0Var3 = (yl0) childAt2;
                        gh.d.a(yl0Var3, canvas, rectF, yl0Var3, x5Var);
                    }
                }
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ((o) this.c).f(canvas, rectF);
                kh khVar = profileActivity.O.c2;
                if (khVar != null) {
                    khVar.f(canvas, rectF);
                    break;
                }
                break;
        }
    }
}
