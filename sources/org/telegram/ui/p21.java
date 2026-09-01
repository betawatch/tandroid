package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class p21 extends org.telegram.ui.Components.sl0 {
    public final Context c;
    public final /* synthetic */ q21 d;

    public p21(q21 q21Var, Context context) {
        this.d = q21Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        int b10 = m1Var.b();
        if (b10 == 0) {
            return true;
        }
        q21 q21Var = this.d;
        return b10 == q21Var.c || b10 == q21Var.d || b10 == q21Var.e;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.h;
    }

    @Override // f2.p0
    public final int j(int i10) {
        q21 q21Var = this.d;
        if (i10 == q21Var.f) {
            return 0;
        }
        if (i10 == 0 || i10 == q21Var.c || i10 == q21Var.d || i10 == q21Var.e) {
            return i10 + 9;
        }
        return 1;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        String str;
        String str2;
        int i11 = m1Var.f;
        View view = m1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
            a9Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
            return;
        }
        if (i11 == 1) {
            return;
        }
        q21 q21Var = this.d;
        if (i11 == 4) {
            ((org.telegram.ui.Cells.s8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), q21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
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
                } else if (i10 == q21Var.c) {
                    str = LocaleController.getString(R.string.QuickReplyDefault2);
                    str2 = "quick_reply_msg2";
                } else if (i10 == q21Var.d) {
                    str = LocaleController.getString(R.string.QuickReplyDefault3);
                    str2 = "quick_reply_msg3";
                } else if (i10 == q21Var.e) {
                    str = LocaleController.getString(R.string.QuickReplyDefault4);
                    str2 = "quick_reply_msg4";
                } else {
                    str = null;
                    str2 = null;
                }
                String string = q21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str2, "");
                boolean z4 = i10 != q21Var.e;
                EditTextBoldCursor editTextBoldCursor = j3Var.a;
                editTextBoldCursor.setText(string);
                editTextBoldCursor.setHint(str);
                j3Var.b = z4;
                j3Var.setWillNotDraw(!z4);
                break;
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View a9Var;
        Context context = this.c;
        if (i10 == 0) {
            a9Var = new org.telegram.ui.Cells.a9(context);
        } else if (i10 != 1) {
            switch (i10) {
                case 9:
                case 10:
                case 11:
                case 12:
                    org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context);
                    j3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                    this.d.n[i10 - 9] = j3Var;
                    a9Var = j3Var;
                    break;
                default:
                    a9Var = new org.telegram.ui.Cells.s8(context);
                    a9Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                    break;
            }
        } else {
            a9Var = new org.telegram.ui.Cells.aa(context);
            a9Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
        }
        a9Var.setLayoutParams(new f2.x0(-1, -2));
        return new org.telegram.ui.Components.fl0(a9Var);
    }
}
