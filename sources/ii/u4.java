package ii;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class u4 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new u4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.u51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        v4 v4Var = (v4) view;
        a aVar = (a) v51Var.G;
        q3 q3Var = (q3) v51Var.H;
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

    @Override // org.telegram.ui.Components.u51
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        return v51Var.d == v51Var2.d;
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        v4 v4Var = new v4(context, d6Var);
        v4Var.setBackground(new b2(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, d6Var)));
        return v4Var;
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        return v51Var.d == v51Var2.d;
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean isClickable() {
        return false;
    }
}
