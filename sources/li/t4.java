package li;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class t4 extends s61 {
    public static final /* synthetic */ int a = 0;

    static {
        s61.setup(new t4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.s61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        u4 u4Var = (u4) view;
        a aVar = (a) t61Var.G;
        o3 o3Var = (o3) t61Var.H;
        ArrayList arrayList = u4Var.y;
        u4Var.a = aVar;
        u4Var.N = o3Var;
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
        u4Var.m();
        u4Var.v.b();
        if (u4Var.W >= arrayList.size()) {
            u4Var.W = Math.max(0, arrayList.size() - 1);
        }
        u4Var.a0 = 0.0f;
        u4Var.U.d(u4Var.k() ? 1.0f : 0.0f, true);
        u4Var.n(false);
        u4Var.requestLayout();
        u4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean contentsEquals(t61 t61Var, t61 t61Var2) {
        return t61Var.d == t61Var2.d;
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        u4 u4Var = new u4(context, u6Var);
        u4Var.setBackground(new y1(y6.w0(y6.d6, u6Var)));
        return u4Var;
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        return t61Var.d == t61Var2.d;
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean isClickable() {
        return false;
    }
}
