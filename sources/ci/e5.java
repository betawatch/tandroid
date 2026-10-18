package ci;

import ai.pa;
import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.un0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class e5 extends un0 {
    public pa h;
    public final /* synthetic */ u5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(u5 u5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.n = u5Var;
    }

    @Override // org.telegram.ui.Components.un0
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
