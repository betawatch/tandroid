package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ag(eo eoVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = eoVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                eo eoVar = this.b;
                ri riVar = new ri(eoVar, eoVar, eoVar.getParentActivity(), eoVar.ea, this.c);
                riVar.setCalcMandatoryInsets(eoVar.x9());
                riVar.setDimBehind(false);
                eoVar.A7(false);
                eoVar.showDialog(riVar);
                break;
            default:
                eo eoVar2 = this.b;
                if (eoVar2.getParentActivity() != null && eoVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.wv(eoVar2, eoVar2.getParentActivity(), eoVar2.ea, this.c).show();
                    eoVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
