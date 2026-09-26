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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public abstract class ly0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10 = UserConfig.selectedAccount;
        Context context = m2Var.getContext();
        ci.s2 s2Var = new ci.s2(context, d6Var, true, false);
        s2Var.y = new gg.d2(i10, context, tL_messages_stickerSet, 10);
        if (m2Var.visibleDialog != null) {
            s2Var.show();
        } else {
            m2Var.showDialog(s2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.d6 d6Var, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.StickersDeleteStickerSetTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.StickersDeleteStickerSetDescription);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new w2(17, runnable, stickerSet));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.show();
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.q7, d6Var));
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.d6 d6Var, Context context, Utilities.Callback2 callback2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        boolean z10 = stickerSet != null;
        String string = LocaleController.getString(z10 ? R.string.EditStickerPack : R.string.NewStickerPack);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.R = string;
        a2Var.T = LocaleController.getString(R.string.StickersChooseNameForStickerPack);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(20.0f), 0);
        final jy0 jy0Var = new jy0(context);
        int i10 = org.telegram.ui.ActionBar.h6.j5;
        jy0Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        jy0Var.setInputType(16385);
        jy0Var.setTextSize(1, 16.0f);
        jy0Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        jy0Var.setHandlesColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.vf, d6Var));
        jy0Var.setHeaderHintColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.L6, d6Var));
        jy0Var.setSingleLine(true);
        jy0Var.setFocusable(true);
        jy0Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new InputFilter() { // from class: org.telegram.ui.Components.iy0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
                return (charSequence.length() <= 0 || !Character.isWhitespace(charSequence.charAt(0))) ? charSequence : (TextUtils.isEmpty(jy0.this.getText()) || i13 == 0) ? "" : charSequence;
            }
        }});
        jy0Var.setLineColors(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.k6, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.l6, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.p7, d6Var));
        jy0Var.setImeOptions(6);
        jy0Var.setBackground(null);
        jy0Var.requestFocus();
        jy0Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : 0.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 28.0f), 0);
        frameLayout.addView(jy0Var);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, w7.y5.d(26, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        jy0Var.addTextChangedListener(new ky0(numberTextView, jy0Var));
        if (z10) {
            jy0Var.setText(stickerSet.title);
            jy0Var.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.n(frameLayout);
        a2Var.G = 4;
        alertDialog$Builder.k(LocaleController.getString(z10 ? R.string.Done : R.string.Create), new ca.b(jy0Var, callback2, context, z10, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mv(jy0Var, 25));
        org.telegram.ui.ActionBar.a2 o9 = alertDialog$Builder.o();
        o9.h0 = false;
        jy0Var.setOnEditorActionListener(new e1(o9, 8));
    }
}
