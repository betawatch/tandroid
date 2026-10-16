package ji;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class x4 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new x4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.l61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        y4 y4Var = (y4) view;
        a aVar = (a) m61Var.G;
        q3 q3Var = (q3) m61Var.H;
        ArrayList arrayList = y4Var.y;
        y4Var.a = aVar;
        y4Var.N = q3Var;
        y4Var.c(aVar);
        if (aVar != null) {
            a aVar2 = y4Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock = aVar2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
                }
            }
            if (aVar.g == null) {
                aVar.g = new u();
            }
        }
        y4Var.n();
        y4Var.v.b();
        if (y4Var.W >= arrayList.size()) {
            y4Var.W = Math.max(0, arrayList.size() - 1);
        }
        y4Var.a0 = 0.0f;
        y4Var.U.d(y4Var.l() ? 1.0f : 0.0f, true);
        y4Var.o(false);
        y4Var.requestLayout();
        y4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        return m61Var.d == m61Var2.d;
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        y4 y4Var = new y4(context, c6Var);
        y4Var.setBackground(new a2(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var)));
        return y4Var;
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        return m61Var.d == m61Var2.d;
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean isClickable() {
        return false;
    }
}
