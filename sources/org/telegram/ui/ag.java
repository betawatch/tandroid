package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                oi oiVar = new oi(znVar, znVar, znVar.getParentActivity(), znVar.ea, this.c);
                oiVar.setCalcMandatoryInsets(znVar.x9());
                oiVar.setDimBehind(false);
                znVar.A7(false);
                znVar.showDialog(oiVar);
                break;
            default:
                zn znVar2 = this.b;
                if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.sv(znVar2, znVar2.getParentActivity(), znVar2.ea, this.c).show();
                    znVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
