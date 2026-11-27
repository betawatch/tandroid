// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class lj9 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new lj9());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L10;
     */
    @Override // a8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        mj9 mj9Var = (mj9) view;
        mk0 mk0Var = (mk0) b8cVar.H;
        ii9 ii9Var = (ii9) b8cVar.I;
        ArrayList arrayList = mj9Var.E;
        mj9Var.a = mk0Var;
        mj9Var.O = ii9Var;
        mj9Var.c(mk0Var);
        if (mk0Var != null) {
            mk0 mk0Var2 = mj9Var.a;
            if (mk0Var2 != null) {
                TL_iv.PageBlock pageBlock = mk0Var2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
                }
            }
            if (mk0Var.g == null) {
                mk0Var.g = new p07();
            }
        }
        mj9Var.p();
        mj9Var.w.b();
        if (mj9Var.a0 >= arrayList.size()) {
            mj9Var.a0 = Math.max(0, arrayList.size() - 1);
        }
        mj9Var.b0 = 0.0f;
        mj9Var.V.e(true, mj9Var.n() ? 1.0f : 0.0f);
        mj9Var.q(false);
        mj9Var.requestLayout();
        mj9Var.invalidate();
    }

    @Override // a8c
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.d == b8cVar2.d;
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        mj9 mj9Var = new mj9(context, vnbVar);
        mj9Var.setBackground(new vg9(aob.v0(aob.d6, vnbVar)));
        return mj9Var;
    }

    @Override // a8c
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.d == b8cVar2.d;
    }

    @Override // a8c
    public final boolean f() {
        return false;
    }
}
