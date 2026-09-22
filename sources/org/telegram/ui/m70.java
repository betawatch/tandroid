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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class m70 extends org.telegram.ui.Components.xl0 {
    public final Context c;
    public final /* synthetic */ n70 d;

    public m70(n70 n70Var, Context context) {
        this.d = n70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        n70 n70Var = this.d;
        return b10 == n70Var.r || b10 == n70Var.n || b10 == n70Var.s || b10 == 0;
    }

    @Override // s4.h0
    public final int h() {
        n70 n70Var = this.d;
        if (n70Var.e) {
            return 0;
        }
        return n70Var.w;
    }

    @Override // s4.h0
    public final int j(int i10) {
        n70 n70Var = this.d;
        if (i10 == n70Var.n || i10 == n70Var.s || i10 == n70Var.r) {
            return 0;
        }
        if (i10 == n70Var.v || i10 == n70Var.h) {
            return 1;
        }
        return i10 == 0 ? 2 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        n70 n70Var = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
            if (i10 == n70Var.n) {
                faVar.b(LocaleController.getString(R.string.CopyLink), true);
                return;
            } else if (i10 == n70Var.s) {
                faVar.b(LocaleController.getString(R.string.ShareLink), false);
                return;
            } else {
                if (i10 == n70Var.r) {
                    faVar.b(LocaleController.getString(R.string.RevokeLink), true);
                    return;
                }
                return;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = n70Var.f;
            q8Var.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
            q8Var.setWillNotDraw(true);
            return;
        }
        org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
        int i12 = n70Var.v;
        Context context = this.c;
        if (i10 == i12) {
            f9Var.setText("");
            f9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
        } else if (i10 == n70Var.h) {
            TLRPC.Chat chat = n70Var.getMessagesController().getChat(Long.valueOf(n70Var.d));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                f9Var.setText(LocaleController.getString(R.string.LinkInfo));
            } else {
                f9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
            }
            f9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout faVar = new org.telegram.ui.Cells.fa(context);
            faVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            frameLayout = faVar;
        } else if (i10 != 1) {
            org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
            TextView textView = new TextView(context);
            q8Var.a = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            q8Var.addView(textView, w7.y5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            q8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            frameLayout = q8Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.f9(context);
        }
        return new org.telegram.ui.Components.il0(frameLayout);
    }
}
