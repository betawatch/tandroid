package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class bf1 implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ ef1 a;

    public bf1(ef1 ef1Var) {
        this.a = ef1Var;
    }

    @Override // org.telegram.ui.Components.am0
    public final void d(int i10, View view) {
        ef1 ef1Var = this.a;
        ArrayList arrayList = ef1Var.d;
        if (((df1) arrayList.get(i10)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -ef1Var.c);
            bundle.putBoolean("for_select", true);
            ye1 ye1Var = new ye1(bundle);
            ye1Var.A0 = ef1Var.e;
            ye1Var.v = new ze1(this);
            ef1Var.presentFragment(ye1Var);
        }
        if (((df1) arrayList.get(i10)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((df1) arrayList.get(i10)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ef1Var.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            d11 d11Var = new d11(bundle2, null);
            d11Var.r = new af1(this, tL_forumTopic);
            ef1Var.presentFragment(d11Var);
        }
        if (((df1) arrayList.get(i10)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ef1Var.getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ze1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            ef1Var.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
            }
        }
    }
}
