package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ly implements org.telegram.ui.Components.h00 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ uy b;

    public ly(Context context, uy uyVar) {
        this.b = uyVar;
        this.a = context;
    }

    public final int a(int i10) {
        uy uyVar = this.b;
        if (uyVar.R0 == 3) {
            return 0;
        }
        if (i10 == uyVar.z0.getDefaultTabId()) {
            return uyVar.getMessagesStorage().getMainUnreadCount();
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = uyVar.getMessagesController().getDialogFilters();
        if (i10 < 0 || i10 >= dialogFilters.size()) {
            return 0;
        }
        return uyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
    }

    public final void b(float f7) {
        uy uyVar = this.b;
        if (f7 != 1.0f || uyVar.e0[1].getVisibility() == 0 || uyVar.j2) {
            if (uyVar.h3) {
                uyVar.e0[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                uyVar.e0[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * uyVar.e0[0].getMeasuredWidth()));
            } else {
                uyVar.e0[0].setTranslationX(r3.getMeasuredWidth() * f7);
                uyVar.e0[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - uyVar.e0[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                ty[] tyVarArr = uyVar.e0;
                ty tyVar = tyVarArr[0];
                tyVarArr[0] = tyVarArr[1];
                tyVarArr[1] = tyVar;
                tyVar.setVisibility(8);
                uy.j1(uyVar, true);
                uyVar.c5(false);
                uyVar.z0.O = false;
                uyVar.A3(uyVar.e0[0]);
                uyVar.e0[0].d.getClass();
                uyVar.e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.j00 j00Var, boolean z10) {
        int i10;
        int i11;
        uy uyVar = this.b;
        int i12 = uyVar.e0[0].h;
        int i13 = j00Var.a;
        if (i12 == i13) {
            return;
        }
        if (j00Var.f) {
            uyVar.z0.i(i13);
            i11 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
            uyVar.showDialog(new rg.k0(3, i11, this.a, uyVar, null));
            return;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = uyVar.getMessagesController().getDialogFilters();
        if (j00Var.e || ((i10 = j00Var.a) >= 0 && i10 < dialogFilters.size())) {
            ty tyVar = uyVar.e0[1];
            tyVar.h = j00Var.a;
            tyVar.setVisibility(0);
            uyVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            uy.j1(uyVar, false);
            uyVar.a5(true);
            uyVar.h3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        uy uyVar = this.b;
        if (isChatlist) {
            org.telegram.ui.Components.f10.R(uyVar, dialogFilter.id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pw(1, this, dialogFilter));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        uyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.q7));
        }
    }
}
