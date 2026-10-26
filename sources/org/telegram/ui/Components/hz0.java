package org.telegram.ui.Components;

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class hz0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        int i10 = UserConfig.selectedAccount;
        Context context = r2Var.getContext();
        fi.l2 l2Var = new fi.l2(context, u6Var, true, false);
        l2Var.E = new i2.z(i10, context, tL_messages_stickerSet, 10);
        if (r2Var.visibleDialog != null) {
            l2Var.show();
        } else {
            r2Var.showDialog(l2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.u6 u6Var, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.StickersDeleteStickerSetTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.StickersDeleteStickerSetDescription);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new p1(26, runnable, stickerSet));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.show();
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, u6Var);
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.u6 u6Var, Context context, Utilities.Callback2 callback2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        boolean z10 = stickerSet != null;
        String string = LocaleController.getString(z10 ? R.string.EditStickerPack : R.string.NewStickerPack);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = string;
        e2Var.T = LocaleController.getString(R.string.StickersChooseNameForStickerPack);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(20.0f), 0);
        fz0 fz0Var = new fz0(context);
        int i10 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.V(fz0Var, i10, u6Var);
        fz0Var.setInputType(16385);
        fz0Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.V(fz0Var, i10, u6Var);
        org.telegram.ui.ActionBar.f7.m(fz0Var, 36, org.telegram.ui.ActionBar.y6.vf, u6Var);
        org.telegram.ui.ActionBar.f7.m(fz0Var, 35, org.telegram.ui.ActionBar.y6.L6, u6Var);
        fz0Var.setSingleLine(true);
        fz0Var.setFocusable(true);
        fz0Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new qk(1, fz0Var)});
        org.telegram.ui.ActionBar.f7.G(fz0Var, org.telegram.ui.ActionBar.y6.k6, org.telegram.ui.ActionBar.y6.l6, org.telegram.ui.ActionBar.y6.p7, u6Var);
        fz0Var.setImeOptions(6);
        fz0Var.setBackground(null);
        fz0Var.requestFocus();
        fz0Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : 0.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 28.0f), 0);
        frameLayout.addView(fz0Var);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, gb1.h(26, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        fz0Var.addTextChangedListener(new gz0(numberTextView, fz0Var));
        if (z10) {
            fz0Var.setText(stickerSet.title);
            fz0Var.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.o(frameLayout);
        e2Var.G = 4;
        alertDialog$Builder.k(LocaleController.getString(z10 ? R.string.Done : R.string.Create), new ea.b(fz0Var, callback2, context, z10, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tv(fz0Var, 26));
        org.telegram.ui.ActionBar.e2 p10 = alertDialog$Builder.p();
        p10.j0 = false;
        fz0Var.setOnEditorActionListener(new d1(p10, 9));
    }
}
