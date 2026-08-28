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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class ix0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        int i9 = UserConfig.selectedAccount;
        Context context = o2Var.getContext();
        kh.n2 n2Var = new kh.n2(context, b6Var, true, false);
        n2Var.y = new c3.e(i9, context, tL_messages_stickerSet, 8);
        if (o2Var.visibleDialog != null) {
            n2Var.show();
        } else {
            o2Var.showDialog(n2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.b6 b6Var, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.StickersDeleteStickerSetTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.StickersDeleteStickerSetDescription);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new g1(25, runnable, stickerSet));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.show();
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q7, b6Var));
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.b6 b6Var, Context context, Utilities.Callback2 callback2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        boolean z10 = stickerSet != null;
        String string = LocaleController.getString(z10 ? R.string.EditStickerPack : R.string.NewStickerPack);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        c2Var.P = LocaleController.getString(R.string.StickersChooseNameForStickerPack);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(20.0f), 0);
        final gx0 gx0Var = new gx0(context);
        int i9 = org.telegram.ui.ActionBar.f6.j5;
        gx0Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        gx0Var.setInputType(16385);
        gx0Var.setTextSize(1, 16.0f);
        gx0Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        gx0Var.setHandlesColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.vf, b6Var));
        gx0Var.setHeaderHintColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.L6, b6Var));
        gx0Var.setSingleLine(true);
        gx0Var.setFocusable(true);
        gx0Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new InputFilter() { // from class: org.telegram.ui.Components.fx0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                return (charSequence.length() <= 0 || !Character.isWhitespace(charSequence.charAt(0))) ? charSequence : (TextUtils.isEmpty(gx0.this.getText()) || i12 == 0) ? "" : charSequence;
            }
        }});
        gx0Var.setLineColors(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.k6, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.l6, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p7, b6Var));
        gx0Var.setImeOptions(6);
        gx0Var.setBackground(null);
        gx0Var.requestFocus();
        gx0Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : 0.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 28.0f), 0);
        frameLayout.addView(gx0Var);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, g7.e6.d(26, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        gx0Var.addTextChangedListener(new hx0(numberTextView, gx0Var));
        if (z10) {
            gx0Var.setText(stickerSet.title);
            gx0Var.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.n(frameLayout);
        c2Var.C = 4;
        alertDialog$Builder.k(LocaleController.getString(z10 ? R.string.Done : R.string.Create), new k9.b(gx0Var, callback2, context, z10, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wu(gx0Var, 24));
        org.telegram.ui.ActionBar.c2 o6 = alertDialog$Builder.o();
        o6.d0 = false;
        gx0Var.setOnEditorActionListener(new c1(o6, 8));
    }
}
