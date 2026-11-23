package oi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class r4 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new r4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.m41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        s4 s4Var = (s4) view;
        a aVar = (a) n41Var.H;
        m3 m3Var = (m3) n41Var.I;
        ArrayList arrayList = s4Var.E;
        s4Var.a = aVar;
        s4Var.O = m3Var;
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
        if (s4Var.a0 >= arrayList.size()) {
            s4Var.a0 = Math.max(0, arrayList.size() - 1);
        }
        s4Var.b0 = 0.0f;
        s4Var.V.e(true, s4Var.m() ? 1.0f : 0.0f);
        s4Var.q(false);
        s4Var.requestLayout();
        s4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean c(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        s4 s4Var = new s4(context, i6Var);
        s4Var.setBackground(new y1(n6.w0(n6.d6, i6Var)));
        return s4Var;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean e(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean f() {
        return false;
    }
}
