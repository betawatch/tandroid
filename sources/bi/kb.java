package bi;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
