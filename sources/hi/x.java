package hi;

import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.dg0;
import org.telegram.ui.eg0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class x extends v4.i0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public /* synthetic */ x(KeyEvent.Callback callback, Context context, Object obj, int i7) {
        this.c = i7;
        this.f = callback;
        this.d = context;
        this.e = obj;
    }

    @Override // v4.i0
    public final int b() {
        switch (this.c) {
            case 0:
                return u.a().size();
            default:
                return ((eg0) this.f).N.size();
        }
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        switch (this.c) {
            case 0:
                y yVar = (y) f1Var.a;
                u uVar = (u) u.a().get(i7);
                boolean z10 = i7 == yVar.s;
                yVar.setDrawable(new v(uVar, false));
                yVar.b(uVar.equals(((z) this.f).b), z10);
                yVar.s = i7;
                break;
            default:
                eg0 eg0Var = (eg0) this.f;
                ArrayList arrayList = eg0Var.N;
                fj fjVar = (fj) arrayList.get((b() - 1) - i7);
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) f1Var.a;
                aj l10 = eg0Var.l(fjVar);
                int i10 = 0;
                q1Var.setInvalidatesParent(l10 != null);
                q1Var.y3(fjVar, l10, false, false, false, false);
                if (!eg0Var.P.i() && arrayList.size() >= 10) {
                    i10 = arrayList.size() % 10;
                }
                if (i7 == i10 && !fjVar.n5()) {
                    eg0Var.Q = q1Var;
                    Point point = org.telegram.messenger.g0.q;
                    q1Var.A3(point.x, point.y);
                    eg0Var.R = fjVar.e1();
                    break;
                }
                break;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        switch (this.c) {
            case 0:
                y yVar = new y(this.d);
                yVar.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(56.0f)));
                yVar.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
                return new kj0(yVar);
            default:
                eg0 eg0Var = (eg0) this.f;
                dg0 dg0Var = new dg0(eg0Var, this.d, eg0Var.c, (org.telegram.ui.ActionBar.i6) this.e);
                dg0Var.setDelegate(new nb.a(19));
                return new kj0(dg0Var);
        }
    }

    @Override // v4.i0
    public void y(v4.f1 f1Var) {
        switch (this.c) {
            case 0:
                y yVar = (y) f1Var.a;
                ((o2) this.e).a(yVar);
                int i7 = yVar.s;
                if (i7 >= 0 && i7 < u.a().size()) {
                    u uVar = (u) u.a().get(yVar.s);
                    yVar.setDrawable(new v(uVar, false));
                    yVar.b(uVar.equals(((z) this.f).b), false);
                    break;
                }
                break;
        }
    }

    @Override // v4.i0
    public void z(v4.f1 f1Var) {
        switch (this.c) {
            case 0:
                o2 o2Var = (o2) this.e;
                o2Var.d.remove((y) f1Var.a);
                break;
        }
    }
}
