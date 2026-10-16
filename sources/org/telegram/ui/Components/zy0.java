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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public abstract class zy0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10 = UserConfig.selectedAccount;
        Context context = m2Var.getContext();
        di.r2 r2Var = new di.r2(context, c6Var, true, false);
        r2Var.y = new hg.b2(i10, context, tL_messages_stickerSet, 10);
        if (m2Var.visibleDialog != null) {
            r2Var.show();
        } else {
            m2Var.showDialog(r2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.c6 c6Var, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.StickersDeleteStickerSetTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.StickersDeleteStickerSetDescription);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new u2(19, runnable, stickerSet));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.show();
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q7, c6Var));
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.c6 c6Var, Context context, Utilities.Callback2 callback2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        boolean z10 = stickerSet != null;
        String string = LocaleController.getString(z10 ? R.string.EditStickerPack : R.string.NewStickerPack);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.R = string;
        a2Var.T = LocaleController.getString(R.string.StickersChooseNameForStickerPack);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(20.0f), 0);
        xy0 xy0Var = new xy0(context);
        int i10 = org.telegram.ui.ActionBar.g6.j5;
        xy0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        xy0Var.setInputType(16385);
        xy0Var.setTextSize(1, 16.0f);
        xy0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        xy0Var.setHandlesColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.vf, c6Var));
        xy0Var.setHeaderHintColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.L6, c6Var));
        xy0Var.setSingleLine(true);
        xy0Var.setFocusable(true);
        xy0Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new sk(1, xy0Var)});
        xy0Var.setLineColors(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.k6, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.l6, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.p7, c6Var));
        xy0Var.setImeOptions(6);
        xy0Var.setBackground(null);
        xy0Var.requestFocus();
        xy0Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : 0.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 28.0f), 0);
        frameLayout.addView(xy0Var);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, w7.z5.a(20.0f, 0.0f, 2.0f, 4.0f, 0.0f, 26, (LocaleController.isRTL ? 3 : 5) | 16));
        xy0Var.addTextChangedListener(new yy0(numberTextView, xy0Var));
        if (z10) {
            xy0Var.setText(stickerSet.title);
            xy0Var.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.n(frameLayout);
        a2Var.G = 4;
        alertDialog$Builder.k(LocaleController.getString(z10 ? R.string.Done : R.string.Create), new da.b(xy0Var, callback2, context, z10, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xv(xy0Var, 25));
        org.telegram.ui.ActionBar.a2 o10 = alertDialog$Builder.o();
        o10.h0 = false;
        xy0Var.setOnEditorActionListener(new e1(o10, 9));
    }
}
