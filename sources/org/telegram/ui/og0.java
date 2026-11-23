package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class og0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tg0 b;

    public /* synthetic */ og0(tg0 tg0Var, int i7) {
        this.a = i7;
        this.b = tg0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                tg0 tg0Var = this.b;
                sg0 sg0Var = tg0Var.m2;
                HashSet hashSet = tg0Var.Z1;
                if (hashSet.size() != 0 && sg0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : tg0Var.e2.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    sg0Var.a(arrayList);
                    tg0Var.dismiss();
                    break;
                }
                break;
            default:
                tg0 tg0Var2 = this.b;
                tg0Var2.Z1.clear();
                tg0Var2.U1.d.b(true);
                tg0Var2.h1(true, false);
                break;
        }
    }
}
