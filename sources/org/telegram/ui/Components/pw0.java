package org.telegram.ui.Components;

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class pw0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        int i7 = org.telegram.messenger.k10.t0;
        Context context = g2Var.getContext();
        hi.i2 i2Var = new hi.i2(context, h6Var, true, false);
        i2Var.z1 = new ai.u1(i7, context, tL_messages_stickerSet, 10);
        if (g2Var.visibleDialog != null) {
            i2Var.show();
        } else {
            g2Var.showDialog(i2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.h6 h6Var, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        String N0 = org.telegram.messenger.hd.N0(2131744616, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.hd.N0(2131744617, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new h2(21, runnable, stickerSet));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        t1Var.show();
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, h6Var);
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.h6 h6Var, Context context, org.telegram.messenger.r10 r10Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        boolean z10 = stickerSet != null;
        String N0 = org.telegram.messenger.hd.N0(z10 ? 2131751210 : 2131748069, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.hd.N0(2131744621, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        nw0 nw0Var = new nw0(context);
        int i7 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.U(nw0Var, i7, h6Var);
        nw0Var.setInputType(16385);
        nw0Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.U(nw0Var, i7, h6Var);
        org.telegram.ui.ActionBar.t6.l(nw0Var, 36, org.telegram.ui.ActionBar.m6.mg, h6Var);
        org.telegram.ui.ActionBar.t6.l(nw0Var, 35, org.telegram.ui.ActionBar.m6.L6, h6Var);
        nw0Var.setSingleLine(true);
        nw0Var.setFocusable(true);
        nw0Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new pk(1, nw0Var)});
        org.telegram.ui.ActionBar.t6.F(nw0Var, org.telegram.ui.ActionBar.m6.k6, org.telegram.ui.ActionBar.m6.l6, org.telegram.ui.ActionBar.m6.p7, h6Var);
        nw0Var.setImeOptions(6);
        nw0Var.setBackground(null);
        nw0Var.requestFocus();
        nw0Var.setPadding(org.telegram.messenger.g0.L(org.telegram.messenger.hd.a0 ? 28.0f : 0.0f), 0, org.telegram.messenger.g0.L(org.telegram.messenger.hd.a0 ? 0.0f : 28.0f), 0);
        frameLayout.addView(nw0Var);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, c8.ma.d(26, 20.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        nw0Var.addTextChangedListener(new ow0(numberTextView, nw0Var));
        if (z10) {
            nw0Var.setText(stickerSet.title);
            nw0Var.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.o(frameLayout);
        t1Var.H = 4;
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(z10 ? 2131751342 : 2131751741, null), new a3.g(nw0Var, r10Var, context, z10, 7));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new ky(nw0Var, 22));
        org.telegram.ui.ActionBar.t1 p10 = alertDialog$Builder.p();
        p10.k0 = false;
        nw0Var.setOnEditorActionListener(new h(p10, 10));
    }
}
