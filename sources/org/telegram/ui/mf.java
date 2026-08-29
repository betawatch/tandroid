package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ mf(tn tnVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = tnVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                tn tnVar = this.b;
                gi giVar = new gi(tnVar, tnVar, tnVar.getParentActivity(), tnVar.aa, this.c);
                giVar.setCalcMandatoryInsets(tnVar.x9());
                giVar.setDimBehind(false);
                tnVar.A7(false);
                tnVar.showDialog(giVar);
                break;
            default:
                tn tnVar2 = this.b;
                if (tnVar2.getParentActivity() != null && tnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.jv(tnVar2, tnVar2.getParentActivity(), tnVar2.aa, this.c).show();
                    tnVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
