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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class er extends ul0 {
    public final /* synthetic */ gr c;

    public er(gr grVar) {
        this.c = grVar;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 3;
    }

    @Override // s4.h0
    public final int h() {
        gr grVar = this.c;
        return grVar.Z ? grVar.Y.size() + 3 : grVar.a0 ? 2 : 1;
    }

    @Override // s4.h0
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

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 != 3) {
            if (i13 != 2) {
                if (i13 == 1) {
                    ((org.telegram.ui.Cells.f9) view).setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.VoipChatStreamWithAnotherApp), org.telegram.ui.ActionBar.j6.L6, 0, new xp(this, 3)), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                    return;
                }
                return;
            } else {
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                n4Var.setTextSize(15.0f);
                n4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
                n4Var.setText(LocaleController.getString(R.string.VoipChatDisplayedAs).replace(":", ""));
                return;
            }
        }
        gr grVar = this.c;
        TLRPC.Peer peer = (TLRPC.Peer) grVar.Y.get(i10 - 3);
        long peerId = MessageObject.getPeerId(peer);
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.f3) grVar).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.f3) grVar).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        h4Var.e(chat, null, str, i10 != h() - 1);
        h4Var.c(peer == grVar.d0, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        FrameLayout frameLayout;
        Context context = viewGroup.getContext();
        gr grVar = this.c;
        if (i10 == 1) {
            org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
            int i11 = org.telegram.ui.ActionBar.j6.a7;
            f6Var = ((org.telegram.ui.ActionBar.f3) grVar).resourcesProvider;
            f9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            f9Var.setTopPadding(17);
            f9Var.setBottomPadding(17);
            frameLayout = f9Var;
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.n4(context, 22);
        } else if (i10 != 3) {
            boolean z10 = grVar.b0;
            ?? frVar = new fr(context);
            frVar.setOrientation(1);
            kj0 kj0Var = new kj0(context);
            kj0Var.setAutoRepeat(true);
            kj0Var.f(R.raw.utyan_schedule, 112, 112, null);
            kj0Var.d();
            frVar.addView(kj0Var, w7.y5.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(z10 ? LocaleController.formatString(R.string.StartVoipChannelTitle, new Object[0]) : LocaleController.formatString(R.string.StartVoipChatTitle, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
            frVar.addView(textView, w7.y5.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
            textView2.setText(z10 ? LocaleController.formatString(R.string.VoipChannelStart2, new Object[0]) : LocaleController.formatString(R.string.VoipGroupStart2, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            frVar.addView(textView2, w7.y5.t(-2, -2, 1, 28, 0, 28, 17));
            frameLayout = frVar;
        } else {
            frameLayout = new org.telegram.ui.Cells.h4(context, 1, 0, false);
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new fl0(frameLayout);
    }
}
