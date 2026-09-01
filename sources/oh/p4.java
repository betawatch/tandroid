package oh;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fn0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class p4 extends fn0 {
    public z1 h;
    public final /* synthetic */ e5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(e5 e5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.n = e5Var;
    }

    @Override // org.telegram.ui.Components.fn0
    public final void a(String str) {
        z1 z1Var = this.h;
        if (z1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(z1Var);
        }
        this.h = new z1(3, this, str);
        if (TextUtils.isEmpty(str)) {
            this.h.run();
        } else {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        }
        if (this.h != null) {
            e5 e5Var = this.n;
            if (e5Var.N) {
                return;
            }
            e5Var.N = true;
            e5Var.w.E();
            e5Var.x.h1(0, -e5Var.r.getPaddingTop());
        }
    }
}
