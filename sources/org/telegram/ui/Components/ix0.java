package org.telegram.ui.Components;

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class ix0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        int i10 = org.telegram.messenger.e20.s0;
        Context context = k2Var.getContext();
        vh.u1 u1Var = new vh.u1(context, p6Var, true, false);
        u1Var.v1 = new ag.b0(i10, context, tL_messages_stickerSet, 9);
        if (k2Var.visibleDialog != null) {
            u1Var.show();
        } else {
            k2Var.showDialog(u1Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.p6 p6Var, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        String L0 = org.telegram.messenger.dd.L0(2131744877, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.dd.L0(2131744878, null);
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new f2(19, runnable, stickerSet));
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
        x1Var.show();
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, p6Var);
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.p6 p6Var, Context context, org.telegram.messenger.k20 k20Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        boolean z10 = stickerSet != null;
        String L0 = org.telegram.messenger.dd.L0(z10 ? 2131751223 : 2131748279, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.dd.L0(2131744882, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
        gx0 gx0Var = new gx0(context);
        int i10 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(gx0Var, i10, p6Var);
        gx0Var.setInputType(16385);
        gx0Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(gx0Var, i10, p6Var);
        org.telegram.ui.ActionBar.a7.m(gx0Var, 36, org.telegram.ui.ActionBar.t6.jg, p6Var);
        org.telegram.ui.ActionBar.a7.m(gx0Var, 35, org.telegram.ui.ActionBar.t6.L6, p6Var);
        gx0Var.setSingleLine(true);
        gx0Var.setFocusable(true);
        gx0Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new ak(1, gx0Var)});
        org.telegram.ui.ActionBar.a7.G(gx0Var, org.telegram.ui.ActionBar.t6.k6, org.telegram.ui.ActionBar.t6.l6, org.telegram.ui.ActionBar.t6.p7, p6Var);
        gx0Var.setImeOptions(6);
        gx0Var.setBackground(null);
        gx0Var.requestFocus();
        gx0Var.setPadding(org.telegram.messenger.i0.L(org.telegram.messenger.dd.X ? 28.0f : 0.0f), 0, org.telegram.messenger.i0.L(org.telegram.messenger.dd.X ? 0.0f : 28.0f), 0);
        frameLayout.addView(gx0Var);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, w7.b6.d(26, 20.0f, (org.telegram.messenger.dd.X ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        gx0Var.addTextChangedListener(new hx0(numberTextView, gx0Var));
        if (z10) {
            gx0Var.setText(stickerSet.title);
            gx0Var.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.o(frameLayout);
        x1Var.G = 4;
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(z10 ? 2131751355 : 2131751753, null), new bi.o4(gx0Var, k20Var, context, z10, 4));
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new px(gx0Var, 23));
        org.telegram.ui.ActionBar.x1 p5 = alertDialog$Builder.p();
        p5.j0 = false;
        gx0Var.setOnEditorActionListener(new t0(p5, 9));
    }
}
