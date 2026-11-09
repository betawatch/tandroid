package org.telegram.ui.Components;

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class ew0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        int i7 = org.telegram.messenger.p10.s0;
        Context context = f2Var.getContext();
        fi.k2 k2Var = new fi.k2(context, g6Var, true, false);
        k2Var.v1 = new jg.a2(i7, context, tL_messages_stickerSet, 8);
        if (f2Var.visibleDialog != null) {
            k2Var.show();
        } else {
            f2Var.showDialog(k2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.g6 g6Var, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var);
        String M0 = org.telegram.messenger.id.M0(2131744859, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131744860, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new f2(18, runnable, stickerSet));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        u1Var.show();
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, g6Var);
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.g6 g6Var, Context context, org.telegram.messenger.v10 v10Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var);
        boolean z9 = stickerSet != null;
        String M0 = org.telegram.messenger.id.M0(z9 ? 2131751222 : 2131748262, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131744864, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        cw0 cw0Var = new cw0(context);
        int i7 = org.telegram.ui.ActionBar.l6.j5;
        org.telegram.ui.ActionBar.s6.U(cw0Var, i7, g6Var);
        cw0Var.setInputType(16385);
        cw0Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.s6.U(cw0Var, i7, g6Var);
        org.telegram.ui.ActionBar.s6.l(cw0Var, 36, org.telegram.ui.ActionBar.l6.jg, g6Var);
        org.telegram.ui.ActionBar.s6.l(cw0Var, 35, org.telegram.ui.ActionBar.l6.L6, g6Var);
        cw0Var.setSingleLine(true);
        cw0Var.setFocusable(true);
        cw0Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new yj(1, cw0Var)});
        org.telegram.ui.ActionBar.s6.F(cw0Var, org.telegram.ui.ActionBar.l6.k6, org.telegram.ui.ActionBar.l6.l6, org.telegram.ui.ActionBar.l6.p7, g6Var);
        cw0Var.setImeOptions(6);
        cw0Var.setBackground(null);
        cw0Var.requestFocus();
        cw0Var.setPadding(org.telegram.messenger.g0.L(org.telegram.messenger.id.a0 ? 28.0f : 0.0f), 0, org.telegram.messenger.g0.L(org.telegram.messenger.id.a0 ? 0.0f : 28.0f), 0);
        frameLayout.addView(cw0Var);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, c8.ha.d(26, 20.0f, (org.telegram.messenger.id.a0 ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        cw0Var.addTextChangedListener(new dw0(numberTextView, cw0Var));
        if (z9) {
            cw0Var.setText(stickerSet.title);
            cw0Var.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.o(frameLayout);
        u1Var.G = 4;
        alertDialog$Builder.k(org.telegram.messenger.id.M0(z9 ? 2131751354 : 2131751753, null), new a3.g(cw0Var, v10Var, context, z9, 6));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new bx(cw0Var, 23));
        org.telegram.ui.ActionBar.u1 p10 = alertDialog$Builder.p();
        p10.j0 = false;
        cw0Var.setOnEditorActionListener(new t0(p10, 9));
    }
}
