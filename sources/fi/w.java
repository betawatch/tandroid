package fi;

import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.dj;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.ag0;
import org.telegram.ui.bg0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class w extends v4.g0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public /* synthetic */ w(KeyEvent.Callback callback, Context context, Object obj, int i7) {
        this.c = i7;
        this.f = callback;
        this.d = context;
        this.e = obj;
    }

    @Override // v4.g0
    public final int b() {
        switch (this.c) {
            case 0:
                return t.a().size();
            default:
                return ((bg0) this.f).M.size();
        }
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        switch (this.c) {
            case 0:
                x xVar = (x) d1Var.a;
                t tVar = (t) t.a().get(i7);
                boolean z9 = i7 == xVar.s;
                xVar.setDrawable(new u(tVar, false));
                xVar.b(tVar.equals(((y) this.f).b), z9);
                xVar.s = i7;
                break;
            default:
                bg0 bg0Var = (bg0) this.f;
                ArrayList arrayList = bg0Var.M;
                ij ijVar = (ij) arrayList.get((b() - 1) - i7);
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) d1Var.a;
                dj k10 = bg0Var.k(ijVar);
                int i10 = 0;
                q1Var.setInvalidatesParent(k10 != null);
                q1Var.v3(ijVar, k10, false, false, false, false);
                if (!bg0Var.O.i() && arrayList.size() >= 10) {
                    i10 = arrayList.size() % 10;
                }
                if (i7 == i10 && !ijVar.o5()) {
                    bg0Var.P = q1Var;
                    Point point = org.telegram.messenger.g0.q;
                    q1Var.x3(point.x, point.y);
                    bg0Var.Q = ijVar.f1();
                    break;
                }
                break;
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        switch (this.c) {
            case 0:
                x xVar = new x(this.d);
                xVar.setLayoutParams(new v4.o0(org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(56.0f)));
                xVar.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
                return new xi0(xVar);
            default:
                bg0 bg0Var = (bg0) this.f;
                ag0 ag0Var = new ag0(bg0Var, this.d, bg0Var.c, (org.telegram.ui.ActionBar.f6) this.e);
                ag0Var.setDelegate(new qb.a(18));
                return new xi0(ag0Var);
        }
    }

    @Override // v4.g0
    public void y(v4.d1 d1Var) {
        switch (this.c) {
            case 0:
                x xVar = (x) d1Var.a;
                ((p2) this.e).a(xVar);
                int i7 = xVar.s;
                if (i7 >= 0 && i7 < t.a().size()) {
                    t tVar = (t) t.a().get(xVar.s);
                    xVar.setDrawable(new u(tVar, false));
                    xVar.b(tVar.equals(((y) this.f).b), false);
                    break;
                }
                break;
        }
    }

    @Override // v4.g0
    public void z(v4.d1 d1Var) {
        switch (this.c) {
            case 0:
                p2 p2Var = (p2) this.e;
                p2Var.d.remove((x) d1Var.a);
                break;
        }
    }
}
