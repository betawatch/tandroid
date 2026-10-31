package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class e5 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new e5());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.z41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        f5 f5Var = (f5) view;
        a aVar = (a) a51Var.G;
        w3 w3Var = (w3) a51Var.H;
        ArrayList arrayList = f5Var.D;
        f5Var.a = aVar;
        f5Var.N = w3Var;
        f5Var.c(aVar);
        if (aVar != null) {
            a aVar2 = f5Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock = aVar2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
                }
            }
            if (aVar.g == null) {
                aVar.g = new w();
            }
        }
        f5Var.p();
        f5Var.w.b();
        if (f5Var.W >= arrayList.size()) {
            f5Var.W = Math.max(0, arrayList.size() - 1);
        }
        f5Var.a0 = 0.0f;
        f5Var.U.e(true, f5Var.m() ? 1.0f : 0.0f);
        f5Var.q(false);
        f5Var.requestLayout();
        f5Var.invalidate();
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean c(a51 a51Var, a51 a51Var2) {
        return a51Var.d == a51Var2.d;
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        f5 f5Var = new f5(context, p6Var);
        f5Var.setBackground(new h2(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var)));
        return f5Var;
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean e(a51 a51Var, a51 a51Var2) {
        return a51Var.d == a51Var2.d;
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean f() {
        return false;
    }
}
