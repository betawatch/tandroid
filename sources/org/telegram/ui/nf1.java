package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class nf1 implements org.telegram.ui.Components.il0 {
    public final /* synthetic */ qf1 a;

    public nf1(qf1 qf1Var) {
        this.a = qf1Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final void f(int i10, View view) {
        qf1 qf1Var = this.a;
        ArrayList arrayList = qf1Var.d;
        if (((pf1) arrayList.get(i10)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -qf1Var.c);
            bundle.putBoolean("for_select", true);
            kf1 kf1Var = new kf1(bundle);
            kf1Var.x0 = qf1Var.e;
            kf1Var.v = new lf1(this);
            qf1Var.presentFragment(kf1Var);
        }
        if (((pf1) arrayList.get(i10)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((pf1) arrayList.get(i10)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", qf1Var.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            e11 e11Var = new e11(bundle2, null);
            e11Var.r = new mf1(this, tL_forumTopic);
            qf1Var.presentFragment(e11Var);
        }
        if (((pf1) arrayList.get(i10)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qf1Var.getParentActivity());
            alertDialog$Builder.a.O = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new lf1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            qf1Var.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
            }
        }
    }
}
