package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ba1 implements org.telegram.ui.Components.qj0 {
    public final /* synthetic */ ea1 a;

    public ba1(ea1 ea1Var) {
        this.a = ea1Var;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void c(int i7, View view) {
        ea1 ea1Var = this.a;
        ArrayList arrayList = ea1Var.d;
        if (((da1) arrayList.get(i7)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -ea1Var.c);
            bundle.putBoolean("for_select", true);
            y91 y91Var = new y91(bundle);
            y91Var.B0 = ea1Var.e;
            y91Var.w = new z91(this);
            ea1Var.presentFragment(y91Var);
        }
        if (((da1) arrayList.get(i7)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((da1) arrayList.get(i7)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ea1Var.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            jx0 jx0Var = new jx0(bundle2, null);
            jx0Var.s = new aa1(this, tL_forumTopic);
            ea1Var.presentFragment(jx0Var);
        }
        if (((da1) arrayList.get(i7)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ea1Var.getParentActivity());
            String N0 = org.telegram.messenger.hd.N0(2131747719, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.hd.N0(2131747720, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new z91(this));
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
            ea1Var.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
            }
        }
    }
}
