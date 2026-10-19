package ki;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class t4 extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new t4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.f61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        u4 u4Var = (u4) view;
        a aVar = (a) g61Var.G;
        p3 p3Var = (p3) g61Var.H;
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
                aVar.g = new t();
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

    @Override // org.telegram.ui.Components.f61
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        return g61Var.d == g61Var2.d;
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        u4 u4Var = new u4(context, d6Var);
        u4Var.setBackground(new a2(h6.w0(h6.d6, d6Var)));
        return u4Var;
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        return g61Var.d == g61Var2.d;
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean isClickable() {
        return false;
    }
}
