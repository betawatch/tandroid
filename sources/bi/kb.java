package bi;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class kb extends d0 {
    public final /* synthetic */ sb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(Context context, sb sbVar) {
        super(context);
        this.a = sbVar;
    }

    @Override // bi.d0, android.view.View
    public final void invalidate() {
        super.invalidate();
        p5 p5Var = this.a.G0;
        if (p5Var != null) {
            p5Var.b();
        }
    }
}
