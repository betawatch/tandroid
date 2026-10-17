package ki;

import ai.x7;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.i80;
import org.telegram.ui.ey;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public abstract class j4 {
    public static EditTextBoldCursor a(Context context, org.telegram.ui.ActionBar.d6 d6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(h6.w0(h6.j5, d6Var));
        editTextBoldCursor.setHintText(str);
        editTextBoldCursor.setHintColor(h6.w0(h6.H6, d6Var));
        editTextBoldCursor.setHeaderHintColor(h6.w0(h6.L6, d6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        editTextBoldCursor.setLineColors(h6.w0(h6.k6, d6Var), h6.w0(h6.l6, d6Var), h6.w0(h6.p7, d6Var));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(h6.w0(h6.uf, d6Var));
        editTextBoldCursor.setHandlesColor(h6.w0(h6.vf, d6Var));
        return editTextBoldCursor;
    }

    public static i80 b(i80 i80Var, org.telegram.ui.ActionBar.n2 n2Var, final v3 v3Var, final boolean z10) {
        TL_iv.textButton textbutton;
        k4 k4Var = v3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (k4Var == null || (textbutton = k4Var.a) == null) ? null : textbutton.type;
        if (inlineButtonType == null) {
            final int i10 = 0;
            i80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: ki.f4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            j4.i(v3Var, z10);
                            break;
                        default:
                            j4.h(v3Var, z10);
                            break;
                    }
                }
            }, false);
            final int i11 = 1;
            i80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: ki.f4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            j4.i(v3Var, z10);
                            break;
                        default:
                            j4.h(v3Var, z10);
                            break;
                    }
                }
            }, false);
            i80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new x7(n2Var, v3Var, z10, 9), false);
            i80Var.Z();
            return i80Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            i(v3Var, z10);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            h(v3Var, z10);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            v3Var.f.p3(true);
            k(n2Var, z10, new g4(v3Var, 2));
        }
        return null;
    }

    public static i80 c(i80 i80Var, org.telegram.ui.ActionBar.n2 n2Var, final Context context, final org.telegram.ui.ActionBar.d6 d6Var, final t3 t3Var, final boolean z10) {
        int i10 = t3Var.b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                e(context, d6Var, t3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, d6Var, t3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(n2Var, context, d6Var, t3Var, z10);
            }
            return null;
        }
        final int i11 = 0;
        i80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: ki.h4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        j4.e(context, d6Var, t3Var, z10);
                        break;
                    default:
                        j4.d(context, d6Var, t3Var, z10);
                        break;
                }
            }
        }, false);
        final int i12 = 1;
        i80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: ki.h4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        j4.e(context, d6Var, t3Var, z10);
                        break;
                    default:
                        j4.d(context, d6Var, t3Var, z10);
                        break;
                }
            }
        }, false);
        i80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new ai.e2(n2Var, context, d6Var, t3Var, z10, 4), false);
        i80Var.Z();
        return i80Var;
    }

    public static void d(Context context, org.telegram.ui.ActionBar.d6 d6Var, t3 t3Var, boolean z10) {
        boolean c10 = t3Var.c();
        int i10 = t3Var.b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, d6Var, t3Var, z10, LocaleController.getString(c10 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new e4(t3Var, 3));
    }

    public static void e(Context context, org.telegram.ui.ActionBar.d6 d6Var, t3 t3Var, boolean z10) {
        boolean c10 = t3Var.c();
        int i10 = t3Var.b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, d6Var, t3Var, z10, LocaleController.getString(c10 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new e4(t3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, t3 t3Var, boolean z10) {
        boolean c10 = t3Var.c();
        LinearLayout e = wh.e(context, 1);
        int i10 = 0;
        e.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = t3Var.b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i11 < 0 || i11 >= d.buttons.size()) ? null : d.buttons.get(i11);
        EditTextBoldCursor a2 = a(context, d6Var, string, pageButton == null ? "" : e6.l(pageButton.text));
        e.addView(a2, w7.z5.n(-1, 64));
        ai.y3 y3Var = new ai.y3(a2, n2Var, z10, t3Var, 7);
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(context, 0, d6Var) : new org.telegram.ui.ActionBar.e2(context, 0, d6Var);
        String string2 = LocaleController.getString(c10 ? R.string.RichEditorEditProfileButton : R.string.RichEditorCreateProfileButton);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string2;
        alertDialog$Builder.n(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new da.b(c10, y3Var, a2, t3Var, 2));
        if (c10) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new j5.b(y3Var, 6));
            String string3 = LocaleController.getString(R.string.Delete);
            e4 e4Var = new e4(t3Var, 2);
            b2Var.p0 = string3;
            b2Var.q0 = e4Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            b2Var.J0 = true;
            i10 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i10, d6Var);
    }

    public static void g(Context context, org.telegram.ui.ActionBar.d6 d6Var, t3 t3Var, boolean z10, String str, String str2, String str3, e4 e4Var) {
        LinearLayout e = wh.e(context, 1);
        e.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i10 = t3Var.b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        EditTextBoldCursor a2 = a(context, d6Var, string, pageButton == null ? "" : e6.l(pageButton.text));
        EditTextBoldCursor a10 = a(context, d6Var, str2, str3);
        e.addView(a2, w7.z5.n(-1, 64));
        e.addView(a10, w7.z5.n(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(context, 0, d6Var) : new org.telegram.ui.ActionBar.e2(context, 0, d6Var);
        alertDialog$Builder.a.R = str;
        alertDialog$Builder.n(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ai.s2(a2, a10, e4Var, 13));
        if (t3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new e4(t3Var, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a10;
        }
        j(alertDialog$Builder, a2, t3Var.c() ? -3 : 0, d6Var);
    }

    public static void h(v3 v3Var, boolean z10) {
        TL_iv.textButton textbutton;
        k4 k4Var = v3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (k4Var == null || (textbutton = k4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String l4 = z11 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : e6.l(v3Var.e);
        v3Var.f.p3(false);
        v3Var.a.showInputDialog(LocaleController.getString(z11 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), l4, false, !z10, new g4(v3Var, 1));
    }

    public static void i(v3 v3Var, boolean z10) {
        TL_iv.textButton textbutton;
        k4 k4Var = v3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (k4Var == null || (textbutton = k4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z11 ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://";
        v3Var.f.p3(false);
        v3Var.a.showInputDialog(LocaleController.getString(z11 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), str, true, !z10, new g4(v3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.setOnShowListener(new ig.r(1, editTextBoldCursor));
        b2Var.q(250L);
        if (i10 == 0 || !(b2Var.d(i10) instanceof TextView)) {
            return;
        }
        ((TextView) b2Var.d(i10)).setTextColor(h6.w0(h6.q7, d6Var));
    }

    public static void k(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, i4 i4Var) {
        if (n2Var == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        ey eyVar = new ey(bundle);
        eyVar.C2 = new j5.b(i4Var, 7);
        if (!z10) {
            n2Var.presentFragment(eyVar);
            return;
        }
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.a = true;
        n2Var.showAsSheet(eyVar, l2Var);
    }
}
