package hi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class w4 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new w4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.u51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        x4 x4Var = (x4) view;
        a aVar = (a) v51Var.G;
        s3 s3Var = (s3) v51Var.H;
        ArrayList arrayList = x4Var.y;
        x4Var.a = aVar;
        x4Var.N = s3Var;
        x4Var.c(aVar);
        if (aVar != null) {
            a aVar2 = x4Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock = aVar2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
                }
            }
            if (aVar.g == null) {
                aVar.g = new v();
            }
        }
        x4Var.n();
        x4Var.v.b();
        if (x4Var.W >= arrayList.size()) {
            x4Var.W = Math.max(0, arrayList.size() - 1);
        }
        x4Var.a0 = 0.0f;
        x4Var.U.d(x4Var.l() ? 1.0f : 0.0f, true);
        x4Var.o(false);
        x4Var.requestLayout();
        x4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        return v51Var.d == v51Var2.d;
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        x4 x4Var = new x4(context, f6Var);
        x4Var.setBackground(new d2(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var)));
        return x4Var;
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        return v51Var.d == v51Var2.d;
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean isClickable() {
        return false;
    }
}
