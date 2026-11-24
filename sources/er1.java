// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class er1 extends su1 {
    public final /* synthetic */ mu1 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er1(mu1 mu1Var, Context context, wjb wjbVar, wp1 wp1Var, kl0 kl0Var) {
        super(context, wjbVar, wp1Var, kl0Var);
        this.M = mu1Var;
    }

    @Override // su1, android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.M.jd.s(3, i == 0, getMeasuredWidth() > 0);
    }
}
