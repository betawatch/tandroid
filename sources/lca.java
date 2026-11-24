// default package

import android.content.Context;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class lca extends tq8 {
    public final /* synthetic */ nfa W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lca(nfa nfaVar, d dVar, Context context, int i, long j, wjb wjbVar, kl0 kl0Var) {
        super(dVar, context, i, j, wjbVar, kl0Var);
        this.W = nfaVar;
    }

    @Override // tq8
    public final void q(boolean z) {
        nfa nfaVar = this.W;
        TextView textView = nfaVar.t0;
        textView.setVisibility(0);
        textView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.4f).scaleY(z ? 1.0f : 0.4f).withEndAction(new k08((byte) 13, (Object) this, z)).start();
        nfaVar.G1(true);
        nfaVar.Q0();
    }
}
