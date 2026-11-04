package ei;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.Components.il0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v4 extends il0 {
    public b0 f;
    public final /* synthetic */ k5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(k5 k5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = k5Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final void a(String str) {
        b0 b0Var = this.f;
        if (b0Var != null) {
            org.telegram.messenger.g0.r(b0Var);
        }
        this.f = new b0(8, this, str);
        if (TextUtils.isEmpty(str)) {
            this.f.run();
        } else {
            org.telegram.messenger.g0.i3(this.f, 300L);
        }
        if (this.f != null) {
            k5 k5Var = this.h;
            if (k5Var.R) {
                return;
            }
            k5Var.R = true;
            k5Var.x.E();
            k5Var.y.h1(0, -k5Var.r.getPaddingTop());
        }
    }
}
