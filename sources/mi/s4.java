package mi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class s4 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new s4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.q31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        t4 t4Var = (t4) view;
        a aVar = (a) r31Var.G;
        m3 m3Var = (m3) r31Var.H;
        ArrayList arrayList = t4Var.E;
        t4Var.a = aVar;
        t4Var.O = m3Var;
        t4Var.c(aVar);
        if (aVar != null) {
            a aVar2 = t4Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock = aVar2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
                }
            }
            if (aVar.g == null) {
                aVar.g = new s();
            }
        }
        t4Var.p();
        t4Var.w.b();
        if (t4Var.a0 >= arrayList.size()) {
            t4Var.a0 = Math.max(0, arrayList.size() - 1);
        }
        t4Var.b0 = 0.0f;
        t4Var.V.e(true, t4Var.m() ? 1.0f : 0.0f);
        t4Var.q(false);
        t4Var.requestLayout();
        t4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean c(r31 r31Var, r31 r31Var2) {
        return r31Var.d == r31Var2.d;
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        t4 t4Var = new t4(context, e6Var);
        t4Var.setBackground(new z1(k6.w0(k6.d6, e6Var)));
        return t4Var;
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean e(r31 r31Var, r31 r31Var2) {
        return r31Var.d == r31Var2.d;
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean f() {
        return false;
    }
}
