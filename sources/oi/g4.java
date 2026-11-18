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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.y60;
import org.telegram.ui.cx;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public abstract class g4 {
    public static EditTextBoldCursor a(Context context, i6 i6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        u6.U(editTextBoldCursor, n6.j5, i6Var);
        editTextBoldCursor.setHintText(str);
        u6.l(editTextBoldCursor, 34, n6.H6, i6Var);
        u6.l(editTextBoldCursor, 35, n6.L6, i6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        u6.F(editTextBoldCursor, n6.k6, n6.l6, n6.p7, i6Var);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        u6.C(editTextBoldCursor, n6.lg, i6Var);
        u6.l(editTextBoldCursor, 36, n6.mg, i6Var);
        return editTextBoldCursor;
    }

    public static y60 b(y60 y60Var, org.telegram.ui.ActionBar.h2 h2Var, final r3 r3Var, final boolean z10) {
        TL_iv.textButton textbutton;
        h4 h4Var = r3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (h4Var == null || (textbutton = h4Var.a) == null) ? null : textbutton.type;
        final int i7 = 1;
        if (inlineButtonType == null) {
            final int i10 = 0;
            y60Var.c(R.drawable.media_link_24, gd.M0(2131752215, null), new Runnable() { // from class: oi.c4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            g4.i(r3Var, z10);
                            break;
                        default:
                            g4.h(r3Var, z10);
                            break;
                    }
                }
            }, false);
            y60Var.c(R.drawable.msg_copy, gd.M0(2131751756, null), new Runnable() { // from class: oi.c4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            g4.i(r3Var, z10);
                            break;
                        default:
                            g4.h(r3Var, z10);
                            break;
                    }
                }
            }, false);
            y60Var.c(R.drawable.left_status_profile, gd.M0(2131745804, null), new p6(h2Var, r3Var, z10, 9), false);
            y60Var.a0();
            return y60Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            i(r3Var, z10);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            h(r3Var, z10);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            r3Var.f.r3(true);
            k(h2Var, z10, new d4(r3Var, 2));
        }
        return null;
    }

    public static y60 c(y60 y60Var, org.telegram.ui.ActionBar.h2 h2Var, final Context context, final i6 i6Var, final p3 p3Var, final boolean z10) {
        int i7 = p3Var.b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType == null) {
            final int i10 = 0;
            y60Var.c(R.drawable.media_link_24, gd.M0(2131752215, null), new Runnable() { // from class: oi.e4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            g4.e(context, i6Var, p3Var, z10);
                            break;
                        default:
                            g4.d(context, i6Var, p3Var, z10);
                            break;
                    }
                }
            }, false);
            final int i11 = 1;
            y60Var.c(R.drawable.msg_copy, gd.M0(2131751756, null), new Runnable() { // from class: oi.e4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            g4.e(context, i6Var, p3Var, z10);
                            break;
                        default:
                            g4.d(context, i6Var, p3Var, z10);
                            break;
                    }
                }
            }, false);
            y60Var.c(R.drawable.left_status_profile, gd.M0(2131745804, null), new ai.n(h2Var, context, i6Var, p3Var, z10, 4), false);
            y60Var.a0();
            return y60Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            e(context, i6Var, p3Var, z10);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            d(context, i6Var, p3Var, z10);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            f(h2Var, context, i6Var, p3Var, z10);
        }
        return null;
    }

    public static void d(Context context, i6 i6Var, p3 p3Var, boolean z10) {
        boolean c10 = p3Var.c();
        int i7 = p3Var.b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        g(context, i6Var, p3Var, z10, gd.M0(c10 ? 2131745807 : 2131745811, null), gd.M0(2131745815, null), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new b4(p3Var, 3));
    }

    public static void e(Context context, i6 i6Var, p3 p3Var, boolean z10) {
        boolean c10 = p3Var.c();
        int i7 = p3Var.b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        g(context, i6Var, p3Var, z10, gd.M0(c10 ? 2131745806 : 2131745810, null), gd.M0(2131745813, null), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new b4(p3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.h2 h2Var, Context context, i6 i6Var, p3 p3Var, boolean z10) {
        boolean c10 = p3Var.c();
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        int i7 = 0;
        g10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = gd.M0(2131745814, null);
        int i10 = p3Var.b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        EditTextBoldCursor a10 = a(context, i6Var, M0, pageButton == null ? "" : b6.l(pageButton.text));
        g10.addView(a10, ma.o(-1, 64));
        aa.c0 c0Var = new aa.c0(a10, h2Var, z10, p3Var, 7);
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(0, context, i6Var) : new org.telegram.ui.ActionBar.w1(0, context, i6Var);
        String M02 = gd.M0(c10 ? 2131745805 : 2131745809, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M02;
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(gd.M0(2131747638, null), new a3.g(c10, c0Var, a10, p3Var, 4));
        if (c10) {
            alertDialog$Builder.i(gd.M0(2131745812, null), new ki.e(c0Var, 22));
            String M03 = gd.M0(2131751587, null);
            b4 b4Var = new b4(p3Var, 2);
            u1Var.q0 = M03;
            u1Var.r0 = b4Var;
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
            u1Var.K0 = true;
            i7 = -4;
        } else {
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
        }
        j(alertDialog$Builder, a10, i7, i6Var);
    }

    public static void g(Context context, i6 i6Var, p3 p3Var, boolean z10, String str, String str2, String str3, b4 b4Var) {
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = gd.M0(2131745814, null);
        int i7 = p3Var.b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        EditTextBoldCursor a10 = a(context, i6Var, M0, pageButton == null ? "" : b6.l(pageButton.text));
        EditTextBoldCursor a11 = a(context, i6Var, str2, str3);
        g10.addView(a10, ma.o(-1, 64));
        g10.addView(a11, ma.o(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(0, context, i6Var) : new org.telegram.ui.ActionBar.w1(0, context, i6Var);
        alertDialog$Builder.a.S = str;
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(gd.M0(2131747638, null), new a3.h(a10, a11, b4Var, 17));
        if (p3Var.c()) {
            alertDialog$Builder.i(gd.M0(2131751587, null), new b4(p3Var, 0));
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
        } else {
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
        }
        if (!TextUtils.isEmpty(a10.getText())) {
            a10 = a11;
        }
        j(alertDialog$Builder, a10, p3Var.c() ? -3 : 0, i6Var);
    }

    public static void h(r3 r3Var, boolean z10) {
        TL_iv.textButton textbutton;
        h4 h4Var = r3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (h4Var == null || (textbutton = h4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String l10 = z11 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : b6.l(r3Var.e);
        r3Var.f.r3(false);
        r3Var.a.I(gd.M0(z11 ? 2131745807 : 2131745811, null), gd.M0(2131745815, null), l10, false, !z10, new d4(r3Var, 1));
    }

    public static void i(r3 r3Var, boolean z10) {
        TL_iv.textButton textbutton;
        h4 h4Var = r3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (h4Var == null || (textbutton = h4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z11 ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://";
        r3Var.f.r3(false);
        r3Var.a.I(gd.M0(z11 ? 2131745806 : 2131745810, null), gd.M0(2131745813, null), str, true, !z10, new d4(r3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i7, i6 i6Var) {
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.setOnShowListener(new bi.l(editTextBoldCursor, 3));
        u1Var.r(250L);
        if (i7 == 0 || !(u1Var.d(i7) instanceof TextView)) {
            return;
        }
        u6.U((TextView) u1Var.d(i7), n6.q7, i6Var);
    }

    public static void k(org.telegram.ui.ActionBar.h2 h2Var, boolean z10, f4 f4Var) {
        if (h2Var == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        cx cxVar = new cx(bundle);
        cxVar.E2 = new ki.e(f4Var, 23);
        if (!z10) {
            h2Var.presentFragment(cxVar);
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2();
        f2Var.a = true;
        h2Var.showAsSheet(cxVar, f2Var);
    }
}
