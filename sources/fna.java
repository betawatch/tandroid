// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fna extends l5c {
    public final /* synthetic */ kna Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fna(kna knaVar, o39 o39Var, Context context, int i, tf8 tf8Var, wjb wjbVar) {
        super(o39Var, context, i, 0, true, tf8Var, wjbVar);
        this.Q = knaVar;
    }

    @Override // l5c, w39
    public final void t(s49 s49Var, int i) {
        super.t(s49Var, i);
        View view = s49Var.a;
        if (view instanceof ina) {
            ina inaVar = (ina) view;
            gna gnaVar = inaVar.w;
            boolean a1 = this.Q.a1(gnaVar);
            inaVar.c.f(a1, false);
            inaVar.r.a(a1, false);
            inaVar.setOnClickListener(new b99(this, gnaVar, (byte) 12));
        }
    }
}
