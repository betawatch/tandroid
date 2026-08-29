package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fw implements org.telegram.ui.Components.a00 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ fy b;

    public fw(Context context, fy fyVar) {
        this.b = fyVar;
        this.a = context;
    }

    public final int a(int i10) {
        fy fyVar = this.b;
        if (fyVar.N0 == 3) {
            return 0;
        }
        if (i10 == fyVar.v0.getDefaultTabId()) {
            return fyVar.getMessagesStorage().getMainUnreadCount();
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = fyVar.getMessagesController().getDialogFilters();
        if (i10 < 0 || i10 >= dialogFilters.size()) {
            return 0;
        }
        return fyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
    }

    public final void b(float f9) {
        fy fyVar = this.b;
        if (f9 != 1.0f || fyVar.a0[1].getVisibility() == 0 || fyVar.f2) {
            if (fyVar.d3) {
                fyVar.a0[0].setTranslationX((-f9) * r3.getMeasuredWidth());
                fyVar.a0[1].setTranslationX(r3[0].getMeasuredWidth() - (f9 * fyVar.a0[0].getMeasuredWidth()));
            } else {
                fyVar.a0[0].setTranslationX(r3.getMeasuredWidth() * f9);
                fyVar.a0[1].setTranslationX((f9 * r3[0].getMeasuredWidth()) - fyVar.a0[0].getMeasuredWidth());
            }
            if (f9 == 1.0f) {
                ey[] eyVarArr = fyVar.a0;
                ey eyVar = eyVarArr[0];
                eyVarArr[0] = eyVarArr[1];
                eyVarArr[1] = eyVar;
                eyVar.setVisibility(8);
                fy.f1(fyVar, true);
                fyVar.T4(false);
                fyVar.v0.K = false;
                fyVar.r3(fyVar.a0[0]);
                fyVar.a0[0].d.getClass();
                fyVar.a0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.c00 c00Var, boolean z10) {
        int i10;
        int i11;
        fy fyVar = this.b;
        int i12 = fyVar.a0[0].h;
        int i13 = c00Var.a;
        if (i12 == i13) {
            return;
        }
        if (c00Var.f) {
            fyVar.v0.i(i13);
            i11 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
            fyVar.showDialog(new cg.v0(3, i11, this.a, fyVar, null));
            return;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = fyVar.getMessagesController().getDialogFilters();
        if (c00Var.e || ((i10 = c00Var.a) >= 0 && i10 < dialogFilters.size())) {
            ey eyVar = fyVar.a0[1];
            eyVar.h = c00Var.a;
            eyVar.setVisibility(0);
            fyVar.a0[1].setTranslationX(r7[0].getMeasuredWidth());
            fy.f1(fyVar, false);
            fyVar.R4(true);
            fyVar.d3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        fy fyVar = this.b;
        if (isChatlist) {
            org.telegram.ui.Components.y00.T(fyVar, dialogFilter.id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fyVar.getParentActivity());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xr(8, this, dialogFilter));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        fyVar.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.q7));
        }
    }
}
