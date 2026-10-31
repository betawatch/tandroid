package kg;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i0 implements View.OnClickListener {
    public final /* synthetic */ j0 a;

    public i0(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Cells.m mVar = (org.telegram.ui.Cells.m) view.getParent();
        ArrayList arrayList = new ArrayList();
        arrayList.add(mVar.getCurrentChannel());
        q0 q0Var = this.a.c;
        int i10 = q0.O2;
        q0Var.x1(arrayList);
    }
}
