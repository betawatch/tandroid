package hi;

import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.eg0;
import org.telegram.ui.fg0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                return ((fg0) this.f).N.size();
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
                fg0 fg0Var = (fg0) this.f;
                ArrayList arrayList = fg0Var.N;
                fj fjVar = (fj) arrayList.get((b() - 1) - i7);
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) f1Var.a;
                aj l10 = fg0Var.l(fjVar);
                int i10 = 0;
                r1Var.setInvalidatesParent(l10 != null);
                r1Var.y3(fjVar, l10, false, false, false, false);
                if (!fg0Var.P.i() && arrayList.size() >= 10) {
                    i10 = arrayList.size() % 10;
                }
                if (i7 == i10 && !fjVar.n5()) {
                    fg0Var.Q = r1Var;
                    Point point = org.telegram.messenger.g0.q;
                    r1Var.A3(point.x, point.y);
                    fg0Var.R = fjVar.e1();
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
                fg0 fg0Var = (fg0) this.f;
                eg0 eg0Var = new eg0(fg0Var, this.d, fg0Var.c, (org.telegram.ui.ActionBar.i6) this.e);
                eg0Var.setDelegate(new nb.a(19));
                return new kj0(eg0Var);
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
