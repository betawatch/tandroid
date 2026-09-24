package ii;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ok;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.y70;
import org.telegram.ui.qy;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public abstract class k4 {
    public static EditTextBoldCursor a(Context context, org.telegram.ui.ActionBar.d6 d6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.j5, d6Var));
        editTextBoldCursor.setHintText(str);
        editTextBoldCursor.setHintColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.H6, d6Var));
        editTextBoldCursor.setHeaderHintColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.L6, d6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.k6, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.l6, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.p7, d6Var));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.uf, d6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.vf, d6Var));
        return editTextBoldCursor;
    }

    public static y70 b(y70 y70Var, org.telegram.ui.ActionBar.m2 m2Var, final w3 w3Var, final boolean z10) {
        TL_iv.textButton textbutton;
        l4 l4Var = w3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (l4Var == null || (textbutton = l4Var.a) == null) ? null : textbutton.type;
        if (inlineButtonType == null) {
            final int i10 = 0;
            y70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: ii.g4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            k4.i(w3Var, z10);
                            break;
                        default:
                            k4.h(w3Var, z10);
                            break;
                    }
                }
            }, false);
            final int i11 = 1;
            y70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: ii.g4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            k4.i(w3Var, z10);
                            break;
                        default:
                            k4.h(w3Var, z10);
                            break;
                    }
                }
            }, false);
            y70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new ci.y0(m2Var, w3Var, z10, 6), false);
            y70Var.Z();
            return y70Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            i(w3Var, z10);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            h(w3Var, z10);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            w3Var.f.o3(true);
            k(m2Var, z10, new h4(w3Var, 2));
        }
        return null;
    }

    public static y70 c(y70 y70Var, org.telegram.ui.ActionBar.m2 m2Var, final Context context, final org.telegram.ui.ActionBar.d6 d6Var, final u3 u3Var, final boolean z10) {
        int i10 = u3Var.b;
        TL_iv.pageBlockButtonRow d = u3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                e(context, d6Var, u3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, d6Var, u3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(m2Var, context, d6Var, u3Var, z10);
            }
            return null;
        }
        final int i11 = 0;
        y70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: ii.i4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        k4.e(context, d6Var, u3Var, z10);
                        break;
                    default:
                        k4.d(context, d6Var, u3Var, z10);
                        break;
                }
            }
        }, false);
        final int i12 = 1;
        y70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: ii.i4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        k4.e(context, d6Var, u3Var, z10);
                        break;
                    default:
                        k4.d(context, d6Var, u3Var, z10);
                        break;
                }
            }
        }, false);
        y70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new ci.u1(m2Var, context, d6Var, u3Var, z10, 3), false);
        y70Var.Z();
        return y70Var;
    }

    public static void d(Context context, org.telegram.ui.ActionBar.d6 d6Var, u3 u3Var, boolean z10) {
        boolean c10 = u3Var.c();
        int i10 = u3Var.b;
        TL_iv.pageBlockButtonRow d = u3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, d6Var, u3Var, z10, LocaleController.getString(c10 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new f4(u3Var, 3));
    }

    public static void e(Context context, org.telegram.ui.ActionBar.d6 d6Var, u3 u3Var, boolean z10) {
        boolean c10 = u3Var.c();
        int i10 = u3Var.b;
        TL_iv.pageBlockButtonRow d = u3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, d6Var, u3Var, z10, LocaleController.getString(c10 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new f4(u3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, u3 u3Var, boolean z10) {
        boolean c10 = u3Var.c();
        LinearLayout f7 = ok.f(context, 1);
        int i10 = 0;
        f7.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = u3Var.b;
        TL_iv.pageBlockButtonRow d = u3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i11 < 0 || i11 >= d.buttons.size()) ? null : d.buttons.get(i11);
        EditTextBoldCursor a2 = a(context, d6Var, string, pageButton == null ? "" : g6.l(pageButton.text));
        f7.addView(a2, w7.y5.n(-1, 64));
        ai.s4 s4Var = new ai.s4(a2, m2Var, z10, u3Var, 5);
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(context, 0, d6Var) : new org.telegram.ui.ActionBar.d2(context, 0, d6Var);
        String string2 = LocaleController.getString(c10 ? R.string.RichEditorEditProfileButton : R.string.RichEditorCreateProfileButton);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.R = string2;
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ca.b(c10, s4Var, a2, u3Var, 2));
        if (c10) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new ei.d5(s4Var, 17));
            String string3 = LocaleController.getString(R.string.Delete);
            f4 f4Var = new f4(u3Var, 2);
            a2Var.p0 = string3;
            a2Var.q0 = f4Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            a2Var.J0 = true;
            i10 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i10, d6Var);
    }

    public static void g(Context context, org.telegram.ui.ActionBar.d6 d6Var, u3 u3Var, boolean z10, String str, String str2, String str3, f4 f4Var) {
        LinearLayout f7 = ok.f(context, 1);
        f7.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i10 = u3Var.b;
        TL_iv.pageBlockButtonRow d = u3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        EditTextBoldCursor a2 = a(context, d6Var, string, pageButton == null ? "" : g6.l(pageButton.text));
        EditTextBoldCursor a10 = a(context, d6Var, str2, str3);
        f7.addView(a2, w7.y5.n(-1, 64));
        f7.addView(a10, w7.y5.n(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(context, 0, d6Var) : new org.telegram.ui.ActionBar.d2(context, 0, d6Var);
        alertDialog$Builder.a.R = str;
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ai.q5(a2, a10, f4Var, 12));
        if (u3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new f4(u3Var, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a10;
        }
        j(alertDialog$Builder, a2, u3Var.c() ? -3 : 0, d6Var);
    }

    public static void h(w3 w3Var, boolean z10) {
        TL_iv.textButton textbutton;
        l4 l4Var = w3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (l4Var == null || (textbutton = l4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String l4 = z11 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : g6.l(w3Var.e);
        w3Var.f.o3(false);
        w3Var.a.showInputDialog(LocaleController.getString(z11 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), l4, false, !z10, new h4(w3Var, 1));
    }

    public static void i(w3 w3Var, boolean z10) {
        TL_iv.textButton textbutton;
        l4 l4Var = w3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (l4Var == null || (textbutton = l4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z11 ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://";
        w3Var.f.o3(false);
        w3Var.a.showInputDialog(LocaleController.getString(z11 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), str, true, !z10, new h4(w3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.setOnShowListener(new hg.t(1, editTextBoldCursor));
        a2Var.q(250L);
        if (i10 == 0 || !(a2Var.d(i10) instanceof TextView)) {
            return;
        }
        ((TextView) a2Var.d(i10)).setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.q7, d6Var));
    }

    public static void k(org.telegram.ui.ActionBar.m2 m2Var, boolean z10, j4 j4Var) {
        if (m2Var == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        qy qyVar = new qy(bundle);
        qyVar.C2 = new ei.d5(j4Var, 18);
        if (!z10) {
            m2Var.presentFragment(qyVar);
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
        k2Var.a = true;
        m2Var.showAsSheet(qyVar, k2Var);
    }
}
