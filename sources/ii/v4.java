package ii;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class v4 extends o61 {
    public static final /* synthetic */ int a = 0;

    static {
        o61.setup(new v4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.o61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        w4 w4Var = (w4) view;
        a aVar = (a) p61Var.G;
        q3 q3Var = (q3) p61Var.H;
        ArrayList arrayList = w4Var.y;
        w4Var.a = aVar;
        w4Var.N = q3Var;
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

    @Override // org.telegram.ui.Components.o61
    public final boolean contentsEquals(p61 p61Var, p61 p61Var2) {
        return p61Var.d == p61Var2.d;
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        w4 w4Var = new w4(context, e6Var);
        w4Var.setBackground(new b2(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var)));
        return w4Var;
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean equals(p61 p61Var, p61 p61Var2) {
        return p61Var.d == p61Var2.d;
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean isClickable() {
        return false;
    }
}
