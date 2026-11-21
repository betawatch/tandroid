package oi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import di.p6;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a70;
import org.telegram.ui.cx;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public abstract class h4 {
    public static EditTextBoldCursor a(Context context, h6 h6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        t6.U(editTextBoldCursor, m6.j5, h6Var);
        editTextBoldCursor.setHintText(str);
        t6.l(editTextBoldCursor, 34, m6.H6, h6Var);
        t6.l(editTextBoldCursor, 35, m6.L6, h6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        t6.F(editTextBoldCursor, m6.k6, m6.l6, m6.p7, h6Var);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        t6.C(editTextBoldCursor, m6.lg, h6Var);
        t6.l(editTextBoldCursor, 36, m6.mg, h6Var);
        return editTextBoldCursor;
    }

    public static a70 b(a70 a70Var, org.telegram.ui.ActionBar.g2 g2Var, final s3 s3Var, final boolean z10) {
        TL_iv.textButton textbutton;
        i4 i4Var = s3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (i4Var == null || (textbutton = i4Var.a) == null) ? null : textbutton.type;
        final int i7 = 1;
        if (inlineButtonType == null) {
            final int i10 = 0;
            a70Var.c(R.drawable.media_link_24, gd.N0(2131752214, null), new Runnable() { // from class: oi.d4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            h4.i(s3Var, z10);
                            break;
                        default:
                            h4.h(s3Var, z10);
                            break;
                    }
                }
            }, false);
            a70Var.c(R.drawable.msg_copy, gd.N0(2131751755, null), new Runnable() { // from class: oi.d4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            h4.i(s3Var, z10);
                            break;
                        default:
                            h4.h(s3Var, z10);
                            break;
                    }
                }
            }, false);
            a70Var.c(R.drawable.left_status_profile, gd.N0(2131745803, null), new p6(g2Var, s3Var, z10, 9), false);
            a70Var.a0();
            return a70Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            i(s3Var, z10);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            h(s3Var, z10);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            s3Var.f.r3(true);
            k(g2Var, z10, new e4(s3Var, 2));
        }
        return null;
    }

    public static a70 c(a70 a70Var, org.telegram.ui.ActionBar.g2 g2Var, final Context context, final h6 h6Var, final q3 q3Var, final boolean z10) {
        int i7 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType == null) {
            final int i10 = 0;
            a70Var.c(R.drawable.media_link_24, gd.N0(2131752214, null), new Runnable() { // from class: oi.f4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            h4.e(context, h6Var, q3Var, z10);
                            break;
                        default:
                            h4.d(context, h6Var, q3Var, z10);
                            break;
                    }
                }
            }, false);
            final int i11 = 1;
            a70Var.c(R.drawable.msg_copy, gd.N0(2131751755, null), new Runnable() { // from class: oi.f4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            h4.e(context, h6Var, q3Var, z10);
                            break;
                        default:
                            h4.d(context, h6Var, q3Var, z10);
                            break;
                    }
                }
            }, false);
            a70Var.c(R.drawable.left_status_profile, gd.N0(2131745803, null), new ai.i(g2Var, context, h6Var, q3Var, z10, 4), false);
            a70Var.a0();
            return a70Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            e(context, h6Var, q3Var, z10);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            d(context, h6Var, q3Var, z10);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            f(g2Var, context, h6Var, q3Var, z10);
        }
        return null;
    }

    public static void d(Context context, h6 h6Var, q3 q3Var, boolean z10) {
        boolean c10 = q3Var.c();
        int i7 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        g(context, h6Var, q3Var, z10, gd.N0(c10 ? 2131745806 : 2131745810, null), gd.N0(2131745814, null), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new c4(q3Var, 3));
    }

    public static void e(Context context, h6 h6Var, q3 q3Var, boolean z10) {
        boolean c10 = q3Var.c();
        int i7 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        g(context, h6Var, q3Var, z10, gd.N0(c10 ? 2131745805 : 2131745809, null), gd.N0(2131745812, null), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new c4(q3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.g2 g2Var, Context context, h6 h6Var, q3 q3Var, boolean z10) {
        boolean c10 = q3Var.c();
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        int i7 = 0;
        g10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String N0 = gd.N0(2131745813, null);
        int i10 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        EditTextBoldCursor a10 = a(context, h6Var, N0, pageButton == null ? "" : c6.l(pageButton.text));
        g10.addView(a10, ma.o(-1, 64));
        aa.c0 c0Var = new aa.c0(a10, g2Var, z10, q3Var, 7);
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(0, context, h6Var) : new org.telegram.ui.ActionBar.v1(0, context, h6Var);
        String N02 = gd.N0(c10 ? 2131745804 : 2131745808, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N02;
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(gd.N0(2131747637, null), new a3.g(c10, c0Var, a10, q3Var, 4));
        if (c10) {
            alertDialog$Builder.i(gd.N0(2131745811, null), new kg.x1(c0Var, 23));
            String N03 = gd.N0(2131751586, null);
            c4 c4Var = new c4(q3Var, 2);
            t1Var.q0 = N03;
            t1Var.r0 = c4Var;
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
            t1Var.K0 = true;
            i7 = -4;
        } else {
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
        }
        j(alertDialog$Builder, a10, i7, h6Var);
    }

    public static void g(Context context, h6 h6Var, q3 q3Var, boolean z10, String str, String str2, String str3, c4 c4Var) {
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String N0 = gd.N0(2131745813, null);
        int i7 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        EditTextBoldCursor a10 = a(context, h6Var, N0, pageButton == null ? "" : c6.l(pageButton.text));
        EditTextBoldCursor a11 = a(context, h6Var, str2, str3);
        g10.addView(a10, ma.o(-1, 64));
        g10.addView(a11, ma.o(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(0, context, h6Var) : new org.telegram.ui.ActionBar.v1(0, context, h6Var);
        alertDialog$Builder.a.S = str;
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(gd.N0(2131747637, null), new a3.h(a10, a11, c4Var, 17));
        if (q3Var.c()) {
            alertDialog$Builder.i(gd.N0(2131751586, null), new c4(q3Var, 0));
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
        } else {
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
        }
        if (!TextUtils.isEmpty(a10.getText())) {
            a10 = a11;
        }
        j(alertDialog$Builder, a10, q3Var.c() ? -3 : 0, h6Var);
    }

    public static void h(s3 s3Var, boolean z10) {
        TL_iv.textButton textbutton;
        i4 i4Var = s3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (i4Var == null || (textbutton = i4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String l10 = z11 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : c6.l(s3Var.e);
        s3Var.f.r3(false);
        s3Var.a.I(gd.N0(z11 ? 2131745806 : 2131745810, null), gd.N0(2131745814, null), l10, false, !z10, new e4(s3Var, 1));
    }

    public static void i(s3 s3Var, boolean z10) {
        TL_iv.textButton textbutton;
        i4 i4Var = s3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (i4Var == null || (textbutton = i4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z11 ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://";
        s3Var.f.r3(false);
        s3Var.a.I(gd.N0(z11 ? 2131745805 : 2131745809, null), gd.N0(2131745812, null), str, true, !z10, new e4(s3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i7, h6 h6Var) {
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.setOnShowListener(new bi.l(editTextBoldCursor, 3));
        t1Var.r(250L);
        if (i7 == 0 || !(t1Var.d(i7) instanceof TextView)) {
            return;
        }
        t6.U((TextView) t1Var.d(i7), m6.q7, h6Var);
    }

    public static void k(org.telegram.ui.ActionBar.g2 g2Var, boolean z10, g4 g4Var) {
        if (g2Var == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        cx cxVar = new cx(bundle);
        cxVar.E2 = new kg.x1(g4Var, 24);
        if (!z10) {
            g2Var.presentFragment(cxVar);
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
        e2Var.a = true;
        g2Var.showAsSheet(cxVar, e2Var);
    }
}
