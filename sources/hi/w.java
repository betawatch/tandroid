package hi;

import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.ag0;
import org.telegram.ui.bg0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w extends v4.h0 {
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

    @Override // v4.h0
    public final int b() {
        switch (this.c) {
            case 0:
                return t.a().size();
            default:
                return ((bg0) this.f).N.size();
        }
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        switch (this.c) {
            case 0:
                x xVar = (x) e1Var.a;
                t tVar = (t) t.a().get(i7);
                boolean z10 = i7 == xVar.s;
                xVar.setDrawable(new u(tVar, false));
                xVar.b(tVar.equals(((y) this.f).b), z10);
                xVar.s = i7;
                break;
            default:
                bg0 bg0Var = (bg0) this.f;
                ArrayList arrayList = bg0Var.N;
                gj gjVar = (gj) arrayList.get((b() - 1) - i7);
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) e1Var.a;
                bj l10 = bg0Var.l(gjVar);
                int i10 = 0;
                q1Var.setInvalidatesParent(l10 != null);
                q1Var.x3(gjVar, l10, false, false, false, false);
                if (!bg0Var.P.i() && arrayList.size() >= 10) {
                    i10 = arrayList.size() % 10;
                }
                if (i7 == i10 && !gjVar.n5()) {
                    bg0Var.Q = q1Var;
                    Point point = org.telegram.messenger.g0.q;
                    q1Var.z3(point.x, point.y);
                    bg0Var.R = gjVar.e1();
                    break;
                }
                break;
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        switch (this.c) {
            case 0:
                x xVar = new x(this.d);
                xVar.setLayoutParams(new v4.p0(org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(56.0f)));
                xVar.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
                return new cj0(xVar);
            default:
                bg0 bg0Var = (bg0) this.f;
                ag0 ag0Var = new ag0(bg0Var, this.d, bg0Var.c, (org.telegram.ui.ActionBar.e6) this.e);
                ag0Var.setDelegate(new nb.a(19));
                return new cj0(ag0Var);
        }
    }

    @Override // v4.h0
    public void y(v4.e1 e1Var) {
        switch (this.c) {
            case 0:
                x xVar = (x) e1Var.a;
                ((n2) this.e).a(xVar);
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

    @Override // v4.h0
    public void z(v4.e1 e1Var) {
        switch (this.c) {
            case 0:
                n2 n2Var = (n2) this.e;
                n2Var.d.remove((x) e1Var.a);
                break;
        }
    }
}
