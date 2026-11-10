package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ca1 implements org.telegram.ui.Components.bj0 {
    public final /* synthetic */ fa1 a;

    public ca1(fa1 fa1Var) {
        this.a = fa1Var;
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        fa1 fa1Var = this.a;
        ArrayList arrayList = fa1Var.d;
        if (((ea1) arrayList.get(i7)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -fa1Var.c);
            bundle.putBoolean("for_select", true);
            z91 z91Var = new z91(bundle);
            z91Var.A0 = fa1Var.e;
            z91Var.w = new aa1(this);
            fa1Var.presentFragment(z91Var);
        }
        if (((ea1) arrayList.get(i7)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((ea1) arrayList.get(i7)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", fa1Var.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            lx0 lx0Var = new lx0(bundle2, null);
            lx0Var.s = new ba1(this, tL_forumTopic);
            fa1Var.presentFragment(lx0Var);
        }
        if (((ea1) arrayList.get(i7)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fa1Var.getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131747913, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131747914, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new aa1(this));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            fa1Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
            }
        }
    }
}
