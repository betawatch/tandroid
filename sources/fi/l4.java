package fi;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class l4 extends rl0 {
    public di.w2 f;
    public final /* synthetic */ a5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(a5 a5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = a5Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final void a(String str) {
        di.w2 w2Var = this.f;
        if (w2Var != null) {
            org.telegram.messenger.g0.r(w2Var);
        }
        this.f = new di.w2(28, this, str);
        if (TextUtils.isEmpty(str)) {
            this.f.run();
        } else {
            org.telegram.messenger.g0.h3(this.f, 300L);
        }
        if (this.f != null) {
            a5 a5Var = this.h;
            if (a5Var.R) {
                return;
            }
            a5Var.R = true;
            a5Var.x.E();
            a5Var.y.h1(0, -a5Var.r.getPaddingTop());
        }
    }
}
