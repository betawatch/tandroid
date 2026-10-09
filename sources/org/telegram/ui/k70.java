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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k70 extends org.telegram.ui.Components.pm0 {
    public final Context c;
    public final /* synthetic */ l70 d;

    public k70(l70 l70Var, Context context) {
        this.d = l70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        int b10 = d1Var.b();
        l70 l70Var = this.d;
        return b10 == l70Var.r || b10 == l70Var.n || b10 == l70Var.s || b10 == 0;
    }

    @Override // s4.i0
    public final int h() {
        l70 l70Var = this.d;
        if (l70Var.e) {
            return 0;
        }
        return l70Var.w;
    }

    @Override // s4.i0
    public final int j(int i10) {
        l70 l70Var = this.d;
        if (i10 == l70Var.n || i10 == l70Var.s || i10 == l70Var.r) {
            return 0;
        }
        if (i10 == l70Var.v || i10 == l70Var.h) {
            return 1;
        }
        return i10 == 0 ? 2 : 0;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        int i11 = d1Var.f;
        View view = d1Var.a;
        l70 l70Var = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
            if (i10 == l70Var.n) {
                caVar.b(LocaleController.getString(R.string.CopyLink), true);
                return;
            } else if (i10 == l70Var.s) {
                caVar.b(LocaleController.getString(R.string.ShareLink), false);
                return;
            } else {
                if (i10 == l70Var.r) {
                    caVar.b(LocaleController.getString(R.string.RevokeLink), true);
                    return;
                }
                return;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = l70Var.f;
            p8Var.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
            p8Var.setWillNotDraw(true);
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        int i12 = l70Var.v;
        Context context = this.c;
        if (i10 == i12) {
            e9Var.setText("");
            e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.b7));
        } else if (i10 == l70Var.h) {
            TLRPC.Chat chat = l70Var.getMessagesController().getChat(Long.valueOf(l70Var.d));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                e9Var.setText(LocaleController.getString(R.string.LinkInfo));
            } else {
                e9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
            }
            e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.W0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.i6.b7));
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout caVar = new org.telegram.ui.Cells.ca(context);
            caVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
            frameLayout = caVar;
        } else if (i10 != 1) {
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
            TextView textView = new TextView(context);
            p8Var.a = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            p8Var.addView(textView, w7.x5.a(-2.0f, 23.0f, 10.0f, 23.0f, 10.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
            p8Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
            frameLayout = p8Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.e9(context);
        }
        return new org.telegram.ui.Components.am0(frameLayout);
    }
}
