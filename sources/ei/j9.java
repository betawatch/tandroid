package ei;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j9 extends y {
    public final /* synthetic */ r9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(Context context, r9 r9Var) {
        super(context);
        this.a = r9Var;
    }

    @Override // ei.y, android.view.View
    public final void invalidate() {
        super.invalidate();
        i4 i4Var = this.a.H0;
        if (i4Var != null) {
            i4Var.b();
        }
    }
}
