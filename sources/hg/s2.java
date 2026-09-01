package hg;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class s2 extends qh.d {
    public final /* synthetic */ v2 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(v2 v2Var, Context context, g6 g6Var) {
        super(context, g6Var, true);
        this.e0 = v2Var;
    }

    @Override // qh.d
    public final float a(float f10, float f11) {
        v2 v2Var = this.e0;
        boolean z4 = v2Var.q0 == 0.0f;
        v2Var.q0 = f10;
        if (z4) {
            v2Var.r0 = new o2(v2Var, 0);
            v2Var.g0(false);
        }
        return f10;
    }
}
