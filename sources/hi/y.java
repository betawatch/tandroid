package hi;

import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.dg0;
import org.telegram.ui.eg0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class y extends v4.i0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public /* synthetic */ y(KeyEvent.Callback callback, Context context, Object obj, int i7) {
        this.c = i7;
        this.f = callback;
        this.d = context;
        this.e = obj;
    }

    @Override // v4.i0
    public final int b() {
        switch (this.c) {
            case 0:
                return v.a().size();
            default:
                return ((eg0) this.f).N.size();
        }
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        switch (this.c) {
            case 0:
                z zVar = (z) f1Var.a;
                v vVar = (v) v.a().get(i7);
                boolean z10 = i7 == zVar.s;
                zVar.setDrawable(new w(vVar, false));
                zVar.b(vVar.equals(((a0) this.f).b), z10);
                zVar.s = i7;
                break;
            default:
                eg0 eg0Var = (eg0) this.f;
                ArrayList arrayList = eg0Var.N;
                gj gjVar = (gj) arrayList.get((b() - 1) - i7);
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) f1Var.a;
                bj l10 = eg0Var.l(gjVar);
                int i10 = 0;
                r1Var.setInvalidatesParent(l10 != null);
                r1Var.y3(gjVar, l10, false, false, false, false);
                if (!eg0Var.P.i() && arrayList.size() >= 10) {
                    i10 = arrayList.size() % 10;
                }
                if (i7 == i10 && !gjVar.n5()) {
                    eg0Var.Q = r1Var;
                    Point point = org.telegram.messenger.g0.q;
                    r1Var.A3(point.x, point.y);
                    eg0Var.R = gjVar.e1();
                    break;
                }
                break;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        switch (this.c) {
            case 0:
                z zVar = new z(this.d);
                zVar.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(56.0f)));
                zVar.setBackground(org.telegram.ui.ActionBar.m6.h0(553648127, 1, -1));
                return new mj0(zVar);
            default:
                eg0 eg0Var = (eg0) this.f;
                dg0 dg0Var = new dg0(eg0Var, this.d, eg0Var.c, (org.telegram.ui.ActionBar.h6) this.e);
                dg0Var.setDelegate(new nb.a(19));
                return new mj0(dg0Var);
        }
    }

    @Override // v4.i0
    public void y(v4.f1 f1Var) {
        switch (this.c) {
            case 0:
                z zVar = (z) f1Var.a;
                ((n2) this.e).a(zVar);
                int i7 = zVar.s;
                if (i7 >= 0 && i7 < v.a().size()) {
                    v vVar = (v) v.a().get(zVar.s);
                    zVar.setDrawable(new w(vVar, false));
                    zVar.b(vVar.equals(((a0) this.f).b), false);
                    break;
                }
                break;
        }
    }

    @Override // v4.i0
    public void z(v4.f1 f1Var) {
        switch (this.c) {
            case 0:
                n2 n2Var = (n2) this.e;
                n2Var.d.remove((z) f1Var.a);
                break;
        }
    }
}
