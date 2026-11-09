package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sg0 b;

    public /* synthetic */ ng0(sg0 sg0Var, int i7) {
        this.a = i7;
        this.b = sg0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                sg0 sg0Var = this.b;
                rg0 rg0Var = sg0Var.i2;
                HashSet hashSet = sg0Var.V1;
                if (hashSet.size() != 0 && rg0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : sg0Var.a2.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    rg0Var.a(arrayList);
                    sg0Var.dismiss();
                    break;
                }
                break;
            default:
                sg0 sg0Var2 = this.b;
                sg0Var2.V1.clear();
                sg0Var2.Q1.d.b(true);
                sg0Var2.g1(true, false);
                break;
        }
    }
}
