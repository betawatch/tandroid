package li;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class r4 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new r4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.w31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        s4 s4Var = (s4) view;
        a aVar = (a) x31Var.G;
        m3 m3Var = (m3) x31Var.H;
        ArrayList arrayList = s4Var.D;
        s4Var.a = aVar;
        s4Var.N = m3Var;
        s4Var.c(aVar);
        if (aVar != null) {
            a aVar2 = s4Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock = aVar2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
                }
            }
            if (aVar.g == null) {
                aVar.g = new s();
            }
        }
        s4Var.p();
        s4Var.w.b();
        if (s4Var.W >= arrayList.size()) {
            s4Var.W = Math.max(0, arrayList.size() - 1);
        }
        s4Var.a0 = 0.0f;
        s4Var.U.e(true, s4Var.m() ? 1.0f : 0.0f);
        s4Var.q(false);
        s4Var.requestLayout();
        s4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean c(x31 x31Var, x31 x31Var2) {
        return x31Var.d == x31Var2.d;
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        s4 s4Var = new s4(context, f6Var);
        s4Var.setBackground(new y1(k6.w0(k6.d6, f6Var)));
        return s4Var;
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean e(x31 x31Var, x31 x31Var2) {
        return x31Var.d == x31Var2.d;
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean f() {
        return false;
    }
}
