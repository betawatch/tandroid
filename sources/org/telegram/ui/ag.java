package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                    new org.telegram.ui.Components.tv(znVar2, znVar2.getParentActivity(), znVar2.ea, this.c).show();
                    znVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
