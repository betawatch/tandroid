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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class by0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10 = UserConfig.selectedAccount;
        Context context = n2Var.getContext();
        ci.t2 t2Var = new ci.t2(context, e6Var, true, false);
        t2Var.y = new gg.d2(i10, context, tL_messages_stickerSet, 9);
        if (n2Var.visibleDialog != null) {
            t2Var.show();
        } else {
            n2Var.showDialog(t2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.e6 e6Var, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.StickersDeleteStickerSetTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.StickersDeleteStickerSetDescription);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new mf(15, runnable, stickerSet));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.show();
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.q7, e6Var));
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.e6 e6Var, Context context, Utilities.Callback2 callback2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        boolean z10 = stickerSet != null;
        String string = LocaleController.getString(z10 ? R.string.EditStickerPack : R.string.NewStickerPack);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        b2Var.T = LocaleController.getString(R.string.StickersChooseNameForStickerPack);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(20.0f), 0);
        final zx0 zx0Var = new zx0(context);
        int i10 = org.telegram.ui.ActionBar.i6.j5;
        zx0Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        zx0Var.setInputType(16385);
        zx0Var.setTextSize(1, 16.0f);
        zx0Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        zx0Var.setHandlesColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.vf, e6Var));
        zx0Var.setHeaderHintColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.L6, e6Var));
        zx0Var.setSingleLine(true);
        zx0Var.setFocusable(true);
        zx0Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new InputFilter() { // from class: org.telegram.ui.Components.yx0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
                return (charSequence.length() <= 0 || !Character.isWhitespace(charSequence.charAt(0))) ? charSequence : (TextUtils.isEmpty(zx0.this.getText()) || i13 == 0) ? "" : charSequence;
            }
        }});
        zx0Var.setLineColors(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.k6, e6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.l6, e6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.p7, e6Var));
        zx0Var.setImeOptions(6);
        zx0Var.setBackground(null);
        zx0Var.requestFocus();
        zx0Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : 0.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 28.0f), 0);
        frameLayout.addView(zx0Var);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, w7.x5.d(26, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        zx0Var.addTextChangedListener(new ay0(numberTextView, zx0Var));
        if (z10) {
            zx0Var.setText(stickerSet.title);
            zx0Var.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.n(frameLayout);
        b2Var.G = 4;
        alertDialog$Builder.k(LocaleController.getString(z10 ? R.string.Done : R.string.Create), new ca.b(zx0Var, callback2, context, z10, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new lv(zx0Var, 24));
        org.telegram.ui.ActionBar.b2 o9 = alertDialog$Builder.o();
        o9.h0 = false;
        zx0Var.setOnEditorActionListener(new e1(o9, 8));
    }
}
