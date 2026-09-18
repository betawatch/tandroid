package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class f31 extends org.telegram.ui.Components.vl0 {
    public final Context c;
    public final /* synthetic */ g31 d;

    public f31(g31 g31Var, Context context) {
        this.d = g31Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        if (b10 == 0) {
            return true;
        }
        g31 g31Var = this.d;
        return b10 == g31Var.c || b10 == g31Var.d || b10 == g31Var.e;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.h;
    }

    @Override // s4.h0
    public final int j(int i10) {
        g31 g31Var = this.d;
        if (i10 == g31Var.f) {
            return 0;
        }
        if (i10 == 0 || i10 == g31Var.c || i10 == g31Var.d || i10 == g31Var.e) {
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
        g31 g31Var = this.d;
        if (i11 == 4) {
            ((org.telegram.ui.Cells.w8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), g31Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
            return;
        }
        switch (i11) {
            case 9:
            case 10:
            case 11:
            case 12:
                org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) view;
                if (i10 == 0) {
                    str = LocaleController.getString(R.string.QuickReplyDefault1);
                    str2 = "quick_reply_msg1";
                } else if (i10 == g31Var.c) {
                    str = LocaleController.getString(R.string.QuickReplyDefault2);
                    str2 = "quick_reply_msg2";
                } else if (i10 == g31Var.d) {
                    str = LocaleController.getString(R.string.QuickReplyDefault3);
                    str2 = "quick_reply_msg3";
                } else if (i10 == g31Var.e) {
                    str = LocaleController.getString(R.string.QuickReplyDefault4);
                    str2 = "quick_reply_msg4";
                } else {
                    str = null;
                    str2 = null;
                }
                String string = g31Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str2, "");
                boolean z10 = i10 != g31Var.e;
                EditTextBoldCursor editTextBoldCursor = k3Var.a;
                editTextBoldCursor.setText(string);
                editTextBoldCursor.setHint(str);
                k3Var.b = z10;
                k3Var.setWillNotDraw(!z10);
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
                    org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context);
                    k3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    this.d.n[i10 - 9] = k3Var;
                    e9Var = k3Var;
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
        return new org.telegram.ui.Components.gl0(e9Var);
    }
}
