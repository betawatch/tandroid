package ai;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jn0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class t6 extends jn0 {
    public a1.e h;
    public final /* synthetic */ k7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(k7 k7Var, Context context, d dVar) {
        super(context, 13.0f, dVar);
        this.n = k7Var;
    }

    @Override // org.telegram.ui.Components.jn0
    public final void a(String str) {
        a1.e eVar = this.h;
        if (eVar != null) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
        }
        this.h = new a1.e(13, this, str);
        if (TextUtils.isEmpty(str)) {
            this.h.run();
        } else {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        }
        if (this.h != null) {
            k7 k7Var = this.n;
            if (k7Var.Q) {
                return;
            }
            k7Var.Q = true;
            k7Var.w.E();
            k7Var.x.h1(0, -k7Var.r.getPaddingTop());
        }
    }
}
