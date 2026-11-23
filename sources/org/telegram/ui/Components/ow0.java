package org.telegram.ui.Components;

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class ow0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        int i7 = org.telegram.messenger.i10.t0;
        Context context = g2Var.getContext();
        hi.r2 r2Var = new hi.r2(context, i6Var, true, false);
        r2Var.z1 = new ai.o1(i7, context, tL_messages_stickerSet, 10);
        if (g2Var.visibleDialog != null) {
            r2Var.show();
        } else {
            g2Var.showDialog(r2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.i6 i6Var, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String N0 = org.telegram.messenger.gd.N0(2131744618, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131744619, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new g2(21, runnable, stickerSet));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        t1Var.show();
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, i6Var);
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.i6 i6Var, Context context, org.telegram.messenger.p10 p10Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        boolean z10 = stickerSet != null;
        String N0 = org.telegram.messenger.gd.N0(z10 ? 2131751210 : 2131748069, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131744623, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        mw0 mw0Var = new mw0(context);
        int i7 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.U(mw0Var, i7, i6Var);
        mw0Var.setInputType(16385);
        mw0Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(mw0Var, i7, i6Var);
        org.telegram.ui.ActionBar.u6.l(mw0Var, 36, org.telegram.ui.ActionBar.n6.mg, i6Var);
        org.telegram.ui.ActionBar.u6.l(mw0Var, 35, org.telegram.ui.ActionBar.n6.L6, i6Var);
        mw0Var.setSingleLine(true);
        mw0Var.setFocusable(true);
        mw0Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new nk(1, mw0Var)});
        org.telegram.ui.ActionBar.u6.F(mw0Var, org.telegram.ui.ActionBar.n6.k6, org.telegram.ui.ActionBar.n6.l6, org.telegram.ui.ActionBar.n6.p7, i6Var);
        mw0Var.setImeOptions(6);
        mw0Var.setBackground(null);
        mw0Var.requestFocus();
        mw0Var.setPadding(org.telegram.messenger.g0.L(org.telegram.messenger.gd.a0 ? 28.0f : 0.0f), 0, org.telegram.messenger.g0.L(org.telegram.messenger.gd.a0 ? 0.0f : 28.0f), 0);
        frameLayout.addView(mw0Var);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, c8.na.d(26, 20.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        mw0Var.addTextChangedListener(new nw0(numberTextView, mw0Var));
        if (z10) {
            mw0Var.setText(stickerSet.title);
            mw0Var.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.o(frameLayout);
        t1Var.H = 4;
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(z10 ? 2131751342 : 2131751741, null), new a3.g(mw0Var, p10Var, context, z10, 7));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new hy(mw0Var, 22));
        org.telegram.ui.ActionBar.t1 p10 = alertDialog$Builder.p();
        p10.k0 = false;
        mw0Var.setOnEditorActionListener(new g(p10, 10));
    }
}
