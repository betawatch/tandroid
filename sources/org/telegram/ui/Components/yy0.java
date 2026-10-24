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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class yy0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10 = UserConfig.selectedAccount;
        Context context = o2Var.getContext();
        ei.n2 n2Var = new ei.n2(context, g6Var, true, false);
        n2Var.E = new hg.b2(i10, context, tL_messages_stickerSet, 10);
        if (o2Var.visibleDialog != null) {
            n2Var.show();
        } else {
            o2Var.showDialog(n2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.g6 g6Var, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.StickersDeleteStickerSetTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.StickersDeleteStickerSetDescription);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new p2(23, runnable, stickerSet));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.show();
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, g6Var);
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.g6 g6Var, Context context, Utilities.Callback2 callback2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        boolean z10 = stickerSet != null;
        String string = LocaleController.getString(z10 ? R.string.EditStickerPack : R.string.NewStickerPack);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = string;
        c2Var.T = LocaleController.getString(R.string.StickersChooseNameForStickerPack);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(20.0f), 0);
        wy0 wy0Var = new wy0(context);
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.W(wy0Var, i10, g6Var);
        wy0Var.setInputType(16385);
        wy0Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.W(wy0Var, i10, g6Var);
        org.telegram.ui.ActionBar.r6.m(wy0Var, 36, org.telegram.ui.ActionBar.k6.vf, g6Var);
        org.telegram.ui.ActionBar.r6.m(wy0Var, 35, org.telegram.ui.ActionBar.k6.L6, g6Var);
        wy0Var.setSingleLine(true);
        wy0Var.setFocusable(true);
        wy0Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new qk(1, wy0Var)});
        org.telegram.ui.ActionBar.r6.H(wy0Var, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, g6Var);
        wy0Var.setImeOptions(6);
        wy0Var.setBackground(null);
        wy0Var.requestFocus();
        wy0Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : 0.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 28.0f), 0);
        frameLayout.addView(wy0Var);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, w7.z5.d(26, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        wy0Var.addTextChangedListener(new xy0(numberTextView, wy0Var));
        if (z10) {
            wy0Var.setText(stickerSet.title);
            wy0Var.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.o(frameLayout);
        c2Var.G = 4;
        alertDialog$Builder.k(LocaleController.getString(z10 ? R.string.Done : R.string.Create), new da.b(wy0Var, callback2, context, z10, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tv(wy0Var, 25));
        org.telegram.ui.ActionBar.c2 p5 = alertDialog$Builder.p();
        p5.j0 = false;
        wy0Var.setOnEditorActionListener(new d1(p5, 9));
    }
}
