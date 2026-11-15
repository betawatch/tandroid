package org.telegram.ui.Components;

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class gw0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        int i7 = org.telegram.messenger.m10.t0;
        Context context = e2Var.getContext();
        hi.i2 i2Var = new hi.i2(context, e6Var, true, false);
        i2Var.z1 = new ai.r1(i7, context, tL_messages_stickerSet, 9);
        if (e2Var.visibleDialog != null) {
            i2Var.show();
        } else {
            e2Var.showDialog(i2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.e6 e6Var, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = org.telegram.messenger.hd.M0(2131744859, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131744860, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new f1(22, runnable, stickerSet));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        t1Var.show();
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, e6Var);
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.e6 e6Var, Context context, org.telegram.messenger.s10 s10Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        boolean z10 = stickerSet != null;
        String M0 = org.telegram.messenger.hd.M0(z10 ? 2131751222 : 2131748262, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131744864, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        ew0 ew0Var = new ew0(context);
        int i7 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.U(ew0Var, i7, e6Var);
        ew0Var.setInputType(16385);
        ew0Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(ew0Var, i7, e6Var);
        org.telegram.ui.ActionBar.q6.l(ew0Var, 36, org.telegram.ui.ActionBar.j6.mg, e6Var);
        org.telegram.ui.ActionBar.q6.l(ew0Var, 35, org.telegram.ui.ActionBar.j6.L6, e6Var);
        ew0Var.setSingleLine(true);
        ew0Var.setFocusable(true);
        ew0Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new gk(1, ew0Var)});
        org.telegram.ui.ActionBar.q6.F(ew0Var, org.telegram.ui.ActionBar.j6.k6, org.telegram.ui.ActionBar.j6.l6, org.telegram.ui.ActionBar.j6.p7, e6Var);
        ew0Var.setImeOptions(6);
        ew0Var.setBackground(null);
        ew0Var.requestFocus();
        ew0Var.setPadding(org.telegram.messenger.g0.L(org.telegram.messenger.hd.a0 ? 28.0f : 0.0f), 0, org.telegram.messenger.g0.L(org.telegram.messenger.hd.a0 ? 0.0f : 28.0f), 0);
        frameLayout.addView(ew0Var);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, c8.ja.d(26, 20.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        ew0Var.addTextChangedListener(new fw0(numberTextView, ew0Var));
        if (z10) {
            ew0Var.setText(stickerSet.title);
            ew0Var.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.o(frameLayout);
        t1Var.H = 4;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(z10 ? 2131751354 : 2131751753, null), new a3.g(ew0Var, s10Var, context, z10, 6));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new gx(ew0Var, 23));
        org.telegram.ui.ActionBar.t1 p10 = alertDialog$Builder.p();
        p10.k0 = false;
        ew0Var.setOnEditorActionListener(new q0(p10, 9));
    }
}
