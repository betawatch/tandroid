package ji;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class v4 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new v4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.g51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        w4 w4Var = (w4) view;
        a aVar = (a) h51Var.G;
        o3 o3Var = (o3) h51Var.H;
        ArrayList arrayList = w4Var.y;
        w4Var.a = aVar;
        w4Var.N = o3Var;
        w4Var.c(aVar);
        if (aVar != null) {
            a aVar2 = w4Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock = aVar2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
                }
            }
            if (aVar.g == null) {
                aVar.g = new u();
            }
        }
        w4Var.n();
        w4Var.v.b();
        if (w4Var.W >= arrayList.size()) {
            w4Var.W = Math.max(0, arrayList.size() - 1);
        }
        w4Var.a0 = 0.0f;
        w4Var.U.d(w4Var.l() ? 1.0f : 0.0f, true);
        w4Var.o(false);
        w4Var.requestLayout();
        w4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        return h51Var.d == h51Var2.d;
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        w4 w4Var = new w4(context, f6Var);
        w4Var.setBackground(new z1(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var)));
        return w4Var;
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        return h51Var.d == h51Var2.d;
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean isClickable() {
        return false;
    }
}
