package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cf1 implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ ff1 a;

    public cf1(ff1 ff1Var) {
        this.a = ff1Var;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void c(int i10, View view) {
        ff1 ff1Var = this.a;
        ArrayList arrayList = ff1Var.d;
        if (((ef1) arrayList.get(i10)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -ff1Var.c);
            bundle.putBoolean("for_select", true);
            ze1 ze1Var = new ze1(bundle);
            ze1Var.w0 = ff1Var.e;
            ze1Var.v = new af1(this);
            ff1Var.presentFragment(ze1Var);
        }
        if (((ef1) arrayList.get(i10)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((ef1) arrayList.get(i10)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ff1Var.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            t01 t01Var = new t01(bundle2, null);
            t01Var.r = new bf1(this, tL_forumTopic);
            ff1Var.presentFragment(t01Var);
        }
        if (((ef1) arrayList.get(i10)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ff1Var.getParentActivity());
            alertDialog$Builder.a.N = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new af1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            ff1Var.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
            }
        }
    }
}
