package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ng1 implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ qg1 a;

    public ng1(qg1 qg1Var) {
        this.a = qg1Var;
    }

    @Override // org.telegram.ui.Components.am0
    public final void a(int i10, View view) {
        qg1 qg1Var = this.a;
        ArrayList arrayList = qg1Var.d;
        if (((pg1) arrayList.get(i10)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -qg1Var.c);
            bundle.putBoolean("for_select", true);
            kg1 kg1Var = new kg1(bundle);
            kg1Var.A0 = qg1Var.e;
            kg1Var.v = new lg1(this);
            qg1Var.presentFragment(kg1Var);
        }
        if (((pg1) arrayList.get(i10)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((pg1) arrayList.get(i10)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", qg1Var.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            c21 c21Var = new c21(bundle2, null);
            c21Var.r = new mg1(this, tL_forumTopic);
            qg1Var.presentFragment(c21Var);
        }
        if (((pg1) arrayList.get(i10)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qg1Var.getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new lg1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
            qg1Var.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
            }
        }
    }
}
