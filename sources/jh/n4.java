package jh;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.km0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class n4 extends km0 {
    public hh.m5 h;
    public final /* synthetic */ c5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(c5 c5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.n = c5Var;
    }

    @Override // org.telegram.ui.Components.km0
    public final void a(String str) {
        hh.m5 m5Var = this.h;
        if (m5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m5Var);
        }
        this.h = new hh.m5(24, this, str);
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
