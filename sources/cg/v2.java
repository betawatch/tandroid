package cg;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v2 extends lh.d {
    public final /* synthetic */ y2 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(y2 y2Var, Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.d0 = y2Var;
    }

    @Override // lh.d
    public final float a(float f10, float f11) {
        y2 y2Var = this.d0;
        boolean z10 = y2Var.p0 == 0.0f;
        y2Var.p0 = f10;
        if (z10) {
            y2Var.q0 = new r2(y2Var, 0);
            y2Var.g0(false);
        }
        return f10;
    }
}
