package di;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class q9 extends y {
    public final /* synthetic */ y9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(Context context, y9 y9Var) {
        super(context);
        this.a = y9Var;
    }

    @Override // di.y, android.view.View
    public final void invalidate() {
        super.invalidate();
        p4 p4Var = this.a.G0;
        if (p4Var != null) {
            p4Var.b();
        }
    }
}
