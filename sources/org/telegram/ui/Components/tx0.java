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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class tx0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10 = UserConfig.selectedAccount;
        Context context = o2Var.getContext();
        nh.k2 k2Var = new nh.k2(context, c6Var, true, false);
        k2Var.y = new e3.d(i10, context, tL_messages_stickerSet, 7);
        if (o2Var.visibleDialog != null) {
            k2Var.show();
        } else {
            o2Var.showDialog(k2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.c6 c6Var, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.StickersDeleteStickerSetTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.StickersDeleteStickerSetDescription);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j1(25, runnable, stickerSet));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.show();
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, c6Var));
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.c6 c6Var, Context context, Utilities.Callback2 callback2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        boolean z10 = stickerSet != null;
        String string = LocaleController.getString(z10 ? R.string.EditStickerPack : R.string.NewStickerPack);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        c2Var.P = LocaleController.getString(R.string.StickersChooseNameForStickerPack);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(20.0f), 0);
        final rx0 rx0Var = new rx0(context);
        int i10 = org.telegram.ui.ActionBar.g6.j5;
        rx0Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        rx0Var.setInputType(16385);
        rx0Var.setTextSize(1, 16.0f);
        rx0Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        rx0Var.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.vf, c6Var));
        rx0Var.setHeaderHintColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, c6Var));
        rx0Var.setSingleLine(true);
        rx0Var.setFocusable(true);
        rx0Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new InputFilter() { // from class: org.telegram.ui.Components.qx0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
                return (charSequence.length() <= 0 || !Character.isWhitespace(charSequence.charAt(0))) ? charSequence : (TextUtils.isEmpty(rx0.this.getText()) || i13 == 0) ? "" : charSequence;
            }
        }});
        rx0Var.setLineColors(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.k6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.l6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.p7, c6Var));
        rx0Var.setImeOptions(6);
        rx0Var.setBackground(null);
        rx0Var.requestFocus();
        rx0Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : 0.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 28.0f), 0);
        frameLayout.addView(rx0Var);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, i7.f6.d(26, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        rx0Var.addTextChangedListener(new sx0(numberTextView, rx0Var));
        if (z10) {
            rx0Var.setText(stickerSet.title);
            rx0Var.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.n(frameLayout);
        c2Var.C = 4;
        alertDialog$Builder.k(LocaleController.getString(z10 ? R.string.Done : R.string.Create), new m9.b(rx0Var, callback2, context, z10, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new cv(rx0Var, 24));
        org.telegram.ui.ActionBar.c2 o10 = alertDialog$Builder.o();
        o10.d0 = false;
        rx0Var.setOnEditorActionListener(new f1(o10, 8));
    }
}
