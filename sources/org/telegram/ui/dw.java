package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dw implements org.telegram.ui.Components.qz {
    public final /* synthetic */ Context a;
    public final /* synthetic */ dy b;

    public dw(Context context, dy dyVar) {
        this.b = dyVar;
        this.a = context;
    }

    public final int a(int i9) {
        dy dyVar = this.b;
        if (dyVar.N0 == 3) {
            return 0;
        }
        if (i9 == dyVar.v0.getDefaultTabId()) {
            return dyVar.getMessagesStorage().getMainUnreadCount();
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = dyVar.getMessagesController().getDialogFilters();
        if (i9 < 0 || i9 >= dialogFilters.size()) {
            return 0;
        }
        return dyVar.getMessagesController().getDialogFilters().get(i9).unreadCount;
    }

    public final void b(float f10) {
        dy dyVar = this.b;
        if (f10 != 1.0f || dyVar.a0[1].getVisibility() == 0 || dyVar.f2) {
            if (dyVar.d3) {
                dyVar.a0[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                dyVar.a0[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * dyVar.a0[0].getMeasuredWidth()));
            } else {
                dyVar.a0[0].setTranslationX(r3.getMeasuredWidth() * f10);
                dyVar.a0[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - dyVar.a0[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                cy[] cyVarArr = dyVar.a0;
                cy cyVar = cyVarArr[0];
                cyVarArr[0] = cyVarArr[1];
                cyVarArr[1] = cyVar;
                cyVar.setVisibility(8);
                dy.f1(dyVar, true);
                dyVar.T4(false);
                dyVar.v0.K = false;
                dyVar.r3(dyVar.a0[0]);
                dyVar.a0[0].d.getClass();
                dyVar.a0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.sz szVar, boolean z10) {
        int i9;
        int i10;
        dy dyVar = this.b;
        int i11 = dyVar.a0[0].h;
        int i12 = szVar.a;
        if (i11 == i12) {
            return;
        }
        if (szVar.f) {
            dyVar.v0.i(i12);
            i10 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
            dyVar.showDialog(new zf.j0(3, i10, this.a, dyVar, null));
            return;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = dyVar.getMessagesController().getDialogFilters();
        if (szVar.e || ((i9 = szVar.a) >= 0 && i9 < dialogFilters.size())) {
            cy cyVar = dyVar.a0[1];
            cyVar.h = szVar.a;
            cyVar.setVisibility(0);
            dyVar.a0[1].setTranslationX(r7[0].getMeasuredWidth());
            dy.f1(dyVar, false);
            dyVar.R4(true);
            dyVar.d3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        dy dyVar = this.b;
        if (isChatlist) {
            org.telegram.ui.Components.n00.S(dyVar, dialogFilter.id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dyVar.getParentActivity());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new yr(8, this, dialogFilter));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        dyVar.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.q7));
        }
    }
}
