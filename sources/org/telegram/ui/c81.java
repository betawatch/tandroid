package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class c81 implements View.OnClickListener {
    public final /* synthetic */ lf0 a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ org.telegram.ui.Components.ek0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.x60 e;
    public final /* synthetic */ org.telegram.ui.Components.x60 f;
    public final /* synthetic */ g81 h;

    public c81(g81 g81Var, lf0 lf0Var, bn bnVar, org.telegram.ui.Components.ek0 ek0Var, LinearLayout linearLayout, org.telegram.ui.Components.x60 x60Var, org.telegram.ui.Components.x60 x60Var2) {
        this.h = g81Var;
        this.a = lf0Var;
        this.b = bnVar;
        this.c = ek0Var;
        this.d = linearLayout;
        this.e = x60Var;
        this.f = x60Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lf0 lf0Var = this.a;
        ArrayList arrayList = lf0Var.b;
        ArrayList arrayList2 = lf0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        g81 g81Var = this.h;
        bn bnVar = this.b;
        if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
            TLObject tLObject = (TLObject) arrayList2.get(0);
            if (tLObject == null) {
                return;
            }
            Bundle bundle = new Bundle();
            if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
            } else if (tLObject instanceof TLRPC.Chat) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
            }
            bnVar.presentFragment(new ProfileActivity(bundle, null));
            g81Var.c(false);
            return;
        }
        if (org.telegram.messenger.bz.c1 > 0 && bnVar.m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
            org.telegram.ui.Components.fc t6 = new org.telegram.ui.Components.kc(org.telegram.ui.Components.bb.a(g81Var.getContext()), g81Var.a).t(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131748295, null)), null);
            bnVar.C1 = t6;
            t6.j = 4000;
            t6.j();
            org.telegram.messenger.bz.S(org.telegram.messenger.bz.c1 - 1);
        }
        org.telegram.ui.Components.ek0 ek0Var = this.c;
        ek0Var.requestLayout();
        this.d.requestLayout();
        ek0Var.getAdapter().f();
        this.e.L(this.f);
    }
}
