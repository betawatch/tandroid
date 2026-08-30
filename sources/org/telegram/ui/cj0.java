package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cj0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hj0 b;

    public /* synthetic */ cj0(hj0 hj0Var, int i10) {
        this.a = i10;
        this.b = hj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                hj0 hj0Var = this.b;
                gj0 gj0Var = hj0Var.n0;
                HashSet hashSet = hj0Var.a0;
                if (hashSet.size() != 0 && gj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : hj0Var.f0.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    gj0Var.a(arrayList);
                    hj0Var.dismiss();
                    break;
                }
                break;
            default:
                hj0 hj0Var2 = this.b;
                hj0Var2.a0.clear();
                hj0Var2.V.d.b(true);
                hj0Var2.U(true, false);
                break;
        }
    }
}
