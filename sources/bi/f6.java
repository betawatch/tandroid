package bi;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yn0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class f6 extends yn0 {
    public a1.f h;
    public final /* synthetic */ w6 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(w6 w6Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.n = w6Var;
    }

    @Override // org.telegram.ui.Components.yn0
    public final void a(String str) {
        a1.f fVar = this.h;
        if (fVar != null) {
            AndroidUtilities.cancelRunOnUIThread(fVar);
        }
        this.h = new a1.f(24, this, str);
        if (TextUtils.isEmpty(str)) {
            this.h.run();
        } else {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        }
        if (this.h != null) {
            w6 w6Var = this.n;
            if (w6Var.Q) {
                return;
            }
            w6Var.Q = true;
            w6Var.w.E();
            w6Var.x.h1(0, -w6Var.r.getPaddingTop());
        }
    }
}
