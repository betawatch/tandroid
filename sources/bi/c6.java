package bi;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wm0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class c6 extends wm0 {
    public a1.e h;
    public final /* synthetic */ s6 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(s6 s6Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.n = s6Var;
    }

    @Override // org.telegram.ui.Components.wm0
    public final void a(String str) {
        a1.e eVar = this.h;
        if (eVar != null) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
        }
        this.h = new a1.e(22, this, str);
        if (TextUtils.isEmpty(str)) {
            this.h.run();
        } else {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        }
        if (this.h != null) {
            s6 s6Var = this.n;
            if (s6Var.Q) {
                return;
            }
            s6Var.Q = true;
            s6Var.w.E();
            s6Var.x.h1(0, -s6Var.r.getPaddingTop());
        }
    }
}
