package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class dw implements org.telegram.ui.Components.n00 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ey b;

    public dw(Context context, ey eyVar) {
        this.b = eyVar;
        this.a = context;
    }

    public final int a(int i10) {
        ey eyVar = this.b;
        if (eyVar.R0 == 3) {
            return 0;
        }
        if (i10 == eyVar.z0.getDefaultTabId()) {
            return eyVar.getMessagesStorage().getMainUnreadCount();
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = eyVar.getMessagesController().getDialogFilters();
        if (i10 < 0 || i10 >= dialogFilters.size()) {
            return 0;
        }
        return eyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
    }

    public final void b(float f7) {
        ey eyVar = this.b;
        if (f7 != 1.0f || eyVar.e0[1].getVisibility() == 0 || eyVar.j2) {
            if (eyVar.i3) {
                eyVar.e0[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                eyVar.e0[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * eyVar.e0[0].getMeasuredWidth()));
            } else {
                eyVar.e0[0].setTranslationX(r3.getMeasuredWidth() * f7);
                eyVar.e0[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - eyVar.e0[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                dy[] dyVarArr = eyVar.e0;
                dy dyVar = dyVarArr[0];
                dyVarArr[0] = dyVarArr[1];
                dyVarArr[1] = dyVar;
                dyVar.setVisibility(8);
                ey.c1(eyVar, true);
                eyVar.R4(false);
                eyVar.z0.O = false;
                eyVar.p3(eyVar.e0[0]);
                eyVar.e0[0].d.getClass();
                eyVar.e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.p00 p00Var, boolean z10) {
        int i10;
        int i11;
        ey eyVar = this.b;
        int i12 = eyVar.e0[0].h;
        int i13 = p00Var.a;
        if (i12 == i13) {
            return;
        }
        if (p00Var.f) {
            eyVar.z0.i(i13);
            i11 = ((org.telegram.ui.ActionBar.n2) eyVar).currentAccount;
            eyVar.showDialog(new sg.j0(3, i11, this.a, eyVar, null));
            return;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = eyVar.getMessagesController().getDialogFilters();
        if (p00Var.e || ((i10 = p00Var.a) >= 0 && i10 < dialogFilters.size())) {
            dy dyVar = eyVar.e0[1];
            dyVar.h = p00Var.a;
            dyVar.setVisibility(0);
            eyVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            ey.c1(eyVar, false);
            eyVar.P4(true);
            eyVar.i3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        ey eyVar = this.b;
        if (isChatlist) {
            org.telegram.ui.Components.k10.U(eyVar, dialogFilter.id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zu(4, this, dialogFilter));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        eyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(eyVar.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
        }
    }
}
