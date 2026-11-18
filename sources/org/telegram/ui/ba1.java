package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ba1 implements org.telegram.ui.Components.oj0 {
    public final /* synthetic */ ea1 a;

    public ba1(ea1 ea1Var) {
        this.a = ea1Var;
    }

    @Override // org.telegram.ui.Components.oj0
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
            String M0 = org.telegram.messenger.gd.M0(2131747720, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.gd.M0(2131747721, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new z91(this));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            ea1Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
            }
        }
    }
}
