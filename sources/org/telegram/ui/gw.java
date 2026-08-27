package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gw implements org.telegram.ui.Components.tz {
    public final /* synthetic */ Context a;
    public final /* synthetic */ gy b;

    public gw(Context context, gy gyVar) {
        this.b = gyVar;
        this.a = context;
    }

    public final int a(int i10) {
        gy gyVar = this.b;
        if (gyVar.N0 == 3) {
            return 0;
        }
        if (i10 == gyVar.v0.getDefaultTabId()) {
            return gyVar.getMessagesStorage().getMainUnreadCount();
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = gyVar.getMessagesController().getDialogFilters();
        if (i10 < 0 || i10 >= dialogFilters.size()) {
            return 0;
        }
        return gyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
    }

    public final void b(float f10) {
        gy gyVar = this.b;
        if (f10 != 1.0f || gyVar.a0[1].getVisibility() == 0 || gyVar.f2) {
            if (gyVar.d3) {
                gyVar.a0[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                gyVar.a0[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * gyVar.a0[0].getMeasuredWidth()));
            } else {
                gyVar.a0[0].setTranslationX(r3.getMeasuredWidth() * f10);
                gyVar.a0[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - gyVar.a0[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                fy[] fyVarArr = gyVar.a0;
                fy fyVar = fyVarArr[0];
                fyVarArr[0] = fyVarArr[1];
                fyVarArr[1] = fyVar;
                fyVar.setVisibility(8);
                gy.f1(gyVar, true);
                gyVar.T4(false);
                gyVar.v0.K = false;
                gyVar.r3(gyVar.a0[0]);
                gyVar.a0[0].d.getClass();
                gyVar.a0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.vz vzVar, boolean z10) {
        int i10;
        int i11;
        gy gyVar = this.b;
        int i12 = gyVar.a0[0].h;
        int i13 = vzVar.a;
        if (i12 == i13) {
            return;
        }
        if (vzVar.f) {
            gyVar.v0.i(i13);
            i11 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
            gyVar.showDialog(new ag.i1(3, i11, this.a, gyVar, null));
            return;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = gyVar.getMessagesController().getDialogFilters();
        if (vzVar.e || ((i10 = vzVar.a) >= 0 && i10 < dialogFilters.size())) {
            fy fyVar = gyVar.a0[1];
            fyVar.h = vzVar.a;
            fyVar.setVisibility(0);
            gyVar.a0[1].setTranslationX(r7[0].getMeasuredWidth());
            gy.f1(gyVar, false);
            gyVar.R4(true);
            gyVar.d3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        gy gyVar = this.b;
        if (isChatlist) {
            org.telegram.ui.Components.q00.T(gyVar, dialogFilter.id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gyVar.getParentActivity());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zr(8, this, dialogFilter));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        gyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.q7));
        }
    }
}
