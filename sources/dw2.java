// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dw2 implements nr7, h49 {
    public final /* synthetic */ rw2 a;

    public /* synthetic */ dw2(rw2 rw2Var) {
        this.a = rw2Var;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        this.a.q = hl.H0(l2dVar, false);
        return l2dVar;
    }

    @Override // h49
    public final void e(View view, w49 w49Var, boolean z, boolean z2) {
        if (w49Var != null) {
            rw2 rw2Var = this.a;
            e53 reactionsWindow = rw2Var.P.getReactionsWindow();
            boolean contains = rw2Var.o.contains(w49Var.f);
            ArrayList arrayList = rw2Var.o;
            if (!contains) {
                arrayList.add(w49Var.f);
                if (rw2Var.o.size() > 7) {
                    rw2Var.o.remove(0);
                }
            } else if (arrayList.size() <= 1) {
                return;
            } else {
                rw2Var.o.remove(w49Var.f);
            }
            rw2Var.P.setSelectedEmojis(rw2Var.o);
            if (reactionsWindow != null) {
                a53 a53Var = reactionsWindow.m;
                rw2Var.P.m(null, null, false);
                if (a53Var != null) {
                    a53Var.setSelectedReactions(rw2Var.o);
                    a53Var.setRecentReactions(rw2Var.P.W);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override // h49
    public final boolean j() {
        return true;
    }

    @Override // h49
    public final boolean k() {
        return false;
    }

    @Override // h49
    public final boolean p() {
        return false;
    }

    @Override // h49
    public final void n() {
    }

    @Override // h49
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
