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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class a70 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public final /* synthetic */ b70 d;

    public a70(b70 b70Var, Context context) {
        this.d = b70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        b70 b70Var = this.d;
        return b10 == b70Var.r || b10 == b70Var.n || b10 == b70Var.s || b10 == 0;
    }

    @Override // s4.h0
    public final int h() {
        b70 b70Var = this.d;
        if (b70Var.e) {
            return 0;
        }
        return b70Var.w;
    }

    @Override // s4.h0
    public final int j(int i10) {
        b70 b70Var = this.d;
        if (i10 == b70Var.n || i10 == b70Var.s || i10 == b70Var.r) {
            return 0;
        }
        if (i10 == b70Var.v || i10 == b70Var.h) {
            return 1;
        }
        return i10 == 0 ? 2 : 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f;
        View view = e1Var.a;
        b70 b70Var = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
            if (i10 == b70Var.n) {
                gaVar.b(LocaleController.getString(R.string.CopyLink), true);
                return;
            } else if (i10 == b70Var.s) {
                gaVar.b(LocaleController.getString(R.string.ShareLink), false);
                return;
            } else {
                if (i10 == b70Var.r) {
                    gaVar.b(LocaleController.getString(R.string.RevokeLink), true);
                    return;
                }
                return;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = b70Var.f;
            t8Var.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
            t8Var.setWillNotDraw(true);
            return;
        }
        org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
        if (i10 == b70Var.v) {
            i9Var.setText("");
            return;
        }
        if (i10 == b70Var.h) {
            TLRPC.Chat chat = b70Var.getMessagesController().getChat(Long.valueOf(b70Var.d));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                i9Var.setText(LocaleController.getString(R.string.LinkInfo));
            } else {
                i9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
            }
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout gaVar = new org.telegram.ui.Cells.ga(context);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, gaVar, null);
            frameLayout = gaVar;
        } else if (i10 != 1) {
            org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context);
            TextView textView = new TextView(context);
            t8Var.a = textView;
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            t8Var.addView(textView, org.telegram.ui.Components.kb1.h(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, t8Var, null);
            frameLayout = t8Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.i9(context);
        }
        return new org.telegram.ui.Components.wl0(frameLayout);
    }
}
