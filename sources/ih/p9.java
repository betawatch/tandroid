package ih;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class p9 extends yf.r0 {
    public final /* synthetic */ q9 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(q9 q9Var, Context context, float f10) {
        super(context, f10);
        this.M = q9Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.M.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
