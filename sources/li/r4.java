package li;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class r4 extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new r4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.x31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        s4 s4Var = (s4) view;
        a aVar = (a) y31Var.G;
        m3 m3Var = (m3) y31Var.H;
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

    @Override // org.telegram.ui.Components.x31
    public final boolean c(y31 y31Var, y31 y31Var2) {
        return y31Var.d == y31Var2.d;
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        s4 s4Var = new s4(context, g6Var);
        s4Var.setBackground(new y1(l6.w0(l6.d6, g6Var)));
        return s4Var;
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean e(y31 y31Var, y31 y31Var2) {
        return y31Var.d == y31Var2.d;
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean f() {
        return false;
    }
}
