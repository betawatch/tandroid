package fi;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.Components.jl0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n4 extends jl0 {
    public di.s2 f;
    public final /* synthetic */ c5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(c5 c5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = c5Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void a(String str) {
        di.s2 s2Var = this.f;
        if (s2Var != null) {
            org.telegram.messenger.g0.r(s2Var);
        }
        this.f = new di.s2(26, this, str);
        if (TextUtils.isEmpty(str)) {
            this.f.run();
        } else {
            org.telegram.messenger.g0.i3(this.f, 300L);
        }
        if (this.f != null) {
            c5 c5Var = this.h;
            if (c5Var.R) {
                return;
            }
            c5Var.R = true;
            c5Var.x.E();
            c5Var.y.h1(0, -c5Var.r.getPaddingTop());
        }
    }
}
