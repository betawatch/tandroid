// default package

import android.content.Context;
import android.widget.TextView;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class cga extends eu8 {
    public final /* synthetic */ eja W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cga(eja ejaVar, e eVar, Context context, int i, long j, vnb vnbVar, ll0 ll0Var) {
        super(eVar, context, i, j, vnbVar, ll0Var);
        this.W = ejaVar;
    }

    @Override // eu8
    public final void q(boolean z) {
        eja ejaVar = this.W;
        TextView textView = ejaVar.t0;
        textView.setVisibility(0);
        textView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.4f).scaleY(z ? 1.0f : 0.4f).withEndAction(new q38((byte) 13, (Object) this, z)).start();
        ejaVar.G1(true);
        ejaVar.Q0();
    }
}
