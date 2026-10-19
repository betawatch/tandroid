package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class bw implements org.telegram.ui.Components.n00 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ cy b;

    public bw(Context context, cy cyVar) {
        this.b = cyVar;
        this.a = context;
    }

    public final int a(int i10) {
        cy cyVar = this.b;
        if (cyVar.R0 == 3) {
            return 0;
        }
        if (i10 == cyVar.z0.getDefaultTabId()) {
            return cyVar.getMessagesStorage().getMainUnreadCount();
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = cyVar.getMessagesController().getDialogFilters();
        if (i10 < 0 || i10 >= dialogFilters.size()) {
            return 0;
        }
        return cyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
    }

    public final void b(float f7) {
        cy cyVar = this.b;
        if (f7 != 1.0f || cyVar.e0[1].getVisibility() == 0 || cyVar.j2) {
            if (cyVar.i3) {
                cyVar.e0[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                cyVar.e0[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * cyVar.e0[0].getMeasuredWidth()));
            } else {
                cyVar.e0[0].setTranslationX(r3.getMeasuredWidth() * f7);
                cyVar.e0[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - cyVar.e0[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                ay[] ayVarArr = cyVar.e0;
                ay ayVar = ayVarArr[0];
                ayVarArr[0] = ayVarArr[1];
                ayVarArr[1] = ayVar;
                ayVar.setVisibility(8);
                cy.c1(cyVar, true);
                cyVar.R4(false);
                cyVar.z0.O = false;
                cyVar.p3(cyVar.e0[0]);
                cyVar.e0[0].d.getClass();
                cyVar.e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.p00 p00Var, boolean z10) {
        int i10;
        int i11;
        cy cyVar = this.b;
        int i12 = cyVar.e0[0].h;
        int i13 = p00Var.a;
        if (i12 == i13) {
            return;
        }
        if (p00Var.f) {
            cyVar.z0.i(i13);
            i11 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
            cyVar.showDialog(new sg.k0(3, i11, this.a, cyVar, null));
            return;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = cyVar.getMessagesController().getDialogFilters();
        if (p00Var.e || ((i10 = p00Var.a) >= 0 && i10 < dialogFilters.size())) {
            ay ayVar = cyVar.e0[1];
            ayVar.h = p00Var.a;
            ayVar.setVisibility(0);
            cyVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            cy.c1(cyVar, false);
            cyVar.P4(true);
            cyVar.i3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        cy cyVar = this.b;
        if (isChatlist) {
            org.telegram.ui.Components.k10.U(cyVar, dialogFilter.id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cyVar.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xu(4, this, dialogFilter));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        cyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(cyVar.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
        }
    }
}
