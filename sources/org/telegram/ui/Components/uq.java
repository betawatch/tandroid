package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uq extends vk0 {
    public final /* synthetic */ wq c;

    public uq(wq wqVar) {
        this.c = wqVar;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 3;
    }

    @Override // f2.r0
    public final int h() {
        wq wqVar = this.c;
        return wqVar.V ? wqVar.U.size() + 3 : wqVar.W ? 2 : 1;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        int i10 = 1;
        if (i9 != 1) {
            i10 = 2;
            if (i9 != 2) {
                return 3;
            }
        }
        return i10;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        TLObject chat;
        String str;
        int i11;
        int i12 = q1Var.f;
        View view = q1Var.a;
        if (i12 != 3) {
            if (i12 != 2) {
                if (i12 == 1) {
                    ((org.telegram.ui.Cells.b9) view).setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.VoipChatStreamWithAnotherApp), org.telegram.ui.ActionBar.f6.L6, 0, new np(this, 3)), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                    return;
                }
                return;
            } else {
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                m4Var.setTextSize(15.0f);
                m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
                m4Var.setText(LocaleController.getString(R.string.VoipChatDisplayedAs).replace(":", ""));
                return;
            }
        }
        wq wqVar = this.c;
        TLRPC.Peer peer = (TLRPC.Peer) wqVar.U.get(i9 - 3);
        long peerId = MessageObject.getPeerId(peer);
        if (peerId > 0) {
            i11 = ((org.telegram.ui.ActionBar.f3) wqVar).currentAccount;
            chat = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i10 = ((org.telegram.ui.ActionBar.f3) wqVar).currentAccount;
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
            str = null;
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        g4Var.e(chat, null, str, i9 != h() - 1);
        g4Var.c(peer == wqVar.Z, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        FrameLayout frameLayout;
        Context context = viewGroup.getContext();
        wq wqVar = this.c;
        if (i9 == 1) {
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
            int i10 = org.telegram.ui.ActionBar.f6.a7;
            b6Var = ((org.telegram.ui.ActionBar.f3) wqVar).resourcesProvider;
            b9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
            b9Var.setTopPadding(17);
            b9Var.setBottomPadding(17);
            frameLayout = b9Var;
        } else if (i9 == 2) {
            frameLayout = new org.telegram.ui.Cells.m4(context, 22);
        } else if (i9 != 3) {
            boolean z10 = wqVar.X;
            ?? vqVar = new vq(context);
            vqVar.setOrientation(1);
            pi0 pi0Var = new pi0(context);
            pi0Var.setAutoRepeat(true);
            pi0Var.f(R.raw.utyan_schedule, 112, 112, null);
            pi0Var.d();
            vqVar.addView(pi0Var, g7.e6.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(z10 ? LocaleController.formatString(R.string.StartVoipChannelTitle, new Object[0]) : LocaleController.formatString(R.string.StartVoipChatTitle, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
            vqVar.addView(textView, g7.e6.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
            textView2.setText(z10 ? LocaleController.formatString(R.string.VoipChannelStart2, new Object[0]) : LocaleController.formatString(R.string.VoipGroupStart2, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            vqVar.addView(textView2, g7.e6.t(-2, -2, 1, 28, 0, 28, 17));
            frameLayout = vqVar;
        } else {
            frameLayout = new org.telegram.ui.Cells.g4(context, 1, 0, false);
        }
        frameLayout.setLayoutParams(new f2.a1(-1, -2));
        return new ik0(frameLayout);
    }
}
