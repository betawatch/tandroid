package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class pf1 implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ sf1 a;

    public pf1(sf1 sf1Var) {
        this.a = sf1Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void f(int i10, View view) {
        sf1 sf1Var = this.a;
        ArrayList arrayList = sf1Var.d;
        if (((rf1) arrayList.get(i10)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -sf1Var.c);
            bundle.putBoolean("for_select", true);
            mf1 mf1Var = new mf1(bundle);
            mf1Var.x0 = sf1Var.e;
            mf1Var.v = new nf1(this);
            sf1Var.presentFragment(mf1Var);
        }
        if (((rf1) arrayList.get(i10)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((rf1) arrayList.get(i10)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", sf1Var.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            g11 g11Var = new g11(bundle2, null);
            g11Var.r = new of1(this, tL_forumTopic);
            sf1Var.presentFragment(g11Var);
        }
        if (((rf1) arrayList.get(i10)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sf1Var.getParentActivity());
            alertDialog$Builder.a.O = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nf1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            sf1Var.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
            }
        }
    }
}
