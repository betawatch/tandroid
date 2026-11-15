package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class a81 implements View.OnClickListener {
    public final /* synthetic */ jf0 a;
    public final /* synthetic */ an b;
    public final /* synthetic */ org.telegram.ui.Components.uj0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.m60 e;
    public final /* synthetic */ org.telegram.ui.Components.m60 f;
    public final /* synthetic */ e81 h;

    public a81(e81 e81Var, jf0 jf0Var, an anVar, org.telegram.ui.Components.uj0 uj0Var, LinearLayout linearLayout, org.telegram.ui.Components.m60 m60Var, org.telegram.ui.Components.m60 m60Var2) {
        this.h = e81Var;
        this.a = jf0Var;
        this.b = anVar;
        this.c = uj0Var;
        this.d = linearLayout;
        this.e = m60Var;
        this.f = m60Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jf0 jf0Var = this.a;
        ArrayList arrayList = jf0Var.b;
        ArrayList arrayList2 = jf0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        e81 e81Var = this.h;
        an anVar = this.b;
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
            anVar.presentFragment(new ProfileActivity(bundle, null));
            e81Var.c(false);
            return;
        }
        if (org.telegram.messenger.gz.c1 > 0 && anVar.m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
            org.telegram.ui.Components.xb t6 = new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(e81Var.getContext()), e81Var.a).t(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748488, null)), null);
            anVar.C1 = t6;
            t6.j = 4000;
            t6.j();
            org.telegram.messenger.gz.S(org.telegram.messenger.gz.c1 - 1);
        }
        org.telegram.ui.Components.uj0 uj0Var = this.c;
        uj0Var.requestLayout();
        this.d.requestLayout();
        uj0Var.getAdapter().f();
        this.e.K(this.f);
    }
}
