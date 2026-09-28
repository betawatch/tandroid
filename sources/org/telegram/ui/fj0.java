package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fj0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kj0 b;

    public /* synthetic */ fj0(kj0 kj0Var, int i10) {
        this.a = i10;
        this.b = kj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                kj0 kj0Var = this.b;
                jj0 jj0Var = kj0Var.q0;
                HashSet hashSet = kj0Var.d0;
                if (hashSet.size() != 0 && jj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : kj0Var.i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    jj0Var.a(arrayList);
                    kj0Var.dismiss();
                    break;
                }
                break;
            default:
                kj0 kj0Var2 = this.b;
                kj0Var2.d0.clear();
                kj0Var2.Y.d.b(true);
                kj0Var2.U(true, false);
                break;
        }
    }
}
