package lh;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.um0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class n4 extends um0 {
    public r3 h;
    public final /* synthetic */ c5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(c5 c5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.n = c5Var;
    }

    @Override // org.telegram.ui.Components.um0
    public final void a(String str) {
        r3 r3Var = this.h;
        if (r3Var != null) {
            AndroidUtilities.cancelRunOnUIThread(r3Var);
        }
        this.h = new r3(1, this, str);
        if (TextUtils.isEmpty(str)) {
            this.h.run();
        } else {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        }
        if (this.h != null) {
            c5 c5Var = this.n;
            if (c5Var.M) {
                return;
            }
            c5Var.M = true;
            c5Var.w.E();
            c5Var.x.h1(0, -c5Var.r.getPaddingTop());
        }
    }
}
