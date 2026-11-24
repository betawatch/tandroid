// default package

import android.content.Context;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
