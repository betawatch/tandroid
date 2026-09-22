package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ag(zn znVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = znVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                zn znVar = this.b;
                pi piVar = new pi(znVar, znVar, znVar.getParentActivity(), znVar.ea, this.c);
                piVar.setCalcMandatoryInsets(znVar.x9());
                piVar.setDimBehind(false);
                znVar.A7(false);
                znVar.showDialog(piVar);
                break;
            default:
                zn znVar2 = this.b;
                if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.tv(znVar2, znVar2.getParentActivity(), znVar2.ea, this.c).show();
                    znVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
