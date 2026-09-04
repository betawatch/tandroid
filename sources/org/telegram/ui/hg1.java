package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class hg1 implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ kg1 a;

    public hg1(kg1 kg1Var) {
        this.a = kg1Var;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void a(int i10, View view) {
        kg1 kg1Var = this.a;
        ArrayList arrayList = kg1Var.d;
        if (((jg1) arrayList.get(i10)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -kg1Var.c);
            bundle.putBoolean("for_select", true);
            eg1 eg1Var = new eg1(bundle);
            eg1Var.A0 = kg1Var.e;
            eg1Var.v = new fg1(this);
            kg1Var.presentFragment(eg1Var);
        }
        if (((jg1) arrayList.get(i10)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((jg1) arrayList.get(i10)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", kg1Var.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            y11 y11Var = new y11(bundle2, null);
            y11Var.r = new gg1(this, tL_forumTopic);
            kg1Var.presentFragment(y11Var);
        }
        if (((jg1) arrayList.get(i10)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kg1Var.getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new fg1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            kg1Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
            }
        }
    }
}
