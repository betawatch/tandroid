package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ff implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ff(an anVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                an anVar = this.b;
                xh xhVar = new xh(anVar, anVar, anVar.getParentActivity(), anVar.Aa, this.c);
                boolean V9 = anVar.V9();
                xhVar.i0 = V9;
                xhVar.n = V9;
                xhVar.p0 = false;
                anVar.P7(false);
                anVar.showDialog(xhVar);
                break;
            default:
                an anVar2 = this.b;
                if (anVar2.getParentActivity() != null && anVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.wu(anVar2, anVar2.getParentActivity(), anVar2.Aa, this.c).show();
                    anVar2.P7(true);
                    break;
                }
                break;
        }
    }
}
