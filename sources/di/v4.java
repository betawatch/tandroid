package di;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.Components.el0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class v4 extends el0 {
    public z0 f;
    public final /* synthetic */ k5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(k5 k5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = k5Var;
    }

    @Override // org.telegram.ui.Components.el0
    public final void a(String str) {
        z0 z0Var = this.f;
        if (z0Var != null) {
            org.telegram.messenger.g0.r(z0Var);
        }
        this.f = new z0(5, this, str);
        if (TextUtils.isEmpty(str)) {
            this.f.run();
        } else {
            org.telegram.messenger.g0.i3(this.f, 300L);
        }
        if (this.f != null) {
            k5 k5Var = this.h;
            if (k5Var.Q) {
                return;
            }
            k5Var.Q = true;
            k5Var.x.E();
            k5Var.y.h1(0, -k5Var.r.getPaddingTop());
        }
    }
}
