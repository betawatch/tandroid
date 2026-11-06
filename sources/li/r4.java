package li;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class r4 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new r4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.q31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        s4 s4Var = (s4) view;
        a aVar = (a) r31Var.G;
        m3 m3Var = (m3) r31Var.H;
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

    @Override // org.telegram.ui.Components.q31
    public final boolean c(r31 r31Var, r31 r31Var2) {
        return r31Var.d == r31Var2.d;
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        s4 s4Var = new s4(context, f6Var);
        s4Var.setBackground(new y1(k6.w0(k6.d6, f6Var)));
        return s4Var;
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
