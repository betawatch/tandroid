package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ fg(fo foVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = foVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                fo foVar = this.b;
                ui uiVar = new ui(foVar, foVar, foVar.getParentActivity(), foVar.ea, this.c);
                uiVar.setCalcMandatoryInsets(foVar.C9());
                uiVar.setDimBehind(false);
                foVar.D7(false);
                foVar.showDialog(uiVar);
                break;
            default:
                fo foVar2 = this.b;
                if (foVar2.getParentActivity() != null && foVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.ew(foVar2, foVar2.getParentActivity(), foVar2.ea, this.c).show();
                    foVar2.D7(true);
                    break;
                }
                break;
        }
    }
}
