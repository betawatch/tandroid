package oi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class o4 extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new o4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.a41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        p4 p4Var = (p4) view;
        a aVar = (a) b41Var.G;
        j3 j3Var = (j3) b41Var.H;
        ArrayList arrayList = p4Var.E;
        p4Var.a = aVar;
        p4Var.O = j3Var;
        p4Var.c(aVar);
        if (aVar != null) {
            a aVar2 = p4Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock = aVar2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
                }
            }
            if (aVar.g == null) {
                aVar.g = new r();
            }
        }
        p4Var.p();
        p4Var.w.b();
        if (p4Var.a0 >= arrayList.size()) {
            p4Var.a0 = Math.max(0, arrayList.size() - 1);
        }
        p4Var.b0 = 0.0f;
        p4Var.V.e(true, p4Var.m() ? 1.0f : 0.0f);
        p4Var.q(false);
        p4Var.requestLayout();
        p4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean c(b41 b41Var, b41 b41Var2) {
        return b41Var.d == b41Var2.d;
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        p4 p4Var = new p4(context, e6Var);
        p4Var.setBackground(new w1(j6.w0(j6.d6, e6Var)));
        return p4Var;
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean e(b41 b41Var, b41 b41Var2) {
        return b41Var.d == b41Var2.d;
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean f() {
        return false;
    }
}
