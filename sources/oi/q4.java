package oi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class q4 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new q4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.k41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        r4 r4Var = (r4) view;
        a aVar = (a) l41Var.H;
        l3 l3Var = (l3) l41Var.I;
        ArrayList arrayList = r4Var.E;
        r4Var.a = aVar;
        r4Var.O = l3Var;
        r4Var.c(aVar);
        if (aVar != null) {
            a aVar2 = r4Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock = aVar2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
                }
            }
            if (aVar.g == null) {
                aVar.g = new r();
            }
        }
        r4Var.p();
        r4Var.w.b();
        if (r4Var.a0 >= arrayList.size()) {
            r4Var.a0 = Math.max(0, arrayList.size() - 1);
        }
        r4Var.b0 = 0.0f;
        r4Var.V.e(true, r4Var.m() ? 1.0f : 0.0f);
        r4Var.q(false);
        r4Var.requestLayout();
        r4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean c(l41 l41Var, l41 l41Var2) {
        return l41Var.d == l41Var2.d;
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        r4 r4Var = new r4(context, i6Var);
        r4Var.setBackground(new w1(n6.w0(n6.d6, i6Var)));
        return r4Var;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean e(l41 l41Var, l41 l41Var2) {
        return l41Var.d == l41Var2.d;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean f() {
        return false;
    }
}
