package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ jf(cn cnVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = cnVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                cn cnVar = this.b;
                zh zhVar = new zh(cnVar, cnVar, cnVar.getParentActivity(), cnVar.za, this.c);
                boolean U9 = cnVar.U9();
                zhVar.h0 = U9;
                zhVar.n = U9;
                zhVar.o0 = false;
                cnVar.P7(false);
                cnVar.showDialog(zhVar);
                break;
            default:
                cn cnVar2 = this.b;
                if (cnVar2.getParentActivity() != null && cnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.qu(cnVar2, cnVar2.getParentActivity(), cnVar2.za, this.c).show();
                    cnVar2.P7(true);
                    break;
                }
                break;
        }
    }
}
