// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hp1 extends i92 {
    public final /* synthetic */ mu1 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp1(mu1 mu1Var, Activity activity, int i, TLRPC.Document document, wjb wjbVar) {
        super(activity, i, document, wjbVar);
        this.N = mu1Var;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float y = getY();
        mu1 mu1Var = this.N;
        float y2 = mu1Var.g1.getY() + y;
        this.K = mu1Var.m1.getBackgroundSizeY();
        this.J = y2;
    }
}
