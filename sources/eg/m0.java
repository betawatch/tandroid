package eg;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m0 implements View.OnClickListener {
    public final /* synthetic */ n0 a;

    public m0(n0 n0Var) {
        this.a = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view.getParent();
        ArrayList arrayList = new ArrayList();
        arrayList.add(nVar.getCurrentChannel());
        v0 v0Var = this.a.c;
        int i10 = v0.S0;
        v0Var.D1(arrayList);
    }
}
