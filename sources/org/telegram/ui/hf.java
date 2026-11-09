package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ hf(cn cnVar, ArrayList arrayList, int i7) {
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
                    new org.telegram.ui.Components.ru(cnVar2, cnVar2.getParentActivity(), cnVar2.za, this.c).show();
                    cnVar2.P7(true);
                    break;
                }
                break;
        }
    }
}
