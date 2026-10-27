package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ff1 implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ if1 a;

    public ff1(if1 if1Var) {
        this.a = if1Var;
    }

    @Override // org.telegram.ui.Components.am0
    public final void c(int i10, View view) {
        if1 if1Var = this.a;
        ArrayList arrayList = if1Var.d;
        if (((hf1) arrayList.get(i10)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -if1Var.c);
            bundle.putBoolean("for_select", true);
            cf1 cf1Var = new cf1(bundle);
            cf1Var.A0 = if1Var.e;
            cf1Var.v = new df1(this);
            if1Var.presentFragment(cf1Var);
        }
        if (((hf1) arrayList.get(i10)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((hf1) arrayList.get(i10)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", if1Var.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            j11 j11Var = new j11(bundle2, null);
            j11Var.s = new ef1(this, tL_forumTopic);
            if1Var.presentFragment(j11Var);
        }
        if (((hf1) arrayList.get(i10)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(if1Var.getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new df1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            if1Var.showDialog(e2Var);
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
            }
        }
    }
}
