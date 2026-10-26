package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class e0 extends s61 {
    public static final /* synthetic */ int a = 0;

    static {
        s61.setup(new e0());
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        f0 f0Var = (f0) view;
        a aVar = (a) t61Var.G;
        d0 d0Var = (d0) t61Var.H;
        f0Var.a = aVar;
        f0Var.E = d0Var;
        f0Var.c(aVar);
        f0Var.h();
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        f0 f0Var = new f0(context, i10, u6Var);
        f0Var.setBackground(new y1(y6.w0(y6.d6, u6Var)));
        return f0Var;
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean isClickable() {
        return false;
    }
}
