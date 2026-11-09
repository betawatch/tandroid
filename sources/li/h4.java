package li;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.u7;
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.l60;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public abstract class h4 {
    public static EditTextBoldCursor a(Context context, g6 g6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        s6.U(editTextBoldCursor, l6.j5, g6Var);
        editTextBoldCursor.setHintText(str);
        s6.l(editTextBoldCursor, 34, l6.H6, g6Var);
        s6.l(editTextBoldCursor, 35, l6.L6, g6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        s6.F(editTextBoldCursor, l6.k6, l6.l6, l6.p7, g6Var);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        s6.C(editTextBoldCursor, l6.ig, g6Var);
        s6.l(editTextBoldCursor, 36, l6.jg, g6Var);
        return editTextBoldCursor;
    }

    public static l60 b(l60 l60Var, org.telegram.ui.ActionBar.f2 f2Var, final s3 s3Var, final boolean z9) {
        TL_iv.textButton textbutton;
        i4 i4Var = s3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (i4Var == null || (textbutton = i4Var.a) == null) ? null : textbutton.type;
        final int i7 = 1;
        if (inlineButtonType == null) {
            final int i10 = 0;
            l60Var.c(R.drawable.media_link_24, id.M0(2131752226, null), new Runnable() { // from class: li.d4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            h4.i(s3Var, z9);
                            break;
                        default:
                            h4.h(s3Var, z9);
                            break;
                    }
                }
            }, false);
            l60Var.c(R.drawable.msg_copy, id.M0(2131751767, null), new Runnable() { // from class: li.d4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            h4.i(s3Var, z9);
                            break;
                        default:
                            h4.h(s3Var, z9);
                            break;
                    }
                }
            }, false);
            l60Var.c(R.drawable.left_status_profile, id.M0(2131745999, null), new u7(f2Var, s3Var, z9, 9), false);
            l60Var.Z();
            return l60Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            i(s3Var, z9);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            h(s3Var, z9);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            s3Var.f.r3(true);
            k(f2Var, z9, new e4(s3Var, 2));
        }
        return null;
    }

    public static l60 c(l60 l60Var, org.telegram.ui.ActionBar.f2 f2Var, final Context context, final g6 g6Var, final q3 q3Var, final boolean z9) {
        int i7 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType == null) {
            final int i10 = 0;
            l60Var.c(R.drawable.media_link_24, id.M0(2131752226, null), new Runnable() { // from class: li.f4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            h4.e(context, g6Var, q3Var, z9);
                            break;
                        default:
                            h4.d(context, g6Var, q3Var, z9);
                            break;
                    }
                }
            }, false);
            final int i11 = 1;
            l60Var.c(R.drawable.msg_copy, id.M0(2131751767, null), new Runnable() { // from class: li.f4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            h4.e(context, g6Var, q3Var, z9);
                            break;
                        default:
                            h4.d(context, g6Var, q3Var, z9);
                            break;
                    }
                }
            }, false);
            l60Var.c(R.drawable.left_status_profile, id.M0(2131745999, null), new fi.q1(f2Var, context, g6Var, q3Var, z9, 3), false);
            l60Var.Z();
            return l60Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            e(context, g6Var, q3Var, z9);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            d(context, g6Var, q3Var, z9);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            f(f2Var, context, g6Var, q3Var, z9);
        }
        return null;
    }

    public static void d(Context context, g6 g6Var, q3 q3Var, boolean z9) {
        boolean c10 = q3Var.c();
        int i7 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        g(context, g6Var, q3Var, z9, id.M0(c10 ? 2131746002 : 2131746006, null), id.M0(2131746010, null), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new c4(q3Var, 3));
    }

    public static void e(Context context, g6 g6Var, q3 q3Var, boolean z9) {
        boolean c10 = q3Var.c();
        int i7 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        g(context, g6Var, q3Var, z9, id.M0(c10 ? 2131746001 : 2131746005, null), id.M0(2131746008, null), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new c4(q3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.f2 f2Var, Context context, g6 g6Var, q3 q3Var, boolean z9) {
        boolean c10 = q3Var.c();
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        int i7 = 0;
        f10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = id.M0(2131746009, null);
        int i10 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        EditTextBoldCursor a10 = a(context, g6Var, M0, pageButton == null ? "" : c6.l(pageButton.text));
        f10.addView(a10, ha.o(-1, 64));
        aa.d0 d0Var = new aa.d0(a10, f2Var, z9, q3Var, 7);
        AlertDialog$Builder alertDialog$Builder = z9 ? new AlertDialog$Builder(0, context, g6Var) : new org.telegram.ui.ActionBar.w1(0, context, g6Var);
        String M02 = id.M0(c10 ? 2131746000 : 2131746004, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M02;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(id.M0(2131747831, null), new a3.g(c10, d0Var, a10, q3Var, 3));
        if (c10) {
            alertDialog$Builder.i(id.M0(2131746007, null), new l2.x(d0Var, 8));
            String M03 = id.M0(2131751598, null);
            c4 c4Var = new c4(q3Var, 2);
            u1Var.p0 = M03;
            u1Var.q0 = c4Var;
            alertDialog$Builder.h(id.M0(2131752589, null), null);
            u1Var.J0 = true;
            i7 = -4;
        } else {
            alertDialog$Builder.h(id.M0(2131752589, null), null);
        }
        j(alertDialog$Builder, a10, i7, g6Var);
    }

    public static void g(Context context, g6 g6Var, q3 q3Var, boolean z9, String str, String str2, String str3, c4 c4Var) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = id.M0(2131746009, null);
        int i7 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        EditTextBoldCursor a10 = a(context, g6Var, M0, pageButton == null ? "" : c6.l(pageButton.text));
        EditTextBoldCursor a11 = a(context, g6Var, str2, str3);
        f10.addView(a10, ha.o(-1, 64));
        f10.addView(a11, ha.o(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z9 ? new AlertDialog$Builder(0, context, g6Var) : new org.telegram.ui.ActionBar.w1(0, context, g6Var);
        alertDialog$Builder.a.R = str;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(id.M0(2131747831, null), new a3.h(a10, a11, c4Var, 16));
        if (q3Var.c()) {
            alertDialog$Builder.i(id.M0(2131751598, null), new c4(q3Var, 0));
            alertDialog$Builder.h(id.M0(2131752589, null), null);
        } else {
            alertDialog$Builder.h(id.M0(2131752589, null), null);
        }
        if (!TextUtils.isEmpty(a10.getText())) {
            a10 = a11;
        }
        j(alertDialog$Builder, a10, q3Var.c() ? -3 : 0, g6Var);
    }

    public static void h(s3 s3Var, boolean z9) {
        TL_iv.textButton textbutton;
        i4 i4Var = s3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (i4Var == null || (textbutton = i4Var.a) == null) ? null : textbutton.type;
        boolean z10 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String l10 = z10 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : c6.l(s3Var.e);
        s3Var.f.r3(false);
        s3Var.a.H(id.M0(z10 ? 2131746002 : 2131746006, null), id.M0(2131746010, null), l10, false, !z9, new e4(s3Var, 1));
    }

    public static void i(s3 s3Var, boolean z9) {
        TL_iv.textButton textbutton;
        i4 i4Var = s3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (i4Var == null || (textbutton = i4Var.a) == null) ? null : textbutton.type;
        boolean z10 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z10 ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://";
        s3Var.f.r3(false);
        s3Var.a.H(id.M0(z10 ? 2131746001 : 2131746005, null), id.M0(2131746008, null), str, true, !z9, new e4(s3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i7, g6 g6Var) {
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.setOnShowListener(new kg.r(editTextBoldCursor, 1));
        u1Var.r(250L);
        if (i7 == 0 || !(u1Var.d(i7) instanceof TextView)) {
            return;
        }
        s6.U((TextView) u1Var.d(i7), l6.q7, g6Var);
    }

    public static void k(org.telegram.ui.ActionBar.f2 f2Var, boolean z9, g4 g4Var) {
        if (f2Var == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        yw ywVar = new yw(bundle);
        ywVar.D2 = new l2.x(g4Var, 9);
        if (!z9) {
            f2Var.presentFragment(ywVar);
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
        d2Var.a = true;
        f2Var.showAsSheet(ywVar, d2Var);
    }
}
