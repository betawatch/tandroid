package org.telegram.ui.Components;

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class nw0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        int i7 = org.telegram.messenger.j10.t0;
        Context context = h2Var.getContext();
        hi.j2 j2Var = new hi.j2(context, i6Var, true, false);
        j2Var.z1 = new ai.r1(i7, context, tL_messages_stickerSet, 10);
        if (h2Var.visibleDialog != null) {
            j2Var.show();
        } else {
            h2Var.showDialog(j2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.i6 i6Var, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String M0 = org.telegram.messenger.gd.M0(2131744624, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.M0(2131744625, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new g2(21, runnable, stickerSet));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        u1Var.show();
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, i6Var);
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.i6 i6Var, Context context, org.telegram.messenger.q10 q10Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        boolean z10 = stickerSet != null;
        String M0 = org.telegram.messenger.gd.M0(z10 ? 2131751211 : 2131748070, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.M0(2131744629, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        lw0 lw0Var = new lw0(context);
        int i7 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.U(lw0Var, i7, i6Var);
        lw0Var.setInputType(16385);
        lw0Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(lw0Var, i7, i6Var);
        org.telegram.ui.ActionBar.u6.l(lw0Var, 36, org.telegram.ui.ActionBar.n6.mg, i6Var);
        org.telegram.ui.ActionBar.u6.l(lw0Var, 35, org.telegram.ui.ActionBar.n6.L6, i6Var);
        lw0Var.setSingleLine(true);
        lw0Var.setFocusable(true);
        lw0Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new nk(1, lw0Var)});
        org.telegram.ui.ActionBar.u6.F(lw0Var, org.telegram.ui.ActionBar.n6.k6, org.telegram.ui.ActionBar.n6.l6, org.telegram.ui.ActionBar.n6.p7, i6Var);
        lw0Var.setImeOptions(6);
        lw0Var.setBackground(null);
        lw0Var.requestFocus();
        lw0Var.setPadding(org.telegram.messenger.g0.L(org.telegram.messenger.gd.a0 ? 28.0f : 0.0f), 0, org.telegram.messenger.g0.L(org.telegram.messenger.gd.a0 ? 0.0f : 28.0f), 0);
        frameLayout.addView(lw0Var);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, c8.ma.d(26, 20.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        lw0Var.addTextChangedListener(new mw0(numberTextView, lw0Var));
        if (z10) {
            lw0Var.setText(stickerSet.title);
            lw0Var.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.o(frameLayout);
        u1Var.H = 4;
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(z10 ? 2131751343 : 2131751742, null), new a3.g(lw0Var, q10Var, context, z10, 7));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new iy(lw0Var, 22));
        org.telegram.ui.ActionBar.u1 p10 = alertDialog$Builder.p();
        p10.k0 = false;
        lw0Var.setOnEditorActionListener(new g(p10, 10));
    }
}
