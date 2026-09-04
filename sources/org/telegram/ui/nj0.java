package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
