package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class gj0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lj0 b;

    public /* synthetic */ gj0(lj0 lj0Var, int i10) {
        this.a = i10;
        this.b = lj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                lj0 lj0Var = this.b;
                kj0 kj0Var = lj0Var.q0;
                HashSet hashSet = lj0Var.d0;
                if (hashSet.size() != 0 && kj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : lj0Var.i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    kj0Var.a(arrayList);
                    lj0Var.dismiss();
                    break;
                }
                break;
            default:
                lj0 lj0Var2 = this.b;
                lj0Var2.d0.clear();
                lj0Var2.Y.d.b(true);
                lj0Var2.U(true, false);
                break;
        }
    }
}
