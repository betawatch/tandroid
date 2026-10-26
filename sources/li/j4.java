package li;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.s9;
import bi.u7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.cy;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public abstract class j4 {
    public static EditTextBoldCursor a(Context context, u6 u6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        f7.V(editTextBoldCursor, y6.j5, u6Var);
        editTextBoldCursor.setHintText(str);
        f7.m(editTextBoldCursor, 34, y6.H6, u6Var);
        f7.m(editTextBoldCursor, 35, y6.L6, u6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        f7.G(editTextBoldCursor, y6.k6, y6.l6, y6.p7, u6Var);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        f7.D(editTextBoldCursor, y6.uf, u6Var);
        f7.m(editTextBoldCursor, 36, y6.vf, u6Var);
        return editTextBoldCursor;
    }

    public static k80 b(k80 k80Var, org.telegram.ui.ActionBar.r2 r2Var, final u3 u3Var, final boolean z10) {
        TL_iv.textButton textbutton;
        k4 k4Var = u3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (k4Var == null || (textbutton = k4Var.a) == null) ? null : textbutton.type;
        if (inlineButtonType == null) {
            final int i10 = 0;
            k80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: li.f4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            j4.i(u3Var, z10);
                            break;
                        default:
                            j4.h(u3Var, z10);
                            break;
                    }
                }
            }, false);
            final int i11 = 1;
            k80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: li.f4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            j4.i(u3Var, z10);
                            break;
                        default:
                            j4.h(u3Var, z10);
                            break;
                    }
                }
            }, false);
            k80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new u7(r2Var, u3Var, z10, 9), false);
            k80Var.Z();
            return k80Var;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            i(u3Var, z10);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            h(u3Var, z10);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            u3Var.f.u3(true);
            k(r2Var, z10, new g4(u3Var, 2));
        }
        return null;
    }

    public static k80 c(k80 k80Var, org.telegram.ui.ActionBar.r2 r2Var, final Context context, final u6 u6Var, final s3 s3Var, final boolean z10) {
        int i10 = s3Var.b;
        TL_iv.pageBlockButtonRow d = s3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                e(context, u6Var, s3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, u6Var, s3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(r2Var, context, u6Var, s3Var, z10);
            }
            return null;
        }
        final int i11 = 0;
        k80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() { // from class: li.h4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        j4.e(context, u6Var, s3Var, z10);
                        break;
                    default:
                        j4.d(context, u6Var, s3Var, z10);
                        break;
                }
            }
        }, false);
        final int i12 = 1;
        k80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() { // from class: li.h4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        j4.e(context, u6Var, s3Var, z10);
                        break;
                    default:
                        j4.d(context, u6Var, s3Var, z10);
                        break;
                }
            }
        }, false);
        k80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new fi.r1(r2Var, context, u6Var, s3Var, z10, 3), false);
        k80Var.Z();
        return k80Var;
    }

    public static void d(Context context, u6 u6Var, s3 s3Var, boolean z10) {
        boolean c10 = s3Var.c();
        int i10 = s3Var.b;
        TL_iv.pageBlockButtonRow d = s3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, u6Var, s3Var, z10, LocaleController.getString(c10 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new e4(s3Var, 3));
    }

    public static void e(Context context, u6 u6Var, s3 s3Var, boolean z10) {
        boolean c10 = s3Var.c();
        int i10 = s3Var.b;
        TL_iv.pageBlockButtonRow d = s3Var.d();
        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        g(context, u6Var, s3Var, z10, LocaleController.getString(c10 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new e4(s3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.r2 r2Var, Context context, u6 u6Var, s3 s3Var, boolean z10) {
        boolean c10 = s3Var.c();
        LinearLayout d = vh.d(context, 1);
        int i10 = 0;
        d.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = s3Var.b;
        TL_iv.pageBlockButtonRow d10 = s3Var.d();
        TL_keyboard.PageButton pageButton = (d10 == null || i11 < 0 || i11 >= d10.buttons.size()) ? null : d10.buttons.get(i11);
        EditTextBoldCursor a2 = a(context, u6Var, string, pageButton == null ? "" : f6.l(pageButton.text));
        d.addView(a2, gb1.r(-1, 64));
        s9 s9Var = new s9(a2, r2Var, z10, s3Var, 6);
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(context, 0, u6Var) : new org.telegram.ui.ActionBar.h2(context, 0, u6Var);
        String string2 = LocaleController.getString(c10 ? R.string.RichEditorEditProfileButton : R.string.RichEditorCreateProfileButton);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = string2;
        alertDialog$Builder.o(d);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ea.b(c10, s9Var, a2, s3Var, 2));
        if (c10) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new jg.e1(s9Var, 10));
            String string3 = LocaleController.getString(R.string.Delete);
            e4 e4Var = new e4(s3Var, 2);
            e2Var.r0 = string3;
            e2Var.s0 = e4Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            e2Var.L0 = true;
            i10 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i10, u6Var);
    }

    public static void g(Context context, u6 u6Var, s3 s3Var, boolean z10, String str, String str2, String str3, e4 e4Var) {
        LinearLayout d = vh.d(context, 1);
        d.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i10 = s3Var.b;
        TL_iv.pageBlockButtonRow d10 = s3Var.d();
        TL_keyboard.PageButton pageButton = (d10 == null || i10 < 0 || i10 >= d10.buttons.size()) ? null : d10.buttons.get(i10);
        EditTextBoldCursor a2 = a(context, u6Var, string, pageButton == null ? "" : f6.l(pageButton.text));
        EditTextBoldCursor a10 = a(context, u6Var, str2, str3);
        d.addView(a2, gb1.r(-1, 64));
        d.addView(a10, gb1.r(-1, 64));
        AlertDialog$Builder alertDialog$Builder = z10 ? new AlertDialog$Builder(context, 0, u6Var) : new org.telegram.ui.ActionBar.h2(context, 0, u6Var);
        alertDialog$Builder.a.R = str;
        alertDialog$Builder.o(d);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new androidx.car.app.utils.a(a2, a10, e4Var, 13));
        if (s3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new e4(s3Var, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a10;
        }
        j(alertDialog$Builder, a2, s3Var.c() ? -3 : 0, u6Var);
    }

    public static void h(u3 u3Var, boolean z10) {
        TL_iv.textButton textbutton;
        k4 k4Var = u3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (k4Var == null || (textbutton = k4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String l4 = z11 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : f6.l(u3Var.e);
        u3Var.f.u3(false);
        u3Var.a.showInputDialog(LocaleController.getString(z11 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), l4, false, !z10, new g4(u3Var, 1));
    }

    public static void i(u3 u3Var, boolean z10) {
        TL_iv.textButton textbutton;
        k4 k4Var = u3Var.d;
        TL_keyboard.InlineButtonType inlineButtonType = (k4Var == null || (textbutton = k4Var.a) == null) ? null : textbutton.type;
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z11 ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://";
        u3Var.f.u3(false);
        u3Var.a.showInputDialog(LocaleController.getString(z11 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), str, true, !z10, new g4(u3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, u6 u6Var) {
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.setOnShowListener(new jg.s(editTextBoldCursor, 1));
        e2Var.r(250L);
        if (i10 == 0 || !(e2Var.d(i10) instanceof TextView)) {
            return;
        }
        f7.V((TextView) e2Var.d(i10), y6.q7, u6Var);
    }

    public static void k(org.telegram.ui.ActionBar.r2 r2Var, boolean z10, i4 i4Var) {
        if (r2Var == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        cy cyVar = new cy(bundle);
        cyVar.C2 = new jg.e1(i4Var, 11);
        if (!z10) {
            r2Var.presentFragment(cyVar);
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
        p2Var.a = true;
        r2Var.showAsSheet(cyVar, p2Var);
    }
}
