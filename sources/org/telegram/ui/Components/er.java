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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class er extends rl0 {
    public final /* synthetic */ gr c;

    public er(gr grVar) {
        this.c = grVar;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 3;
    }

    @Override // f2.p0
    public final int h() {
        gr grVar = this.c;
        return grVar.W ? grVar.V.size() + 3 : grVar.X ? 2 : 1;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                return 3;
            }
        }
        return i11;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        int i13 = m1Var.f;
        View view = m1Var.a;
        if (i13 != 3) {
            if (i13 != 2) {
                if (i13 == 1) {
                    ((org.telegram.ui.Cells.a9) view).setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.VoipChatStreamWithAnotherApp), org.telegram.ui.ActionBar.k6.L6, 0, new xp(this, 3)), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
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
        gr grVar = this.c;
        TLRPC.Peer peer = (TLRPC.Peer) grVar.V.get(i10 - 3);
        long peerId = MessageObject.getPeerId(peer);
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.h3) grVar).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.h3) grVar).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        g4Var.e(chat, null, str, i10 != h() - 1);
        g4Var.c(peer == grVar.a0, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        FrameLayout frameLayout;
        Context context = viewGroup.getContext();
        gr grVar = this.c;
        if (i10 == 1) {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            int i11 = org.telegram.ui.ActionBar.k6.a7;
            g6Var = ((org.telegram.ui.ActionBar.h3) grVar).resourcesProvider;
            a9Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
            a9Var.setTopPadding(17);
            a9Var.setBottomPadding(17);
            frameLayout = a9Var;
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.m4(context, 22);
        } else if (i10 != 3) {
            boolean z4 = grVar.Y;
            ?? frVar = new fr(context);
            frVar.setOrientation(1);
            kj0 kj0Var = new kj0(context);
            kj0Var.setAutoRepeat(true);
            kj0Var.f(R.raw.utyan_schedule, 112, 112, null);
            kj0Var.d();
            frVar.addView(kj0Var, k7.c6.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(z4 ? LocaleController.formatString(R.string.StartVoipChannelTitle, new Object[0]) : LocaleController.formatString(R.string.StartVoipChatTitle, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
            frVar.addView(textView, k7.c6.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.j5, false));
            textView2.setText(z4 ? LocaleController.formatString(R.string.VoipChannelStart2, new Object[0]) : LocaleController.formatString(R.string.VoipGroupStart2, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            frVar.addView(textView2, k7.c6.t(-2, -2, 1, 28, 0, 28, 17));
            frameLayout = frVar;
        } else {
            frameLayout = new org.telegram.ui.Cells.g4(context, 1, 0, false);
        }
        frameLayout.setLayoutParams(new f2.x0(-1, -2));
        return new el0(frameLayout);
    }
}
