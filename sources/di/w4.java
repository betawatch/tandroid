package di;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.Components.el0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w4 extends el0 {
    public z0 f;
    public final /* synthetic */ l5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(l5 l5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = l5Var;
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
            l5 l5Var = this.h;
            if (l5Var.Q) {
                return;
            }
            l5Var.Q = true;
            l5Var.x.E();
            l5Var.y.h1(0, -l5Var.r.getPaddingTop());
        }
    }
}
