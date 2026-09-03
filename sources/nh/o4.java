package nh;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dn0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class o4 extends dn0 {
    public n4 h;
    public final /* synthetic */ d5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(d5 d5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.n = d5Var;
    }

    @Override // org.telegram.ui.Components.dn0
    public final void a(String str) {
        n4 n4Var = this.h;
        if (n4Var != null) {
            AndroidUtilities.cancelRunOnUIThread(n4Var);
        }
        this.h = new n4(0, this, str);
        if (TextUtils.isEmpty(str)) {
            this.h.run();
        } else {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        }
        if (this.h != null) {
            d5 d5Var = this.n;
            if (d5Var.N) {
                return;
            }
            d5Var.N = true;
            d5Var.w.E();
            d5Var.x.h1(0, -d5Var.r.getPaddingTop());
        }
    }
}
