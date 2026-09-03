package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ej0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jj0 b;

    public /* synthetic */ ej0(jj0 jj0Var, int i10) {
        this.a = i10;
        this.b = jj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                jj0 jj0Var = this.b;
                ij0 ij0Var = jj0Var.n0;
                HashSet hashSet = jj0Var.a0;
                if (hashSet.size() != 0 && ij0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : jj0Var.f0.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    ij0Var.a(arrayList);
                    jj0Var.dismiss();
                    break;
                }
                break;
            default:
                jj0 jj0Var2 = this.b;
                jj0Var2.a0.clear();
                jj0Var2.V.d.b(true);
                jj0Var2.U(true, false);
                break;
        }
    }
}
