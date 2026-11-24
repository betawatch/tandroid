// default package

import android.content.Context;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gda extends FragmentContextView {
    public final /* synthetic */ nfa X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gda(nfa nfaVar, Context context, d dVar, nfa nfaVar2, wjb wjbVar) {
        super(context, dVar, nfaVar2, false, wjbVar);
        this.X0 = nfaVar;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i) {
        nfa nfaVar = this.X0;
        nfaVar.S0.j(nfaVar.T0, i == 0, true);
    }
}
