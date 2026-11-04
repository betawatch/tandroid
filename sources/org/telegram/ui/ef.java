package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ef(wm wmVar, ArrayList arrayList, int i3) {
        this.a = i3;
        this.b = wmVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wm wmVar = this.b;
                th thVar = new th(wmVar, wmVar, wmVar.getParentActivity(), wmVar.ya, this.c);
                boolean T9 = wmVar.T9();
                thVar.i0 = T9;
                thVar.n = T9;
                thVar.p0 = false;
                wmVar.O7(false);
                wmVar.showDialog(thVar);
                break;
            default:
                wm wmVar2 = this.b;
                if (wmVar2.getParentActivity() != null && wmVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.pu(wmVar2, wmVar2.getParentActivity(), wmVar2.ya, this.c).show();
                    wmVar2.O7(true);
                    break;
                }
                break;
        }
    }
}
