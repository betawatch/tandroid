package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ug0 b;

    public /* synthetic */ pg0(ug0 ug0Var, int i7) {
        this.a = i7;
        this.b = ug0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ug0 ug0Var = this.b;
                tg0 tg0Var = ug0Var.m2;
                HashSet hashSet = ug0Var.Z1;
                if (hashSet.size() != 0 && tg0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : ug0Var.e2.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    tg0Var.a(arrayList);
                    ug0Var.dismiss();
                    break;
                }
                break;
            default:
                ug0 ug0Var2 = this.b;
                ug0Var2.Z1.clear();
                ug0Var2.U1.d.b(true);
                ug0Var2.h1(true, false);
                break;
        }
    }
}
