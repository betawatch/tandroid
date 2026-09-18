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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class cy0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10 = UserConfig.selectedAccount;
        Context context = o2Var.getContext();
        ci.t2 t2Var = new ci.t2(context, f6Var, true, false);
        t2Var.y = new gg.d2(i10, context, tL_messages_stickerSet, 9);
        if (o2Var.visibleDialog != null) {
            t2Var.show();
        } else {
            o2Var.showDialog(t2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.f6 f6Var, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.StickersDeleteStickerSetTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.StickersDeleteStickerSetDescription);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new mf(15, runnable, stickerSet));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.show();
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, f6Var));
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.f6 f6Var, Context context, Utilities.Callback2 callback2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        boolean z10 = stickerSet != null;
        String string = LocaleController.getString(z10 ? R.string.EditStickerPack : R.string.NewStickerPack);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = string;
        c2Var.T = LocaleController.getString(R.string.StickersChooseNameForStickerPack);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(20.0f), 0);
        final ay0 ay0Var = new ay0(context);
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        ay0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        ay0Var.setInputType(16385);
        ay0Var.setTextSize(1, 16.0f);
        ay0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        ay0Var.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vf, f6Var));
        ay0Var.setHeaderHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, f6Var));
        ay0Var.setSingleLine(true);
        ay0Var.setFocusable(true);
        ay0Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new InputFilter() { // from class: org.telegram.ui.Components.zx0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
                return (charSequence.length() <= 0 || !Character.isWhitespace(charSequence.charAt(0))) ? charSequence : (TextUtils.isEmpty(ay0.this.getText()) || i13 == 0) ? "" : charSequence;
            }
        }});
        ay0Var.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var));
        ay0Var.setImeOptions(6);
        ay0Var.setBackground(null);
        ay0Var.requestFocus();
        ay0Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : 0.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 28.0f), 0);
        frameLayout.addView(ay0Var);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, w7.x5.d(26, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        ay0Var.addTextChangedListener(new by0(numberTextView, ay0Var));
        if (z10) {
            ay0Var.setText(stickerSet.title);
            ay0Var.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.n(frameLayout);
        c2Var.G = 4;
        alertDialog$Builder.k(LocaleController.getString(z10 ? R.string.Done : R.string.Create), new ca.b(ay0Var, callback2, context, z10, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new lv(ay0Var, 24));
        org.telegram.ui.ActionBar.c2 o9 = alertDialog$Builder.o();
        o9.h0 = false;
        ay0Var.setOnEditorActionListener(new e1(o9, 8));
    }
}
