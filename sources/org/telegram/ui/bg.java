package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ bg(bo boVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = boVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                bo boVar = this.b;
                qi qiVar = new qi(boVar, boVar, boVar.getParentActivity(), boVar.ea, this.c);
                qiVar.setCalcMandatoryInsets(boVar.x9());
                qiVar.setDimBehind(false);
                boVar.A7(false);
                boVar.showDialog(qiVar);
                break;
            default:
                bo boVar2 = this.b;
                if (boVar2.getParentActivity() != null && boVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.sv(boVar2, boVar2.getParentActivity(), boVar2.ea, this.c).show();
                    boVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
