package oi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import di.m6;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.m60;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public abstract class e4 {
    public static EditTextBoldCursor a(Context context, e6 e6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        q6.U(editTextBoldCursor, j6.j5, e6Var);
        editTextBoldCursor.setHintText(str);
        q6.l(editTextBoldCursor, 34, j6.H6, e6Var);
        q6.l(editTextBoldCursor, 35, j6.L6, e6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        q6.F(editTextBoldCursor, j6.k6, j6.l6, j6.p7, e6Var);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        q6.C(editTextBoldCursor, j6.lg, e6Var);
        q6.l(editTextBoldCursor, 36, j6.mg, e6Var);
        return editTextBoldCursor;
    }

    public static m60 b(m60 m60Var, org.telegram.ui.ActionBar.e2 e2Var, final p3 p3Var, final boolean z10) {
        TL_iv.textButton textbutton;
        f4 f4Var = p3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (f4Var == null || (textbutton = f4Var.a) == null) ? null : textbutton.type;
        final int i7 = 1;
        if (inlineButtonType == null) {
            final int i10 = 0;
            m60Var.c(R.drawable.media_link_24, hd.M0(2131752226, null), new Runnable() { // from class: oi.a4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            e4.i(p3Var, z10);
                            break;
                        default:
                            e4.h(p3Var, z10);
                            break;
                    }
                }
            }, false);
            m60Var.c(R.drawable.msg_copy, hd.M0(2131751767, null), new Runnable() { // from class: oi.a4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            e4.i(p3Var, z10);
                            break;
                        default:
                            e4.h(p3Var, z10);
                            break;
                    }
                }
            }, false);
            m60Var.c(R.drawable.left_status_profile, hd.M0(2131745999, null), new m6(e2Var, p3Var, z10, 9), false);
            m60Var.Z();
            return m60Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            i(p3Var, z10);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            h(p3Var, z10);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            p3Var.f.r3(true);
            k(e2Var, z10, new b4(p3Var, 2));
        }
        return null;
    }

    public static m60 c(m60 m60Var, org.telegram.ui.ActionBar.e2 e2Var, final Context context, final e6 e6Var, final n3 n3Var, final boolean z10) {
        int i7 = n3Var.b;
        TL_iv.pageBlockButtonRow d = n3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType == null) {
            final int i10 = 0;
            m60Var.c(R.drawable.media_link_24, hd.M0(2131752226, null), new Runnable() { // from class: oi.c4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            e4.e(context, e6Var, n3Var, z10);
                            break;
                        default:
                            e4.d(context, e6Var, n3Var, z10);
                            break;
                    }
                }
            }, false);
            final int i11 = 1;
            m60Var.c(R.drawable.msg_copy, hd.M0(2131751767, null), new Runnable() { // from class: oi.c4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            e4.e(context, e6Var, n3Var, z10);
                            break;
                        default:
                            e4.d(context, e6Var, n3Var, z10);
                            break;
                    }
                }
            }, false);
            m60Var.c(R.drawable.left_status_profile, hd.M0(2131745999, null), new ai.j(e2Var, context, e6Var, n3Var, z10, 5), false);
            m60Var.Z();
            return m60Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            e(context, e6Var, n3Var, z10);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            d(context, e6Var, n3Var, z10);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            f(e2Var, context, e6Var, n3Var, z10);
        }
        return null;
    }

    public static void d(Context context, e6 e6Var, n3 n3Var, boolean z10) {
        boolean c10 = n3Var.c();
        int i7 = n3Var.b;
        TL_iv.pageBlockButtonRow d = n3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        g(context, e6Var, n3Var, z10, hd.M0(c10 ? 2131746002 : 2131746006, null), hd.M0(2131746010, null), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new z3(n3Var, 3));
    }

    public static void e(Context context, e6 e6Var, n3 n3Var, boolean z10) {
        boolean c10 = n3Var.c();
        int i7 = n3Var.b;
        TL_iv.pageBlockButtonRow d = n3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        g(context, e6Var, n3Var, z10, hd.M0(c10 ? 2131746001 : 2131746005, null), hd.M0(2131746008, null), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new z3(n3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.e2 e2Var, Context context, e6 e6Var, n3 n3Var, boolean z10) {
        boolean c10 = n3Var.c();
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        int i7 = 0;
        f10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = hd.M0(2131746009, null);
        int i10 = n3Var.b;
        TL_iv.pageBlockButtonRow d = n3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        EditTextBoldCursor a10 = a(context, e6Var, M0, pageButton == null ? "" : a6.l(pageButton.text));
        f10.addView(a10, ja.o(-1, 64));
        aa.c0 c0Var = new aa.c0(a10, e2Var, z10, n3Var, 7);
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(0, context, e6Var) : new org.telegram.ui.ActionBar.v1(0, context, e6Var);
        String M02 = hd.M0(c10 ? 2131746000 : 2131746004, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M02;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(hd.M0(2131747831, null), new a3.g(c10, c0Var, a10, n3Var, 3));
        if (c10) {
            alertDialog$Builder.i(hd.M0(2131746007, null), new ki.e(c0Var, 21));
            String M03 = hd.M0(2131751598, null);
            z3 z3Var = new z3(n3Var, 2);
            t1Var.q0 = M03;
            t1Var.r0 = z3Var;
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
            t1Var.K0 = true;
            i7 = -4;
        } else {
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
        }
        j(alertDialog$Builder, a10, i7, e6Var);
    }

    public static void g(Context context, e6 e6Var, n3 n3Var, boolean z10, String str, String str2, String str3, z3 z3Var) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = hd.M0(2131746009, null);
        int i7 = n3Var.b;
        TL_iv.pageBlockButtonRow d = n3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        EditTextBoldCursor a10 = a(context, e6Var, M0, pageButton == null ? "" : a6.l(pageButton.text));
        EditTextBoldCursor a11 = a(context, e6Var, str2, str3);
        f10.addView(a10, ja.o(-1, 64));
        f10.addView(a11, ja.o(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(0, context, e6Var) : new org.telegram.ui.ActionBar.v1(0, context, e6Var);
        alertDialog$Builder.a.S = str;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(hd.M0(2131747831, null), new a3.h(a10, a11, z3Var, 17));
        if (n3Var.c()) {
            alertDialog$Builder.i(hd.M0(2131751598, null), new z3(n3Var, 0));
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
        } else {
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
        }
        if (!TextUtils.isEmpty(a10.getText())) {
            a10 = a11;
        }
        j(alertDialog$Builder, a10, n3Var.c() ? -3 : 0, e6Var);
    }

    public static void h(p3 p3Var, boolean z10) {
        TL_iv.textButton textbutton;
        f4 f4Var = p3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (f4Var == null || (textbutton = f4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String l10 = z11 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : a6.l(p3Var.e);
        p3Var.f.r3(false);
        p3Var.a.I(hd.M0(z11 ? 2131746002 : 2131746006, null), hd.M0(2131746010, null), l10, false, !z10, new b4(p3Var, 1));
    }

    public static void i(p3 p3Var, boolean z10) {
        TL_iv.textButton textbutton;
        f4 f4Var = p3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (f4Var == null || (textbutton = f4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z11 ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://";
        p3Var.f.r3(false);
        p3Var.a.I(hd.M0(z11 ? 2131746001 : 2131746005, null), hd.M0(2131746008, null), str, true, !z10, new b4(p3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i7, e6 e6Var) {
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.setOnShowListener(new bi.l(editTextBoldCursor, 3));
        t1Var.r(250L);
        if (i7 == 0 || !(t1Var.d(i7) instanceof TextView)) {
            return;
        }
        q6.U((TextView) t1Var.d(i7), j6.q7, e6Var);
    }

    public static void k(org.telegram.ui.ActionBar.e2 e2Var, boolean z10, d4 d4Var) {
        if (e2Var == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        yw ywVar = new yw(bundle);
        ywVar.E2 = new ki.e(d4Var, 22);
        if (!z10) {
            e2Var.presentFragment(ywVar);
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2();
        c2Var.a = true;
        e2Var.showAsSheet(ywVar, c2Var);
    }
}
