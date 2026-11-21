package oi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class r4 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new r4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.n41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        s4 s4Var = (s4) view;
        a aVar = (a) o41Var.H;
        m3 m3Var = (m3) o41Var.I;
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
                aVar.g = new r();
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

    @Override // org.telegram.ui.Components.n41
    public final boolean c(o41 o41Var, o41 o41Var2) {
        return o41Var.d == o41Var2.d;
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        s4 s4Var = new s4(context, h6Var);
        s4Var.setBackground(new y1(m6.w0(m6.d6, h6Var)));
        return s4Var;
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean e(o41 o41Var, o41 o41Var2) {
        return o41Var.d == o41Var2.d;
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean f() {
        return false;
    }
}
