package org.telegram.ui.Components;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class dy0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10 = UserConfig.selectedAccount;
        Context context = p2Var.getContext();
        qh.x1 x1Var = new qh.x1(context, g6Var, true, false);
        x1Var.y = new e3.d(i10, context, tL_messages_stickerSet, 7);
        if (p2Var.visibleDialog != null) {
            x1Var.show();
        } else {
            p2Var.showDialog(x1Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.g6 g6Var, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.StickersDeleteStickerSetTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.StickersDeleteStickerSetDescription);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new o1(24, runnable, stickerSet));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.show();
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.q7, g6Var));
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.g6 g6Var, Context context, Utilities.Callback2 callback2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        boolean z4 = stickerSet != null;
        String string = LocaleController.getString(z4 ? R.string.EditStickerPack : R.string.NewStickerPack);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        d2Var.Q = LocaleController.getString(R.string.StickersChooseNameForStickerPack);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(20.0f), 0);
        final by0 by0Var = new by0(context);
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        by0Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        by0Var.setInputType(16385);
        by0Var.setTextSize(1, 16.0f);
        by0Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        by0Var.setHandlesColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.vf, g6Var));
        by0Var.setHeaderHintColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.L6, g6Var));
        by0Var.setSingleLine(true);
        by0Var.setFocusable(true);
        by0Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new InputFilter() { // from class: org.telegram.ui.Components.ay0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
                return (charSequence.length() <= 0 || !Character.isWhitespace(charSequence.charAt(0))) ? charSequence : (TextUtils.isEmpty(by0.this.getText()) || i13 == 0) ? "" : charSequence;
            }
        }});
        by0Var.setLineColors(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.k6, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.l6, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.p7, g6Var));
        by0Var.setImeOptions(6);
        by0Var.setBackground(null);
        by0Var.requestFocus();
        by0Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : 0.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 28.0f), 0);
        frameLayout.addView(by0Var);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, k7.c6.d(26, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        by0Var.addTextChangedListener(new cy0(numberTextView, by0Var));
        if (z4) {
            by0Var.setText(stickerSet.title);
            by0Var.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.n(frameLayout);
        d2Var.D = 4;
        alertDialog$Builder.k(LocaleController.getString(z4 ? R.string.Done : R.string.Create), new o9.b(by0Var, callback2, context, z4, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new hv(by0Var, 24));
        org.telegram.ui.ActionBar.d2 o10 = alertDialog$Builder.o();
        o10.e0 = false;
        by0Var.setOnEditorActionListener(new d1(o10, 8));
    }
}
