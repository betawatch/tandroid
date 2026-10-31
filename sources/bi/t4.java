package bi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.z60;
import org.telegram.ui.ay;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public abstract class t4 {
    public static EditTextBoldCursor a(Context context, org.telegram.ui.ActionBar.p6 p6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        a7.V(editTextBoldCursor, org.telegram.ui.ActionBar.t6.j5, p6Var);
        editTextBoldCursor.setHintText(str);
        a7.m(editTextBoldCursor, 34, org.telegram.ui.ActionBar.t6.H6, p6Var);
        a7.m(editTextBoldCursor, 35, org.telegram.ui.ActionBar.t6.L6, p6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        a7.G(editTextBoldCursor, org.telegram.ui.ActionBar.t6.k6, org.telegram.ui.ActionBar.t6.l6, org.telegram.ui.ActionBar.t6.p7, p6Var);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        a7.D(editTextBoldCursor, org.telegram.ui.ActionBar.t6.ig, p6Var);
        a7.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.t6.jg, p6Var);
        return editTextBoldCursor;
    }

    public static z60 b(z60 z60Var, org.telegram.ui.ActionBar.k2 k2Var, final c4 c4Var, final boolean z10) {
        TL_iv.textButton textbutton;
        u4 u4Var = c4Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (u4Var == null || (textbutton = u4Var.a) == null) ? null : textbutton.type;
        final int i10 = 1;
        if (inlineButtonType == null) {
            final int i11 = 0;
            z60Var.c(R.drawable.media_link_24, cd.L0(2131752226, null), new Runnable() { // from class: bi.p4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            t4.i(c4Var, z10);
                            break;
                        default:
                            t4.h(c4Var, z10);
                            break;
                    }
                }
            }, false);
            z60Var.c(R.drawable.msg_copy, cd.L0(2131751767, null), new Runnable() { // from class: bi.p4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            t4.i(c4Var, z10);
                            break;
                        default:
                            t4.h(c4Var, z10);
                            break;
                    }
                }
            }, false);
            z60Var.c(R.drawable.left_status_profile, cd.L0(2131746016, null), new ag.j0(k2Var, c4Var, z10, 4), false);
            z60Var.Z();
            return z60Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            i(c4Var, z10);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            h(c4Var, z10);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            c4Var.f.r3(true);
            k(k2Var, z10, new q4(c4Var, 2));
        }
        return null;
    }

    public static z60 c(z60 z60Var, org.telegram.ui.ActionBar.k2 k2Var, final Context context, final org.telegram.ui.ActionBar.p6 p6Var, final a4 a4Var, final boolean z10) {
        int i10 = a4Var.b;
        TL_iv.pageBlockButtonRow d = a4Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType == null) {
            final int i11 = 0;
            z60Var.c(R.drawable.media_link_24, cd.L0(2131752226, null), new Runnable() { // from class: bi.r4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            t4.e(context, p6Var, a4Var, z10);
                            break;
                        default:
                            t4.d(context, p6Var, a4Var, z10);
                            break;
                    }
                }
            }, false);
            final int i12 = 1;
            z60Var.c(R.drawable.msg_copy, cd.L0(2131751767, null), new Runnable() { // from class: bi.r4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            t4.e(context, p6Var, a4Var, z10);
                            break;
                        default:
                            t4.d(context, p6Var, a4Var, z10);
                            break;
                    }
                }
            }, false);
            z60Var.c(R.drawable.left_status_profile, cd.L0(2131746016, null), new ag.n0(k2Var, context, p6Var, a4Var, z10, 1), false);
            z60Var.Z();
            return z60Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            e(context, p6Var, a4Var, z10);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            d(context, p6Var, a4Var, z10);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            f(k2Var, context, p6Var, a4Var, z10);
        }
        return null;
    }

    public static void d(Context context, org.telegram.ui.ActionBar.p6 p6Var, a4 a4Var, boolean z10) {
        boolean c10 = a4Var.c();
        int i10 = a4Var.b;
        TL_iv.pageBlockButtonRow d = a4Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        g(context, p6Var, a4Var, z10, cd.L0(c10 ? 2131746019 : 2131746023, null), cd.L0(2131746027, null), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new m4(a4Var, 3));
    }

    public static void e(Context context, org.telegram.ui.ActionBar.p6 p6Var, a4 a4Var, boolean z10) {
        boolean c10 = a4Var.c();
        int i10 = a4Var.b;
        TL_iv.pageBlockButtonRow d = a4Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        g(context, p6Var, a4Var, z10, cd.L0(c10 ? 2131746018 : 2131746022, null), cd.L0(2131746025, null), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new m4(a4Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.k2 k2Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, a4 a4Var, boolean z10) {
        boolean c10 = a4Var.c();
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        int i10 = 0;
        f7.setPadding(org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(24.0f), 0);
        String L0 = cd.L0(2131746026, null);
        int i11 = a4Var.b;
        TL_iv.pageBlockButtonRow d = a4Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i11 < 0 || i11 >= d.buttons.size()) ? null : d.buttons.get(i11);
        EditTextBoldCursor a2 = a(context, p6Var, L0, pageButton == null ? "" : s6.l(pageButton.text));
        f7.addView(a2, w7.b6.o(-1, 64));
        n4 n4Var = new n4(a2, k2Var, z10, a4Var, 0);
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(0, context, p6Var) : new org.telegram.ui.ActionBar.a2(0, context, p6Var);
        String L02 = cd.L0(c10 ? 2131746017 : 2131746021, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L02;
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(cd.L0(2131747847, null), new o4(c10, n4Var, a2, a4Var, 0));
        if (c10) {
            alertDialog$Builder.i(cd.L0(2131746024, null), new a1.c(n4Var, 11));
            String L03 = cd.L0(2131751599, null);
            m4 m4Var = new m4(a4Var, 2);
            x1Var.r0 = L03;
            x1Var.s0 = m4Var;
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
            x1Var.L0 = true;
            i10 = -4;
        } else {
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
        }
        j(alertDialog$Builder, a2, i10, p6Var);
    }

    public static void g(Context context, org.telegram.ui.ActionBar.p6 p6Var, a4 a4Var, boolean z10, String str, String str2, String str3, m4 m4Var) {
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f7.setPadding(org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(24.0f), 0);
        String L0 = cd.L0(2131746026, null);
        int i10 = a4Var.b;
        TL_iv.pageBlockButtonRow d = a4Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        EditTextBoldCursor a2 = a(context, p6Var, L0, pageButton == null ? "" : s6.l(pageButton.text));
        EditTextBoldCursor a10 = a(context, p6Var, str2, str3);
        f7.addView(a2, w7.b6.o(-1, 64));
        f7.addView(a10, w7.b6.o(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(0, context, p6Var) : new org.telegram.ui.ActionBar.a2(0, context, p6Var);
        alertDialog$Builder.a.R = str;
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(cd.L0(2131747847, null), new androidx.car.app.utils.a(a2, a10, m4Var, 4));
        if (a4Var.c()) {
            alertDialog$Builder.i(cd.L0(2131751599, null), new m4(a4Var, 0));
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
        } else {
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a10;
        }
        j(alertDialog$Builder, a2, a4Var.c() ? -3 : 0, p6Var);
    }

    public static void h(c4 c4Var, boolean z10) {
        TL_iv.textButton textbutton;
        u4 u4Var = c4Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (u4Var == null || (textbutton = u4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String l4 = z11 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : s6.l(c4Var.e);
        c4Var.f.r3(false);
        c4Var.a.H(cd.L0(z11 ? 2131746019 : 2131746023, null), cd.L0(2131746027, null), l4, false, !z10, new q4(c4Var, 1));
    }

    public static void i(c4 c4Var, boolean z10) {
        TL_iv.textButton textbutton;
        u4 u4Var = c4Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (u4Var == null || (textbutton = u4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z11 ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://";
        c4Var.f.r3(false);
        c4Var.a.H(cd.L0(z11 ? 2131746018 : 2131746022, null), cd.L0(2131746025, null), str, true, !z10, new q4(c4Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.setOnShowListener(new ag.d0(editTextBoldCursor, 1));
        x1Var.r(250L);
        if (i10 == 0 || !(x1Var.d(i10) instanceof TextView)) {
            return;
        }
        a7.V((TextView) x1Var.d(i10), org.telegram.ui.ActionBar.t6.q7, p6Var);
    }

    public static void k(org.telegram.ui.ActionBar.k2 k2Var, boolean z10, s4 s4Var) {
        if (k2Var == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        ay ayVar = new ay(bundle);
        ayVar.C2 = new a1.c(s4Var, 12);
        if (!z10) {
            k2Var.presentFragment(ayVar);
            return;
        }
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
        i2Var.a = true;
        k2Var.showAsSheet(ayVar, i2Var);
    }
}
