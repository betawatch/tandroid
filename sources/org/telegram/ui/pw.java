package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class pw implements org.telegram.ui.Components.g00 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ py b;

    public pw(Context context, py pyVar) {
        this.b = pyVar;
        this.a = context;
    }

    public final int a(int i10) {
        py pyVar = this.b;
        if (pyVar.O0 == 3) {
            return 0;
        }
        if (i10 == pyVar.w0.getDefaultTabId()) {
            return pyVar.getMessagesStorage().getMainUnreadCount();
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = pyVar.getMessagesController().getDialogFilters();
        if (i10 < 0 || i10 >= dialogFilters.size()) {
            return 0;
        }
        return pyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
    }

    public final void b(float f10) {
        py pyVar = this.b;
        if (f10 != 1.0f || pyVar.b0[1].getVisibility() == 0 || pyVar.g2) {
            if (pyVar.e3) {
                pyVar.b0[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                pyVar.b0[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * pyVar.b0[0].getMeasuredWidth()));
            } else {
                pyVar.b0[0].setTranslationX(r3.getMeasuredWidth() * f10);
                pyVar.b0[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - pyVar.b0[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                oy[] oyVarArr = pyVar.b0;
                oy oyVar = oyVarArr[0];
                oyVarArr[0] = oyVarArr[1];
                oyVarArr[1] = oyVar;
                oyVar.setVisibility(8);
                py.f1(pyVar, true);
                pyVar.T4(false);
                pyVar.w0.L = false;
                pyVar.r3(pyVar.b0[0]);
                pyVar.b0[0].d.getClass();
                pyVar.b0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.i00 i00Var, boolean z4) {
        int i10;
        int i11;
        py pyVar = this.b;
        int i12 = pyVar.b0[0].h;
        int i13 = i00Var.a;
        if (i12 == i13) {
            return;
        }
        if (i00Var.f) {
            pyVar.w0.i(i13);
            i11 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
            pyVar.showDialog(new fg.v0(3, i11, this.a, pyVar, null));
            return;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = pyVar.getMessagesController().getDialogFilters();
        if (i00Var.e || ((i10 = i00Var.a) >= 0 && i10 < dialogFilters.size())) {
            oy oyVar = pyVar.b0[1];
            oyVar.h = i00Var.a;
            oyVar.setVisibility(0);
            pyVar.b0[1].setTranslationX(r7[0].getMeasuredWidth());
            py.f1(pyVar, false);
            pyVar.R4(true);
            pyVar.e3 = z4;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        py pyVar = this.b;
        if (isChatlist) {
            org.telegram.ui.Components.d10.T(pyVar, dialogFilter.id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pyVar.getParentActivity());
        alertDialog$Builder.a.O = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new rs(7, this, dialogFilter));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        pyVar.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.q7));
        }
    }
}
