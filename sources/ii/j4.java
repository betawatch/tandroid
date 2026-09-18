package ii;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.n70;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public abstract class j4 {
    public static EditTextBoldCursor a(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(j6.v0(j6.j5, f6Var));
        editTextBoldCursor.setHintText(str);
        editTextBoldCursor.setHintColor(j6.v0(j6.H6, f6Var));
        editTextBoldCursor.setHeaderHintColor(j6.v0(j6.L6, f6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        editTextBoldCursor.setLineColors(j6.v0(j6.k6, f6Var), j6.v0(j6.l6, f6Var), j6.v0(j6.p7, f6Var));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(j6.v0(j6.uf, f6Var));
        editTextBoldCursor.setHandlesColor(j6.v0(j6.vf, f6Var));
        return editTextBoldCursor;
    }

    public static n70 b(n70 n70Var, org.telegram.ui.ActionBar.o2 o2Var, final v3 v3Var, final boolean z10) {
        TL_iv.textButton textbutton;
        k4 k4Var = v3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (k4Var == null || (textbutton = k4Var.a) == null) ? null : textbutton.type;
        if (inlineButtonType == null) {
            final int i10 = 0;
            n70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: ii.f4
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
            n70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: ii.f4
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
            n70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new ci.y0(o2Var, v3Var, z10, 6), false);
            n70Var.Z();
            return n70Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            i(v3Var, z10);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            h(v3Var, z10);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            v3Var.f.p3(true);
            k(o2Var, z10, new g4(v3Var, 2));
        }
        return null;
    }

    public static n70 c(n70 n70Var, org.telegram.ui.ActionBar.o2 o2Var, final Context context, final org.telegram.ui.ActionBar.f6 f6Var, final t3 t3Var, final boolean z10) {
        int i10 = t3Var.b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                e(context, f6Var, t3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, f6Var, t3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(o2Var, context, f6Var, t3Var, z10);
            }
            return null;
        }
        final int i11 = 0;
        n70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: ii.h4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        j4.e(context, f6Var, t3Var, z10);
                        break;
                    default:
                        j4.d(context, f6Var, t3Var, z10);
                        break;
                }
            }
        }, false);
        final int i12 = 1;
        n70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: ii.h4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        j4.e(context, f6Var, t3Var, z10);
                        break;
                    default:
                        j4.d(context, f6Var, t3Var, z10);
                        break;
                }
            }
        }, false);
        n70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new ci.u1(o2Var, context, f6Var, t3Var, z10, 3), false);
        n70Var.Z();
        return n70Var;
    }

    public static void d(Context context, org.telegram.ui.ActionBar.f6 f6Var, t3 t3Var, boolean z10) {
        boolean c10 = t3Var.c();
        int i10 = t3Var.b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, f6Var, t3Var, z10, LocaleController.getString(c10 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new e4(t3Var, 3));
    }

    public static void e(Context context, org.telegram.ui.ActionBar.f6 f6Var, t3 t3Var, boolean z10) {
        boolean c10 = t3Var.c();
        int i10 = t3Var.b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, f6Var, t3Var, z10, LocaleController.getString(c10 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new e4(t3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, t3 t3Var, boolean z10) {
        boolean c10 = t3Var.c();
        LinearLayout f7 = wl.f(context, 1);
        int i10 = 0;
        f7.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = t3Var.b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i11 < 0 || i11 >= d.buttons.size()) ? null : d.buttons.get(i11);
        EditTextBoldCursor a2 = a(context, f6Var, string, pageButton == null ? "" : f6.l(pageButton.text));
        f7.addView(a2, w7.x5.n(-1, 64));
        ai.s4 s4Var = new ai.s4(a2, o2Var, z10, t3Var, 5);
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(context, 0, f6Var) : new org.telegram.ui.ActionBar.f2(context, 0, f6Var);
        String string2 = LocaleController.getString(c10 ? R.string.RichEditorEditProfileButton : R.string.RichEditorCreateProfileButton);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = string2;
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ca.b(c10, s4Var, a2, t3Var, 2));
        if (c10) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new ei.d5(s4Var, 18));
            String string3 = LocaleController.getString(R.string.Delete);
            e4 e4Var = new e4(t3Var, 2);
            c2Var.p0 = string3;
            c2Var.q0 = e4Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            c2Var.J0 = true;
            i10 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i10, f6Var);
    }

    public static void g(Context context, org.telegram.ui.ActionBar.f6 f6Var, t3 t3Var, boolean z10, String str, String str2, String str3, e4 e4Var) {
        LinearLayout f7 = wl.f(context, 1);
        f7.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i10 = t3Var.b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        EditTextBoldCursor a2 = a(context, f6Var, string, pageButton == null ? "" : f6.l(pageButton.text));
        EditTextBoldCursor a10 = a(context, f6Var, str2, str3);
        f7.addView(a2, w7.x5.n(-1, 64));
        f7.addView(a10, w7.x5.n(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(context, 0, f6Var) : new org.telegram.ui.ActionBar.f2(context, 0, f6Var);
        alertDialog$Builder.a.R = str;
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ai.r5(a2, a10, e4Var, 12));
        if (t3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new e4(t3Var, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a10;
        }
        j(alertDialog$Builder, a2, t3Var.c() ? -3 : 0, f6Var);
    }

    public static void h(v3 v3Var, boolean z10) {
        TL_iv.textButton textbutton;
        k4 k4Var = v3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (k4Var == null || (textbutton = k4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String l4 = z11 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : f6.l(v3Var.e);
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

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.setOnShowListener(new hg.r(1, editTextBoldCursor));
        c2Var.q(250L);
        if (i10 == 0 || !(c2Var.d(i10) instanceof TextView)) {
            return;
        }
        ((TextView) c2Var.d(i10)).setTextColor(j6.v0(j6.q7, f6Var));
    }

    public static void k(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, i4 i4Var) {
        if (o2Var == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        wy wyVar = new wy(bundle);
        wyVar.C2 = new ei.d5(i4Var, 19);
        if (!z10) {
            o2Var.presentFragment(wyVar);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
        m2Var.a = true;
        o2Var.showAsSheet(wyVar, m2Var);
    }
}
