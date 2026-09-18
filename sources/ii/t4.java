package ii;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class t4 extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new t4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.w51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        u4 u4Var = (u4) view;
        a aVar = (a) x51Var.G;
        p3 p3Var = (p3) x51Var.H;
        ArrayList arrayList = u4Var.y;
        u4Var.a = aVar;
        u4Var.N = p3Var;
        u4Var.c(aVar);
        if (aVar != null) {
            a aVar2 = u4Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock = aVar2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
                }
            }
            if (aVar.g == null) {
                aVar.g = new u();
            }
        }
        u4Var.n();
        u4Var.v.b();
        if (u4Var.W >= arrayList.size()) {
            u4Var.W = Math.max(0, arrayList.size() - 1);
        }
        u4Var.a0 = 0.0f;
        u4Var.U.d(u4Var.l() ? 1.0f : 0.0f, true);
        u4Var.o(false);
        u4Var.requestLayout();
        u4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean contentsEquals(x51 x51Var, x51 x51Var2) {
        return x51Var.d == x51Var2.d;
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        u4 u4Var = new u4(context, e6Var);
        u4Var.setBackground(new a2(j6.v0(j6.d6, e6Var)));
        return u4Var;
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean equals(x51 x51Var, x51 x51Var2) {
        return x51Var.d == x51Var2.d;
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean isClickable() {
        return false;
    }
}
