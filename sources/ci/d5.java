package ci;

import ai.pa;
import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.un0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class d5 extends un0 {
    public pa h;
    public final /* synthetic */ t5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(t5 t5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.n = t5Var;
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
            t5 t5Var = this.n;
            if (t5Var.Q) {
                return;
            }
            t5Var.Q = true;
            t5Var.w.E();
            t5Var.x.h1(0, -t5Var.r.getPaddingTop());
        }
    }
}
