package di;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.Components.fl0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class w4 extends fl0 {
    public z0 f;
    public final /* synthetic */ l5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(l5 l5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = l5Var;
    }

    @Override // org.telegram.ui.Components.fl0
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
