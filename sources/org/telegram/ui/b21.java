package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b21 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ c21 d;

    public b21(c21 c21Var, Context context) {
        this.d = c21Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int b10 = n1Var.b();
        if (b10 == 0) {
            return true;
        }
        c21 c21Var = this.d;
        return b10 == c21Var.c || b10 == c21Var.d || b10 == c21Var.e;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.h;
    }

    @Override // f2.p0
    public final int j(int i10) {
        c21 c21Var = this.d;
        if (i10 == c21Var.f) {
            return 0;
        }
        if (i10 == 0 || i10 == c21Var.c || i10 == c21Var.d || i10 == c21Var.e) {
            return i10 + 9;
        }
        return 1;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        String str;
        String str2;
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
            y8Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
            return;
        }
        if (i11 == 1) {
            return;
        }
        c21 c21Var = this.d;
        if (i11 == 4) {
            ((org.telegram.ui.Cells.q8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), c21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
            return;
        }
        switch (i11) {
            case 9:
            case 10:
            case 11:
            case 12:
                org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) view;
                if (i10 == 0) {
                    str = LocaleController.getString(R.string.QuickReplyDefault1);
                    str2 = "quick_reply_msg1";
                } else if (i10 == c21Var.c) {
                    str = LocaleController.getString(R.string.QuickReplyDefault2);
                    str2 = "quick_reply_msg2";
                } else if (i10 == c21Var.d) {
                    str = LocaleController.getString(R.string.QuickReplyDefault3);
                    str2 = "quick_reply_msg3";
                } else if (i10 == c21Var.e) {
                    str = LocaleController.getString(R.string.QuickReplyDefault4);
                    str2 = "quick_reply_msg4";
                } else {
                    str = null;
                    str2 = null;
                }
                String string = c21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str2, "");
                boolean z10 = i10 != c21Var.e;
                EditTextBoldCursor editTextBoldCursor = h3Var.a;
                editTextBoldCursor.setText(string);
                editTextBoldCursor.setHint(str);
                h3Var.b = z10;
                h3Var.setWillNotDraw(!z10);
                break;
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View y8Var;
        Context context = this.c;
        if (i10 == 0) {
            y8Var = new org.telegram.ui.Cells.y8(context);
        } else if (i10 != 1) {
            switch (i10) {
                case 9:
                case 10:
                case 11:
                case 12:
                    org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context);
                    h3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                    this.d.n[i10 - 9] = h3Var;
                    y8Var = h3Var;
                    break;
                default:
                    y8Var = new org.telegram.ui.Cells.q8(context);
                    y8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                    break;
            }
        } else {
            y8Var = new org.telegram.ui.Cells.y9(context);
            y8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        }
        y8Var.setLayoutParams(new f2.x0(-1, -2));
        return new org.telegram.ui.Components.vk0(y8Var);
    }
}
