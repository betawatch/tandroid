package org.telegram.ui.Components;

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class dw0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        int i7 = org.telegram.messenger.p10.s0;
        Context context = f2Var.getContext();
        fi.k2 k2Var = new fi.k2(context, f6Var, true, false);
        k2Var.v1 = new jg.a2(i7, context, tL_messages_stickerSet, 8);
        if (f2Var.visibleDialog != null) {
            k2Var.show();
        } else {
            f2Var.showDialog(k2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.f6 f6Var, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        String M0 = org.telegram.messenger.hd.M0(2131744860, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131744861, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new f2(18, runnable, stickerSet));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        u1Var.show();
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, f6Var);
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.f6 f6Var, Context context, org.telegram.messenger.v10 v10Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        boolean z9 = stickerSet != null;
        String M0 = org.telegram.messenger.hd.M0(z9 ? 2131751223 : 2131748261, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131744865, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        bw0 bw0Var = new bw0(context);
        int i7 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(bw0Var, i7, f6Var);
        bw0Var.setInputType(16385);
        bw0Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(bw0Var, i7, f6Var);
        org.telegram.ui.ActionBar.r6.m(bw0Var, 36, org.telegram.ui.ActionBar.k6.jg, f6Var);
        org.telegram.ui.ActionBar.r6.m(bw0Var, 35, org.telegram.ui.ActionBar.k6.L6, f6Var);
        bw0Var.setSingleLine(true);
        bw0Var.setFocusable(true);
        bw0Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new yj(1, bw0Var)});
        org.telegram.ui.ActionBar.r6.G(bw0Var, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, f6Var);
        bw0Var.setImeOptions(6);
        bw0Var.setBackground(null);
        bw0Var.requestFocus();
        bw0Var.setPadding(org.telegram.messenger.g0.L(org.telegram.messenger.hd.a0 ? 28.0f : 0.0f), 0, org.telegram.messenger.g0.L(org.telegram.messenger.hd.a0 ? 0.0f : 28.0f), 0);
        frameLayout.addView(bw0Var);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, c8.ha.d(26, 20.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        bw0Var.addTextChangedListener(new cw0(numberTextView, bw0Var));
        if (z9) {
            bw0Var.setText(stickerSet.title);
            bw0Var.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.o(frameLayout);
        u1Var.G = 4;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(z9 ? 2131751355 : 2131751753, null), new a3.g(bw0Var, v10Var, context, z9, 6));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new ax(bw0Var, 23));
        org.telegram.ui.ActionBar.u1 p10 = alertDialog$Builder.p();
        p10.j0 = false;
        bw0Var.setOnEditorActionListener(new t0(p10, 9));
    }
}
