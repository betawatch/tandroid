// default package

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class cj9 {
    public static EditTextBoldCursor a(Context context, vnb vnbVar, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        yob.X(editTextBoldCursor, aob.j5, vnbVar);
        editTextBoldCursor.setHintText(str);
        yob.l(editTextBoldCursor, 34, aob.H6, vnbVar);
        yob.l(editTextBoldCursor, 35, aob.L6, vnbVar);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        yob.F(editTextBoldCursor, aob.k6, aob.l6, aob.p7, vnbVar);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        yob.C(editTextBoldCursor, aob.lg, vnbVar);
        yob.l(editTextBoldCursor, 36, aob.mg, vnbVar);
        return editTextBoldCursor;
    }

    public static fu5 b(fu5 fu5Var, e eVar, final oi9 oi9Var, final boolean z) {
        TL_iv.textButton textbutton;
        dj9 dj9Var = oi9Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (dj9Var == null || (textbutton = dj9Var.a) == null) ? null : textbutton.type;
        final byte b = 1;
        if (inlineButtonType == null) {
            final byte b2 = 0;
            fu5Var.b(R.drawable.media_link_24, ob6.M0(2131752191, null), new Runnable() { // from class: yi9
                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b2;
                    boolean z2 = z;
                    oi9 oi9Var2 = oi9Var;
                    switch (b3) {
                        case 0:
                            cj9.i(oi9Var2, z2);
                            break;
                        default:
                            cj9.h(oi9Var2, z2);
                            break;
                    }
                }
            }, false);
            fu5Var.b(R.drawable.msg_copy, ob6.M0(2131751732, null), new Runnable() { // from class: yi9
                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b;
                    boolean z2 = z;
                    oi9 oi9Var2 = oi9Var;
                    switch (b3) {
                        case 0:
                            cj9.i(oi9Var2, z2);
                            break;
                        default:
                            cj9.h(oi9Var2, z2);
                            break;
                    }
                }
            }, false);
            fu5Var.b(R.drawable.left_status_profile, ob6.M0(2131745726, null), new yn6((Object) eVar, (Object) oi9Var, z, (byte) 18), false);
            fu5Var.a0();
            return fu5Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            i(oi9Var, z);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            h(oi9Var, z);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            oi9Var.f.l3(true);
            k(eVar, z, new zi9(oi9Var, (byte) 2));
        }
        return null;
    }

    public static fu5 c(fu5 fu5Var, e eVar, final Context context, final vnb vnbVar, final mi9 mi9Var, final boolean z) {
        int i = mi9Var.b;
        TL_iv.pageBlockButtonRow d = mi9Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i < 0 || i >= d.buttons.size()) ? null : d.buttons.get(i);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType == null) {
            final byte b = 0;
            fu5Var.b(R.drawable.media_link_24, ob6.M0(2131752191, null), new Runnable() { // from class: aj9
                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    boolean z2 = z;
                    mi9 mi9Var2 = mi9Var;
                    vnb vnbVar2 = vnbVar;
                    Context context2 = context;
                    switch (b2) {
                        case 0:
                            cj9.e(context2, vnbVar2, mi9Var2, z2);
                            break;
                        default:
                            cj9.d(context2, vnbVar2, mi9Var2, z2);
                            break;
                    }
                }
            }, false);
            final byte b2 = 1;
            fu5Var.b(R.drawable.msg_copy, ob6.M0(2131751732, null), new Runnable() { // from class: aj9
                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b2;
                    boolean z2 = z;
                    mi9 mi9Var2 = mi9Var;
                    vnb vnbVar2 = vnbVar;
                    Context context2 = context;
                    switch (b22) {
                        case 0:
                            cj9.e(context2, vnbVar2, mi9Var2, z2);
                            break;
                        default:
                            cj9.d(context2, vnbVar2, mi9Var2, z2);
                            break;
                    }
                }
            }, false);
            fu5Var.b(R.drawable.left_status_profile, ob6.M0(2131745726, null), new va7(eVar, (Object) context, (Object) vnbVar, (Object) mi9Var, z, (byte) 17), false);
            fu5Var.a0();
            return fu5Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            e(context, vnbVar, mi9Var, z);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            d(context, vnbVar, mi9Var, z);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            f(eVar, context, vnbVar, mi9Var, z);
        }
        return null;
    }

    public static void d(Context context, vnb vnbVar, mi9 mi9Var, boolean z) {
        boolean c = mi9Var.c();
        int i = mi9Var.b;
        TL_iv.pageBlockButtonRow d = mi9Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i < 0 || i >= d.buttons.size()) ? null : d.buttons.get(i);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        g(context, vnbVar, mi9Var, z, ob6.M0(c ? 2131745729 : 2131745733, null), ob6.M0(2131745737, null), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new xi9(mi9Var, (byte) 2));
    }

    public static void e(Context context, vnb vnbVar, mi9 mi9Var, boolean z) {
        boolean c = mi9Var.c();
        int i = mi9Var.b;
        TL_iv.pageBlockButtonRow d = mi9Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i < 0 || i >= d.buttons.size()) ? null : d.buttons.get(i);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        g(context, vnbVar, mi9Var, z, ob6.M0(c ? 2131745728 : 2131745732, null), ob6.M0(2131745735, null), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new xi9(mi9Var, (byte) 0));
    }

    public static void f(e eVar, Context context, vnb vnbVar, mi9 mi9Var, boolean z) {
        boolean c = mi9Var.c();
        LinearLayout j = uh9.j(context, 1);
        int i = 0;
        j.setPadding(hl.L(24.0f), 0, hl.L(24.0f), 0);
        String M0 = ob6.M0(2131745736, null);
        int i2 = mi9Var.b;
        TL_iv.pageBlockButtonRow d = mi9Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i2 < 0 || i2 >= d.buttons.size()) ? null : d.buttons.get(i2);
        EditTextBoldCursor a = a(context, vnbVar, M0, pageButton == null ? "" : mm9.l(pageButton.text));
        j.addView(a, tre.o(-1, 64));
        lb7 lb7Var = new lb7((Object) a, (Object) eVar, z, (Object) mi9Var, (byte) 10);
        AlertDialog$Builder alertDialog$Builder = z ? new AlertDialog$Builder(0, vnbVar, context) : new nd(0, vnbVar, context);
        String M02 = ob6.M0(c ? 2131745727 : 2131745731, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M02;
        alertDialog$Builder.n(j);
        alertDialog$Builder.j(ob6.M0(2131747558, null), new ag(c, (Object) lb7Var, (Object) a, (Object) mi9Var, (byte) 7));
        if (c) {
            alertDialog$Builder.h(ob6.M0(2131745734, null), new ye9(lb7Var, (byte) 5));
            String M03 = ob6.M0(2131751563, null);
            xi9 xi9Var = new xi9(mi9Var, (byte) 1);
            idVar.q0 = M03;
            idVar.r0 = xi9Var;
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            idVar.K0 = true;
            i = -4;
        } else {
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        }
        j(alertDialog$Builder, a, i, vnbVar);
    }

    public static void g(Context context, vnb vnbVar, mi9 mi9Var, boolean z, String str, String str2, String str3, xi9 xi9Var) {
        LinearLayout j = uh9.j(context, 1);
        j.setPadding(hl.L(24.0f), 0, hl.L(24.0f), 0);
        String M0 = ob6.M0(2131745736, null);
        int i = mi9Var.b;
        TL_iv.pageBlockButtonRow d = mi9Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i < 0 || i >= d.buttons.size()) ? null : d.buttons.get(i);
        EditTextBoldCursor a = a(context, vnbVar, M0, pageButton == null ? "" : mm9.l(pageButton.text));
        EditTextBoldCursor a2 = a(context, vnbVar, str2, str3);
        j.addView(a, tre.o(-1, 64));
        j.addView(a2, tre.o(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z ? new AlertDialog$Builder(0, vnbVar, context) : new nd(0, vnbVar, context);
        alertDialog$Builder.a.S = str;
        alertDialog$Builder.n(j);
        alertDialog$Builder.j(ob6.M0(2131747558, null), new o48((Object) a, (Object) a2, (Object) xi9Var, (byte) 7));
        if (mi9Var.c()) {
            alertDialog$Builder.h(ob6.M0(2131751563, null), new xi9(mi9Var, (byte) 3));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        } else {
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        }
        if (!TextUtils.isEmpty(a.getText())) {
            a = a2;
        }
        j(alertDialog$Builder, a, mi9Var.c() ? -3 : 0, vnbVar);
    }

    public static void h(oi9 oi9Var, boolean z) {
        TL_iv.textButton textbutton;
        dj9 dj9Var = oi9Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (dj9Var == null || (textbutton = dj9Var.a) == null) ? null : textbutton.type;
        boolean z2 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String l = z2 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : mm9.l(oi9Var.e);
        oi9Var.f.l3(false);
        oi9Var.a.I(ob6.M0(z2 ? 2131745729 : 2131745733, null), ob6.M0(2131745737, null), l, false, !z, new zi9(oi9Var, (byte) 1));
    }

    public static void i(oi9 oi9Var, boolean z) {
        TL_iv.textButton textbutton;
        dj9 dj9Var = oi9Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (dj9Var == null || (textbutton = dj9Var.a) == null) ? null : textbutton.type;
        boolean z2 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z2 ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://";
        oi9Var.f.l3(false);
        oi9Var.a.I(ob6.M0(z2 ? 2131745728 : 2131745732, null), ob6.M0(2131745735, null), str, true, !z, new zi9(oi9Var, (byte) 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i, vnb vnbVar) {
        id idVar = alertDialog$Builder.a;
        idVar.setOnShowListener(new ee4(editTextBoldCursor, (byte) 1));
        idVar.q(250L);
        if (i == 0 || !(idVar.c(i) instanceof TextView)) {
            return;
        }
        yob.X((TextView) idVar.c(i), aob.q7, vnbVar);
    }

    public static void k(e eVar, boolean z, bj9 bj9Var) {
        if (eVar == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        uj3 uj3Var = new uj3(bundle);
        uj3Var.E2 = new ye9(bj9Var, (byte) 4);
        if (!z) {
            eVar.presentFragment(uj3Var);
            return;
        }
        bg0 bg0Var = new bg0();
        bg0Var.a = true;
        eVar.showAsSheet(uj3Var, bg0Var);
    }
}
