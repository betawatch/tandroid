package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ hf(bn bnVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                bn bnVar = this.b;
                wh whVar = new wh(bnVar, bnVar, bnVar.getParentActivity(), bnVar.Ba, this.c);
                boolean V9 = bnVar.V9();
                whVar.i0 = V9;
                whVar.n = V9;
                whVar.p0 = false;
                bnVar.P7(false);
                bnVar.showDialog(whVar);
                break;
            default:
                bn bnVar2 = this.b;
                if (bnVar2.getParentActivity() != null && bnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.bv(bnVar2, bnVar2.getParentActivity(), bnVar2.Ba, this.c).show();
                    bnVar2.P7(true);
                    break;
                }
                break;
        }
    }
}
