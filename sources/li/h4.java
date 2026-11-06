package li;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.u7;
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.k60;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public abstract class h4 {
    public static EditTextBoldCursor a(Context context, f6 f6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        r6.V(editTextBoldCursor, k6.j5, f6Var);
        editTextBoldCursor.setHintText(str);
        r6.m(editTextBoldCursor, 34, k6.H6, f6Var);
        r6.m(editTextBoldCursor, 35, k6.L6, f6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        r6.G(editTextBoldCursor, k6.k6, k6.l6, k6.p7, f6Var);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        r6.D(editTextBoldCursor, k6.ig, f6Var);
        r6.m(editTextBoldCursor, 36, k6.jg, f6Var);
        return editTextBoldCursor;
    }

    public static k60 b(k60 k60Var, org.telegram.ui.ActionBar.f2 f2Var, final s3 s3Var, final boolean z9) {
        TL_iv.textButton textbutton;
        i4 i4Var = s3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (i4Var == null || (textbutton = i4Var.a) == null) ? null : textbutton.type;
        final int i7 = 1;
        if (inlineButtonType == null) {
            final int i10 = 0;
            k60Var.c(R.drawable.media_link_24, hd.M0(2131752226, null), new Runnable() { // from class: li.d4
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
            k60Var.c(R.drawable.msg_copy, hd.M0(2131751767, null), new Runnable() { // from class: li.d4
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
            k60Var.c(R.drawable.left_status_profile, hd.M0(2131746000, null), new u7(f2Var, s3Var, z9, 9), false);
            k60Var.Z();
            return k60Var;
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

    public static k60 c(k60 k60Var, org.telegram.ui.ActionBar.f2 f2Var, final Context context, final f6 f6Var, final q3 q3Var, final boolean z9) {
        int i7 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType == null) {
            final int i10 = 0;
            k60Var.c(R.drawable.media_link_24, hd.M0(2131752226, null), new Runnable() { // from class: li.f4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            h4.e(context, f6Var, q3Var, z9);
                            break;
                        default:
                            h4.d(context, f6Var, q3Var, z9);
                            break;
                    }
                }
            }, false);
            final int i11 = 1;
            k60Var.c(R.drawable.msg_copy, hd.M0(2131751767, null), new Runnable() { // from class: li.f4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            h4.e(context, f6Var, q3Var, z9);
                            break;
                        default:
                            h4.d(context, f6Var, q3Var, z9);
                            break;
                    }
                }
            }, false);
            k60Var.c(R.drawable.left_status_profile, hd.M0(2131746000, null), new fi.q1(f2Var, context, f6Var, q3Var, z9, 3), false);
            k60Var.Z();
            return k60Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            e(context, f6Var, q3Var, z9);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            d(context, f6Var, q3Var, z9);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            f(f2Var, context, f6Var, q3Var, z9);
        }
        return null;
    }

    public static void d(Context context, f6 f6Var, q3 q3Var, boolean z9) {
        boolean c10 = q3Var.c();
        int i7 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        g(context, f6Var, q3Var, z9, hd.M0(c10 ? 2131746003 : 2131746007, null), hd.M0(2131746011, null), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new c4(q3Var, 3));
    }

    public static void e(Context context, f6 f6Var, q3 q3Var, boolean z9) {
        boolean c10 = q3Var.c();
        int i7 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        g(context, f6Var, q3Var, z9, hd.M0(c10 ? 2131746002 : 2131746006, null), hd.M0(2131746009, null), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new c4(q3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.f2 f2Var, Context context, f6 f6Var, q3 q3Var, boolean z9) {
        boolean c10 = q3Var.c();
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        int i7 = 0;
        f10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = hd.M0(2131746010, null);
        int i10 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        EditTextBoldCursor a10 = a(context, f6Var, M0, pageButton == null ? "" : c6.l(pageButton.text));
        f10.addView(a10, ha.o(-1, 64));
        aa.d0 d0Var = new aa.d0(a10, f2Var, z9, q3Var, 7);
        AlertDialog$Builder alertDialog$Builder = z9 ? new AlertDialog$Builder(0, context, f6Var) : new org.telegram.ui.ActionBar.w1(0, context, f6Var);
        String M02 = hd.M0(c10 ? 2131746001 : 2131746005, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M02;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(hd.M0(2131747830, null), new a3.g(c10, d0Var, a10, q3Var, 3));
        if (c10) {
            alertDialog$Builder.i(hd.M0(2131746008, null), new l2.y(d0Var, 8));
            String M03 = hd.M0(2131751599, null);
            c4 c4Var = new c4(q3Var, 2);
            u1Var.p0 = M03;
            u1Var.q0 = c4Var;
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
            u1Var.J0 = true;
            i7 = -4;
        } else {
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
        }
        j(alertDialog$Builder, a10, i7, f6Var);
    }

    public static void g(Context context, f6 f6Var, q3 q3Var, boolean z9, String str, String str2, String str3, c4 c4Var) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = hd.M0(2131746010, null);
        int i7 = q3Var.b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i7 < 0 || i7 >= d.buttons.size()) ? null : d.buttons.get(i7);
        EditTextBoldCursor a10 = a(context, f6Var, M0, pageButton == null ? "" : c6.l(pageButton.text));
        EditTextBoldCursor a11 = a(context, f6Var, str2, str3);
        f10.addView(a10, ha.o(-1, 64));
        f10.addView(a11, ha.o(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z9 ? new AlertDialog$Builder(0, context, f6Var) : new org.telegram.ui.ActionBar.w1(0, context, f6Var);
        alertDialog$Builder.a.R = str;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(hd.M0(2131747830, null), new a3.h(a10, a11, c4Var, 16));
        if (q3Var.c()) {
            alertDialog$Builder.i(hd.M0(2131751599, null), new c4(q3Var, 0));
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
        } else {
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
        }
        if (!TextUtils.isEmpty(a10.getText())) {
            a10 = a11;
        }
        j(alertDialog$Builder, a10, q3Var.c() ? -3 : 0, f6Var);
    }

    public static void h(s3 s3Var, boolean z9) {
        TL_iv.textButton textbutton;
        i4 i4Var = s3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (i4Var == null || (textbutton = i4Var.a) == null) ? null : textbutton.type;
        boolean z10 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String l10 = z10 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : c6.l(s3Var.e);
        s3Var.f.r3(false);
        s3Var.a.H(hd.M0(z10 ? 2131746003 : 2131746007, null), hd.M0(2131746011, null), l10, false, !z9, new e4(s3Var, 1));
    }

    public static void i(s3 s3Var, boolean z9) {
        TL_iv.textButton textbutton;
        i4 i4Var = s3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (i4Var == null || (textbutton = i4Var.a) == null) ? null : textbutton.type;
        boolean z10 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z10 ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://";
        s3Var.f.r3(false);
        s3Var.a.H(hd.M0(z10 ? 2131746002 : 2131746006, null), hd.M0(2131746009, null), str, true, !z9, new e4(s3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i7, f6 f6Var) {
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.setOnShowListener(new kg.r(editTextBoldCursor, 1));
        u1Var.r(250L);
        if (i7 == 0 || !(u1Var.d(i7) instanceof TextView)) {
            return;
        }
        r6.V((TextView) u1Var.d(i7), k6.q7, f6Var);
    }

    public static void k(org.telegram.ui.ActionBar.f2 f2Var, boolean z9, g4 g4Var) {
        if (f2Var == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        ww wwVar = new ww(bundle);
        wwVar.C2 = new l2.y(g4Var, 9);
        if (!z9) {
            f2Var.presentFragment(wwVar);
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
        d2Var.a = true;
        f2Var.showAsSheet(wwVar, d2Var);
    }
}
