package hi;

import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.cg0;
import org.telegram.ui.dg0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class f0 extends v4.i0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public /* synthetic */ f0(KeyEvent.Callback callback, Context context, Object obj, int i7) {
        this.c = i7;
        this.f = callback;
        this.d = context;
        this.e = obj;
    }

    @Override // v4.i0
    public final int b() {
        switch (this.c) {
            case 0:
                return c0.a().size();
            default:
                return ((dg0) this.f).N.size();
        }
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        switch (this.c) {
            case 0:
                g0 g0Var = (g0) f1Var.a;
                c0 c0Var = (c0) c0.a().get(i7);
                boolean z10 = i7 == g0Var.s;
                g0Var.setDrawable(new d0(c0Var, false));
                g0Var.b(c0Var.equals(((h0) this.f).b), z10);
                g0Var.s = i7;
                break;
            default:
                dg0 dg0Var = (dg0) this.f;
                ArrayList arrayList = dg0Var.N;
                fj fjVar = (fj) arrayList.get((b() - 1) - i7);
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) f1Var.a;
                aj l10 = dg0Var.l(fjVar);
                int i10 = 0;
                r1Var.setInvalidatesParent(l10 != null);
                r1Var.y3(fjVar, l10, false, false, false, false);
                if (!dg0Var.P.i() && arrayList.size() >= 10) {
                    i10 = arrayList.size() % 10;
                }
                if (i7 == i10 && !fjVar.n5()) {
                    dg0Var.Q = r1Var;
                    Point point = org.telegram.messenger.g0.q;
                    r1Var.A3(point.x, point.y);
                    dg0Var.R = fjVar.e1();
                    break;
                }
                break;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        switch (this.c) {
            case 0:
                g0 g0Var = new g0(this.d);
                g0Var.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(56.0f)));
                g0Var.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
                return new mj0(g0Var);
            default:
                dg0 dg0Var = (dg0) this.f;
                cg0 cg0Var = new cg0(dg0Var, this.d, dg0Var.c, (org.telegram.ui.ActionBar.i6) this.e);
                cg0Var.setDelegate(new nb.a(19));
                return new mj0(cg0Var);
        }
    }

    @Override // v4.i0
    public void y(v4.f1 f1Var) {
        switch (this.c) {
            case 0:
                g0 g0Var = (g0) f1Var.a;
                ((w2) this.e).a(g0Var);
                int i7 = g0Var.s;
                if (i7 >= 0 && i7 < c0.a().size()) {
                    c0 c0Var = (c0) c0.a().get(g0Var.s);
                    g0Var.setDrawable(new d0(c0Var, false));
                    g0Var.b(c0Var.equals(((h0) this.f).b), false);
                    break;
                }
                break;
        }
    }

    @Override // v4.i0
    public void z(v4.f1 f1Var) {
        switch (this.c) {
            case 0:
                w2 w2Var = (w2) this.e;
                w2Var.d.remove((g0) f1Var.a);
                break;
        }
    }
}
