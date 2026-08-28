package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ pf(qn qnVar, ArrayList arrayList, int i9) {
        this.a = i9;
        this.b = qnVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                qn qnVar = this.b;
                di diVar = new di(qnVar, qnVar, qnVar.getParentActivity(), qnVar.aa, this.c);
                diVar.setCalcMandatoryInsets(qnVar.x9());
                diVar.setDimBehind(false);
                qnVar.A7(false);
                qnVar.showDialog(diVar);
                break;
            default:
                qn qnVar2 = this.b;
                if (qnVar2.getParentActivity() != null && qnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.dv(qnVar2, qnVar2.getParentActivity(), qnVar2.aa, this.c).show();
                    qnVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
