package eg;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t2 extends nh.d {
    public final /* synthetic */ w2 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(w2 w2Var, Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.d0 = w2Var;
    }

    @Override // nh.d
    public final float a(float f9, float f10) {
        w2 w2Var = this.d0;
        boolean z10 = w2Var.p0 == 0.0f;
        w2Var.p0 = f9;
        if (z10) {
            w2Var.q0 = new p2(w2Var, 0);
            w2Var.g0(false);
        }
        return f9;
    }
}
