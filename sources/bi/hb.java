package bi;

import android.content.Context;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final class hb extends d0 {
    public final /* synthetic */ pb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(Context context, pb pbVar) {
        super(context);
        this.a = pbVar;
    }

    @Override // bi.d0, android.view.View
    public final void invalidate() {
        super.invalidate();
        n5 n5Var = this.a.G0;
        if (n5Var != null) {
            n5Var.b();
        }
    }
}
