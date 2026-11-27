// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class o42 extends y46 {
    public final /* synthetic */ q22 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o42(q22 q22Var, Context context) {
        super(context);
        this.r = q22Var;
    }

    @Override // y46
    public final int k(int i, View view) {
        int k = super.k(i, view);
        s42 s42Var = (s42) this.r.V;
        return k - (s42Var.M.getPaddingTop() - (s42Var.r0 - s42Var.q0));
    }

    @Override // y46
    public final int m(int i) {
        return super.m(i) << 2;
    }
}
