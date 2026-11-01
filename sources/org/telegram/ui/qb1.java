package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qb1 implements org.telegram.ui.Components.hk0 {
    public final /* synthetic */ tb1 a;

    public qb1(tb1 tb1Var) {
        this.a = tb1Var;
    }

    @Override // org.telegram.ui.Components.hk0
    public final void f(int i10, View view) {
        tb1 tb1Var = this.a;
        ArrayList arrayList = tb1Var.d;
        if (((sb1) arrayList.get(i10)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -tb1Var.c);
            bundle.putBoolean("for_select", true);
            nb1 nb1Var = new nb1(bundle);
            nb1Var.A0 = tb1Var.e;
            nb1Var.w = new ob1(this);
            tb1Var.presentFragment(nb1Var);
        }
        if (((sb1) arrayList.get(i10)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((sb1) arrayList.get(i10)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", tb1Var.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            ty0 ty0Var = new ty0(bundle2, null);
            ty0Var.s = new pb1(this, tL_forumTopic);
            tb1Var.presentFragment(ty0Var);
        }
        if (((sb1) arrayList.get(i10)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tb1Var.getParentActivity());
            String L0 = org.telegram.messenger.dd.L0(2131747929, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.dd.L0(2131747930, null);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new ob1(this));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
            tb1Var.showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
            }
        }
    }
}
