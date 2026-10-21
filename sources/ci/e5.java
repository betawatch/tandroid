package ci;

import ai.pa;
import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vn0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class e5 extends vn0 {
    public pa h;
    public final /* synthetic */ u5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(u5 u5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.n = u5Var;
    }

    @Override // org.telegram.ui.Components.vn0
    public final void a(String str) {
        pa paVar = this.h;
        if (paVar != null) {
            AndroidUtilities.cancelRunOnUIThread(paVar);
        }
        this.h = new pa(17, this, str);
        if (TextUtils.isEmpty(str)) {
            this.h.run();
        } else {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        }
        if (this.h != null) {
            u5 u5Var = this.n;
            if (u5Var.Q) {
                return;
            }
            u5Var.Q = true;
            u5Var.w.E();
            u5Var.x.h1(0, -u5Var.r.getPaddingTop());
        }
    }
}
