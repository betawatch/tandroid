package bi;

import android.content.Context;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
