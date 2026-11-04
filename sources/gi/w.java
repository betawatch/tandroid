package gi;

import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ui;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.uf0;
import org.telegram.ui.vf0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w extends u4.h0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public /* synthetic */ w(KeyEvent.Callback callback, Context context, Object obj, int i3) {
        this.c = i3;
        this.f = callback;
        this.d = context;
        this.e = obj;
    }

    @Override // u4.h0
    public final int b() {
        switch (this.c) {
            case 0:
                return t.a().size();
            default:
                return ((vf0) this.f).N.size();
        }
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        switch (this.c) {
            case 0:
                x xVar = (x) d1Var.a;
                t tVar = (t) t.a().get(i3);
                boolean z10 = i3 == xVar.s;
                xVar.setDrawable(new u(tVar, false));
                xVar.b(tVar.equals(((y) this.f).b), z10);
                xVar.s = i3;
                break;
            default:
                vf0 vf0Var = (vf0) this.f;
                ArrayList arrayList = vf0Var.N;
                zi ziVar = (zi) arrayList.get((b() - 1) - i3);
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) d1Var.a;
                ui k10 = vf0Var.k(ziVar);
                int i10 = 0;
                q1Var.setInvalidatesParent(k10 != null);
                q1Var.u3(ziVar, k10, false, false, false, false);
                if (!vf0Var.P.i() && arrayList.size() >= 10) {
                    i10 = arrayList.size() % 10;
                }
                if (i3 == i10 && !ziVar.o5()) {
                    vf0Var.Q = q1Var;
                    Point point = org.telegram.messenger.g0.q;
                    q1Var.w3(point.x, point.y);
                    vf0Var.R = ziVar.f1();
                    break;
                }
                break;
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        switch (this.c) {
            case 0:
                x xVar = new x(this.d);
                xVar.setLayoutParams(new u4.p0(org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(56.0f)));
                xVar.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
                return new bj0(xVar);
            default:
                vf0 vf0Var = (vf0) this.f;
                uf0 uf0Var = new uf0(vf0Var, this.d, vf0Var.c, (org.telegram.ui.ActionBar.e6) this.e);
                uf0Var.setDelegate(new ra.e(18));
                return new bj0(uf0Var);
        }
    }

    @Override // u4.h0
    public void y(u4.d1 d1Var) {
        switch (this.c) {
            case 0:
                x xVar = (x) d1Var.a;
                ((n2) this.e).a(xVar);
                int i3 = xVar.s;
                if (i3 >= 0 && i3 < t.a().size()) {
                    t tVar = (t) t.a().get(xVar.s);
                    xVar.setDrawable(new u(tVar, false));
                    xVar.b(tVar.equals(((y) this.f).b), false);
                    break;
                }
                break;
        }
    }

    @Override // u4.h0
    public void z(u4.d1 d1Var) {
        switch (this.c) {
            case 0:
                n2 n2Var = (n2) this.e;
                n2Var.d.remove((x) d1Var.a);
                break;
        }
    }
}
