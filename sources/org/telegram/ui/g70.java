package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class g70 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ h70 d;

    public g70(h70 h70Var, Context context) {
        this.d = h70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        int b10 = m1Var.b();
        h70 h70Var = this.d;
        return b10 == h70Var.r || b10 == h70Var.n || b10 == h70Var.s || b10 == 0;
    }

    @Override // f2.p0
    public final int h() {
        h70 h70Var = this.d;
        if (h70Var.e) {
            return 0;
        }
        return h70Var.w;
    }

    @Override // f2.p0
    public final int j(int i10) {
        h70 h70Var = this.d;
        if (i10 == h70Var.n || i10 == h70Var.s || i10 == h70Var.r) {
            return 0;
        }
        if (i10 == h70Var.v || i10 == h70Var.h) {
            return 1;
        }
        return i10 == 0 ? 2 : 0;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11 = m1Var.f;
        View view = m1Var.a;
        h70 h70Var = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
            if (i10 == h70Var.n) {
                aaVar.b(LocaleController.getString(R.string.CopyLink), true);
                return;
            } else if (i10 == h70Var.s) {
                aaVar.b(LocaleController.getString(R.string.ShareLink), false);
                return;
            } else {
                if (i10 == h70Var.r) {
                    aaVar.b(LocaleController.getString(R.string.RevokeLink), true);
                    return;
                }
                return;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = h70Var.f;
            n8Var.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
            n8Var.setWillNotDraw(true);
            return;
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        int i12 = h70Var.v;
        Context context = this.c;
        if (i10 == i12) {
            a9Var.setText("");
            a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
        } else if (i10 == h70Var.h) {
            TLRPC.Chat chat = h70Var.getMessagesController().getChat(Long.valueOf(h70Var.d));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                a9Var.setText(LocaleController.getString(R.string.LinkInfo));
            } else {
                a9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
            }
            a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7));
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout aaVar = new org.telegram.ui.Cells.aa(context);
            aaVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
            frameLayout = aaVar;
        } else if (i10 != 1) {
            org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context);
            TextView textView = new TextView(context);
            n8Var.a = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            n8Var.addView(textView, k7.c6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            n8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
            frameLayout = n8Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.a9(context);
        }
        return new org.telegram.ui.Components.el0(frameLayout);
    }
}
