package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class og1 implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ rg1 a;

    public og1(rg1 rg1Var) {
        this.a = rg1Var;
    }

    @Override // org.telegram.ui.Components.am0
    public final void a(int i10, View view) {
        rg1 rg1Var = this.a;
        ArrayList arrayList = rg1Var.d;
        if (((qg1) arrayList.get(i10)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -rg1Var.c);
            bundle.putBoolean("for_select", true);
            lg1 lg1Var = new lg1(bundle);
            lg1Var.A0 = rg1Var.e;
            lg1Var.v = new mg1(this);
            rg1Var.presentFragment(lg1Var);
        }
        if (((qg1) arrayList.get(i10)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((qg1) arrayList.get(i10)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", rg1Var.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            c21 c21Var = new c21(bundle2, null);
            c21Var.r = new ng1(this, tL_forumTopic);
            rg1Var.presentFragment(c21Var);
        }
        if (((qg1) arrayList.get(i10)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rg1Var.getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new mg1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
            rg1Var.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
            }
        }
    }
}
