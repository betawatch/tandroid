package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a21 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ b21 d;

    public a21(b21 b21Var, Context context) {
        this.d = b21Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int b10 = q1Var.b();
        if (b10 == 0) {
            return true;
        }
        b21 b21Var = this.d;
        return b10 == b21Var.c || b10 == b21Var.d || b10 == b21Var.e;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.h;
    }

    @Override // f2.r0
    public final int j(int i9) {
        b21 b21Var = this.d;
        if (i9 == b21Var.f) {
            return 0;
        }
        if (i9 == 0 || i9 == b21Var.c || i9 == b21Var.d || i9 == b21Var.e) {
            return i9 + 9;
        }
        return 1;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        String str;
        String str2;
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 == 0) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            b9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
            b9Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
            return;
        }
        if (i10 == 1) {
            return;
        }
        b21 b21Var = this.d;
        if (i10 == 4) {
            ((org.telegram.ui.Cells.t8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), b21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
            return;
        }
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 12:
                org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) view;
                if (i9 == 0) {
                    str = LocaleController.getString(R.string.QuickReplyDefault1);
                    str2 = "quick_reply_msg1";
                } else if (i9 == b21Var.c) {
                    str = LocaleController.getString(R.string.QuickReplyDefault2);
                    str2 = "quick_reply_msg2";
                } else if (i9 == b21Var.d) {
                    str = LocaleController.getString(R.string.QuickReplyDefault3);
                    str2 = "quick_reply_msg3";
                } else if (i9 == b21Var.e) {
                    str = LocaleController.getString(R.string.QuickReplyDefault4);
                    str2 = "quick_reply_msg4";
                } else {
                    str = null;
                    str2 = null;
                }
                String string = b21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str2, "");
                boolean z10 = i9 != b21Var.e;
                EditTextBoldCursor editTextBoldCursor = k3Var.a;
                editTextBoldCursor.setText(string);
                editTextBoldCursor.setHint(str);
                k3Var.b = z10;
                k3Var.setWillNotDraw(!z10);
                break;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View b9Var;
        Context context = this.c;
        if (i9 == 0) {
            b9Var = new org.telegram.ui.Cells.b9(context);
        } else if (i9 != 1) {
            switch (i9) {
                case 9:
                case 10:
                case 11:
                case 12:
                    org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context);
                    k3Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                    this.d.n[i9 - 9] = k3Var;
                    b9Var = k3Var;
                    break;
                default:
                    b9Var = new org.telegram.ui.Cells.t8(context);
                    b9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                    break;
            }
        } else {
            b9Var = new org.telegram.ui.Cells.ba(context);
            b9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        }
        b9Var.setLayoutParams(new f2.a1(-1, -2));
        return new org.telegram.ui.Components.ik0(b9Var);
    }
}
