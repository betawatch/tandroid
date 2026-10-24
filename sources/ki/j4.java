package ki;

import ai.x9;
import ai.y7;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.sl;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.j80;
import org.telegram.ui.ey;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public abstract class j4 {
    public static EditTextBoldCursor a(Context context, org.telegram.ui.ActionBar.g6 g6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        r6.W(editTextBoldCursor, k6.j5, g6Var);
        editTextBoldCursor.setHintText(str);
        r6.m(editTextBoldCursor, 34, k6.H6, g6Var);
        r6.m(editTextBoldCursor, 35, k6.L6, g6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        r6.H(editTextBoldCursor, k6.k6, k6.l6, k6.p7, g6Var);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        r6.E(editTextBoldCursor, k6.uf, g6Var);
        r6.m(editTextBoldCursor, 36, k6.vf, g6Var);
        return editTextBoldCursor;
    }

    public static j80 b(j80 j80Var, org.telegram.ui.ActionBar.o2 o2Var, final v3 v3Var, final boolean z10) {
        TL_iv.textButton textbutton;
        k4 k4Var = v3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (k4Var == null || (textbutton = k4Var.a) == null) ? null : textbutton.type;
        if (inlineButtonType == null) {
            final int i10 = 0;
            j80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: ki.f4
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
            j80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: ki.f4
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
            j80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new y7(o2Var, v3Var, z10, 9), false);
            j80Var.Z();
            return j80Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            i(v3Var, z10);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            h(v3Var, z10);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            v3Var.f.u3(true);
            k(o2Var, z10, new g4(v3Var, 2));
        }
        return null;
    }

    public static j80 c(j80 j80Var, org.telegram.ui.ActionBar.o2 o2Var, final Context context, final org.telegram.ui.ActionBar.g6 g6Var, final t3 t3Var, final boolean z10) {
        int i10 = t3Var.b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                e(context, g6Var, t3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, g6Var, t3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(o2Var, context, g6Var, t3Var, z10);
            }
            return null;
        }
        final int i11 = 0;
        j80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: ki.h4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        j4.e(context, g6Var, t3Var, z10);
                        break;
                    default:
                        j4.d(context, g6Var, t3Var, z10);
                        break;
                }
            }
        }, false);
        final int i12 = 1;
        j80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: ki.h4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        j4.e(context, g6Var, t3Var, z10);
                        break;
                    default:
                        j4.d(context, g6Var, t3Var, z10);
                        break;
                }
            }
        }, false);
        j80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new ei.s1(o2Var, context, g6Var, t3Var, z10, 3), false);
        j80Var.Z();
        return j80Var;
    }

    public static void d(Context context, org.telegram.ui.ActionBar.g6 g6Var, t3 t3Var, boolean z10) {
        boolean c10 = t3Var.c();
        int i10 = t3Var.b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, g6Var, t3Var, z10, LocaleController.getString(c10 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new e4(t3Var, 3));
    }

    public static void e(Context context, org.telegram.ui.ActionBar.g6 g6Var, t3 t3Var, boolean z10) {
        boolean c10 = t3Var.c();
        int i10 = t3Var.b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, g6Var, t3Var, z10, LocaleController.getString(c10 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new e4(t3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, t3 t3Var, boolean z10) {
        boolean c10 = t3Var.c();
        LinearLayout e = sl.e(context, 1);
        int i10 = 0;
        e.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = t3Var.b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i11 < 0 || i11 >= d.buttons.size()) ? null : d.buttons.get(i11);
        EditTextBoldCursor a2 = a(context, g6Var, string, pageButton == null ? "" : e6.l(pageButton.text));
        e.addView(a2, w7.z5.n(-1, 64));
        x9 x9Var = new x9(a2, o2Var, z10, t3Var, 6);
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(context, 0, g6Var) : new org.telegram.ui.ActionBar.f2(context, 0, g6Var);
        String string2 = LocaleController.getString(c10 ? R.string.RichEditorEditProfileButton : R.string.RichEditorCreateProfileButton);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = string2;
        alertDialog$Builder.o(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new da.b(c10, x9Var, a2, t3Var, 2));
        if (c10) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new j5.b(x9Var, 6));
            String string3 = LocaleController.getString(R.string.Delete);
            e4 e4Var = new e4(t3Var, 2);
            c2Var.r0 = string3;
            c2Var.s0 = e4Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            c2Var.L0 = true;
            i10 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i10, g6Var);
    }

    public static void g(Context context, org.telegram.ui.ActionBar.g6 g6Var, t3 t3Var, boolean z10, String str, String str2, String str3, e4 e4Var) {
        LinearLayout e = sl.e(context, 1);
        e.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i10 = t3Var.b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        EditTextBoldCursor a2 = a(context, g6Var, string, pageButton == null ? "" : e6.l(pageButton.text));
        EditTextBoldCursor a10 = a(context, g6Var, str2, str3);
        e.addView(a2, w7.z5.n(-1, 64));
        e.addView(a10, w7.z5.n(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(context, 0, g6Var) : new org.telegram.ui.ActionBar.f2(context, 0, g6Var);
        alertDialog$Builder.a.R = str;
        alertDialog$Builder.o(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ai.u2(a2, a10, e4Var, 13));
        if (t3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new e4(t3Var, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a10;
        }
        j(alertDialog$Builder, a2, t3Var.c() ? -3 : 0, g6Var);
    }

    public static void h(v3 v3Var, boolean z10) {
        TL_iv.textButton textbutton;
        k4 k4Var = v3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (k4Var == null || (textbutton = k4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String l4 = z11 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : e6.l(v3Var.e);
        v3Var.f.u3(false);
        v3Var.a.showInputDialog(LocaleController.getString(z11 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), l4, false, !z10, new g4(v3Var, 1));
    }

    public static void i(v3 v3Var, boolean z10) {
        TL_iv.textButton textbutton;
        k4 k4Var = v3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (k4Var == null || (textbutton = k4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z11 ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://";
        v3Var.f.u3(false);
        v3Var.a.showInputDialog(LocaleController.getString(z11 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), str, true, !z10, new g4(v3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.setOnShowListener(new ig.r(editTextBoldCursor, 1));
        c2Var.r(250L);
        if (i10 == 0 || !(c2Var.d(i10) instanceof TextView)) {
            return;
        }
        r6.W((TextView) c2Var.d(i10), k6.q7, g6Var);
    }

    public static void k(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, i4 i4Var) {
        if (o2Var == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        ey eyVar = new ey(bundle);
        eyVar.C2 = new j5.b(i4Var, 7);
        if (!z10) {
            o2Var.presentFragment(eyVar);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
        m2Var.a = true;
        o2Var.showAsSheet(eyVar, m2Var);
    }
}
