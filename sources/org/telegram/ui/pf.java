package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ pf(rn rnVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = rnVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                rn rnVar = this.b;
                fi fiVar = new fi(rnVar, rnVar, rnVar.getParentActivity(), rnVar.aa, this.c);
                fiVar.setCalcMandatoryInsets(rnVar.x9());
                fiVar.setDimBehind(false);
                rnVar.A7(false);
                rnVar.showDialog(fiVar);
                break;
            default:
                rn rnVar2 = this.b;
                if (rnVar2.getParentActivity() != null && rnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.cv(rnVar2, rnVar2.getParentActivity(), rnVar2.aa, this.c).show();
                    rnVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
