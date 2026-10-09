package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                qi qiVar = new qi(znVar, znVar, znVar.getParentActivity(), znVar.ea, this.c);
                qiVar.setCalcMandatoryInsets(znVar.C9());
                qiVar.setDimBehind(false);
                znVar.D7(false);
                znVar.showDialog(qiVar);
                break;
            default:
                zn znVar2 = this.b;
                if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.iw(znVar2, znVar2.getParentActivity(), znVar2.ea, this.c).show();
                    znVar2.D7(true);
                    break;
                }
                break;
        }
    }
}
