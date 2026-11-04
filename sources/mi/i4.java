package mi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ci.u8;
import ci.v6;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f60;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public abstract class i4 {
    public static EditTextBoldCursor a(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        r6.V(editTextBoldCursor, k6.j5, e6Var);
        editTextBoldCursor.setHintText(str);
        r6.m(editTextBoldCursor, 34, k6.H6, e6Var);
        r6.m(editTextBoldCursor, 35, k6.L6, e6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        r6.G(editTextBoldCursor, k6.k6, k6.l6, k6.p7, e6Var);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        r6.D(editTextBoldCursor, k6.ig, e6Var);
        r6.m(editTextBoldCursor, 36, k6.jg, e6Var);
        return editTextBoldCursor;
    }

    public static f60 b(f60 f60Var, org.telegram.ui.ActionBar.d2 d2Var, final s3 s3Var, final boolean z10) {
        TL_iv.textButton textbutton;
        j4 j4Var = s3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (j4Var == null || (textbutton = j4Var.a) == null) ? null : textbutton.type;
        final int i3 = 1;
        if (inlineButtonType == null) {
            final int i10 = 0;
            f60Var.c(R.drawable.media_link_24, bd.M0(2131752226, null), new Runnable() { // from class: mi.e4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            i4.i(s3Var, z10);
                            break;
                        default:
                            i4.h(s3Var, z10);
                            break;
                    }
                }
            }, false);
            f60Var.c(R.drawable.msg_copy, bd.M0(2131751767, null), new Runnable() { // from class: mi.e4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            i4.i(s3Var, z10);
                            break;
                        default:
                            i4.h(s3Var, z10);
                            break;
                    }
                }
            }, false);
            f60Var.c(R.drawable.left_status_profile, bd.M0(2131746009, null), new v6(d2Var, s3Var, z10, 9), false);
            f60Var.Z();
            return f60Var;
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
            k(d2Var, z10, new f4(s3Var, 2));
        }
        return null;
    }

    public static f60 c(f60 f60Var, org.telegram.ui.ActionBar.d2 d2Var, final Context context, final org.telegram.ui.ActionBar.e6 e6Var, final q3 q3Var, final boolean z10) {
        int i3 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i3 < 0 || i3 >= d.buttons.size()) ? null : d.buttons.get(i3);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType == null) {
            final int i10 = 0;
            f60Var.c(R.drawable.media_link_24, bd.M0(2131752226, null), new Runnable() { // from class: mi.g4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            i4.e(context, e6Var, q3Var, z10);
                            break;
                        default:
                            i4.d(context, e6Var, q3Var, z10);
                            break;
                    }
                }
            }, false);
            final int i11 = 1;
            f60Var.c(R.drawable.msg_copy, bd.M0(2131751767, null), new Runnable() { // from class: mi.g4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            i4.e(context, e6Var, q3Var, z10);
                            break;
                        default:
                            i4.d(context, e6Var, q3Var, z10);
                            break;
                    }
                }
            }, false);
            f60Var.c(R.drawable.left_status_profile, bd.M0(2131746009, null), new gi.q1(d2Var, context, e6Var, q3Var, z10, 3), false);
            f60Var.Z();
            return f60Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            e(context, e6Var, q3Var, z10);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            d(context, e6Var, q3Var, z10);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            f(d2Var, context, e6Var, q3Var, z10);
        }
        return null;
    }

    public static void d(Context context, org.telegram.ui.ActionBar.e6 e6Var, q3 q3Var, boolean z10) {
        boolean c2 = q3Var.c();
        int i3 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i3 < 0 || i3 >= d.buttons.size()) ? null : d.buttons.get(i3);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        g(context, e6Var, q3Var, z10, bd.M0(c2 ? 2131746012 : 2131746016, null), bd.M0(2131746020, null), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new c4(q3Var, 3));
    }

    public static void e(Context context, org.telegram.ui.ActionBar.e6 e6Var, q3 q3Var, boolean z10) {
        boolean c2 = q3Var.c();
        int i3 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i3 < 0 || i3 >= d.buttons.size()) ? null : d.buttons.get(i3);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        g(context, e6Var, q3Var, z10, bd.M0(c2 ? 2131746011 : 2131746015, null), bd.M0(2131746018, null), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new c4(q3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.d2 d2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, q3 q3Var, boolean z10) {
        boolean c2 = q3Var.c();
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        int i3 = 0;
        f10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = bd.M0(2131746019, null);
        int i10 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        EditTextBoldCursor a10 = a(context, e6Var, M0, pageButton == null ? "" : d6.l(pageButton.text));
        f10.addView(a10, mf.o(-1, 64));
        u8 u8Var = new u8(a10, d2Var, z10, q3Var, 6);
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(0, context, e6Var) : new org.telegram.ui.ActionBar.u1(0, context, e6Var);
        String M02 = bd.M0(c2 ? 2131746010 : 2131746014, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M02;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(bd.M0(2131747839, null), new ga.b(c2, u8Var, a10, q3Var, 2));
        if (c2) {
            alertDialog$Builder.i(bd.M0(2131746017, null), new l5.b(u8Var, 10));
            String M03 = bd.M0(2131751599, null);
            c4 c4Var = new c4(q3Var, 2);
            s1Var.s0 = M03;
            s1Var.t0 = c4Var;
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
            s1Var.M0 = true;
            i3 = -4;
        } else {
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
        }
        j(alertDialog$Builder, a10, i3, e6Var);
    }

    public static void g(Context context, org.telegram.ui.ActionBar.e6 e6Var, q3 q3Var, boolean z10, String str, String str2, String str3, c4 c4Var) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = bd.M0(2131746019, null);
        int i3 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i3 < 0 || i3 >= d.buttons.size()) ? null : d.buttons.get(i3);
        EditTextBoldCursor a10 = a(context, e6Var, M0, pageButton == null ? "" : d6.l(pageButton.text));
        EditTextBoldCursor a11 = a(context, e6Var, str2, str3);
        f10.addView(a10, mf.o(-1, 64));
        f10.addView(a11, mf.o(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(0, context, e6Var) : new org.telegram.ui.ActionBar.u1(0, context, e6Var);
        alertDialog$Builder.a.S = str;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(bd.M0(2131747839, null), new aa.a(a10, a11, c4Var, 13));
        if (q3Var.c()) {
            alertDialog$Builder.i(bd.M0(2131751599, null), new c4(q3Var, 0));
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
        } else {
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
        }
        if (!TextUtils.isEmpty(a10.getText())) {
            a10 = a11;
        }
        j(alertDialog$Builder, a10, q3Var.c() ? -3 : 0, e6Var);
    }

    public static void h(s3 s3Var, boolean z10) {
        TL_iv.textButton textbutton;
        j4 j4Var = s3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (j4Var == null || (textbutton = j4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String l10 = z11 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : d6.l(s3Var.e);
        s3Var.f.r3(false);
        s3Var.a.H(bd.M0(z11 ? 2131746012 : 2131746016, null), bd.M0(2131746020, null), l10, false, !z10, new f4(s3Var, 1));
    }

    public static void i(s3 s3Var, boolean z10) {
        TL_iv.textButton textbutton;
        j4 j4Var = s3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (j4Var == null || (textbutton = j4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z11 ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://";
        s3Var.f.r3(false);
        s3Var.a.H(bd.M0(z11 ? 2131746011 : 2131746015, null), bd.M0(2131746018, null), str, true, !z10, new f4(s3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.setOnShowListener(new ai.p(editTextBoldCursor, 3));
        s1Var.r(250L);
        if (i3 == 0 || !(s1Var.d(i3) instanceof TextView)) {
            return;
        }
        r6.V((TextView) s1Var.d(i3), k6.q7, e6Var);
    }

    public static void k(org.telegram.ui.ActionBar.d2 d2Var, boolean z10, h4 h4Var) {
        if (d2Var == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        uw uwVar = new uw(bundle);
        uwVar.D2 = new l5.b(h4Var, 11);
        if (!z10) {
            d2Var.presentFragment(uwVar);
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
        b2Var.a = true;
        d2Var.showAsSheet(uwVar, b2Var);
    }
}
