package bi;

import ai.d9;
import android.content.Context;
import org.telegram.ui.Components.jx0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class m extends t {
    public final /* synthetic */ u v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(u uVar, Context context) {
        super(uVar, context);
        this.v = uVar;
    }

    @Override // bi.t, s4.h0
    public final void l() {
        super.l();
        u uVar = this.v;
        if (uVar.r.getVisibility() == 0) {
            uVar.w.l();
        }
        jx0 jx0Var = uVar.y;
        if (jx0Var != null) {
            d9 d9Var = this.e;
            jx0Var.e(d9Var != null && d9Var.k(), true);
        }
    }
}
