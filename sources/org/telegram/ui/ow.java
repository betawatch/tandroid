package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ow implements org.telegram.ui.Components.e00 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ oy b;

    public ow(Context context, oy oyVar) {
        this.b = oyVar;
        this.a = context;
    }

    public final int a(int i10) {
        oy oyVar = this.b;
        if (oyVar.O0 == 3) {
            return 0;
        }
        if (i10 == oyVar.w0.getDefaultTabId()) {
            return oyVar.getMessagesStorage().getMainUnreadCount();
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = oyVar.getMessagesController().getDialogFilters();
        if (i10 < 0 || i10 >= dialogFilters.size()) {
            return 0;
        }
        return oyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
    }

    public final void b(float f10) {
        oy oyVar = this.b;
        if (f10 != 1.0f || oyVar.b0[1].getVisibility() == 0 || oyVar.g2) {
            if (oyVar.e3) {
                oyVar.b0[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                oyVar.b0[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * oyVar.b0[0].getMeasuredWidth()));
            } else {
                oyVar.b0[0].setTranslationX(r3.getMeasuredWidth() * f10);
                oyVar.b0[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - oyVar.b0[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                ny[] nyVarArr = oyVar.b0;
                ny nyVar = nyVarArr[0];
                nyVarArr[0] = nyVarArr[1];
                nyVarArr[1] = nyVar;
                nyVar.setVisibility(8);
                oy.f1(oyVar, true);
                oyVar.T4(false);
                oyVar.w0.L = false;
                oyVar.r3(oyVar.b0[0]);
                oyVar.b0[0].d.getClass();
                oyVar.b0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.g00 g00Var, boolean z4) {
        int i10;
        int i11;
        oy oyVar = this.b;
        int i12 = oyVar.b0[0].h;
        int i13 = g00Var.a;
        if (i12 == i13) {
            return;
        }
        if (g00Var.f) {
            oyVar.w0.i(i13);
            i11 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
            oyVar.showDialog(new eg.v0(3, i11, this.a, oyVar, null));
            return;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = oyVar.getMessagesController().getDialogFilters();
        if (g00Var.e || ((i10 = g00Var.a) >= 0 && i10 < dialogFilters.size())) {
            ny nyVar = oyVar.b0[1];
            nyVar.h = g00Var.a;
            nyVar.setVisibility(0);
            oyVar.b0[1].setTranslationX(r7[0].getMeasuredWidth());
            oy.f1(oyVar, false);
            oyVar.R4(true);
            oyVar.e3 = z4;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        oy oyVar = this.b;
        if (isChatlist) {
            org.telegram.ui.Components.c10.T(oyVar, dialogFilter.id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oyVar.getParentActivity());
        alertDialog$Builder.a.O = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qs(7, this, dialogFilter));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        oyVar.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
        }
    }
}
