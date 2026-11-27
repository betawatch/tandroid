// default package

import android.content.Context;
import android.widget.TextView;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
