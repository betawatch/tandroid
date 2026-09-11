package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class h31 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public final /* synthetic */ i31 d;

    public h31(i31 i31Var, Context context) {
        this.d = i31Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        if (b10 == 0) {
            return true;
        }
        i31 i31Var = this.d;
        return b10 == i31Var.c || b10 == i31Var.d || b10 == i31Var.e;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.h;
    }

    @Override // s4.h0
    public final int j(int i10) {
        i31 i31Var = this.d;
        if (i10 == i31Var.f) {
            return 0;
        }
        if (i10 == 0 || i10 == i31Var.c || i10 == i31Var.d || i10 == i31Var.e) {
            return i10 + 9;
        }
        return 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            e9Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
            return;
        }
        if (i11 == 1) {
            return;
        }
        i31 i31Var = this.d;
        if (i11 == 4) {
            ((org.telegram.ui.Cells.w8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), i31Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
            return;
        }
        switch (i11) {
            case 9:
            case 10:
            case 11:
            case 12:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) view;
                if (i10 == 0) {
                    str = LocaleController.getString(R.string.QuickReplyDefault1);
                    str2 = "quick_reply_msg1";
                } else if (i10 == i31Var.c) {
                    str = LocaleController.getString(R.string.QuickReplyDefault2);
                    str2 = "quick_reply_msg2";
                } else if (i10 == i31Var.d) {
                    str = LocaleController.getString(R.string.QuickReplyDefault3);
                    str2 = "quick_reply_msg3";
                } else if (i10 == i31Var.e) {
                    str = LocaleController.getString(R.string.QuickReplyDefault4);
                    str2 = "quick_reply_msg4";
                } else {
                    str = null;
                    str2 = null;
                }
                String string = i31Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str2, "");
                boolean z10 = i10 != i31Var.e;
                EditTextBoldCursor editTextBoldCursor = j3Var.a;
                editTextBoldCursor.setText(string);
                editTextBoldCursor.setHint(str);
                j3Var.b = z10;
                j3Var.setWillNotDraw(!z10);
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View e9Var;
        Context context = this.c;
        if (i10 == 0) {
            e9Var = new org.telegram.ui.Cells.e9(context);
        } else if (i10 != 1) {
            switch (i10) {
                case 9:
                case 10:
                case 11:
                case 12:
                    org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context);
                    j3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    this.d.n[i10 - 9] = j3Var;
                    e9Var = j3Var;
                    break;
                default:
                    e9Var = new org.telegram.ui.Cells.w8(context);
                    e9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    break;
            }
        } else {
            e9Var = new org.telegram.ui.Cells.ea(context);
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        }
        e9Var.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.vk0(e9Var);
    }
}
