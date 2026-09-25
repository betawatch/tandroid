package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class pw implements org.telegram.ui.Components.f00 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ qy b;

    public pw(Context context, qy qyVar) {
        this.b = qyVar;
        this.a = context;
    }

    public final int a(int i10) {
        qy qyVar = this.b;
        if (qyVar.R0 == 3) {
            return 0;
        }
        if (i10 == qyVar.z0.getDefaultTabId()) {
            return qyVar.getMessagesStorage().getMainUnreadCount();
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = qyVar.getMessagesController().getDialogFilters();
        if (i10 < 0 || i10 >= dialogFilters.size()) {
            return 0;
        }
        return qyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
    }

    public final void b(float f7) {
        qy qyVar = this.b;
        if (f7 != 1.0f || qyVar.e0[1].getVisibility() == 0 || qyVar.j2) {
            if (qyVar.h3) {
                qyVar.e0[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                qyVar.e0[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * qyVar.e0[0].getMeasuredWidth()));
            } else {
                qyVar.e0[0].setTranslationX(r3.getMeasuredWidth() * f7);
                qyVar.e0[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - qyVar.e0[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                py[] pyVarArr = qyVar.e0;
                py pyVar = pyVarArr[0];
                pyVarArr[0] = pyVarArr[1];
                pyVarArr[1] = pyVar;
                pyVar.setVisibility(8);
                qy.f1(qyVar, true);
                qyVar.T4(false);
                qyVar.z0.O = false;
                qyVar.r3(qyVar.e0[0]);
                qyVar.e0[0].d.getClass();
                qyVar.e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.h00 h00Var, boolean z10) {
        int i10;
        int i11;
        qy qyVar = this.b;
        int i12 = qyVar.e0[0].h;
        int i13 = h00Var.a;
        if (i12 == i13) {
            return;
        }
        if (h00Var.f) {
            qyVar.z0.i(i13);
            i11 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
            qyVar.showDialog(new rg.j0(3, i11, this.a, qyVar, null));
            return;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = qyVar.getMessagesController().getDialogFilters();
        if (h00Var.e || ((i10 = h00Var.a) >= 0 && i10 < dialogFilters.size())) {
            py pyVar = qyVar.e0[1];
            pyVar.h = h00Var.a;
            pyVar.setVisibility(0);
            qyVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            qy.f1(qyVar, false);
            qyVar.R4(true);
            qyVar.h3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        qy qyVar = this.b;
        if (isChatlist) {
            org.telegram.ui.Components.d10.T(qyVar, dialogFilter.id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qyVar.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ow(0, this, dialogFilter));
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        qyVar.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
        }
    }
}
