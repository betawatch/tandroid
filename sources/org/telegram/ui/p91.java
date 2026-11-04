package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p91 implements org.telegram.ui.Components.fj0 {
    public final /* synthetic */ s91 a;

    public p91(s91 s91Var) {
        this.a = s91Var;
    }

    @Override // org.telegram.ui.Components.fj0
    public final void f(int i3, View view) {
        s91 s91Var = this.a;
        ArrayList arrayList = s91Var.d;
        if (((r91) arrayList.get(i3)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -s91Var.c);
            bundle.putBoolean("for_select", true);
            m91 m91Var = new m91(bundle);
            m91Var.B0 = s91Var.e;
            m91Var.w = new n91(this);
            s91Var.presentFragment(m91Var);
        }
        if (((r91) arrayList.get(i3)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((r91) arrayList.get(i3)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", s91Var.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            yw0 yw0Var = new yw0(bundle2, null);
            yw0Var.s = new o91(this, tL_forumTopic);
            s91Var.presentFragment(yw0Var);
        }
        if (((r91) arrayList.get(i3)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s91Var.getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131747921, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131747922, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new n91(this));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            s91Var.showDialog(s1Var);
            TextView textView = (TextView) s1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
            }
        }
    }
}
