package ih;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hm0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class r4 extends hm0 {
    public h3.g0 h;
    public final /* synthetic */ g5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(g5 g5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.n = g5Var;
    }

    @Override // org.telegram.ui.Components.hm0
    public final void a(String str) {
        h3.g0 g0Var = this.h;
        if (g0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g0Var);
        }
        this.h = new h3.g0(15, this, str);
        if (TextUtils.isEmpty(str)) {
            this.h.run();
        } else {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        }
        if (this.h != null) {
            g5 g5Var = this.n;
            if (g5Var.M) {
                return;
            }
            g5Var.M = true;
            g5Var.w.E();
            g5Var.x.h1(0, -g5Var.r.getPaddingTop());
        }
    }
}
