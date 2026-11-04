package org.telegram.ui.Components;

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class cw0 {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        int i3 = org.telegram.messenger.h10.t0;
        Context context = d2Var.getContext();
        gi.i2 i2Var = new gi.i2(context, e6Var, true, false);
        i2Var.w1 = new k2.y(i3, context, tL_messages_stickerSet, 10);
        if (d2Var.visibleDialog != null) {
            i2Var.show();
        } else {
            d2Var.showDialog(i2Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.e6 e6Var, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = org.telegram.messenger.bd.M0(2131744869, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131744870, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.jo(runnable, stickerSet));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        s1Var.show();
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, e6Var);
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, org.telegram.ui.ActionBar.e6 e6Var, Context context, org.telegram.messenger.n10 n10Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        boolean z10 = stickerSet != null;
        String M0 = org.telegram.messenger.bd.M0(z10 ? 2131751223 : 2131748270, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131744874, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        aw0 aw0Var = new aw0(context);
        int i3 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(aw0Var, i3, e6Var);
        aw0Var.setInputType(16385);
        aw0Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(aw0Var, i3, e6Var);
        org.telegram.ui.ActionBar.r6.m(aw0Var, 36, org.telegram.ui.ActionBar.k6.jg, e6Var);
        org.telegram.ui.ActionBar.r6.m(aw0Var, 35, org.telegram.ui.ActionBar.k6.L6, e6Var);
        aw0Var.setSingleLine(true);
        aw0Var.setFocusable(true);
        aw0Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new xj(1, aw0Var)});
        org.telegram.ui.ActionBar.r6.G(aw0Var, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, e6Var);
        aw0Var.setImeOptions(6);
        aw0Var.setBackground(null);
        aw0Var.requestFocus();
        aw0Var.setPadding(org.telegram.messenger.g0.L(org.telegram.messenger.bd.a0 ? 28.0f : 0.0f), 0, org.telegram.messenger.g0.L(org.telegram.messenger.bd.a0 ? 0.0f : 28.0f), 0);
        frameLayout.addView(aw0Var);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, b8.mf.d(26, 20.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        aw0Var.addTextChangedListener(new bw0(numberTextView, aw0Var));
        if (z10) {
            aw0Var.setText(stickerSet.title);
            aw0Var.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.o(frameLayout);
        s1Var.H = 4;
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(z10 ? 2131751355 : 2131751753, null), new ga.b(aw0Var, n10Var, context, z10, 5));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new zw(aw0Var, 23));
        org.telegram.ui.ActionBar.s1 p10 = alertDialog$Builder.p();
        p10.k0 = false;
        aw0Var.setOnEditorActionListener(new s0(p10, 9));
    }
}
