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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h70 extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public final /* synthetic */ i70 d;

    public h70(i70 i70Var, Context context) {
        this.d = i70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        i70 i70Var = this.d;
        return b10 == i70Var.r || b10 == i70Var.n || b10 == i70Var.s || b10 == 0;
    }

    @Override // f2.o0
    public final int h() {
        i70 i70Var = this.d;
        if (i70Var.e) {
            return 0;
        }
        return i70Var.w;
    }

    @Override // f2.o0
    public final int j(int i10) {
        i70 i70Var = this.d;
        if (i10 == i70Var.n || i10 == i70Var.s || i10 == i70Var.r) {
            return 0;
        }
        if (i10 == i70Var.v || i10 == i70Var.h) {
            return 1;
        }
        return i10 == 0 ? 2 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f;
        View view = l1Var.a;
        i70 i70Var = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
            if (i10 == i70Var.n) {
                z9Var.b(LocaleController.getString(R.string.CopyLink), true);
                return;
            } else if (i10 == i70Var.s) {
                z9Var.b(LocaleController.getString(R.string.ShareLink), false);
                return;
            } else {
                if (i10 == i70Var.r) {
                    z9Var.b(LocaleController.getString(R.string.RevokeLink), true);
                    return;
                }
                return;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = i70Var.f;
            m8Var.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
            m8Var.setWillNotDraw(true);
            return;
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        int i12 = i70Var.v;
        Context context = this.c;
        if (i10 == i12) {
            z8Var.setText("");
            z8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
        } else if (i10 == i70Var.h) {
            TLRPC.Chat chat = i70Var.getMessagesController().getChat(Long.valueOf(i70Var.d));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                z8Var.setText(LocaleController.getString(R.string.LinkInfo));
            } else {
                z8Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
            }
            z8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout z9Var = new org.telegram.ui.Cells.z9(context);
            z9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            frameLayout = z9Var;
        } else if (i10 != 1) {
            org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context);
            TextView textView = new TextView(context);
            m8Var.a = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            m8Var.addView(textView, k7.b6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            m8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            frameLayout = m8Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.z8(context);
        }
        return new org.telegram.ui.Components.dl0(frameLayout);
    }
}
