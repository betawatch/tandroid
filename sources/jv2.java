// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class jv2 implements no7, s09 {
    public final /* synthetic */ xv2 a;

    public /* synthetic */ jv2(xv2 xv2Var) {
        this.a = xv2Var;
    }

    @Override // s09
    public final boolean C() {
        return false;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        this.a.q = gl.H0(vxcVar, false);
        return vxcVar;
    }

    @Override // s09
    public final void q(View view, h19 h19Var, boolean z, boolean z2) {
        if (h19Var != null) {
            xv2 xv2Var = this.a;
            m43 reactionsWindow = xv2Var.P.getReactionsWindow();
            boolean contains = xv2Var.o.contains(h19Var.f);
            ArrayList arrayList = xv2Var.o;
            if (!contains) {
                arrayList.add(h19Var.f);
                if (xv2Var.o.size() > 7) {
                    xv2Var.o.remove(0);
                }
            } else if (arrayList.size() <= 1) {
                return;
            } else {
                xv2Var.o.remove(h19Var.f);
            }
            xv2Var.P.setSelectedEmojis(xv2Var.o);
            if (reactionsWindow != null) {
                i43 i43Var = reactionsWindow.m;
                xv2Var.P.m(null, null, false);
                if (i43Var != null) {
                    i43Var.setSelectedReactions(xv2Var.o);
                    i43Var.setRecentReactions(xv2Var.P.W);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override // s09
    public final boolean r() {
        return true;
    }

    @Override // s09
    public final boolean u() {
        return false;
    }

    @Override // s09
    public final void A() {
    }

    @Override // s09
    public final void x(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
