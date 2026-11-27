// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class j39 extends tk4 {
    public final /* synthetic */ o39 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j39(o39 o39Var, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.V = o39Var;
    }

    @Override // tk4
    public final int getAdditionalHeight() {
        q37 q37Var;
        o39 o39Var = this.V;
        if (o39Var.I.isEmpty() || (q37Var = o39Var.K) == null) {
            return 0;
        }
        return hl.L(8.0f) + q37Var.getMeasuredHeight();
    }
}
