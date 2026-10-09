package ii;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.p80;
import org.telegram.ui.ty;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public abstract class l4 {
    public static EditTextBoldCursor a(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.j5, e6Var));
        editTextBoldCursor.setHintText(str);
        editTextBoldCursor.setHintColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.H6, e6Var));
        editTextBoldCursor.setHeaderHintColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.L6, e6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.k6, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.l6, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.p7, e6Var));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.uf, e6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.vf, e6Var));
        return editTextBoldCursor;
    }

    public static p80 b(p80 p80Var, org.telegram.ui.ActionBar.n2 n2Var, final w3 w3Var, final boolean z10) {
        TL_iv.textButton textbutton;
        m4 m4Var = w3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (m4Var == null || (textbutton = m4Var.a) == null) ? null : textbutton.type;
        if (inlineButtonType == null) {
            final int i10 = 0;
            p80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: ii.h4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            l4.i(w3Var, z10);
                            break;
                        default:
                            l4.h(w3Var, z10);
                            break;
                    }
                }
            }, false);
            final int i11 = 1;
            p80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: ii.h4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            l4.i(w3Var, z10);
                            break;
                        default:
                            l4.h(w3Var, z10);
                            break;
                    }
                }
            }, false);
            p80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new ci.x0(n2Var, w3Var, z10, 6), false);
            p80Var.Z();
            return p80Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            i(w3Var, z10);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            h(w3Var, z10);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            w3Var.f.p3(true);
            k(n2Var, z10, new i4(w3Var, 2));
        }
        return null;
    }

    public static p80 c(p80 p80Var, org.telegram.ui.ActionBar.n2 n2Var, final Context context, final org.telegram.ui.ActionBar.e6 e6Var, final u3 u3Var, final boolean z10) {
        int i10 = u3Var.b;
        TL_iv.pageBlockButtonRow d = u3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                e(context, e6Var, u3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, e6Var, u3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(n2Var, context, e6Var, u3Var, z10);
            }
            return null;
        }
        final int i11 = 0;
        p80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: ii.j4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        l4.e(context, e6Var, u3Var, z10);
                        break;
                    default:
                        l4.d(context, e6Var, u3Var, z10);
                        break;
                }
            }
        }, false);
        final int i12 = 1;
        p80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: ii.j4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        l4.e(context, e6Var, u3Var, z10);
                        break;
                    default:
                        l4.d(context, e6Var, u3Var, z10);
                        break;
                }
            }
        }, false);
        p80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new ci.t1(n2Var, context, e6Var, u3Var, z10, 3), false);
        p80Var.Z();
        return p80Var;
    }

    public static void d(Context context, org.telegram.ui.ActionBar.e6 e6Var, u3 u3Var, boolean z10) {
        boolean c10 = u3Var.c();
        int i10 = u3Var.b;
        TL_iv.pageBlockButtonRow d = u3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, e6Var, u3Var, z10, LocaleController.getString(c10 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new g4(u3Var, 3));
    }

    public static void e(Context context, org.telegram.ui.ActionBar.e6 e6Var, u3 u3Var, boolean z10) {
        boolean c10 = u3Var.c();
        int i10 = u3Var.b;
        TL_iv.pageBlockButtonRow d = u3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, e6Var, u3Var, z10, LocaleController.getString(c10 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new g4(u3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, u3 u3Var, boolean z10) {
        boolean c10 = u3Var.c();
        LinearLayout e7 = bi.e(context, 1);
        int i10 = 0;
        e7.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = u3Var.b;
        TL_iv.pageBlockButtonRow d = u3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i11 < 0 || i11 >= d.buttons.size()) ? null : d.buttons.get(i11);
        EditTextBoldCursor a2 = a(context, e6Var, string, pageButton == null ? "" : h6.l(pageButton.text));
        e7.addView(a2, w7.x5.n(-1, 64));
        ai.t4 t4Var = new ai.t4(a2, n2Var, z10, u3Var, 5);
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(context, 0, e6Var) : new org.telegram.ui.ActionBar.e2(context, 0, e6Var);
        String string2 = LocaleController.getString(c10 ? R.string.RichEditorEditProfileButton : R.string.RichEditorCreateProfileButton);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string2;
        alertDialog$Builder.n(e7);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ca.b(c10, t4Var, a2, u3Var, 2));
        if (c10) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new ei.c5(t4Var, 17));
            String string3 = LocaleController.getString(R.string.Delete);
            g4 g4Var = new g4(u3Var, 2);
            b2Var.p0 = string3;
            b2Var.q0 = g4Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            b2Var.J0 = true;
            i10 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i10, e6Var);
    }

    public static void g(Context context, org.telegram.ui.ActionBar.e6 e6Var, u3 u3Var, boolean z10, String str, String str2, String str3, g4 g4Var) {
        LinearLayout e7 = bi.e(context, 1);
        e7.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i10 = u3Var.b;
        TL_iv.pageBlockButtonRow d = u3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        EditTextBoldCursor a2 = a(context, e6Var, string, pageButton == null ? "" : h6.l(pageButton.text));
        EditTextBoldCursor a10 = a(context, e6Var, str2, str3);
        e7.addView(a2, w7.x5.n(-1, 64));
        e7.addView(a10, w7.x5.n(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(context, 0, e6Var) : new org.telegram.ui.ActionBar.e2(context, 0, e6Var);
        alertDialog$Builder.a.R = str;
        alertDialog$Builder.n(e7);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ai.r5(a2, a10, g4Var, 12));
        if (u3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new g4(u3Var, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a10;
        }
        j(alertDialog$Builder, a2, u3Var.c() ? -3 : 0, e6Var);
    }

    public static void h(w3 w3Var, boolean z10) {
        TL_iv.textButton textbutton;
        m4 m4Var = w3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (m4Var == null || (textbutton = m4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String l4 = z11 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : h6.l(w3Var.e);
        w3Var.f.p3(false);
        w3Var.a.showInputDialog(LocaleController.getString(z11 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), l4, false, !z10, new i4(w3Var, 1));
    }

    public static void i(w3 w3Var, boolean z10) {
        TL_iv.textButton textbutton;
        m4 m4Var = w3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (m4Var == null || (textbutton = m4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z11 ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://";
        w3Var.f.p3(false);
        w3Var.a.showInputDialog(LocaleController.getString(z11 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), str, true, !z10, new i4(w3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.setOnShowListener(new hg.s(1, editTextBoldCursor));
        b2Var.q(250L);
        if (i10 == 0 || !(b2Var.d(i10) instanceof TextView)) {
            return;
        }
        ((TextView) b2Var.d(i10)).setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q7, e6Var));
    }

    public static void k(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, k4 k4Var) {
        if (n2Var == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        ty tyVar = new ty(bundle);
        tyVar.C2 = new ei.c5(k4Var, 18);
        if (!z10) {
            n2Var.presentFragment(tyVar);
            return;
        }
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.a = true;
        n2Var.showAsSheet(tyVar, l2Var);
    }
}
