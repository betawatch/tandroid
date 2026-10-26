package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class df1 implements org.telegram.ui.Components.zl0 {
    public final /* synthetic */ gf1 a;

    public df1(gf1 gf1Var) {
        this.a = gf1Var;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void c(int i10, View view) {
        gf1 gf1Var = this.a;
        ArrayList arrayList = gf1Var.d;
        if (((ff1) arrayList.get(i10)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -gf1Var.c);
            bundle.putBoolean("for_select", true);
            af1 af1Var = new af1(bundle);
            af1Var.A0 = gf1Var.e;
            af1Var.v = new bf1(this);
            gf1Var.presentFragment(af1Var);
        }
        if (((ff1) arrayList.get(i10)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((ff1) arrayList.get(i10)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", gf1Var.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            h11 h11Var = new h11(bundle2, null);
            h11Var.s = new cf1(this, tL_forumTopic);
            gf1Var.presentFragment(h11Var);
        }
        if (((ff1) arrayList.get(i10)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf1Var.getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bf1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            gf1Var.showDialog(e2Var);
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
            }
        }
    }
}
