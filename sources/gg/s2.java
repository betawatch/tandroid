package gg;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s2 extends ph.d {
    public final /* synthetic */ v2 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(v2 v2Var, Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.e0 = v2Var;
    }

    @Override // ph.d
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
