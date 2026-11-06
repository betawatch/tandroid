package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ hf(an anVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                an anVar = this.b;
                xh xhVar = new xh(anVar, anVar, anVar.getParentActivity(), anVar.xa, this.c);
                boolean T9 = anVar.T9();
                xhVar.h0 = T9;
                xhVar.n = T9;
                xhVar.o0 = false;
                anVar.O7(false);
                anVar.showDialog(xhVar);
                break;
            default:
                an anVar2 = this.b;
                if (anVar2.getParentActivity() != null && anVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.qu(anVar2, anVar2.getParentActivity(), anVar2.xa, this.c).show();
                    anVar2.O7(true);
                    break;
                }
                break;
        }
    }
}
