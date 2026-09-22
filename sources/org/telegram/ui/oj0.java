package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class oj0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uj0 b;

    public /* synthetic */ oj0(uj0 uj0Var, int i10) {
        this.a = i10;
        this.b = uj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                uj0 uj0Var = this.b;
                tj0 tj0Var = uj0Var.q0;
                HashSet hashSet = uj0Var.d0;
                if (hashSet.size() != 0 && tj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : uj0Var.i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    tj0Var.a(arrayList);
                    uj0Var.dismiss();
                    break;
                }
                break;
            default:
                uj0 uj0Var2 = this.b;
                uj0Var2.d0.clear();
                uj0Var2.Y.d.b(true);
                uj0Var2.U(true, false);
                break;
        }
    }
}
