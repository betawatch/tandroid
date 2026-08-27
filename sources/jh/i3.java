package jh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.vj0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class i3 implements vj0 {
    public final /* synthetic */ e4 a;

    public i3(e4 e4Var) {
        this.a = e4Var;
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.vj0
    public final boolean m() {
        ((z8) this.a.M1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.vj0
    public final void n(View view, ig.q0 q0Var, boolean z10, boolean z11) {
        j3.m mVar = new j3.m(this, q0Var, view, 2);
        if (z10) {
            mVar.run();
        } else {
            this.a.n0(mVar);
        }
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ void r(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z10) {
    }
}
