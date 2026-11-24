// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fpa extends l7c {
    public final /* synthetic */ kpa Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpa(kpa kpaVar, r59 r59Var, Context context, int i, vh8 vh8Var, ylb ylbVar) {
        super(r59Var, context, i, 0, true, vh8Var, ylbVar);
        this.Q = kpaVar;
    }

    @Override // l7c, y59
    public final void t(u69 u69Var, int i) {
        super.t(u69Var, i);
        View view = u69Var.a;
        if (view instanceof ipa) {
            ipa ipaVar = (ipa) view;
            gpa gpaVar = ipaVar.w;
            boolean a1 = this.Q.a1(gpaVar);
            ipaVar.c.f(a1, false);
            ipaVar.r.a(a1, false);
            ipaVar.setOnClickListener(new r39(this, gpaVar, (byte) 13));
        }
    }
}
