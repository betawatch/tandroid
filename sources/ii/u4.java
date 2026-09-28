package ii;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final class u4 extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new u4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.w51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        v4 v4Var = (v4) view;
        a aVar = (a) x51Var.G;
        q3 q3Var = (q3) x51Var.H;
        ArrayList arrayList = v4Var.y;
        v4Var.a = aVar;
        v4Var.N = q3Var;
        v4Var.c(aVar);
        if (aVar != null) {
            a aVar2 = v4Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock = aVar2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
                }
            }
            if (aVar.g == null) {
                aVar.g = new u();
            }
        }
        v4Var.n();
        v4Var.v.b();
        if (v4Var.W >= arrayList.size()) {
            v4Var.W = Math.max(0, arrayList.size() - 1);
        }
        v4Var.a0 = 0.0f;
        v4Var.U.d(v4Var.l() ? 1.0f : 0.0f, true);
        v4Var.o(false);
        v4Var.requestLayout();
        v4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean contentsEquals(x51 x51Var, x51 x51Var2) {
        return x51Var.d == x51Var2.d;
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        v4 v4Var = new v4(context, d6Var);
        v4Var.setBackground(new b2(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, d6Var)));
        return v4Var;
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
