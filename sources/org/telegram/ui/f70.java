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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f70 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ g70 d;

    public f70(g70 g70Var, Context context) {
        this.d = g70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        g70 g70Var = this.d;
        return b10 == g70Var.r || b10 == g70Var.n || b10 == g70Var.s || b10 == 0;
    }

    @Override // f2.o0
    public final int h() {
        g70 g70Var = this.d;
        if (g70Var.e) {
            return 0;
        }
        return g70Var.w;
    }

    @Override // f2.o0
    public final int j(int i10) {
        g70 g70Var = this.d;
        if (i10 == g70Var.n || i10 == g70Var.s || i10 == g70Var.r) {
            return 0;
        }
        if (i10 == g70Var.v || i10 == g70Var.h) {
            return 1;
        }
        return i10 == 0 ? 2 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f;
        View view = l1Var.a;
        g70 g70Var = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
            if (i10 == g70Var.n) {
                aaVar.b(LocaleController.getString(R.string.CopyLink), true);
                return;
            } else if (i10 == g70Var.s) {
                aaVar.b(LocaleController.getString(R.string.ShareLink), false);
                return;
            } else {
                if (i10 == g70Var.r) {
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
            TLRPC.TL_chatInviteExported tL_chatInviteExported = g70Var.f;
            n8Var.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
            n8Var.setWillNotDraw(true);
            return;
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        int i12 = g70Var.v;
        Context context = this.c;
        if (i10 == i12) {
            a9Var.setText("");
            a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
        } else if (i10 == g70Var.h) {
            TLRPC.Chat chat = g70Var.getMessagesController().getChat(Long.valueOf(g70Var.d));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                a9Var.setText(LocaleController.getString(R.string.LinkInfo));
            } else {
                a9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
            }
            a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout aaVar = new org.telegram.ui.Cells.aa(context);
            aaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            frameLayout = aaVar;
        } else if (i10 != 1) {
            org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context);
            TextView textView = new TextView(context);
            n8Var.a = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            n8Var.addView(textView, k7.b6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            n8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            frameLayout = n8Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.a9(context);
        }
        return new org.telegram.ui.Components.el0(frameLayout);
    }
}
