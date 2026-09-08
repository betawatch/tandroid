package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class nj0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tj0 b;

    public /* synthetic */ nj0(tj0 tj0Var, int i10) {
        this.a = i10;
        this.b = tj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                tj0 tj0Var = this.b;
                sj0 sj0Var = tj0Var.q0;
                HashSet hashSet = tj0Var.d0;
                if (hashSet.size() != 0 && sj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : tj0Var.i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    sj0Var.a(arrayList);
                    tj0Var.dismiss();
                    break;
                }
                break;
            default:
                tj0 tj0Var2 = this.b;
                tj0Var2.d0.clear();
                tj0Var2.Y.d.b(true);
                tj0Var2.U(true, false);
                break;
        }
    }
}
